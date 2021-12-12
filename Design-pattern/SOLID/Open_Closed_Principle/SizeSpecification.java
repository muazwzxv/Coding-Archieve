public class SizeSpecification implements Specification<Product> {
	private Size size;

	public SizeSpecification(Size s) {
		this.size = s;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.size == this.size;
	}

}
