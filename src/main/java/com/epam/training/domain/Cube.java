package com.epam.training.domain;

/**
 * Represents cube.
 *
 * @author Vitaly_Krasovsky.
 */
public class Cube extends AbstractFigure {
    private long side1;

    public Cube(long side1) {
        this.side1 = side1;
    }

    public long getSide1() {
        return side1;
    }

    public void setSide1(long side1) {
        this.side1 = side1;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side1=" + side1 +
                '}';
    }

    @Override
    public double calculateVolume() {
        return side1 * side1 * side1;
    }
}
