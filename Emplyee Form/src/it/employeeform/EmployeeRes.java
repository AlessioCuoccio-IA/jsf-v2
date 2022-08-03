package it.employeeform;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;

@ManagedBean
public class EmployeeRes {
	
	private ArrayList<String> lista;

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
	@PostConstruct
	public void init() {
		String a = "A";
		String b = "B";
		String c = "C";
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(a);
		list2.add(b);
		list2.add(c);
		
		setLista(list2);
		
	}

	
	
	

}
