# The Visitor Pattern

The visitor design pattern is a way of separating an algorithm 
from an object structure on which it operates. 
A practical result of this separation is the ability to add new operations 
to existing object structures without modifying the structures.

With the visitor pattern, each operation is implemented in a visitor that is then handed 
to the object structure, which passes its constituting objects to the visitor. 
The structure is unaware of any specific visitor, so they can be freely created 
wherever an operation is needed.

Visitor Patter requires:

- a new visitor implementation for each operation (without touching the types it operates on)
- each visitor to be able to handle all relevant classes (otherwise they don't compile)

Source: https://www.digitalocean.com/community/tutorials/visitor-design-pattern-java (code example)