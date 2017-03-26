package co.edu.unbosque.complejidadAlgoritmica.modelo;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class Arco<K,V> implements IArco<K,V>{

	private IVertice<K,V> origen;
	private IVertice<K,V> destino;
	private double peso;
	
	public Arco(IVertice<K,V> pOrigen, IVertice<K,V> pDestino,double pPeso)
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
