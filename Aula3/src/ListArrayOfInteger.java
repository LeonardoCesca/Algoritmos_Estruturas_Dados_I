import java.util.Arrays;
import java.util.Arrays;

public class ListArrayOfInteger {

	private static final int INITIAL_SIZE = 10;
	private Integer[] data;
	private int count;

	/**
	  Construtor da lista
	 */
	public ListArrayOfInteger() {
		this(INITIAL_SIZE);
	}

	/**
	 * Construtor da lista
	 *
	 * @param tam
	 *            tamanho inicial a ser alocado para a lista
	 */
	public ListArrayOfInteger(int tam) {
		if (tam <= 0) {
			tam = INITIAL_SIZE;
		}
		data = new Integer[tam];
		count = 0;
	}

	/**
	 * Esvazia a lista
	 */
	public void clear() {
		data = new Integer[INITIAL_SIZE];
		count = 0;
	}

	/**
	 * Retorna true se a lista não contêm elementos
	 *
	 * @return true se a lista não contêm elementos
	 */
	public boolean isEmpty() {
		return (count == 0);
	}

	/**
	 * Retorna o número de elementos da lista
	 *
	 * @return o número de elementos da lista
	 */
	public int size() {
		return count;
	}

	/**
	 * Adiciona um elemento ao final da lista
	 *
	 * @param element
	 *            elemento a ser adicionado ao final da lista
	 */
	public void add(Integer element) {
		if (count == data.length) {
			setCapacity(data.length * 2);
		}
		data[count] = element;
		count++;
	}

	/**
	 * Insere um elemento em uma determinada posição da lista
	 *
	 * @param index
	 *            a posição da lista onde o elemento será inserido
	 * @param element
	 *            elemento a ser inserido
	 * @throws IndexOutOfBoundsException
	 *             se (index < 0 || index > size())
	 */
	public void add(int index, Integer element) {

		if (index < 0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}

		if (count == data.length) {
			setCapacity(data.length * 2);
		}

		for (int i = count; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = element;
		count++;
	}

	/**
	 * Remove o elemento de uma determinada posição da lista
	 *
	 * @param index
	 *            a posição da lista
	 * @return o elemento que foi removido da lista
	 * @throws IndexOutOfBoundsException
	 *             se (index < 0 || index >= size())
	 */
	public int removeByIndex(int index) {
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		int aux = data[index];

		for (int i = index; i < count - 1; i++) {
			data[i] = data[i + 1];
		}

		data[count - 1] = null;
		count--;

		return aux;
	}

	/**
	 * Remove a primeira ocorrência do elemento na lista, se estiver presente
	 *
	 * @param element
	 *            o elemento a ser removido
	 * @return true se a lista contém o elemento especificado
	 */
	public boolean remove(Integer element) {

		for (int i = 0; i < count; i++) {

			if (element.equals(data[i])) {
				for (int j = i; j < count - 1; j++) {
					data[j] = data[j + 1];
				}
				data[count - 1] = null;
				count--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Retorna o elemento de uma determinada posição da lista
	 *
	 * @param index
	 *            a posição da lista
	 * @return o elemento da posição especificada
	 * @throws IndexOutOfBoundsException
	 *             se (index < 0 || index >= size())
	 */
	public int get(int index) {
		if ((index < 0) || (index >= count)) {
			throw new IndexOutOfBoundsException("Index = " + index);
		}
		return data[index];
	}

	/**
	 * Substitui o elemento armanzenado em uma determinada posição da lista
	 * pelo elemento indicado
	 *
	 * @param index
	 *            a posição da lista
	 * @param element
	 *            o elemento a ser armazenado na lista
	 * @return o elemento armazenado anteriormente na posição da lista
	 * @throws IndexOutOfBoundsException
	 *             se (index < 0 || index >= size())
	 */
	public int set(int index, Integer element) {
		if ((index < 0) || (index >= count)) {
			throw new IndexOutOfBoundsException("Index = " + index);
		}
		int item = data[index];
		data[index] = element;
		return item;
	}

	/**
	 * Retorna true se a lista contém o elemento especificado
	 *
	 * @param element
	 *            o elemento a ser testado
	 * @return true se a lista contém o elemento especificado
	 */
	public boolean contains(Integer element) {
		for (int p = 0; p < count; p++) {
			if (data[p].equals(element)) {
				return true;
			}
		}
		// Neste ponto, não achou: retorna falso
		return false;
	}

	public void reverse() {
		Integer aux;
		System.out.println(count);
		for (int p = 0; p < count / 2; p++) {
			aux = data[p];
			data[p] = data[count - p - 1];
			data[count - p - 1] = aux;
		}
	}

	public Integer[] subList(int fromIndex, int toIndex) {
		Integer[] result = new Integer[toIndex - fromIndex];

		for (int i = 0; i < (toIndex - fromIndex); i++) {
			result[i] = data[fromIndex + i];
		}
		return result;
	}

	public void addIncreasingOrder(Integer element) {
		Integer[] aux = new Integer[count + 1];
		for (int i = 0; i < count; i++) {
			if (data[i] <= element) {
				aux[i] = data[i];
			}
			if (data[i] > element) {
				aux[i] = element;
				for (int j = 0; j < count - i; j++) {
					System.out.println(data[i + j]);
					aux[i + 1 + j] = data[i + j];
				}
				break;
			}
		}
		data = aux;
		count = aux.length;
	}

	/**
	 * Retorna o índice da primeira ocorrência do elemento na lista, ou -1 se
	 * a lista não contém o elemento
	 *
	 * @param element
	 *            o elemento a ser buscado
	 * @return o índice da primeira ocorrência do elemento na lista, ou -1 se
	 *         a lista não contém o elemento
	 */
	public int indexOf(Integer element) {
		// Procura elemento no array, se achar retorna
		for (int i = 0; i < count; i++) {
			if (data[i].equals(element)) {
				return i;
			}
		}
		// Neste ponto, não achou: retorna -1
		return -1;
	}



	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < count; i++) {
			s.append(data[i]);
			if (i != (count - 1)) {
				s.append(",");
			}
		}
		s.append("\n");
		return s.toString();
	}

	private void setCapacity(int newCapacity) {
		if (newCapacity != data.length) {
			int min = 0;
			Integer[] newData = new Integer[newCapacity];
			if (data.length < newCapacity) {
				min = data.length;
			} else {
				min = newCapacity;
			}
			for (int i = 0; i < min; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
	}

}
