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

        System.out.println(rover.toString());
    }
}
