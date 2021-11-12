package corejava.intermediate.assignment;

 class Demo extends AbstractionTestCases                   //3rd When we extend an abstract class, we must override a method of make a class abstract.
{
	void test()
	{
		
	}
}

abstract class Demo2 extends AbstractionTestCases
{
	                                                       //5th.we can declade a class abstract without having a class abstract
}
abstract public/*[private] */ class AbstractionTestCases   //4th..abstarct class cannot be private
{
	abstract void test();                                  //1..if any class has any of its method abstarct then you must declare entire class abstarct
	public static void main(String[] args) 
	{
		AbstractionTestCases a=new AbstractionTestCases(); //2..abstract class cannot be instantiated
	}
	
}

