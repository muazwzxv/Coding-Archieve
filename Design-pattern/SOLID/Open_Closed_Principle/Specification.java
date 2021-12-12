import java.util.*;
import java.util.stream.Stream;

public interface Specification<T> {
	boolean isSatisfied(T item);
}
