package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GreatestNumberTest {

    @Test
    void testGreatest() {
        GreatestNumber obj = new GreatestNumber();
        assertEquals(5, obj.findGreatest(5, 10));
    }
}
