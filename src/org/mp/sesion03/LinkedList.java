package org.mp.sesion03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> extends AbstractList<E> {
	private Nodo<E> head, tail;


	public LinkedList() {
	}

	public LinkedList(E[] objects) {
		super(objects);
	}


	public E getFirst() {
		if (head != null)
			return head.element;
		return null;
	}

	public E getLast() {
		if (tail != null)
			return tail.element;
		return null;
	}

	public void addFirst(E e) {
		Nodo<E> nuevoNodo = new Nodo<E>(e);
		nuevoNodo.next = head;
		head = nuevoNodo;
		size++;
		if (tail == null)
			tail = head;
	}

	public void addLast(E e) {
		Nodo<E> nuevoNodo = new Nodo<E>(e);
		if (tail == null)
			head = tail = nuevoNodo;
		else {
			tail.next = nuevoNodo;
			tail = tail.next;
		}
		size++;
	}

	public E removeFirst() {
		if (size == 0)
			return null;
		else {
			Nodo<E> temp = head;
			head = head.next;
			size--;
			if (head == null)
				tail = null;
			return temp.element;
		}
	}

	public E removeLast() {
		if (size == 0)
			return null;
		else if (size == 1) {
			Nodo<E> temp = head;
			head = tail = null;
			size = 0;
			return temp.element;
		} else {
			Nodo<E> current = head;
			for (int i = 1; i < size - 1; i++)
				current = current.next;
			Nodo<E> temp = tail;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	public void add(int index, E e) {
		if (index <= 0)
			addFirst(e);
		else if (index >= size)
			addLast(e);
		else {
			Nodo<E> current = head;
			for (int i = 1; i < index; i++)
				current = current.next;
			Nodo<E> temp = current.next;
			current.next = new Nodo<E>(e);
			(current.next).next = temp;
			size++;
		}
	}

	public void clear() {
		head = tail = null;
		size = 0;
	}

	public boolean contains(E e) {
		Nodo<E> current = head;
		for (int i = 0; i < size; i++) {
			if (current.element == e)
				return true;
			current = current.next;
		}
		return false;
	}

	public E get(int index) {
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return head.element;
		else if (index == size - 1)
			return tail.element;
		Nodo<E> current = head;
		for (int i = 1; i <= index; i++)
			current = current.next;
		return current.element;
	}

	public int indexOf(E e) {
		Nodo<E> current = head;
		for (int i = 0; i < size; i++) {
			if (current.element == e)
				return i;
			current = current.next;
		}
		return -1;
	}

	public int lastIndexOf(E e) {
		Nodo<E> current = head;
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (current.element == e)
				index = i;
			current = current.next;
		}
		return index;
	}

	public E remove(int index) {
		if (index < 0 || index >= size)
			return null;
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			Nodo<E> previous = head;
			for (int i = 1; i < index; i++) {
				previous = previous.next;
			}
			Nodo<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element;
		}
	}

	public E set(int index, E e) {
		if (index < 0 || index >= size)
			return null;
		E antiguo = get(index);
		remove(index);
		add(index, e);
		return antiguo;
	}
	
	public String toString() {
		String s = "[";
		Nodo<E> current = head;
		while (current != null) {
			if (current.next == null)
				s += current.element;
			else if (current.next != null)
				s += (current.element + ", ");
			current = current.next;
		}
		return s + "]";
	}

	private static class Nodo<E> {
		E element;
		Nodo<E> next;

		public Nodo(E o) {
			element = o;
		}
	}

	public Iterator<E> iterator() {
		return new LinkedListIterator();
	}

	private class LinkedListIterator implements Iterator<E> {
		private Nodo<E> current = head;

		public boolean hasNext() {
			return current != null;
		}

		public E next() {
			if (current == null)
				throw new NoSuchElementException("No hay más elementos en la lista");
			E temp = current.element;
			current = current.next;
			return temp;
		}

		public void remove() {
			if (size != 0)
				LinkedList.this.remove(current.element);
		}
	}

}
