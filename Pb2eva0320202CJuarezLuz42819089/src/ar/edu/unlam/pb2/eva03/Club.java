package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;


public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre=nombre;
		this.socios=new HashSet<Deportista>();
		this.competencias=new HashMap<String,Evento>();
	}
	
	public void agregarDeportista(Deportista nuevo) {
		socios.add(nuevo);
	}
	
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
	
	
	public void crearEvento(TipoDeEvento tipoDeEvento, String evento) {
		competencias.put(evento, new Evento(tipoDeEvento));
	}
	
	
	
	
}
