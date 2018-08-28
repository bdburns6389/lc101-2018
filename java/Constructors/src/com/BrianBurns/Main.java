package com.BrianBurns;

public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "bob brown", "bob@gmail.com",
                "(907)123-1345");
        //Default Account if no parameters are passed.

        Account emptyAccount = new Account();
        System.out.println("Default account number: " + emptyAccount.getNumber());
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account timsAccount = new Account("Tim", "tim@gmai.com", "13443");
        System.out.println(timsAccount.getBalance());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "50000");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", "40000", "tim@email.com");
        System.out.println(person3.getName());
    }
}
