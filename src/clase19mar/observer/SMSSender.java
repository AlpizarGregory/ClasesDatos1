package clase19mar.observer;

public class SMSSender implements Observer{
    public void notify (TipoCambio tipoCambio) {
        System.out.println("Enviando SMS...el tipo de cambio es " + tipoCambio.getTipoCambio());
    }
}
