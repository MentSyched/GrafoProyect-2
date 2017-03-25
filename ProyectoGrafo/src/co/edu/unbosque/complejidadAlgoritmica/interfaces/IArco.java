package co.edu.unbosque.complejidadAlgoritmica.interfaces;

/**
 * Interface que modela la declaración de un Arco
 * @author Pedro Guillermo
 * @param <K> Parámetro que representa el ID de un vértice
 * @param <V> Parámetro que representa el ELEMENTO de un vértice
 */
public interface IArco<K,V>
{
	/**
	 * Método que retorna el costo del arco
	 * @return el costo del arco
	 */
	public double darCosto();
	
	/**
	 * Método que retorna el vértice origen del arco
	 * @return el vértice origen del arco
	 */
	public IVertice<K, V> darOrigen();
	
	/**
	 * Método que retorna el vértice destino del arco
	 * @return el vértice destino del arco
	 */
	public IVertice<K, V> darDestino();
}
