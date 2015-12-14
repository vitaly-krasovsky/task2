package com.epam.training.domain;

/**
 * Represents half sphere.
 *
 * @author Vitaly_Krasovsky.
 */
public class HalfSphere extends AbstractFigure {
    private long radius;
    private long height;

    public HalfSphere(long radius, long height) {
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
        return "HalfSphere{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calculateVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3) / 2 * height;
    }
}
