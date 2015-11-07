package Summative;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="Codehandler")

@SessionScoped
public class Codehandler implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;

	public String getCode() {
		return code;
	}
	public void setCode(String name) {
		this.code = name;
	}
	
}
