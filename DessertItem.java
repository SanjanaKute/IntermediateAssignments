package corejava.intermediate.assignment;

import java.util.Scanner;

abstract class DessertItems
{
	public abstract void getCost();
	
	public int tax;
	public void DessertItem(int tax)
	{
		this.tax=tax;
	}
	
}

class Candy extends DessertItems
{
	int dollar;
	
	/*public Candy(int i, int j) {
		// TODO Auto-generated constructor stub
	}*/
	public  Candy(int dollar,int tax )
	{ 
		//super(tax);
		this.dollar=dollar;
	}
	public void getCost()
	{
		int itemprice=0;
		int rupees=60;
		int totalprice=dollar/rupees;
		System.out.println("Candy "+(itemprice=totalprice+tax) +"$");
	}
}

class Cookie extends DessertItems
{
	int euro;
	public  Cookie(int euro,int tax)
	{
		//super(tax);
		this.euro=euro;
	}
	public void getCost()
	{
		int itemprice=0;
		int rupees=70;
		int totalprice=euro/rupees;
		System.out.println("Cookie "+(itemprice=totalprice+tax) +"Euro");

	}
}

class IceCream extends DessertItems
{
	//super(tax);
	int rupees;
	public  IceCream(int rupees,int tax)
	{
		//super(tax);

		this.rupees=rupees;
	}
	public void getCost()
	{
		int itemprice=0;
        System.out.println("Cookies "+(itemprice=rupees+tax )+ "Rs.");
	}
}

public class DessertItem
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the role");
			String role=sc.nextLine();
			
			if(role.equals("Customer"))
			{
				customer();
			}
			else if(role.equals("Owner"))
			{
				Owner();
			}

		}

		private static void customer() 
		{
			System.out.println("Welcome..!!!");
			
			Scanner sc=new Scanner(System.in);
			DessertItems di=new Candy(110,11);
			di.getCost();
			
			DessertItems di1=new Cookie(500,20);
			di1.getCost();
			
			DessertItems di2=new IceCream(150,10);
			di2.getCost();
			
			System.out.println("What you would like to have CANDY COOKIE or ICECREAM");
			String input=sc.nextLine();
			
			if(input.equals("Candy"))
			{
				System.out.println("Ordered Candy");
			}
			else if(input.equals("Cookie"))
			{
				System.out.println("Ordered Cookie");
			}
			else if(input.equals("IceCream"))
			{
				System.out.println("Ordered IceCream");
			}
			
			
			
			
		}

		private static void Owner() 
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("What we have to add in our stock Candy, Cookie or IceCream");
			String addItem=sc.nextLine();
			if(addItem.equals("Candy"))
			{
				System.out.println("Candy added in the shop");
			}
			else if(addItem.equals("Cookie"))
			{
				System.out.println("Cookie added in the shop");
			}
			else if(addItem.equals("IceCream"))
			{
				System.out.println("IceCream added in the shop");
			}
		}

}


