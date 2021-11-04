package com.company;

public class TransportByTaxi implements Transporter{
    @Override
    public void transport() {
        System.out.println("Transporting by taxi");
    }
}
