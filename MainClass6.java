package corejava.intermediate.assignment;

abstract class Persistence
{
	 abstract void persist();
}
class FilePersistence extends Persistence
{

	@Override
	void persist() 
	{
		System.out.println("filee is saved file");
		
	}
	
}
class DatabasesPersistence extends Persistence
{

	@Override
	void persist() 
	{
		System.out.println("Filee is saved in database");
		
	}
	
}
 /*class Person extends Persistence
{

	@Override
	void persist()
	{
		System.out.println("File Saved");
	}
	//Persistence p=new Persistence();
	
}*/

 
public class MainClass6 
{ 
	public static void main(String[] args)
	{
		Persistence p=new Persistence(){

			@Override
			void persist() 
			{
			 System.out.println("File Saved");	
			}
			
		};
			p.persist();
	}
}
