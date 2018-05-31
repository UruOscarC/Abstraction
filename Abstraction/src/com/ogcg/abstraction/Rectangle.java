package com.ogcg.abstraction;

public class Rectangle extends Shape {

	double length;
    double width;
     
    public Rectangle(String color,double length,double width) {
        super(color);
        System.out.println("Constructor de rectangulo");
        this.length = length;
        this.width = width;
    }
     
    @Override
    double area() {
        return length * width;
    }
 
    @Override
    public String toString() {
        return "El color del rectangulo es " + super.color + 
                           " y su area es: " + area();
    }

}
