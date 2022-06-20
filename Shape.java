/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author sam
 */
public abstract class Shape {

    /**
     * @param args the command line arguments
     */
    public void printShapeName() {
        System.out.println("Generic Shape");
    }

    public double calculateArea() {
        return 0.0;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Shape s1 = new Shape();
        //System.out.println("The area of the shape: " + s1.calculateArea());
        Shape r1 = new Rectangle(5.2, 3.12);
        r1.printShapeName();
        System.out.println("The area of the shape: " + r1.calculateArea());
        ((Rectangle) r1).sayHi();
    }

}
