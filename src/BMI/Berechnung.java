package BMI;

/**
 * Created by papazong on 14.02.2015.
 */
public class Berechnung
{
    double gewicht;
    double groesse;
    double bmi;

    public Berechnung(double gewicht, double groesse) {
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public void bmiBerechnen()
    {

        // Zentimeter in Meter umrechnen
        groesse=groesse/100;
        bmi=gewicht/(groesse*groesse);
    }


    public double getBmi()
    {
        return bmi;
    }


        
}
