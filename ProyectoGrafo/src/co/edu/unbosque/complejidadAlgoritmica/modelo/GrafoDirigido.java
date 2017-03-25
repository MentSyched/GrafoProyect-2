package co.edu.unbosque.complejidadAlgoritmica.modelo;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IGrafoDirigido;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class GrafoDirigido<K,V> implements IGrafoDirigido<K,V> {

	private int numVertices;
	private List<IVertice<K,V>> listaAdy;
	
	public GrafoDirigido(){
		numVertices = 0;
		listaAdy = new ArrayList<IVertice<K,V>>();
	}
	
	
	public int darOrden() {
		return numVertices;
	}


	public IVertice<K,V> darVertice(K idVertice) {
		IVertice<K,V> rta = null;
		for (int i = 0; i < listaAdy.size() && rta == null; i++) {
			IVertice<K,V> actual = listaAdy.get(i);
			if(actual.darValor() == idVertice)
			{
				rta = actual;
			}
		}
		return rta;
	}

	@Override
	public IArco<K, V> darArco(K idOrigen, K idDestino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarVertice(K idVertice, V infoVertice) {
		boolean registrado = false;
		
		return false;
	}

	@Override
	public IVertice<K, V> eliminarVertice(K idVertice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean agregarArco(K idOrigen, K idDestino, double costoArco) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IArco<K, V> eliminarArco(K idOrigen, K idDestino) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IVertice<K, V>> darRecorridoEnProfundidad(K idOrigen) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IVertice<K, V>> darRecorridoPorAnchura(K idOrigen) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
