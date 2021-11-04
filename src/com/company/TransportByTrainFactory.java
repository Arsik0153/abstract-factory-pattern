package com.company;

public class TransportByTrainFactory implements TransporterFactory{
    @Override
    public Transporter createTransporter() {
        return new TransportByTrain();
    }
}
