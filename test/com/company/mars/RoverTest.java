package com.company.mars;

import com.company.enums.DirectionsEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    private Rover rover;

    @BeforeEach
    public void setUp() {
        rover = new Rover(1, 1, DirectionsEnum.N);
    }

    @Test
    public void testRoverAdvances() {
        rover.advance();
        assertEquals(1, rover.getPosition().getxCoordinate());
        assertEquals(2, rover.getPosition().getyCoordinate());
    }
}
