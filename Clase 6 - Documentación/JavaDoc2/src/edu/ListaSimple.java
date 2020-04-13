package edu;

/**
 * Define una interfaz simple de lista.
 * 
 * @author Antonela Tommasel
 * @version 1.0
 * @param <T> Clase de los datos contenido por la lista
 */
public interface ListaSimple<T> {

	/**
	 * Retorna el elemento contenido en una posici�n dada de la lista.
	 * @param i Posici�n
	 * @return elemento
	 */
	public T obtener(int i);
	/**
	 * Agrega un nuevo dato al final de la lista
	 * @param dato elemento a agregar
	 */
	public void agregar(T dato);
	/**
	 * Retorna la cantidad de elementos contenidos por la lista.
	 * <br>
	 * <ul>
	 * <li> {@link #agregar(Object)} Incrementa el tama�o </li>
	 * <li> {@link #eliminar(int)} Decrementa el tama�o </li>
	 * </ul>
	 * @return cantidad de elementos
	 */
	public int tamanio();
	/**
	 * Elimina un elemento de la lista. No es obligatoria su implementaci�n.
	 * @param i posici�n del elemento a eliminar.
	 * @throws UnsupportedOperationException Occure si la clase no implementa la operaci�n
	 */
	public void eliminar(int i) throws UnsupportedOperationException;
}
