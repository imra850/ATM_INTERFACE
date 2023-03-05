import java.util.*;
interface ATM
{
	void History();
	void Deposit(int Amount);
	void Withdraw(int Amount1);
	void Transfer(int Amount2);
}
class ATM1 implements ATM
{
	ArrayList<String> ar = new ArrayList<>();
	
	public int balance=1000;
	ATM1()
	{
		boolean f=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("*****Welcome to ATM*****");
		System.out.println("******************************************");
		System.out.println("Enter UserID :");
		String u=sc.next();
		System.out.println("********Enter Password********");
		int p=sc.nextInt();
		System.out.println("*******************************************");
		
		if(u.equals("imran")&& p==9770)
		{
			f=true;
			
			while(f==true)
			{
				System.out.println("SELECT WHAT YOU WANT TO DO?");
				System.out.println("PRESS 1 ------------>Deposit");
				System.out.println("PRESS 2 ------------>Withdraw");
				System.out.println("PRESS 3 ------------>Transfer");
				System.out.println("PRESS 4 ------------>History");
				System.out.println("PRESS 5 ------------>EXIT");
				int c=sc.nextInt();
				
				switch(c)
				{
				case 1:
					System.out.println("Enter Amount You Want To Deposit");
					int Amount=sc.nextInt();
					Deposit(Amount);
					break;
				case 2:
					System.out.println("Enter Amount You Want To Withdram");
					int Amount1=sc.nextInt();
					Withdraw(Amount1);
					break;
				case 3:
					System.out.println("Enter Amount You Want To Withdram");
					int Amount3=sc.nextInt();
					Withdraw(Amount3);
					break;
				case 4:
					System.out.println("-----------------------------------------------------");
					System.out.println("Transaction History are ");
					History();
					break;
				case 5:
					System.out.println("Please Collect your card");
					System.out.println("Thank you for Choosing us");
					System.out.println("Logging out");
					f=false;
				}
			}
		}
		else
		{
			System.out.println("Invalid UserId or Password");
			System.out.println("Please Enter Valid UserId and Password");
			System.out.println("Thank you");
		}
	}
	public void Deposit(int Amount)
	{
		balance += Amount;
		System.out.println("****************************************************************");
		System.out.println("***************Amount Deposit Successfully**********************");
		System.out.println("Amount Deposite is " +Amount);
		System.out.println("Total Balance of Account is" +balance);
		System.out.println("****************************************************************");
		ar.add("Deposit"+Amount+" || Balance"+balance);
		System.out.println("");
		System.out.println("");
	}
	public void Withdraw(int Amount1)
	{
		Scanner sc=new Scanner(System.in);
		if(balance>=Amount1)
		{
			balance -= Amount1;
			System.out.println("*********************************************************");
			System.out.println("**************Withdraw Successfully**********************");
			System.out.println("****************collect your case************************");
			System.out.println("Amount Withdraw is"+Amount1);
			System.out.println("Total Balance of Account After withdraw"+balance);
			System.out.println("*********************************************************");
			ar.add("Withdraw"+Amount1+" || Balance"+balance);
			System.out.println("");
			System.out.println("");
			
		}
		else
		{
			System.out.println("Insufficient Balance");
			System.out.println("Enter a valid amount");
			Amount1=sc.nextInt();
			Withdraw(Amount1);
		}
	}
	
	public void Transfer(int Amount3)
	{
		Scanner sc=new Scanner(System.in);
		if(balance>=Amount3)
		{
			balance -= Amount3;
			System.out.println("*********************************************************");
			System.out.println("Enter 4 Digit Account Number to which you want to transfer money" );
			int a=sc.nextInt();
			System.out.println("**************Transaction Successfully**********************");
			System.out.println("You Transferred Rs"+Amount3+"to Account Number"+a);
			System.out.println("Total Balance of Account After Transfer"+balance);
			System.out.println("*********************************************************");
			ar.add("Withdraw"+Amount3+" || Balance"+balance);
			System.out.println("");
			System.out.println("");
			
		}
		else
		{
			System.out.println("Insufficient Balance");
			System.out.println("Enter a valid amount");
			Amount3=sc.nextInt();
			Withdraw(Amount3);
		}
	}
	
	public void History()
	{
		
		if(ar.size()==0)
		{
			System.out.println("No History Available");
			
		}
		for(int i=ar.size()-1;i>=0;i--)
		{
			System.out.println(ar.get(i));
			System.out.println("***************************************");
		}
		
			System.out.println("Initial Balance: 1000");
			System.out.println("***************************************");
			System.out.println("");
			System.out.println("");
		
	}
	
}

public class Atm_interface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ATM1 a=new ATM1();

	}

}
