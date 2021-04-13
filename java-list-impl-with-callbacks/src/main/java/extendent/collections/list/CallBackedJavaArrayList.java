package extendent.collections.list;

import java.util.Collection;
import java.util.function.BiConsumer;

public interface CallBackedJavaArrayList<E> {
	
	public boolean add(E e, BiConsumer<E, Boolean> callback);
	
	public void add(int index, E element, BiConsumer<Integer, E> callback);
	
	public boolean addAll(Collection<? extends E> c, BiConsumer<Collection<? extends E>, CallBackedJavaArrayList<E>> callback);
	
	public int size();
}
