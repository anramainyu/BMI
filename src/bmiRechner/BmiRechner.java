package bmiRechner;

import java.util.Scanner;

/**
 * Created by papazong on 14.02.2015.
 */
public class BmiRechner
{
    double kilo;
    double cm;
    double bmi;
    String bmiKategorie;


    public BmiRechner()
    {
        initBmi();

    }

    private void initBmi()
    {
        System.out.println("BMI-Rechner");
        System.out.println("-----------");
        gewichtEingabe();
    }

    public void gewichtEingabe()
    {
        System.out.println("Bitte geben Sie ihre Größe in Zentimeter an.");
        Scanner sc = new Scanner(System.in);
        cm = sc.nextDouble();
        if(cm >= 100 && cm <= 260)
        {
            groessEingabe();
        }
        else
        {
            gewichtEingabe();
        }
    }

    public void groessEingabe()
    {
        System.out.println("Bitte geben sie Ihr Gewicht in Kilo an.");
        Scanner sc = new Scanner(System.in);
        kilo = sc.nextDouble();
        if(kilo>=20 && kilo<=400)
        {
            berechnung();
        }
        else
        {
            groessEingabe();
        }
    }

    public void berechnung()
    {
        //cm in Meter
        cm=cm/100;
        bmi=kilo/(cm*cm);
        kategorie();
    }

    private void kategorie()
    {
        if(bmi<=16.00)
        {
            bmiKategorie="starkes Untergewicht";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=16.00 && bmi<=16.99)
        {
            bmiKategorie="mäßiges Untergewicht";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=17.00 && bmi<=18.49)
        {
            bmiKategorie="leichtes Untergewicht";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=18.50 && bmi<=24.99)
        {
            bmiKategorie="Normalgewicht";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=25.00 && bmi<=29.99)
        {
            bmiKategorie="Prädipositas";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=30.00 && bmi<=34.99)
        {
            bmiKategorie="Adipositas Grad I";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else if(bmi>=35.00 && bmi<=39.99)
        {
            bmiKategorie="Adipositas Grad II";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }
        else
        {
            bmiKategorie="Adipositas Grad III";
            System.out.println("Mit einem Bmi von: " + (int)bmi + " Haben Sie: "+ bmiKategorie);
        }

    }


}
