package co.edu.unbosque.complejidadAlgoritmica.modelo;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IGrafoDirigido;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class GrafoDirigido<K,V> implements IGrafoDirigido<K,V> {

	private int numVertices;
	private List<IVertice<K,V>> listaVertice;
	
	public GrafoDirigido(){
		numVertices = 0;
		listaVertice = new ArrayList<IVertice<K,V>>();
	}
	
	
	public int darOrden() {
		return numVertices;
	}


	public IVertice<K,V> darVertice(K idVertice) {
		IVertice<K,V> rta = null;
		for (int i = 0; i < listaVertice.size() && rta == null; i++) {
			IVertice<K,V> actual = listaVertice.get(i);
			if(actual.darValor() == idVertice)
			{
				rta = actual;
			}
		}
		return rta;
	}

	
	public IArco<K, V> darArco(K idOrigen, K idDestino) {
		IVertice<K,V> darVertice = darVertice(idOrigen);	
		IArco<K,V> rta = null;
		if(darVertice != null)
		{
			rta = darVertice.darSucesor(idDestino);
		}
		return rta;
	}

	public boolean agregarVertice(K idVertice, V infoVertice) {
		boolean registrado = false;
		IVertice<K,V> buscado = darVertice(idVertice);
		if(buscado != null)
		{
			IVertice<K,V> verNue  = new Vertice<K,V>(idVertice,infoVertice);
			listaVertice.add(verNue);
			registrado = true;
		}
		return registrado;
	}

	
	public IVertice<K, V> eliminarVertice(K idVertice) {
		IVertice<K,V> eliminado = null;
		for (int i = 0; i < listaVertice.size() && eliminado == null; i++) {
			IVertice<K,V> actual = listaVertice.get(i);
			if(actual.darId() == idVertice)
			{
				eliminado = actual;
				listaVertice.remove(i);
			}
		}
		return eliminado;
	}

	
	public boolean agregarArco(K idOrigen, K idDestino, double costoArco) {
		boolean agregado = false;
		IVertice<K,V> verticeOrigenB = darVertice(idOrigen);
		IVertice<K,V> verticeDestinoB = darVertice(idDestino);
		
		if(verticeOrigenB != null && verticeDestinoB != null)
		{
			IArco<K,V> nuevoArco = new Arco<K,V>(verticeOrigenB, verticeDestinoB, costoArco);
			verticeOrigenB.agregarSucesor(nuevoArco);
			agregado = true;
		}
		return agregado;
	}

	
	public IArco<K, V> eliminarArco(K idOrigen, K idDestino) {
		IVertice<K,V> eliminado = darVertice(idOrigen);	
		IArco<K,V> rta = null;
		if(eliminado != null)
		{
			rta = eliminado.removerSucesor(idDestino);
		}
		return rta;
	}

	public List<IVertice<K, V>> darRecorridoEnProfundidad(K idOrigen) {
		return null;
	}


	public List<IVertice<K, V>> darRecorridoPorAnchura(K idOrigen) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
