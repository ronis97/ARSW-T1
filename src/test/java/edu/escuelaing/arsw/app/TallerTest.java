package edu.escuelaing.arsw.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class TallerTest
    extends TestCase
{
//    public void testPhyRecursive(){
//       String file = "/src/main/resources/carpeta";
//       assertTrue(SecondVersion.calculateTotalLinesFromDirectory(new String[]{"phy",file}) == 12);
//    }

    public void testPhyOneFile(){
        assertTrue(FirstVersion.countLinesPhysical("src/main/resources/English.java") == 45);
    }
    public void testLocOneFile(){
        assertTrue(FirstVersion.countLinesOfCode("src/main/resources/English.java") == 27);
    }
}
