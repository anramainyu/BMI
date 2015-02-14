package BMI;

import java.util.Scanner;

/**
 * Created by sschiefer on 12.02.2015.
 */
public class IOSteuerung
{
    double groesse;
    double gewicht;
    String bmiKategorie;

    // Eingaben



    //Ausgaben

    public void bmiUserAusgabe(double bmi)
    {
        System.out.println("Der Bmi liegt bei: "+ (int) bmi + " und Sie haben: "+ bmiKategorie);
    }

    public void ausgabeGewichtInfo()
    {
        System.out.println("Zulässige Werte für das Gewicht sind 25 bis 500" +
                " Kilo. Bitte geben Sie Ihr Gewicht neu ein.");
    }
    public void ausgabeGroesseInfo()
    {
        System.out.println("Zulässige Werte für die Größe sind 125 cm und 260 cm");
    }
    public void ioGewicht()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie das Gewicht in Kilogramm an:");
        double g = sc.nextDouble();

        if(sc!=null)
        {
            if(g >= 25 && g<=500)
            {
                this.gewicht=g;
            }
            else
            {
                ausgabeGewichtInfo();
            }
        }
        else
        {
            ausgabeGewichtInfo();
        }
    }


    public void ioGroesse()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Größe in Zentimeter an:");
        double g = sc.nextDouble();

        if(sc!=null)
        {
            if(g >= 125 && g <=500)
            {
                this.groesse=g;
            }
            else
            {
                ausgabeGroesseInfo();
            }
        }
        else
        {
            ausgabeGroesseInfo();
        }
    }

    public double getGroesse() {
        return groesse;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setBmiKategorie(String bmiKategorie) {
        this.bmiKategorie = bmiKategorie;
    }
}
