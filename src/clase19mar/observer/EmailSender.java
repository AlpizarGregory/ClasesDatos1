package clase19mar.observer;

public class EmailSender implements Observer{
    public void notify (TipoCambio tipoCambio) {
        System.out.println("Enviando email...el tipo de cambio es " + tipoCambio.getTipoCambio());
    }
}
