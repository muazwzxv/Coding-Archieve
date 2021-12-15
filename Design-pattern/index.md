# Design pattern

## Why ?

- Common architectural approaches
- Popularized by the Gang of four book (1994)
- Translated to many OOP languages
- Universally relevant and internalized in some language

## Gamma Categorization

- Design patttern are typically split into three categories
- Creational patterns
  - Deal with the creation (construction of object)
  - Explicit (constructor) vs implicit(DI, reflection, etc)
  - Wholesale (single statement) vs piecewise (step by step)
- Structural pattern
  - Concern with the structure (class members)
  - Many patterns are warappers that mimic the underlying class interface
  - Stress the importance of good API design
- Behavioral patterns
  - They are all different, no central theme

## SOLID Design Principles

### Single Responsibility Pattern

- A single class will have only a single responsibility
- An antipattern can be implement which will go against the idea of design pattern
- The importance of this is to avoid creating god objects or objects/entity that have many responsibilty by implementing separation of concerns and only allow one class to only each have one responsibility

### Open Closed Principle

- The term came from the sole belief of **_Open for extension, but close for modification_**
- This allows behavior to be extended without modifying its undelying source code
- Understanding of Generics and Interfaces in object oriented programming is important
- **_Open for extension means_** - Open to be inherit or implemented (class/interface)
- **_Close for modification_** - Modifying the core logic of the code

### Liskov Subtitution Principle

- Able to subtitute subclass for a base class without anything breaking

### Interface Segregation Principle

- Split interface into smaller interfaces
