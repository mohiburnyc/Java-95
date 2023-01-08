import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Shape sh = null;
		//sh = new Shape(); //Cannot instantiate the type Shape
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("which shape you want to work with [1.Rect|2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		 case 1:
			sh = new Rectangle("Blue", 12,8);
			break;
		 case 2:
			sh = new Circle("Red", 12.5f);
			break;
		 default:
			 System.out.println("INVALID SHAPE SELECTION ... TRY AGAIN");
			 return;
		}//switch
		
		System.out.println("\n=============== SHAPE = " + sh.getClass().getName().toUpperCase() + " ===============\n");
		
		System.out.println("Color of " + sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
	}
}
