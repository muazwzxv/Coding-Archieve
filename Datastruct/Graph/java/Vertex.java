class Vertex {
  String label;
  
  // Constructor
  Vertex(String label) {
    this.label = label;
  }

  @Override
  public int hashCode() {
    return this.label.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || o.getClass() != this.getClass()) return false;

    Vertex vertex = (Vertex) o;

    return (vertex.label.equals(this.label));
  }

}
