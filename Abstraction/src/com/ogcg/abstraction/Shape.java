package com.ogcg.abstraction;

public abstract class Shape {
	
	String color;
    
    abstract double area();
    public abstract String toString();
    
    public Shape(String color) {
        System.out.println("Constructor de Shape");
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
}
