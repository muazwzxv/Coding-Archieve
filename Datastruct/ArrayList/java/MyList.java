public interface MyList<T> {

	public void add(T t);
	public void add(int i, T t);
	public void clear();
	public T get(int i);
	public int indexOf(T t);
	public boolean remove(T t);
	public T remove(int i);
	public T set(int i, T t);
	public int size();
}
