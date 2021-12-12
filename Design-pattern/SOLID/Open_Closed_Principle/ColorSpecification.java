public class ColorSpecification implements Specification<Product> {
	private Color color;

	public ColorSpecification(Color c) {
		this.color = c;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return item.color == this.color;
	}
}
