

// Shape -> Circle, Square
// Rendering -> Vector, Raster

interface Renderer {
	void renderCircle(float radius);
}

class VectorRenderer implements Renderer {
	@Override
	public void renderCircle(float radius) {
		System.out.println("Draw circle of radius");
	}
}

class RasterRenderer implements Renderer {
	@Override
	public void renderCircle(float radius) {
		System.out.println("Draw circle of radius");
	}
}

abstract class Shape {
	protected Renderer renderer;

	public Shape(Renderer renderer) {
		this.renderer = renderer;
	}

	public abstract void resize(float factor);
	public abstract void draw();
}

class Circle extends Shape {
	public float radius;


	public Circle(Renderer renderer) {
		super(renderer);
	}

	public Circle(Renderer renderer, float radius) {
		super(renderer);
		this.radius = radius;
	}

	@Override
	public void draw() {
		renderer.renderCircle(radius);	
	}

	@Override
	public void resize(float factor) {
		radius *= factor;	
	}
}