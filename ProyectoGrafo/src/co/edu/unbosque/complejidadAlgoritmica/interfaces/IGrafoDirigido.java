package co.edu.unbosque.complejidadAlgoritmica.interfaces;

import java.util.List;


/**
 * Interface que modela la declaración de un Grafo Dirigido
 * @author Pedro Guillermo
 * @param <K> Parámetro que representa el ID de un vértice
 * @param <V> Parámetro que representa el ELEMENTO de un vértice
 */
public interface IGrafoDirigido<K,V> 
{
	/**
	 * Método que retorna el orden (cantidad de nodos) del Grafo.
	 * @return el orden del Grafo
	 */
	public int darOrden();
	
	/**
	 * Método que retorna el vértice correspondiente al Id indicado.
	 * @param idVertice id del vértice a ser retornado. 
	 * @return el vértice correspondiente al id ingresado. Null si no existe.
	 */
	public IVertice<K, V> darVertice(K idVertice);
	
	/**
	 * Método que retorna un Arco a partir de los ids de sus vértices origen y destino
	 * @param idOrigen id del vértice origen
	 * @param idDestino id del vértice destino
	 * @return el Arco correspondiente a los vértices ingresados. Null si no hay Arco.
	 */
	public IArco<K,V> darArco(K idOrigen, K idDestino);
	
	/**
	 * Método que agrega un vértice al Grafo
	 * @param idVertice id del vértice a ser agregado
	 * @param infoVertice información a contenerse en el vértice
	 * @return true si se agregó sin problemas. False si ya existía en el grafo o si no 
	 * se pudo agregar por cualquier motivo.
	 */
	public boolean agregarVertice(K idVertice, V infoVertice);
	
	/**
	 * Método que elimina un vértice del Grafo
	 * @param idVertice id del vértice que se va a eliminar
	 * @return el vértice eliminado o Null si no existía.
	 */
	public IVertice<K,V> eliminarVertice(K idVertice);
	
	/**
	 * Método que agrega un arco al Grafo
	 * @param idOrigen id del vértice origen
	 * @param idDestino id del vértice destino
	 * @param costoArco costo del Arco 
	 * @return true si se pudo agregar sin inconvenientes, o false si ya existía.
	 */
	public boolean agregarArco(K idOrigen, K idDestino, double costoArco);
	
	/**
	 * Método que elimina un arco del Grafo
	 * @param idOrigen id del vértice origen
	 * @param idDestino id del vértice destino
	 * @return el arco eliminado o Null si no existía
	 */
	public IArco<K,V> eliminarArco(K idOrigen, K idDestino);
	
	/**
	 * Método que retorna una colección de vértices correspondientes al DFS 
	 * @param idOrigen id del vértice origen del recorrido
	 * @return una colección con los vértices correspondientes al DFS
	 */
	public List<IVertice<K, V>> darRecorridoEnProfundidad(K idOrigen);
	
	/**
	 * Método que retorna una colección de vértices correspondientes al BFS 
	 * @param idOrigen id del vértice origen del recorrido
	 * @return una colección con los vértices correspondientes al BFS
	 */
	public List<IVertice<K, V>> darRecorridoPorAnchura(K idOrigen);
}
