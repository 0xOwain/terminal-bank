import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static void newUser(){
        System.out.println("Enter a number according to the options below:");
        System.out.println("1. View all Customers");
        System.out.println("2. View a Customer");
        System.out.println("3. View Recent Transactions");

        Scanner getAction = new Scanner(System.in);


    }
    public static void main(String[] args) {


        System.out.println("----------- Welcome to DoeBank -----------");

        ArrayList<Customer> customers = new ArrayList<Customer>();
        HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a First name and Last Name: ");
        String name = userInput.nextLine();
    }
}



