package com.uc.test_example.armstrong_number;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Armstrong TEST")

public class ArmstrongNumberTest {
    private ArmstrongNumber armstrongNumber;

    @BeforeEach
    void setUp() {
        armstrongNumber = new ArmstrongNumber();
    }

    @Test
    @DisplayName("Armstrong sayı senaryosu")
    void returnTrueWhenTheNumberIsArmstrong() {
        int armstrongNumber = 407;
        assertEquals(Boolean.TRUE,this.armstrongNumber.isArmstrong(armstrongNumber));
    }
    @Test
    void returnFalseWhenTheNumberIsNotArmstrong() {
        int armstrongNumber = 125;
        assertEquals(Boolean.FALSE,this.armstrongNumber.isArmstrong(armstrongNumber));
    }
    @Test
    void throwsIllegalArgumentExceptionWhenNegativeNumber() {

        assertThrows(IllegalArgumentException.class,()->this.armstrongNumber.isArmstrong(-1));
    }
}
