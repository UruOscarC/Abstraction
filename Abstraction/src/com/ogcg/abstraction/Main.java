package com.ogcg.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape s1 = new Circle("rojo", 2.2);
        Shape s2 = new Rectangle("verde", 2, 4);
         
        System.out.println(s1.toString());
        System.out.println(s2.toString());
	}

}
