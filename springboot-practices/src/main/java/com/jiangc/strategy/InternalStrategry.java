package com.jiangc.strategy;

public class InternalStrategry implements ChargeStrategy{
    @Override
    public double charge(long cost) {
        double taxRate = 0.2;
        return cost * taxRate;
    }
}