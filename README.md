**what is recursion?**
--------------------------------
Any function which calls itself is called **recursive**. 
**Recursion: Process of solving a problem by reducing it to smaller versions of itself.**
A recursive method solves a problem by calling a copy of itself to work on a smaller problem. This is called the recursion step. The
recursion step can result in many more such _recursive calls_.
It is important to ensure that the recursion terminates. Each time the function calls itself with a
slightly simpler version of the original problem. The sequence of smaller problems must
eventually converge on the _base case_ .

Content of a Recursive Method
--------------------------------------
1.**Base case(s)**
Values of the input variables for which we perform no recursive calls are called base cases (there should be at least one base case). 
Every possible chain of recursive calls must eventually reach a base case.
2.**Recursive calls**
Calls to the current method. 
Each recursive call should be defined so that it makes progress towards a base case.
----------
 infinite recursion
 ------------
A definition without a non-recursive part causes infinite recursion.





