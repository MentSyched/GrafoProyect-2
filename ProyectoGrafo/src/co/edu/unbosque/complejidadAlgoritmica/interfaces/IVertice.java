package co.edu.unbosque.complejidadAlgoritmica.interfaces;
import java.util.List;

/**
 * Interface que modela la declaración de un Vértice
 * @author Pedro Guillermo
 * @param <K> Parámetro que representa el ID de un vértice
 * @param <V> Parámetro que representa el ELEMENTO de un vértice
 */
public interface IVertice<K,V>
{
	/**
	 * Método que da el id del vértice
	 * @return el id del vértice
	 */
	public K darId();
	
	/**
	 * Método que da el valor/elemento del vértice
	 * @return el valor/elemento del vértice
	 */
	public V darValor();
	
	/**
	 * Método que indica si el vértice está marcado o no.
	 * @return la marca booleana del vértice.
	 */
	public boolean darMarca();
	
	/**
	 * Método que retorna una Colección con los sucesores del Vértice.
	 * @return la colección de sucesores.
	 */
	public List<IArco<K, V>> darSucesores();
	
	/**
	 * Método que marca el vértice (True)
	 */
	public void marcar();
	
	/**
	 * Método que desmarca el vértice (False)
	 */
	public void desmarcar();
	
	/**
	 * Método que retorna un arco sucesor, indicando el vértice destino.
	 * @param idDestino id del vértice destino
	 * @return un Arco sucesor o Null si no existe.
	 */
	public IArco<K, V> darSucesor(K idDestino);
	
	/**
	 * Método que lleva a cabo la reconstrucción del recorrido DFS del Grafo.
	 * @param vertices Colección de vértices acumulados en el orden del algoritmo DFS
	 */
	public void darRecorridoEnProfundidad(List<IVertice<K, V>> vertices);
	
	/**
	 * Método que lleva a cabo la reconstrucción del recorrido BFS del Grafo.
	 * @param vertices Colección de vértices acumulados en el orden del algoritmo BFS
	 */
	public void darRecorridoPorAnchura(List<IVertice<K, V>> vertices);
	
	/**
	 * Método que agrega un sucesor al vértice.
	 * @param sucesor arco sucesor.
	 * @return true si fue agregado, false si ya existía.
	 */
	public boolean agregarSucesor(IArco<K, V> sucesor);
	
	/**
	 * Método que remueve un sucesor
	 * @param idSucesor id del sucesor
	 * @return el sucesor removido o Null si no existe
	 */
	public IArco<K, V> removerSucesor(K idSucesor);
	
}
