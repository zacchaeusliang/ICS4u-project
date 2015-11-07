
package Summative;
//Copyright (c) <2015> <Phillip Blakey>
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


	public class MonteCarloSim {
		static Timer timer = new Timer();
		static int seconds = 0;
		int var1 = 0;
		int var2 = 0;
		public static void main(String [] args){
			Statistics stats= new Statistics();
			TrialRunner instance = new TrialRunner(10000000,2);
			NVarFunction nVarF = new NVarFunction();
			final long startTime = System.currentTimeMillis();
			instance.runNVar(nVarF);
			final long endTime = System.currentTimeMillis();
		String s="Total execution time: " + (endTime - startTime) + " milliseconds";
		
			
		}
	}
