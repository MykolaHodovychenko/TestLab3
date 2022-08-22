package ua.opnu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("Adding two numbers")
    public void testFunc() {
        assertEquals(Main.func(2, 2), 5, "Херня какая-то");
    }

}
