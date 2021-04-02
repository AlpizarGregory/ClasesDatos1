package clase19mar.observer;

public class Main {
    public static void main(String[] args) {
        var monitorTc = new MonitorTipoCambio();
        monitorTc.addObserver(new EmailSender());
        monitorTc.addObserver(new SMSSender());
        monitorTc.run();
    }
}
