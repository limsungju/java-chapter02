package kr.co.itcen.main;

import kr.co.itcen.i.Drawable;
import kr.co.itcen.i.Resizable;
import kr.co.itcen.paint.shape.Circle;
import kr.co.itcen.paint.shape.Rect;
import kr.co.itcen.paint.shape.Shape;
import kr.co.itcen.paint.shape.Triangle;
import kr.co.itcen.point.ColorPoint;
import kr.co.itcen.point.Point;
import kr.co.itcen.text.GraphicText;

public class Main {
	
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		
		//drawPoint(p1);
		p1.show(false);
		
		Point p2 = new Point(100,200);
		//draw(new Point(100,200);
		//draw((Drawable)new Point(100,200);
		//drawPoint(p2);
		
		//Point cp1 = new ColorPoint();
		//ColorPoint cp1 = new ColorPoint();
		
		//cp1.setX(300);
		//cp1.setY(200);
		//((ColorPoint)cp1).setColor("yellow");
		
		//cp1.setColor("yellow");
		
		draw(new ColorPoint(300,200, "yellow"));
		
		//cp1.show();
		
		Triangle triangle = new Triangle();
		draw(triangle);
		
		Rect rect = new Rect();
		draw(rect);
		
		Circle circle = new Circle();
		draw(circle);
		
		Drawable drawable = new GraphicText("Hello");
		draw(drawable);
		
		Shape s1 = new Triangle();
		// Down Casting : 명시적(Explicity)
		((Triangle)s1).setX1(10);
		
		// Up Casting : 암시적(Implicity)
		Rect s2 = new Rect();
		Shape s3 = s2;
		
		// instanceof 연산자
		Shape s = new Circle();
		
		// 자식인지 아닌지
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Rect);
		// 구현 했는지 안했는지
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle circle1 = new Circle();
		System.out.println(circle1 instanceof Shape);
		System.out.println(circle1 instanceof Circle);
		// 계층관계가 성립하지 않으면 연산자를 사용할 수 없다.
		//System.out.println(circle1 instanceof Triangle);
		//System.out.println(circle1 instanceof Rect);
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	public static void resize(Drawable drawable) {
		if(drawable instanceof Resizable) {
			((Resizable)drawable).resize();
		}
	}
	
	/*
	 * public static void drawPoint(Point point) { point.show(); }
	 * 
	 * public static void draw(Triangle triangle) { triangle.draw(); }
	 * 
	 * public static void draw(Rect rect) { rect.draw(); }
	 * 
	 * public static void draw(Circle circle) { circle.draw(); }
	 */
}
