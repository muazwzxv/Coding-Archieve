public abstract class MyAbstractArrayList<T> implements MyList<T> {

	protected int size = 0;
	protected MyAbstractArrayList(){}

	protected MyAbstractArrayList(T[] data) {
		for (int i =0; i < data.length; i++) {
			add(data[i]);
		}
	}

	public void add(T t) { add(size,t); }

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}	

	public boolean remove(T t) {
		if (indexOf(t) >= 0){
			remove(indexOf(t));
			return true;
		}
		else 
			return false;
	}
}
