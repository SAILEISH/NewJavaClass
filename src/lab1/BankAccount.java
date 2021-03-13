package lab1;
    // withdraw
    // deposit
    // display account information as account number & balance

    // user can open bank account providing two different options
        // name only -- initial balance = 0;
        // name and initial balance


import java.util.Scanner;

public class BankAccount {
    //static variable for the class
    static int accountNumber;
    // member variables
    String name;
    double initialBalance;
    double moneyIn;
    double moneyOut;
    double totalMoney=0;

    //default-constructor
    public BankAccount()
    {
    }

    //arg-constructor
    // account number is pre assigned to the new user
    public BankAccount(int an)
    {
        accountNumber = an;
        System.out.println("Account number "+accountNumber);
    }

    /*
    * this has to be called once for each object
    * open up a new account
    *  user can open bank account providing two different options
         name only -- initial balance = 0;
         name and initial balance
    *
    * */
    public void openAccount(Scanner input)
    {
        String ans;

        System.out.println("Enter name: ");
        name = input.next();

        System.out.println("Do you wish to deposit initial balance on opening a new account?(y/n or, Y/N)");
        ans = input.next();

        if(new String("Y").equals(ans) || new String("y").equals(ans))
        {
            System.out.println("Enter balance: ");
            initialBalance = input.nextInt();
        }

        else
        {
            initialBalance = 0;
        }
        System.out.println("A new bank account has been created under the name "+name+" and initial balance of $"+initialBalance+".");

    }

    /*
    * deposit money in the bank
    * */
    public void depositMoney(Scanner input)
    {
        System.out.println("What is the total sum of money you want to deposit?");
        moneyIn = input.nextDouble();

        if(moneyIn>=400)
        {
            depositMoney(12);
            System.out.println("Deposit successful! You have deposited $"+moneyIn+" with interest rate of 12% on your total amount.");
        }

        else
        {
            System.out.println("Deposit successful! You have deposited $"+moneyIn+".");
            totalMoney = initialBalance + moneyIn;
        }
        System.out.println(""+name+" has $"+totalMoney+" in the account");
        initialBalance = totalMoney;
    }

    /*
    *   withdraw money
    * */
    public void withdrawMoney(Scanner input)
    {
        System.out.println("Type in the amount of money you want to withdraw!");
        moneyOut = input.nextDouble();

        if(moneyOut>initialBalance)
        {
            System.out.println("Can't withdraw money as the requested amount is much higher than the balance in the account.");
            System.out.println("You have $"+initialBalance+" in your account.");
        }

        else
        {
            if(moneyOut>=400)
            {
                withdrawMoney(100);//takes $1 off in each transaction
                System.out.println(""+name+" has $"+totalMoney+" in the account.");
            }

            else
            {
                totalMoney = initialBalance - moneyOut;
                System.out.println("" + name + " has $" + totalMoney + " in the account.");
                //initialBalance = totalMoney;
            }
            initialBalance = totalMoney;
        }
    }

    public void withdrawMoney(double rate)
    {
        totalMoney = initialBalance - (rate/100) - moneyOut;
    }

    public void depositMoney(double interest)
    {
        totalMoney = (initialBalance + moneyIn)*(interest*0.01+1);
    }

    //account information
    public void accountInfo()
    {
        System.out.println("Account number: "+accountNumber);
        System.out.println("Name: "+name);
        System.out.println("Amount remaining: "+initialBalance);
    }
    // main method to call the the other methods and do main task
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        BankAccount obj1 = new BankAccount(11555756); // for user1
        obj1.openAccount(input);

        int x = 1;
        while(x!=0)
        {
            System.out.println("Welcome to Bank. Please type in the number relative to the option.");
            System.out.println("    1. Withdraw funds.");
            System.out.println("    2. Deposit funds.");
            System.out.println("    3. Account details.");
            System.out.print(" Or, press any other key to exit the program.\n\n");

            int choice = input.nextInt();

                if(choice == 1) // meaning open new account
                {
                    obj1.withdrawMoney(input);
                }

                else if(choice == 2)
                {
                    obj1.depositMoney(input);
                }

                else if(choice == 3)
                {
                    obj1.accountInfo();
                }
                else
                {
                    System.exit(0);
                    x = 0;
                }
        }

    }
}
