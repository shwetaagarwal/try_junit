package gl.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeapYearTest{

    //div by 4 and 400

    @Test
    public void TestLeapYearDivBy4(){

        assertEquals("Should be leap",true,Year.isLeap(2016));

    }
    @Test
    public void TestLeapYearNotDivBy4(){
        assertEquals("Should not be leap year",false,Year.isLeap(2015));

    }
    @Test
    public void TestLeapYearNotDivBy4notBy400(){
        assertEquals("Should not be leap year",false,Year.isLeap(1900));

    }
    @Test
    public void TestLeapYearNotDivBy4AndBy400(){
        assertEquals("Should be leap year",true,Year.isLeap(2400));

    }
}
