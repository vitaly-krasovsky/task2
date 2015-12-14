package com.epam.training.domain;

/**
 * Represents cone.
 *
 * @author Vitaly_Krasovsky.
 */
public class Cone extends AbstractFigure {
    private long radius;
    private long height;

    public Cone(long radius, long height) {
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
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double calculateVolume() {
        return 1 / 3 * Math.PI * radius * height;
    }
}
