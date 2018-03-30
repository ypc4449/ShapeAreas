package com.pradeep.SortingShapes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.pradeep.CompareShapeArea.CompareShapeArea;
import com.pradeep.GenericShape.Shape;
import com.pradeep.shapes.Circle;
import com.pradeep.shapes.Rectangle;
import com.pradeep.shapes.Square;


public class SortShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle("Circle", 7);
		Shape rectangle = new Rectangle("Rectangle",2, 4);
		Shape square = new Square("Square", 5);
		
		
		System.out.println("Shapes Before Sorting ");
		
		System.out.println("The area of " +circle.toString()+ " is " +circle.getArea());
		System.out.println("The area of " +rectangle.toString()+ " is " +rectangle.getArea());
		System.out.println("The area of " +square.toString()+ " is " +square.getArea());
		
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(circle);
		shapes.add(rectangle);
		shapes.add(square);
		
		CompareShapeArea compareshapearea =new CompareShapeArea();
		Collections.sort(shapes,compareshapearea);
		
		System.out.println("Shapes After Sorting ");
		System.out.println(shapes);
		

	}
}


