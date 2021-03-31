package clase12mar.singletonEjm;

public class Main {
    private static void count(int sleepTime) throws InterruptedException {
        for (var i = 0; i < 11; i++) {
            System.out.println();
            Thread.sleep(sleepTime);
        }
    }

    public static void main(String[] args) {
//        DBConnection.getInstance().connect();
//        var connection = DBConnection.getInstance();
//
//        var connection2 = DBConnection.getInstance();
        var hilo = new Thread(() -> {
            DBConnection.getInstance();
        });
        hilo.start();
        DBConnection.getInstance();
    }
}
