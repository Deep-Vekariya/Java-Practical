import java.util.*;

public class BankAccount{

	String name;
	String acc_type;
	static double acc_no=0;
	double balance = 0;
	Scanner scanner = new Scanner(System.in);

	// Create account
	void CreateAcc(){
			System.out.print("Enter Account Holder Name : ");
			name = scanner.nextLine();
			System.out.print("Enter Account Type (Saving / Current) : ");
			acc_type = scanner.nextLine();
			acc_no++;
			System.out.println();
	}

	// Deposit balance
	void Deposit(){
		double deposit_balance;
		System.out.print("How Much Ammount You Want to Deposit : ");
		deposit_balance = scanner.nextDouble();
		if(deposit_balance < 0){
			System.out.println("Invelid Ammount");
		}
		balance += deposit_balance;
		System.out.println("Successfully Deposit " + deposit_balance);
		System.out.println("Awailable Balance : "+ balance);
		System.out.println();
	}

	// Withdraw balance
	void Withdraw(){
		double withdraw_ammount;
		System.out.print("How Much Ammount You Want to Withdraw : ");
		withdraw_ammount=scanner.nextDouble();
		if(withdraw_ammount < 0){
			System.out.println("Invalid Ammount");
		}
		balance -= withdraw_ammount;
		System.out.println("Successfully Withdraw "+ withdraw_ammount);
		System.out.println("Awailable Balance : "+ balance);
		System.out.println();
	}

	// Inquiry
	void Inquiry(){
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Number : " + acc_no);
		System.out.println("Account Type : " + acc_type);
		System.out.println("Account Balance : " + balance);
		System.out.println();
	}
}


public class BankAcMain{
	public static void main(String[] args){
		BankAccount b1=new BankAccount();
		b1.CreateAcc();
		b1.Deposit();
		b1.Withdraw();
		b1.Inquiry();
	}
}
