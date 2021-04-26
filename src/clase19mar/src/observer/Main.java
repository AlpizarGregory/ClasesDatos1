package observer;

public class Main {
    public static void main(String[] args) {
        var monitorTc = new MonitorTipoCambio();
        monitorTc.addObserver((Observer) new EmailSender());
        monitorTc.addObserver((Observer) new SMSSender());
        monitorTc.run();
    }
}
