package org.mp.sesion04;

import java.util.Iterator;
import org.mp.sesion03.*;

public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {
	public SortedLinkedList() {
		super();
	}

	public SortedLinkedList(Comparable<E>[] objects) {
		for (int i = 0; i < objects.length; i++) {
			addSorted(objects[i]);
		}
	}

	public void addFirst(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void addLast(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void add(E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void add(int index, E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public E set(int index, E o) {
		throw new UnsupportedOperationException("No garantiza orden");
	}

	public void addSorted(Comparable<E> e) {
		if (isEmpty() || e.compareTo(getFirst()) < 0)
			super.addFirst((E) e);
		else if (e.compareTo(getLast()) > 0)
			super.addLast((E) e);
		else {
			int index = 0;
			Iterator<E> iterador = this.iterator();
			while (iterador.hasNext()) {
				if (e.compareTo(iterador.next()) > 0)
					index++;
				else
					break;
			}
			super.add(index, (E) e);
		}
	}

	@Override
	public String toString() {
		return "Lista ordenada: " + super.toString();
	}
}