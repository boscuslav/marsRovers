package com.company.utils;

import com.company.enums.DirectionsEnum;

public class HeadingNode {
    private DirectionsEnum direction;
    private HeadingNode nextNode;
    private HeadingNode previousNode;

    public HeadingNode(DirectionsEnum direction) {
        this.direction = direction;
    }

    public DirectionsEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionsEnum direction) {
        this.direction = direction;
    }

    public HeadingNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(HeadingNode nextNode) {
        this.nextNode = nextNode;
    }

    public HeadingNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(HeadingNode previousNode) {
        this.previousNode = previousNode;
    }
}
