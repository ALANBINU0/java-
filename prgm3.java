package alan;

class Stage{
	public int area(int side) {
		System.out.println("I am Square");
		return side*side;
	}
    public int area(int l,int b) {
    	System.out.println("I am rectangle");
    	return l*b;
    }
    public float area(float radius) {
    	System.out.println("I am circle");
    	return 3.14f*radius*radius;
    }
    
}

public class prgm3 {
	public static void main(String[] args) {
		Stage Stages=new Stage();
		int rectangleArea=Stages.area(4,5);
		System.out.println("Area of rectangle;"+rectangleArea);
		int squareArea=Stages.area(4);
		System.out.println("Area of square;"+squareArea);
		float circleArea=Stages.area(4f);
		System.out.println("Area of circle;"+circleArea);
	}
	
		
	}
	


