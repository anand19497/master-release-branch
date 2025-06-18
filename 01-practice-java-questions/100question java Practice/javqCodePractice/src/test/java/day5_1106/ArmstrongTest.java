package day5_1106;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArmstrongTest {

    @Test
    void testArmstrongNumbers() {
        Assertions.assertTrue(Armstrong.isArmStrong(153));  // 1³ + 5³ + 3³ = 153
        Assertions.assertTrue(Armstrong.isArmStrong(370));  // 3³ + 7³ + 0³ = 370
        Assertions.assertTrue(Armstrong.isArmStrong(9474)); // 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474
    }




    @Test
    void testNonArmstrongNumbers() {
        Assertions.assertFalse(Armstrong.isArmStrong(123));
        Assertions.assertFalse(Armstrong.isArmStrong(100));
        Assertions.assertFalse(Armstrong.isArmStrong(250));
    }
}