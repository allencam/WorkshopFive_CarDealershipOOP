package com.ps;

public abstract class Contract {
    protected String dateOfContract;
    protected String customerName;
    protected String customerEmail;
    protected Vehicle vehicleSold;
    protected int loanTerm;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract() {}

    public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    abstract public double getTotalPrice();
    abstract public double getMonthlyPayment();

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        this.vehicleSold = vehicleSold;
    }
}
