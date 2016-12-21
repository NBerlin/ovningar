package arraycollection;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCollection<E> implements Collection<E> {
	private E[] theCollection;
	private int size;

	/** Constructs an empty list with an initial capacity of ten. */
	@SuppressWarnings("unchecked")
	public ArrayCollection() {
		theCollection = (E[]) new Object[10];
		size = 0;
	}

	/**
	 * Appends the specified element to the end of this list. Returns true if
	 * this collection changed as a result of the call.
	 */
	public boolean add(E x) {
		if (size == theCollection.length) {
			doubleArray();
		}
		theCollection[size] = x;
		size++;
		return true;
	}

	/** Returns true if this collection contains the specified element. */
	public boolean contains(Object x) {
		// Fett basic men borde klara vad de söker efter.
		for (int i = 0; i < size; i++) {
			if (theCollection[i] == x) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Creates an new array that is twice the size of the current array and
	 * copies the content of the current array into the new one.
	 */
	private void doubleArray() {
		// ny array som är lika stor som nuvarande(fulla) arrayen
		E[] theTemp = (E[]) new Object[theCollection.length];
		// nya är nu exakt likadan som gamla
		theTemp = theCollection;
		// Gör om ursprungliga till en tom array som är dubbel så stor
		theCollection = (E[]) new Object[theTemp.length * 2];
		// För storleken på gamla så sätter man in de gamla värdena i den nya
		// arrayen
		for (int i = 0; i < theTemp.length; i++) {
			theCollection[i] = theTemp[i];
		}
	}

	public Iterator<E> iterator() {

		return new ArrayIterator();
	}

	private class ArrayIterator implements Iterator<E>{
		private int pos;

		private ArrayIterator() {
			pos = 0;
		}

		@Override
		public boolean hasNext() {
			//fall positionen är mindre än size så finns det en nästa.
			return pos<size;
		}

		@Override
		public E next() {
			
			if(hasNext()){
				E item = theCollection[pos];
				pos++;
				return item;
			}
			else{
				throw new NoSuchElementException();
			}
		}

	}

	public int size() {
		return size;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
