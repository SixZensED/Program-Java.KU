
package com.mycompany.square_project;

public class Square {

    private int length;
    private int width;

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public void printDetails() {
        System.out.println("Rectangle [length = " + length + ", width = " + width + "]");
    }
}
