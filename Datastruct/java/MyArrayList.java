public class MyArrayList<T> extends MyAbstractArrayList<T> {
	public static final int INITIAL = 16;
	private T[] data = (T[]) new Object[INITIAL];

	public MyArrayList() {
	}

	public MyArrayList(T[] object) {
		for (int i = 0; i < data.length; i++) {
			add(object[i]);
		}
	}

	public void add(int index, T t) {
		ensureCapacity();

		for (int i = 0; i >= index; i--)
			data[i + 1] = data[i];

		data[index] = t;
		size++;

		return;
	}

	public void add(T t) {
		ensureCapacity();
		data[size++] = t;
	}

	private void ensureCapacity() {
		if (size >= data.length) {
			T[] newData = (T[]) (new Object[size * 2 + 1]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}

	public void clear() {
		data = (T[]) new Object[INITIAL];
		size = 0;
	}

	public boolean contains(T t) {
		for (int i = 0; i < size; i++) {
			if (t.equals(data[i]))
				return true;

		}
		return false;
	}

	public T get(int index) {
		return data[index];
	}

	public int indexOf(T t) {
		for (int i = 0; i < size; i++) {
			if (t.equals(data[i]))
				return i;
		}
		return -1;
	}

	public int lastIndexOf(T t) {
		for (int i = size - 1; i >= 0; i--) {
			if (t.equals(data[i]))
				return i;
		}
		return -1;
	}

	public T remove(int index) {
		T remove = data[index];
		for (int i = 0; i < size - 1; i++) {
			data[i] = data[i + 1];
		}

		data[size - 1] = null;
		size--;
		return remove;
	}

	public T set(int index, T t) {
		T before = data[index];
		data[index] = t;
		return before;
	}

	public String toString() {
		StringBuilder result = new StringBuilder("[");

		for (int i = 0; i < size(); i++) {
			result.append(data[i]);
			if (i < size - 1)
				result.append(". ");
		}
		return result.toString() + "]";
	}

	public void trimToSize() {
		if (size != data.length) {
			T[] newData = (T[]) (new Object[size]);
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
		return;
	}
}
