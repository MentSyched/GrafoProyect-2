package co.edu.unbosque.complejidadAlgoritmica.modelo;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class Arco<K,V> implements IArco<K,V>{

	private Vertice<K,V> origen;
	private Vertice<K,V> destino;
	private double peso;
	
	public Arco(Vertice<K,V> pOrigen, Vertice<K,V> pDestino,double pPeso)
	{
		origen = pOrigen;
		destino = pDestino;
		peso = pPeso;		
	}
	public double darCosto() {
		return peso;
	}

	public IVertice<K,V> darOrigen() {
		return origen;
		
	}

	public IVertice<K,V> darDestino() {
		return destino;
	}

}
