package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;


public class Corredor extends Deportista implements ICorredor {

	private Integer distanciaPreferida;
	private Integer CantidadDeKilometrosEntrenados=0;
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer distanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida=distanciaPreferida;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}
	
	

	
}
