package com.GA.TradingSystemUML;

public class Commodity extends Asset{
    private int id;
    private double shares;
    private double purchasePrice;

    public int getId() {
        return id;
    }

    public double getShares() {
        return shares;
    }

    public void setShares(double shares) {
        this.shares = shares;
    }

    protected double calculateDouble(){
        return 0.0;
    };
}
