package com.company;

public class TransportByTaxiFactory implements TransporterFactory{
    @Override
    public Transporter createTransporter() {
        return new TransportByTaxi();
    }
}
