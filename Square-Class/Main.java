
package com.mycompany.square_project;

public class Main {
    public static void main(String[] args) {
       Square squ = new Square(5, 3);
       
        squ.printDetails();
        System.out.println("Area: " + squ.getArea());

        squ.setLength(10);
        squ.setWidth(4);

        squ.printDetails();
        System.out.println("Updated Area: " + squ.getArea());
    }
}
