package co.edu.unbosque.complejidadAlgoritmica.interfaces;
import java.util.List;

/**
 * Interface que modela la declaraci�n de un V�rtice
 * @author Pedro Guillermo
 * @param <K> Par�metro que representa el ID de un v�rtice
 * @param <V> Par�metro que representa el ELEMENTO de un v�rtice
 */
public interface IVertice<K,V>
{
	/**
	 * M�todo que da el id del v�rtice
	 * @return el id del v�rtice
	 */
	public K darId();
	
	/**
	 * M�todo que da el valor/elemento del v�rtice
	 * @return el valor/elemento del v�rtice
	 */
	public V darValor();
	
	/**
	 * M�todo que indica si el v�rtice est� marcado o no.
	 * @return la marca booleana del v�rtice.
	 */
	public boolean darMarca();
	
	/**
	 * M�todo que retorna una Colecci�n con los sucesores del V�rtice.
	 * @return la colecci�n de sucesores.
	 */
	public List<IArco<K, V>> darSucesores();
	
	/**
	 * M�todo que marca el v�rtice (True)
	 */
	public void marcar();
	
	/**
	 * M�todo que desmarca el v�rtice (False)
	 */
	public void desmarcar();
	
	/**
	 * M�todo que retorna un arco sucesor, indicando el v�rtice destino.
	 * @param idDestino id del v�rtice destino
	 * @return un Arco sucesor o Null si no existe.
	 */
	public IArco<K, V> darSucesor(K idDestino);
	
	/**
	 * M�todo que lleva a cabo la reconstrucci�n del recorrido DFS del Grafo.
	 * @param vertices Colecci�n de v�rtices acumulados en el orden del algoritmo DFS
	 */
	public void darRecorridoEnProfundidad(List<IVertice<K, V>> vertices);
	
	/**
	 * M�todo que lleva a cabo la reconstrucci�n del recorrido BFS del Grafo.
	 * @param vertices Colecci�n de v�rtices acumulados en el orden del algoritmo BFS
	 */
	public void darRecorridoPorAnchura(List<IVertice<K, V>> vertices);
	
	/**
	 * M�todo que agrega un sucesor al v�rtice.
	 * @param sucesor arco sucesor.
	 * @return true si fue agregado, false si ya exist�a.
	 */
	public boolean agregarSucesor(IArco<K, V> sucesor);
	
	/**
	 * M�todo que remueve un sucesor
	 * @param idSucesor id del sucesor
	 * @return el sucesor removido o Null si no existe
	 */
	public IArco<K, V> removerSucesor(K idSucesor);
	
}
