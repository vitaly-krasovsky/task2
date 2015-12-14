package com.epam.training.domain;

/**
 * Represents cylinder.
 *
 * @author Vitaly_Krasovsky.
 */
public class Cylinder extends AbstractFigure {
    private long radius;
    private long height;

    public Cylinder(long radius, long height) {
        this.radius = radius;
        this.height = height;
    }

    public long getRadius() {
        return radius;
    }

    public void setRadius(long radius) {
        this.radius = radius;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
