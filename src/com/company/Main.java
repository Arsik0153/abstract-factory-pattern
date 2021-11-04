package com.company;

public class Main {

    public static void main(String[] args) {
        TransporterFactory factory = new TransportByTaxiFactory();

        Transporter transporter = factory.createTransporter();
        transporter.transport();
    }
}
