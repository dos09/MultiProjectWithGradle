package tester;

import static org.junit.Assert.*;
import org.junit.Test;

import formatter.Formatter02;

public class Tester {
    @Test
    public void test01 () {
        assertEquals("UPdown", Formatter02.swapCase("upDOWN"));
    }
}
