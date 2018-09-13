package com.company;

public class Main {

    public static void main(String[] args) {
        // Hyper Parameters
        double learningRate = 0.001;
        int    iterations   = 50000;

        // Define Network
        Network net = new Network(new int[] {3, 25, 25, 1}, Data.inputs, Data.outputs);
        net.train(50000, true);
    }
}
