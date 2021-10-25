package com.company.mars;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    private Integer height;
    private Integer width;

    private List<Rover> rovers = new ArrayList<>();

    public Grid(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public void addRover(Rover rover) {
        rovers.add(rover);
    }

    public List<Rover> getRovers() {
        return rovers;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
