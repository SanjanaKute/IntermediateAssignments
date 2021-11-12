package corejava.intermediate.assignment;

class SavingAccount 
{
	private int acntno;
	private String name;
	private int totalBal;
	private int moneyused;
	
	public SavingAccount( int acntno,String name )
	{
		this.acntno=acntno;
		this.name=name;	
		this.totalBal=6000;
		this.moneyused=0;
	}
	void fixeddeposit()
	{
		
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setmoneyused(int usedmoney)
	{
		moneyused=moneyused+usedmoney;
	}
	public int getBal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
class CurrentAccount extends MainClass2
{
	private int acntno;
	private String name;
	private int totalBal;
	private int moneyused;
	void cashcredit()
	{
		
	}
	public  CurrentAccount(int acntno, String name )
	{
		this.acntno=acntno;
		this.name=name;	
		this.totalBal=10000;
		this.moneyused=moneyused;
	}
	public int getacntno()
	{
		return acntno;
	}
	
	
	public String getname()
	{
		return name;
	}
	
	public int getmoneyused()
	{
		return moneyused;
	}
	
}
class Bank extends MainClass2
{
	private double money=2000000;
	public double getMoney()
	{
		return money;
	}
	public void setMoney(double Money)
	{
		 this.money=money();
	}
	
	private double money() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void withdraw()
	{
		System.out.println("Account has been debited");
	}
}
public class MainClass2 
{
	public static void main(String[] args) 
	{
		Bank n=new Bank();
		//n.setMoney(5000);
		System.out.println("There is " +n.getMoney()+ " in the bank.");
	}

}
