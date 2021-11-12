package corejava.intermediate.assignment;
class Bank1
{
	public int totalBal;
	public Bank1(int totalBal)
	{
		this.totalBal=totalBal;
	}
	public int getBal()
	{
		return totalBal;
	}
}
class SavingAcct extends Bank1
{
	int fixeddeposite;
	SavingAcct(int totalBal,int fixeddeposite)
	{
		super(totalBal);
		this.fixeddeposite=fixeddeposite;
	}
	public int getBal()
	{
		int savingBal=totalBal+fixeddeposite;
		return savingBal;
	}
	public void show()
	{
		System.out.println("Balance" +totalBal);
		System.out.println("Fixed Deposite "+fixeddeposite);
		System.out.println("Saving Account total Bal: "+getBal());
	}
}

class CurrentAcct extends Bank1
{
	int cashcredit;
	public CurrentAcct(int totalBal,int cashcredit) 
	{
		super(totalBal);
		this.cashcredit=cashcredit;
		// TODO Auto-generated constructor stub
	}
	void show()
	{
		System.out.println("Balance"+totalBal);
		System.out.println("Cash Credit"+cashcredit);
		System.out.println("Cureent acount total Bal "+getBal());
	}

	
}
public class MainClass3 
{

	public static void main(String[] args) 
	{
		SavingAcct sa=new SavingAcct(1200, 1000);
		sa.show();
		
		CurrentAcct ca=new CurrentAcct(1000,500);
		ca.show();
		
		int totalBankBal=sa.getBal()+ca.getBal();
		System.out.println("Total Balance in the Account is :"+totalBankBal);
	}

}
