package corejava.intermediate.assignment;

abstract class Shapes
{
	public abstract void draw();  
}

 class Line extends Shapes
{
	public void draw()
	{
		System.out.println("Line Drawn ");
	}
}
 
 class Rectangle extends Shapes
{
	public void draw()
	{
		System.out.println("Rectangle Drawn");
	}
}
 
class Cube extends Shapes
{
	public void draw()
	{
		System.out.println("Cube Drawn");
	}
}

class MainClass5 
{

	public static void main(String[] args) 
	{
		Shapes c= new Cube();
		c.draw();
		new Rectangle().draw();
		new Line().draw();

	}

}
