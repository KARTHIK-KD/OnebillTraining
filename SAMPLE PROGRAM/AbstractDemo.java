package sampe;

abstract class shap{
	abstract void draw();
}

class Rectangle extends shap{
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		shap obj=new Rectangle();
		obj.draw();
		
	}

}
