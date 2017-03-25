package co.edu.unbosque.complejidadAlgoritmica.modelo;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class Arco<V,K> implements IArco<V,K>{

	private Vertice<V,K> origen;
	private Vertice<V,K> destino;
	private double peso;
	
	public Arco(Vertice<V,K> pOrigen, Vertice<V,K> pDestino,double pPeso)
	{
		origen = pOrigen;
		destino = pDestino;
		peso = pPeso;		
	}
	public double darCosto() {
		return peso;
	}

	public IVertice<V,K> darOrigen() {
		return origen;
		
	}

	public IVertice<V,K> darDestino() {
		return destino;
	}

}
