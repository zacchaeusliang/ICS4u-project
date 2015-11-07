package Summative;

import java.util.Timer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "SimulateMcarlo")
@SessionScoped

public class SimulateMcarlo {
	static Timer timer = new Timer();
	static int seconds = 0;

	private int numVars;
	private int trials;
	 private String result;

	public SimulateMcarlo() {

	}

	public void settrials(int t) {

		trials = t;

	}

	public void setnumVars(int b) {

	numVars =b;
	}

	public int getnumVars() {

		return numVars;
	}

	public int gettrials() {

		return trials;
	}public void SetResult( String r) {

		 result =r;
	}

	public String getResult() {

		return result;
	}

	public String simulate() {
		Statistics stats = new Statistics();
		TrialRunner instance = new TrialRunner( numVars,trials);
		NVarFunction nVarF = new NVarFunction();
	
		instance.runNVar(nVarF);
		final long endTime = System.currentTimeMillis();
	 result = instance.toString();
		return result;
		

	}
}
