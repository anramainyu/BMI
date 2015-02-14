package bmiRechnerTest;

import bmiRechner.BmiRechner;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by papazong on 14.02.2015.
 */
public class TestBmiRechner extends TestCase
{
    @Test
    public void testKategorie()
    {
        BmiRechner bmi = new BmiRechner();
        
        assertEquals(12, bmi.kategorie());
    }


}
