
## Factory design patterns

- Object creation logic becomes too convoluted
- Constructor is not descriptive
	- Name mandated by name of containing type
	- Cannot overload with same sets of arguments with different names
	- can turn into overloading hell
- Wholeale object creation (non-piecewise, unlike builder) can be outsourced to
	- A separate function (Factory method)
	- That may exist in a separate class (Factory)

```java 

// Without factory
class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(double rho, double theta) {
		x = rho * Math.cos(theha);
		y = rho * Mat.sin(thetha);
	}
}

// Still no factory but an improvement
class CoordinateSystem {
	CARTRESIAN,
	POLAR
}

class Point {
	private double x, y;

	public Point(double x, double y, CoordinateSystem sys ) {
		switch(sys) {
			case CARTESIAN:
				this.x = x;
				this.y = y;
				break;
			case POLAR:
				x = rho * Math.cos(theha);
				y = rho * Mat.sin(thetha);
				break;
		}
	}
}

// The Factory method
class Point {
	private double x, y;

	private Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	static class Factory {
		public static Point newCartesianPoint(double x, double y) {
			return new Point(x, y);
		}

		public static Point newPolarPoint(double rho, double theta) {
			return new Point(rho * Math.cos(thetha), rho * Math.sin(theta));
		}
	}
}
/**
* Usage
* Point p = Point.Factory.newPolarPoint(3, 4);
* Point x = Point.Factory.newCartesianPoint(3, 4);
*/

// Abstract Factory
interface HotDrink {
	void consume()
}

class Tea implements HotDrink {
	@Override
	public void consume() {
		System.out.println("Tea is delicious");
	}
}

class Coffee implements HotDrink {
	@Override
	public void consume() {
		System.out.println("Coffee is delicious");
	}
}

interface HotDrinkfactory {
	HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		System.out.println(
			"Put tea in bag, pour water for " + amount + " cups"
		);
		return new Tea()
	}
}

class CoffeeFactory implements HotDrinkFactory {
	@Override
	public HotDrink prepare(int amount) {
		System.out.println(
			"Grind coffee beans , pour water for " + amount + " cups"
		);
		return new Coffee()
	}
}

class HotDrinkMachine {
	private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

	public HotDrinkMachine() throws Exception {
		Set<Class<? extends HotDrinkFactory>> types = new Reflections("")
			.getSubTypeOf(HotDrinkfactory.class);

		for (Class<? extends HotDrinkFactory> type: types) {
			namedFactories.add(new Pair<>(
				type.getSimpleNames().replace("Factory", ""),
				type.getDeclaredConstructor().newInstance();
			))	
		}
	}
}
```



