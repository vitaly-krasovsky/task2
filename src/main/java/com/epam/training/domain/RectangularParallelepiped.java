package com.epam.training.domain;

/**
 * Represents rectangular parallelepiped.
 *
 * @author Vitaly_Krasovsky.
 */
public class RectangularParallelepiped extends AbstractFigure {
    private long side1;
    private long side2;
    private long height;

    public RectangularParallelepiped(long side1, long side2, long height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public long getSide1() {
        return side1;
    }

    public void setSide1(long side1) {
        this.side1 = side1;
    }

    public long getSide2() {
        return side2;
    }

    public void setSide2(long side2) {
        this.side2 = side2;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "RectangularParallelepiped{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", height=" + height +
                '}';
    }

    @Override
    public double calculateVolume() {
        return side1 * side2 * height;
    }
}
