package observer;

public class EmailSender {
    public void notify (TipoCambio tipoCambio) {
        System.out.println("Enviando email...el tipo de cambio es " + tipoCambio.getTipoCambio());
    }
}
