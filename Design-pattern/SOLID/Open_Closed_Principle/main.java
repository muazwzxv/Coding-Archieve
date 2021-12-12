import java.util.List;

public class main {

	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
		Product house = new Product("House", Color.BLUE, Size.HUGE);

		List<Product> products = List.of(apple, tree, house);

		/**
		 * The bad way ----------- Considered bad because every new filter or behavior
		 * added will require an addition of code that will constantly need updating -
		 * filterByColor - filterByName - filterBySize
		 */
		System.out.println("Green Products (Old way): ");
		BadProductFilter.filterByColor(products, Color.GREEN)
				.forEach(p -> System.out.println("- " + p.name + " is green"));

		/**
		 * The better way -------------- The better ways make use of Generics and
		 * Interfaces in java will allows filter() to be extended without necessarily
		 * adding methods or function to handle a very specific requirements
		 */
		BetterProductFilter bpf = new BetterProductFilter();
		System.out.println("Green Products (New way): ");
		bpf.filter(products, new ColorSpecification(Color.GREEN))
				.forEach(p -> System.out.println("- " + p.name + " is green"));

		/**
		 * Using the better way with multiple specification
		 */
		System.out.println("Huge and blue (New way): ");
		bpf.filter(products, new Combinator<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.HUGE)))
				.forEach(p -> System.out.println("- " + p.name + " is large and blue"));

	}
}
