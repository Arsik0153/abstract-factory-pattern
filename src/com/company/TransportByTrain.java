package com.company;

public class TransportByTrain implements Transporter{
    @Override
    public void transport() {
        System.out.println("transporting by train");
    }
}
