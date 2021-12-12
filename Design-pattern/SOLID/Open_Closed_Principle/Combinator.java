public class Combinator<T> implements Specification<T> {

	private Specification<T> first, second;

	public Combinator(Specification<T> f, Specification<T> s) {
		this.first = f;
		this.second = s;
	}

	@Override
	public boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}
}
