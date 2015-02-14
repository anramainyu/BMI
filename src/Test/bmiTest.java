package Test;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by papazong on 14.02.2015.
 */
public class bmiTest extends TestCase
{
    @Test
    public void bmiBerechnenTest()
    {


            //10dGroesse=groesse*groesse;
        double gewicht=80;
        double groesse = 180;

        groesse=groesse*100;
        double bmi = gewicht / (groesse*groesse);
        System.out.println(bmi);

    }
}
