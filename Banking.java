class Bank 
{
String bankName;
int accountNumber;
int accountBalance;
String accountHolderName;
}
void setDetails(String bn, int an, int ab, String n)
{
bankName = bn;
accountNumber = an;
accountBalance = ab;
accountHolderName = n;
}
void getDetails()
{
System.out.println("Bank name is "+bn);
System.out.println("Account Number is "+an);
System.out.println("Account balance is "+ab);
System.out.println("Account holder name is"+n);
}
void deposit(int amt)
{
 accountBalance = accountBalance + amt;
System.out.println("The Balance after deposition is :"+accountBalance);
}
void withdraw(int amt)
{
accountBalance = accountBalance - amt;
System.out.println("The Balance after withdawal is :"+accountBalance);
}
Class Banking
{
public static void main(String args[])
{
Bank b = new Bank;
b.setDetails("Union",3125,45000,"Karan");
b.getDetails();
b.deposit(15000);
b.withdraw(8000);
}
}
