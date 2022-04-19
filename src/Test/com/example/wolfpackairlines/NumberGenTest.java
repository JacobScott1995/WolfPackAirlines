package com.example.wolfpackairlines;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class NumberGenTest {

    @Test
    void uniqueCheck() {
        Assert.assertEquals(75941, NumberGen.UniqueCheck(75941), "This works right?");
    }
}