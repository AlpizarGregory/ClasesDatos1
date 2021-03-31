package clase12mar.hilos;

public class Main {
    private static void count(int sleepTime) throws InterruptedException {
        for (var i = 0; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(sleepTime);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        var hilo = new Thread(() ->  {
            try {
                count(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        hilo.start();
        count(1000);
    }
}
