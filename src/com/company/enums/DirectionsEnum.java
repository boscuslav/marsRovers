package com.company.enums;

public enum DirectionsEnum {
    N(0, 1),
    E(1, 0),
    S(0, -1),
    W(-1, 0);

    public final Integer xAdvance;
    public final Integer yAdvance;

    private DirectionsEnum(Integer xAdvance, Integer yAdvance) {
        this.xAdvance = xAdvance;
        this.yAdvance = yAdvance;
    }
}
