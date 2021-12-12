import java.util.*;
import java.util.Collection;
import java.util.stream.Stream;

public class BadProductFilter {
	public static Stream<Product> filterByColor(List<Product> prod, Color color) {
		return prod.stream().filter(p -> p.color == color);
	}

	public static Stream<Product> filterBySize(List<Product> prod, Size size) {
		return prod.stream().filter(p -> p.size == size);
	}
}
