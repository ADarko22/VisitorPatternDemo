we can now achieve those goals in a much simpler way:

create a sealed interface for all types that are part of these operations
wherever a new operation is needed, use type patterns in switch to implement it 
(this is a preview feature in Java 17)


switch(element) switches over element
each case label tests whether that instance is of the specified type
if so, it creates a variable of that type with a new name (which is unused in my examples)
then the switch evaluates to the string on the right side of the arrow
the switch must evaluate to a result, which is then assigned to message