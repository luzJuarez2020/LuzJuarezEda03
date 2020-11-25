package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Ciclista extends Deportista implements INadador{
	
	private TipoDeBicicleta tipoDeBicicleta;
	
	public Ciclista(Integer numeroDeSocio, String nombre,TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.tipoDeBicicleta=tipoDeBicicleta;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	
	

}
