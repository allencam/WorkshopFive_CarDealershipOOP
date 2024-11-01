package com.ps;

public class SalesContract extends Contract {
    private float salesTaxAmount;
    private int recordingFee;
    private int processingFee;
    boolean wantToFinance;

    public SalesContract(boolean wantToFinance) {
        this.salesTaxAmount = 1.05f;
        this.recordingFee = 100;
        //this.processingFee = processingFee;
        if(vehicleSold.getPrice() < 10_000) {
            this.processingFee = 295;
        } else {
            this.processingFee = 495;
        }
        this.wantToFinance = wantToFinance;
    }

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, double totalPrice, double monthlyPayment, boolean wantToFinance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTaxAmount = 1.05f;
        this.recordingFee = 100;
        if(vehicleSold.getPrice() < 10_000) {
            this.processingFee = 295;
        } else {
            this.processingFee = 495;
        }
        this.wantToFinance = wantToFinance;
    }

    public double getTotalPrice() {
        return (vehicleSold.getPrice() * salesTaxAmount) + // Only the price is subject to sales tax
                processingFee +
                recordingFee;
    }

    public double getMonthlyPayment() {
        if (wantToFinance) {
            double monthlyPayment = (vehicleSold.getPrice() * salesTaxAmount) +
                    processingFee +
                    recordingFee;
            switch (loanTerm) { // Using switch statement in case we want to add more options for longer/shorter loan terms
                case 24:
                    // Revisit this...
                    break;
                case 48:

                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public float getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(float salesTaxAmount) {
        this.salesTaxAmount = salesTaxAmount;
    }

    public int getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(int recordingFee) {
        this.recordingFee = recordingFee;
    }

    public int getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(int processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isWantToFinance() {
        return wantToFinance;
    }

    public void setWantToFinance(boolean wantToFinance) {
        this.wantToFinance = wantToFinance;
    }
}
