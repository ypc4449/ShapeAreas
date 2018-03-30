package com.pradeep.CompareShapeArea;

import java.util.Comparator;

import com.pradeep.GenericShape.Shape;

public class CompareShapeArea implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return new Float(o1.getArea()).compareTo(new Float (o2.getArea()));
	}

}
