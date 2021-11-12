package corejava.intermediate.assignment;

class Manager extends Employee
{
	int salary;
	int incentive;
	int totalSalary;
	
	Manager(int salary, int incentive) 
	{
		this.salary=salary;
		this.incentive=incentive;
	}
	void getSalary()
	{
		System.out.println("Managers total Salary is: "+salary);
	}
	int totalSalary()
    {
          
         int totalSalary=salary+incentive;
         return totalSalary;
    }
	
	
}

class Labour extends Employee
{
	 int salary1;
	 int overtime;
	 int totalSalaryl;
	 public Labour( int salary1, int overtime) 
		{
	    	 this.overtime=overtime;
	    	 this.salary1=salary1;

		}
	 
	 public void getSalary()
	 	{
		 System.out.println("Labours TotalSalary is: " +salary1);
	 	}
	 public int totalSalaryl()
	 { 
		 int totalSalaryl= salary1+overtime;
		 return totalSalaryl;
	 }
	 
     
}

abstract class Employee 
{
	abstract void getSalary();
}

public class Organisation 
{

	public static void main(String[] args) 
	{
        Manager m1 = new Manager (2000, 200);
        System.out.println("Salary of Manager= "+m1.totalSalary);
        m1.getSalary();
        Labour l1=new Labour(1500,150);
        System.out.println("Salary of Labour= "+l1.totalSalaryl);
        l1.getSalary();
        
        int totalEmpSalary= m1.totalSalary+l1.totalSalaryl;
        System.out.println("Total Salary of the employees is : "+totalEmpSalary);


	}

}
