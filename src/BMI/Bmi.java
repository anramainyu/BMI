package BMI;

/**
 * Created by papazong on 14.02.2015.
 */
public class Bmi
{
    double gewicht;
    double groesse;
    double bmi;
    private String bmiKategorie;

    public Bmi(double gewicht, double groesse) {
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public void bmiBerechnen()
    {

        // Zentimeter in Meter umrechnen
        groesse=groesse/100;
        bmi=gewicht/(groesse*groesse);
    }


    public String kategorie() {
        if (bmi <= 16.00)
        {
            bmiKategorie = "starkes Untergewicht";
            return bmiKategorie;

        }
        if (bmi >= 16.00 && bmi <= 16.99)
        {
            bmiKategorie = "mäßiges Untergewicht";
            return bmiKategorie;

        }
        if (bmi >= 17.00 && bmi <= 18.49)
        {
            bmiKategorie = "leichtes Untergewicht";
            return bmiKategorie;

        }
        if (bmi >= 18.50 && bmi <= 24.99)
        {
            bmiKategorie = "Normalgewicht";
            return bmiKategorie;

        }
        if (bmi >= 25.00 && bmi <= 29.99)
        {
            bmiKategorie = "Prädipositas";;
            return bmiKategorie;

        }
        if (bmi >= 30.00 && bmi <= 34.99)
        {
            bmiKategorie = "Adipositas Grad I";
            return bmiKategorie;

        }
        if (bmi >= 35.00 && bmi <= 39.99)
        {
            bmiKategorie = "Adipositas Grad II";
            return bmiKategorie;

        } else
        {
            bmiKategorie = "Adipositas Grad III";
            return bmiKategorie;
        }

    }



    public String getBmiKategorie()
    {
        return bmiKategorie;
    }

    public double getBmi()
    {
        return bmi;
    }


        
}
