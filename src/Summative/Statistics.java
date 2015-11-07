package Summative;


public class Statistics {
	private double maxValue = 0x0.0000000000001P-1022;
	private double minValue = 0x1.fffffffffffffP+1023;
	private double mean = 0;
	private double standardDev = 0;
	private double variance=0;
	private double totalPower0 = 0;
	private double totalPower1 = 0;
	private double totalPower2 = 0;
	
	public void run(double trialValue){
		this.totalPower0++;
		this.totalPower2 = this.totalPower2 + Math.pow(trialValue,2);
		this.totalPower1 = this.totalPower1 + trialValue;
	
		if(trialValue > this.maxValue){
			this.maxValue = trialValue;
		}
		if(trialValue< minValue){
			this.minValue = trialValue;
		}
		
	}
	public void calculuateStdDev(){
		this.standardDev = 1/(double)(totalPower0) * Math.sqrt(totalPower0*totalPower2 - Math.pow(totalPower1,2));
	}
	public void calculateVarience(){
		this.variance = Math.pow(this.standardDev, 2);
	}
	public void calculateMean(){
		this.mean = totalPower1/totalPower0;
	}
	public double getMaxValue(){
		return this.maxValue;
	}
	public double getMinValue(){
		return this.minValue;
	}
	public double getMean(){
		return this.mean;
	}
	public double getStandardDev(){
		return this.standardDev;
	}
	public double getSum(){
		return this.totalPower1;
	}
	public double getVarience(){
		return this.variance;
	}
	public String toString(){
		String output = "Max: " + this.maxValue + "\n" +
				"Min: " + this.minValue + "\n"+
				"Mean: " + this.mean + "\n"+
				"Standard Deviation: " + this.standardDev + "\n"+
				"Sum: " + this.totalPower1 + "\n"+
				"Varience: " + this.variance + "\n"+
				"SS: " + this.totalPower2+ "\n";
		return output;
	}
}
