package com.company.utils;

import com.company.enums.DirectionsEnum;

import java.util.LinkedList;

public class HeadingsList {
    private static HeadingsList instance;

    private HeadingNode head;

    LinkedList<HeadingNode> headings;

    private HeadingsList() {
        head = new HeadingNode(DirectionsEnum.N);
        HeadingNode eastNode = new HeadingNode(DirectionsEnum.E);
        HeadingNode southNode =  new HeadingNode(DirectionsEnum.S);
        HeadingNode westNode =  new HeadingNode(DirectionsEnum.W);

        head.setNextNode(eastNode);
        eastNode.setNextNode(southNode);
        southNode.setNextNode(westNode);
        westNode.setNextNode(head);

        head.setPreviousNode(westNode);
        westNode.setPreviousNode(southNode);
        southNode.setPreviousNode(eastNode);
        eastNode.setPreviousNode(head);
    }

    public static HeadingsList getInstance() {
        if (instance == null) {
            instance = new HeadingsList();
        }
        return instance;
    }

    public HeadingNode getHeadingNode(DirectionsEnum direction) {
        HeadingNode currentNode = this.head;

        if (direction == null) {
            return null;
        }

        while(true) {
            if (currentNode.getDirection().equals(direction)) {
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
    }
}
