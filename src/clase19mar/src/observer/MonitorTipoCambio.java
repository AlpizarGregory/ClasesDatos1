package observer;

import java.util.ArrayList;
import java.util.List;

public class MonitorTipoCambio implements Runnable{
    private static final int SLEEP = 1500; // Para el Thread.sleep
    private double currentTC = 1; // Tipo de cambio inicial
    private boolean active = true; // Para hacer funcionar el while

    private TipoCambio tipoCambioActual = new TipoCambio();

//    private SMSSender smsSender = new SMSSender();
//    private EmailSender emailSender = new EmailSender();

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void run() {
        while (this.active) {
            this.tipoCambioActual.setTipoCambio(currentTC++);
            this.notifyAllObservers();
//            this.smsSender.notify(this.tipoCambioActual);
//            this.emailSender.notify(this.tipoCambioActual);
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
            }
        }
    }

    private void notifyAllObservers() {
        for (Observer o : this.observers) {
            o.notify(this.tipoCambioActual);
        }
        // this.observers.stream().forEach(o -> o.notify(tipoCambioActual)); //Expresión lambda
    }

    public void deActivate() {
        this.active = false;
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }
}

