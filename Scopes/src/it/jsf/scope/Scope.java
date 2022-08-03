package it.jsf.scope;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ApplicationScoped
//@SessionScoped
//@RequestScoped //default
@ManagedBean
public class Scope {

	private Integer value = 0;
	
	private List<String> lista = Stream.of("foo", "bar") .collect(Collectors.toList());


	
	public Scope() {}
 
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	public void increaseValue() {
		value++;
	}
}
