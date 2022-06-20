/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author sam
 */
public class Rectangle extends Shape {

    private double L;
    private double H;

    public Rectangle(double l, double h) {
        this.L = l;
        this.H = h;
    }

    public Rectangle() {
        this.H = 0;
        this.L = 0;
    }

    @Override
    public void printShapeName() {
        System.out.println("Rectangle Shape");
    }
    
    @Override
    public double calculateArea() {
        return this.L * this.H;
    }
    public void sayHi(){
    System.out.println("Hi rectangle");
    }
}
