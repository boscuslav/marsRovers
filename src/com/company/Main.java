package com.company;

import com.company.enums.DirectionsEnum;
import com.company.mars.Grid;
import com.company.mars.Rover;

public class Main {

    public static void main(String[] args) {
        Grid grid = new Grid(5, 5);

        Rover rover = new Rover(1,2, DirectionsEnum.valueOf("N"));
        grid.addRover(rover);
        rover.executeSequence("LMLMLMLMM");

        Rover rover2 = new Rover(3, 3, DirectionsEnum.valueOf("E"));
        grid.addRover(rover2);
        rover2.executeSequence("MMRMMRMRRM");

        System.out.println(rover.toString());
        System.out.println(rover2.toString());
    }
}
