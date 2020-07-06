package bank_account;

class BankAccount
{
long acctnum;
double balance;
String name;
String email;
long phonenum;
  
public BankAccount()
{
acctnum = 123456789;
balance = 50.0;
name = "Abby Truong";
email = "vananhtrg@gmail.com";
phonenum = 5418017187L;
}
  
void deposit(double amt){
balance+=amt;
}

void withdraw(double amt){
if(balance-amt<0)
System.out.println("Insufficient funds"+this.name+"\t"+this.balance);
else
{
balance-=amt;
System.out.println("Withdraw success") ;
}
  
}
void printdetails()
{
System.out.println("Name :"+this.name +"\nAccount Number"+ this.acctnum + "Balance : "+this.balance +"\nEmail : "+this.email+"\nPhone number : "+this.phonenum);
  
}
  
}

//Main.java

import java.util.Scanner;
class Main {
public static void main(String[] args)
{

BankAccount obj=new BankAccount();
Scanner input=new Scanner(System.in);
  
int option;
do{
System.out.println("Choose 1. deposit 2. withdraw 3. display 4. exit");
option=input.nextInt();
  
switch(option)
{
case 1 : System.out.println("Enter amt to deposit:");
double amt=input.nextDouble();
obj.deposit(amt);
break;
case 2: System.out.println("Enter amt to withdraw:");
amt=input.nextDouble();
obj.withdraw(amt);
break;
case 3:
obj.printdetails();
break;
default :System.out.println("Exit from program");
}
}while(option !=4);
}
}