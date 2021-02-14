## Just me learning graph implementation

### Graph
- Data structure for storing connected data
- Vertex = entity
- Edge = relationship between entities

### Directed Graph
- A graph where the edge has directions in them

### Weighted Graph
- The graph has directions and it carries a relative weight

### Representation of Graph
- Can be represented in
  - Adjacency matrix
    - Square matrix with dimensions equivalent to the number of vertices
    - Easy to implement and efficient to query
    - Less efficient with the space occupied
  - Adjacency list
    - An array of lists
    - Array size equivalent to the number of vertices
    - list at a specific index represents the adjacent vertices
      of the vertex represented by that array index
