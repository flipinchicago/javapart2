package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer customer1 = new VipCustomer();
        VipCustomer customer2 = new VipCustomer("Ian", 2000);
        VipCustomer customer3 = new VipCustomer("John", 10000, "john@mayer.com");

        System.out.println("Customer 1 name  " + customer1.getmName());
        System.out.println("Customer 1 limit  " + customer1.getmCreditLimit());
        System.out.println("Customer 1 email  " + customer1.getmEmail());

        System.out.println("Customer 2 name  " + customer2.getmName());
        System.out.println("Customer 2 limit  " + customer2.getmCreditLimit());
        System.out.println("Customer 2 email  " + customer2.getmEmail());

        System.out.println("Customer 3 name  " + customer3.getmName());
        System.out.println("Customer 3 limit  " + customer3.getmCreditLimit());
        System.out.println("Customer 3 email  " + customer3.getmEmail());

    }

}
