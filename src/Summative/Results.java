package Summative;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class Results implements Serializable {

	private static final long serialVersionUID = 1L;
	// takes result as a string
	private String result;
	public Results(){
		
	}

	public String returnResult() {
		return result;
	}
	 public void Setresult(String s){
		 result = s;
	 } public String toString(){
		 return result;
		 
	 }
}


