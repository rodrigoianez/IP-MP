package org.mp.sesion03;

public abstract class AbstractList<E> implements List<E> {
	
	protected int size = 0; 

	protected AbstractList() {
	}

	protected AbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}

	public void add(E e) {
		add(size, e);
	}

	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}

	public int size() {
		return size;
	}

	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		} else
		return false;
	}
}