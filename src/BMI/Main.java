package BMI;

/**
 * Created by papazong on 14.02.2015.
 */
public class Main
{
    public static void Main(String[] args)
    {
        IOSteuerung steuer1 = new IOSteuerung();
        steuer1.ioGewicht();
        steuer1.ioGroesse();

        Berechnung bmi = new Berechnung(steuer1.getGewicht(),steuer1.getGroesse());
        bmi.bmiBerechnen();
    }
}
