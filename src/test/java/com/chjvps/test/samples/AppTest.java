package com.chjvps.test.samples;


import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Sample test case for testNG
 */
public class AppTest
{
    @Test
    public static void testPassed(){
        Reporter.log("Case passed");
        System.out.println("Hello world");
    }

    @Test
    public static void testFailed() throws AssertionError {
        Reporter.log("Case failed");
        throw new AssertionError("Case failed");
    }
}
