//wap in java to Display Bank details of a customer.
Author by:- RITIKA ADLAKHA                                     */


import java.util.Scanner;
class displayBank{
public static void main(String args[])
{
	Scanner S1 = new Scanner (System.in);                   //getting values from user
	System.out.println("Enter your account number");
        int accountNumber = S1.nextInt();
	System.out.println("Enter your name");
        String customerName = S1.next();
	System.out.println("Enter your account balance");
        int accountBalance = S1.nextInt();
	System.out.println("Enter your amount");
        int Amount = S1.nextInt();
   customerDetails coustomer = new customerDetails();                                  //creating object 1
	coustomer.createAccount(accountNumber,customerName,accountBalance);
	coustomer.depositAmount(Amount);
	coustomer.getAmount();
	coustomer.withdrawAmount(Amount);
	coustomer.getAmount();
	customerDetails coustomer1 = new customerDetails();                              //creating object 2
	coustomer1.createAccount(9876546,"Gunjan",4000);
	coustomer1.depositAmount(2000);
	coustomer1.getAmount();
	coustomer1.withdrawAmount(5500);
	coustomer1.getAmount();
}
}
class customerDetails
{
	private int accNumber;
	private String accHolderName;
	private int accBalance;
public void createAccount(int accountNumber, String customerName, int accountBalance)               //calling method for print customer details
{
	accNumber = accountNumber;
	accHolderName = customerName;
	accBalance = accountBalance;
}
public void depositAmount(int amount)                                                        //calling method for deposit amount
{	
	System.out.println("You are depositing. "+amount);	
	accBalance += amount;
}
public void withdrawAmount(int Amount)                                                       //calling method for withdraw amount
{
	System.out.println("You are withdrawing "+Amount);	
 	accBalance -= Amount;
	
}
public void getAmount()                                                                       //calling method to print amount of the customer
{
	System.out.println(accHolderName+" Sir You Have "+accBalance+" in Your Account");
}
}