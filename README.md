# DynamicDeepNeuralNet
This program is a way to make a standard neural network of any size and shape. The layer dimensions can be specified to dynamically
generate any standard neural network model. It is made completely from scratch and only uses standard java.

## Program Details
- Made with Java
- Supports one-hot encoding
- Can use any standard supervised learning dataset.

## Usage
The high-level usage of this model is very simple,
```Java
// Define Network
Network net = new Network(new int[] {3, 25, 25, 1}, Data.inputs, Data.outputs);
net.train(50000, true);
```

This code above is stating that we want to make a neural network with the input layer having three nodes, two hidden layers
with each having 25 nodes and a final output layer with one output node.

The network is then trained with 50 thousand iterations and error-print is set to true. error-print simply prints the error ten times
evenly throughout the training of the network to monitor what is going on.

## Viewing Outputs
To actually get the outputs of the network it is again, quite simple,
 ```Java
net.showOutput();
 ```
Outputs with `XOR data`, `shape:{3, 25, 25, 1}` and learning rate `0.04`:
```Java
[1.458793288959597E-5]
[0.9966428867365743]
[0.9969737186860246]
[-1.098586240172316E-5]
```
Dataset:
``` Java
static double[][] inputs = new double[][]
        {{0, 0, 1 },
        { 0, 1, 1},
        { 1,0,1 },
        { 1, 1, 1} };

    static double[][] outputs = new double[][]
        {{0 },
        { 1 },
        { 1 },
        { 0 }};
```

The network is correct, notice the automatic scientific notation. This is used to resemble a very small decimal value.

## Feed Forward
Feeding forward is used not only for actually training our network, but can be used to get a predictioon for a single example.
Here is how it is done,
```Java
// Will return an output double array
net.feedForward(new double[] {1,1,1} );
```
