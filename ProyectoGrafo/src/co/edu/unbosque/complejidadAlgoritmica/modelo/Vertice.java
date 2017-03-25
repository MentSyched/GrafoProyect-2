package co.edu.unbosque.complejidadAlgoritmica.modelo;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.complejidadAlgoritmica.interfaces.IArco;
import co.edu.unbosque.complejidadAlgoritmica.interfaces.IVertice;

public class Vertice <V,K> implements IVertice <V,K> {
	
	private V id;
	private K valor;
	private boolean marca;
	private List<IArco<V, K>> listaArcos;
	
	public Vertice(V pId,K pValor)
	{
		id = pId;
		valor = pValor;
		marca = false;
		listaArcos = new ArrayList<>();
	}
	
	
	public V darId() {
		return id;
	}

	
	public K darValor() {
		return valor;
	}


	public boolean darMarca() {	
		return marca;
	}
	
	public List<IArco<V, K>> darSucesores() {
		return listaArcos;
	}


	public void marcar() {
		marca = true;
		
	}

	
	public void desmarcar() {
		marca = false;
		
	}

	public IArco<V, K> darSucesor(V idDestino) {
		IArco<V,K> rta = null;
		for (int i = 0; i < listaArcos.size() && rta == null; i++) {
			IArco <V,K> actual = listaArcos.get(i);
			if(actual.darDestino() == idDestino)
			{
				rta = actual;
			}
		}
		return rta;
	}

	@Override
	public void darRecorridoEnProfundidad(List<IVertice<V, K>> vertices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void darRecorridoPorAnchura(List<IVertice<V, K>> vertices) {
		// TODO Auto-generated method stub
		
	}


	public boolean agregarSucesor(IArco<V, K> sucesor) {
		boolean agregado = false;
		IVertice<V,K> actual = sucesor.darDestino();
		IArco<V,K> rta = darSucesor(actual.darId());
		if(rta == null)
		{
			listaArcos.add(sucesor);
			agregado = true;
		}
		return agregado;
	}

	@Override
	public IArco<V, K> removerSucesor(V idSucesor) {
		IArco<V, K> eliminado = darSucesor(idSucesor);
		if(eliminado  != null)
		{
			boolean hecho = false;
			for (int i = 0; i < listaArcos.size() && hecho == false; i++) {
				IVertice <V,K> actual = listaArcos.get(i).darOrigen();
				if(actual.darId() == idSucesor)
				{
					listaArcos.remove(i);
					hecho = true;
				}
			}
		}
		return eliminado;
	}

	

	
	

}
