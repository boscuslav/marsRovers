package com.company.utils;

import com.company.enums.DirectionsEnum;

public class Position {
    private Integer xCoordinate;
    private Integer yCoordinate;

    public Position(Integer xCoordinate, Integer yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Integer getxCoordinate() {
        return xCoordinate;
    }

    public Integer getyCoordinate() {
        return yCoordinate;
    }

    public void advance(DirectionsEnum direction) {
        this.xCoordinate += direction.xAdvance;
        this.yCoordinate += direction.yAdvance;
    }

    @Override
    public String toString() {
        return xCoordinate + " " + yCoordinate;
    }
}
