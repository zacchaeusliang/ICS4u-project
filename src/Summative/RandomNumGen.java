package Summative;

import java.util.Random;

//Copyright (c) <2015> <Phillip Blakey>
import java.util.Random;


public class RandomNumGen {
	// this generates random numbers based on seed ( not implimented in the prototype
	//private long seed;
	private Random rand1;
	public RandomNumGen(){
		//this.seed = Seed;
		//System.out.println("Making random with seed " + seed);
		this.rand1 = new Random();
		
	}
	
	
	public double getRandomNum(){
		double randomNum = rand1.nextDouble();
		//System.out.println(randomNum);
		return randomNum;
	}
	//public static void main(String [] args){
		//RandomNumGen one = new RandomNumGen((long)Math.pow(2, 30));
		//RandomNumGen two = new RandomNumGen(0L);
		//double t11=one.getRandomNum();
		//double t12 = one.getRandomNum();
		//double t13 = two.getRandomNum();
		//System.out.println(t11 + " , " + t12 + " , " + t13);
	//}
}