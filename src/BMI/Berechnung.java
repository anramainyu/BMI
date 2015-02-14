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
        double gr2;
        double bmi;
        gr2=this.gewicht;
        gr2=gr2*gr2;
        this.bmi=gr2*this.gewicht;
    }
}
