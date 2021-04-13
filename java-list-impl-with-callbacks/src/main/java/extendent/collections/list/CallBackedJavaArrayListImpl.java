package extendent.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BiConsumer;

public class CallBackedJavaArrayListImpl<E> extends ArrayList<E> implements CallBackedJavaArrayList<E>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1944990658156228494L;

	@Override
	public boolean add(E e) {
		throw new UnsupportedOperationException();
	}
	
	public boolean add(E e, BiConsumer<E, Boolean> callback) {
		boolean result = super.add(e);
		callback.accept(e, result);
		return result;
	}
	
	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException();
	}
	
	public void add(int index, E element, BiConsumer<Integer, E> callback) {
		super.add(index, element);
		callback.accept(index, element);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}
	
	public boolean addAll(Collection<? extends E> c, BiConsumer<Collection<? extends E>, CallBackedJavaArrayList<E>> callback) {
		boolean addAll = super.addAll(c);
		callback.accept(c, this);
		return addAll;
	}
	
	@Override
	public int size() {
		return super.size();
	}
}
