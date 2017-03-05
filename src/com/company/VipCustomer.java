package com.company;

/**
 * Created by Frenz on 3/4/2017.
 */
public class VipCustomer {

    private String mName;
    private int mCreditLimit;
    private String mEmail;

    public VipCustomer() {

        mName = "frenz";
        mCreditLimit = 1000;
        mEmail = "flipinchitown@gmail.com";
    }

    public VipCustomer(String name, int creditLimit) {
        this.mName = name;
        this.mCreditLimit = creditLimit;
        this.mEmail = "noemailyet@email.com";
    }

    public String getmName() {
        return mName;
    }

    public int getmCreditLimit() {
        return mCreditLimit;
    }

    public String getmEmail() {
        return mEmail;
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.mName = name;
        this.mCreditLimit = creditLimit;
        this.mEmail = email;

    }


    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.
}
