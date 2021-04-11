package clase7abr.quiz3.abstracts12;
// Esta es una aplicación de una red social para celulares

public class Main {
    String operatingSys = null; // haría una revisión del sistema operativo

    SOCharacteristics newSO;

    if (operatingSys == "Android") {
        newSO = new AndroidUI();
    } else if (operatingSys == "iOS") {
        newSO = new AppleUI();
    }
}
