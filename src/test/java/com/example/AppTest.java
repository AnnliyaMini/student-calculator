package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest
{
    @Test 
    void addsPositiveNumbers()
    {
        assertEquals(30,App.add(10,20));
    }

    @Test
    void addZero()
    {
        assertEquals(7,App.add(0,7));
    }

    @Test
    void addsNegativeNumber()
    {
        assertEquals(-5,App.add(-2,-3));
    }
}
