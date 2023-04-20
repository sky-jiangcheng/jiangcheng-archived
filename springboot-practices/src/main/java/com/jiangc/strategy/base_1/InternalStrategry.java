package com.jiangc.strategy.base_1;

public class InternalStrategry implements ChargeStrategy{
    @Override
    public double charge(long cost) {
        double taxRate = 0.2;
        return cost * taxRate;
    }
}