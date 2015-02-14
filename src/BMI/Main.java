package BMI;

/**
 * Created by papazong on 14.02.2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        // User Eingabe von Gewicht und Größe
        IOSteuerung steuer1 = new IOSteuerung();
        steuer1.ioGewicht();
        steuer1.ioGroesse();
        //BMI berechnen
        Bmi Bmi = new Bmi(steuer1.getGewicht(),steuer1.getGroesse());
        Bmi.bmiBerechnen();
        //BMI Ausgeben

        Bmi.kategorie();
        steuer1.setBmiKategorie(Bmi.getBmiKategorie());
        steuer1.bmiUserAusgabe(Bmi.getBmi());

    }
}
