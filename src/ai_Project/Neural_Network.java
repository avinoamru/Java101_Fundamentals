package ai_Project;

import neural.Network;

import java.util.Random;

import neural.Matrix;;

public class Neural_Network {
	
	/**
	 * matrix input and output
	 **/
	final static Matrix trainInput = new Matrix(10, 2);
	final static Matrix trainOutput = new Matrix(10, 1);

	/*
	 * Neural network instance 
	 */
	final static Network neural_net = new Network(2, new int[] {3,1} , new Network.ActivationFunction[]{
	         Network.ActivationFunction.SIGMOID,    //both layers with ...
	         Network.ActivationFunction.SIGMOID});  //... no activation function
	
	
	
	final static Random rand = new Random();
	
	/**
	 * Trainer
	 */
	static void trainer() {
		
		for( int set=0; set < trainInput.getHeight(); set++) {
			
		 trainInput.set(set, 0, rand.nextInt(10));
		 trainInput.set(set, 1, rand.nextInt(10));
		 final double out = (trainInput.get(set, 0) + trainInput.get(set, 1)) / 2;
		 trainOutput.set(set, 0, out);
		}
		
		neural_net.train(0.1, trainInput, trainOutput, true);
		
	
	}
	
	public static void main(String[] args) {
		trainer();
		System.out.println(neural_net);
		System.out.println(neural_net.forward(trainInput));
		
		
		System.out.println(neural_net.cost(trainInput, trainOutput));

		
	}
	
	
}
