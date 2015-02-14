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
        Berechnung bmi = new Berechnung(steuer1.getGewicht(),steuer1.getGroesse());
        bmi.bmiBerechnen();
        //BMI Ausgeben
        steuer1.bmiUserAusgabe(bmi.getBmi());


    }
}
