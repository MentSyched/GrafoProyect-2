package co.edu.unbosque.complejidadAlgoritmica.modelo;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class Vertice <K,V> implements IVertice <K,V> {

	private K id;
	private V valor;
	private boolean marca;
	private List<IArco<K, V>> listaArcos;
	
	public Vertice(K pId,V pValor)
	{
		id = pId;
		valor = pValor;
		marca = false;
		listaArcos = new ArrayList<>();
	}
	public K darId() {
		return id;
	}

	public V darValor() {
		return valor;
	}

	public boolean darMarca() {
		return marca;
	}


	public List<IArco<K, V>> darSucesores() {
		return listaArcos;
	}


	public void marcar() {
		marca = true;		
	}


	public void desmarcar() {
		marca = false;
		
	}


	public IArco<K, V> darSucesor(K idDestino) {
		IArco<K,V> rta = null;
		for (int i = 0; i < listaArcos.size() && rta == null; i++) {
			IVertice <K,V> actual = listaArcos.get(i).darDestino();
			if(actual.darId() == idDestino)
			{
				rta = listaArcos.get(i);
			}
		}
		return rta;
	}


	public void darRecorridoEnProfundidad(List<IVertice<K, V>> vertices) {
		// TODO Auto-generated method stub
		
	}


	public void darRecorridoPorAnchura(List<IVertice<K, V>> vertices) {
		// TODO Auto-generated method stub
		
	}


	public boolean agregarSucesor(IArco<K, V> sucesor) {
			boolean agregado = false;
			IVertice<K,V> actual = sucesor.darDestino();
			IArco<K,V> rta = darSucesor(actual.darId());
			if(rta == null)
			{
				listaArcos.add(sucesor);
				agregado = true;
			}
			return agregado;
		}

	
	public IArco<K, V> removerSucesor(K idSucesor) {
		IArco<K, V> eliminado = null;
			for (int i = 0; i < listaArcos.size() && eliminado == null; i++) {
				IVertice <K,V> actual = listaArcos.get(i).darDestino();
				if(actual.darId() == idSucesor)
				{
					eliminado = listaArcos.get(i);
					listaArcos.remove(i);
				}
			}
		
		return eliminado;
	}
}
