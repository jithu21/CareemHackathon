package com.careem.hack.models;

import javax.persistence.Embeddable;

/**
 * Created by Vineet on 25/02/17.
 */
@Embeddable
public class Dimension {
    private double height;
    private long width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
