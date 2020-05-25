### Class/Object Invocation Order    

When an object in an inheritance chain is instantiated for the first time, this is the order that the code is executed:    

1. All of the static variables are defined in the class (with default values).  For example, the code public static String 
firstName = "Jason";  would result in the creation of the variable firstName  but in this step, it is assigned the default 
value of null (rather than the explicit value of "Jason").  This happens for all of the classes in the hierarchy 
(moving up the inheritance chain).
2. All of the static initialization blocks and explicit values assigned to static variables (such as "Jason" above), 
are executed in the base class, in the order they are written (from top to bottom).  
3. All of the static initialization blocks and explicit values assigned to static variables are executed for the immediate 
child of the base class, in the order they are written (from top to bottom).
4. Step 3 is repeated all the way down the object hierarchy until the instantiated object type is reached.
5. All of the instance variables are defined with default values, for all of the classes in the hierarchy (moving up the 
inheritance chain).
6. All of the instance initialization blocks and explicit values assigned to instance variables are executed for the base 
class, in the order they are written (from top to bottom).  
7. The constructor for the base class is executed.
8. All of the instance initialization blocks and explicit values assigned to instance variables are executed for the immediate 
child of the base class, in the order they are written (from top to bottom),
9. The constructor for the immediate child of the base class is executed.
10. Steps 8 - 9 are repeated all the way down the object hierarchy until the instantiated object type is reached.    

Note that the first steps that execute "static" code will only happen once during the entire life of the class, and may have 
been executed before an object has been instantiated (such as when a reference variable is created or a static member is 
accessed). 
