package com.company.mars;

import com.company.enums.DirectionsEnum;
import com.company.enums.RotationEnum;
import com.company.utils.HeadingNode;
import com.company.utils.HeadingsList;
import com.company.utils.Position;

import java.util.Arrays;

public class Rover {
    private Position position;
    private HeadingNode heading;

    public Rover(Integer xCoordinate, Integer yCoordinate, DirectionsEnum directionsEnum) {
        this.position = new Position(xCoordinate, yCoordinate);
        this.heading = HeadingsList.getInstance().getHeadingNode(directionsEnum);
    }

    public void rotate(RotationEnum rotation) {
        switch (rotation) {
            case L:
                heading = heading.getPreviousNode();
                break;
            case R:
                heading = heading.getNextNode();
                break;
        }
    }

    public void advance() {
        position.advance(heading.getDirection());
    }

    public void executeSequence(String sequence) {
        for (Character action : sequence.trim().toCharArray()) {
            if (action.equals('M')) {
                this.advance();
            } else {
                this.rotate(RotationEnum.valueOf(String.valueOf(action)));
            }
        }
    }

    public Position getPosition() {
        return position;
    }

    public String toString() {
        return position.toString() + " " + heading.getDirection().toString();
    }
}
