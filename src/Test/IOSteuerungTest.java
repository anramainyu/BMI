package Test;


import BMI.IOSteuerung;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class IOSteuerungTest extends TestCase
{
    @Test
    public void testIOGewicht()
    {

        System.out.println("Bitte geben Sie das Gewicht in Kilogramm an:");
        double g = 25;


            if(g >= 25 && g<=500)
            {
                System.out.println("true");
            }
            else
            {

                System.out.println("false");
            }


    }

}