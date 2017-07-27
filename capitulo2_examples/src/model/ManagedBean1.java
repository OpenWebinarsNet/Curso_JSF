package model;

import javax.faces.bean.*;

@ManagedBean
@RequestScoped
public class ManagedBean1 {

	private String name = "Prueba";
	
	public ManagedBean1() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
