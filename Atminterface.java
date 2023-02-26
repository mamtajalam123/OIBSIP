package ATMInterface;
import java.util.*;
class ATM {
    float Balance;
    int Pin = 5678;

    public void checkPin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enter_pin = sc.nextInt();
        if (enter_pin == Pin) {
            source();
        } else {
            System.out.println("Enter a valid pin");
        }
    }

    public void source() {
        System.out.println("Enter your choice");
        System.out.println("1. Check Account Balance");
        System.out.println("2. withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4. Money transfer");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            checkBalance();
        } else if (option == 2) {
            withdrawMoney();
        } else if (option == 3) {
            DepositMoney();
        } else if (option == 4) {
            MoneyTransfer();
        } else if(option== 5) {
            return;
        }else{
            System.out.println("Enter a valid choice");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + Balance);
        source();
    }

    public void withdrawMoney() {
        System.out.println("Enter the amount to withdraw");
        Scanner ss = new Scanner(System.in);
        float amount = ss.nextFloat();
        if (amount > Balance) {
            System.out.println("insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money withdraw successfully");
        }
        source();
    }

    public void DepositMoney() {
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money deposit successfully");
        source();
    }
    public void MoneyTransfer(){
        System.out.println("Enter the amount to transfer");
        Scanner sc =new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance - amount;
        System.out.println("Money transferred successfully");
    }

}

class ATMInterface
{
    public static void main(String[] args)
    {
        ATM ss = new ATM();
        ss.checkPin();
    }
}