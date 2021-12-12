import java.util.stream.Stream;
import java.util.*;

public interface Filter<T> {
	Stream<T> filter(List<T> item, Specification<T> spec);
}
