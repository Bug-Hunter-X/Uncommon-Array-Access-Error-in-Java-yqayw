# Uncommon Array Access Error in Java

This repository demonstrates an uncommon scenario of an `ArrayIndexOutOfBoundsException` in Java.  The code attempts to access an array element that is out of bounds. While `ArrayIndexOutOfBoundsException` is a common exception type, the specific situation presented might be less frequently encountered.

## The Bug

The `UncommonErrorExample.java` file contains a simple Java program that attempts to access an array element outside the bounds of the array.  This results in the `ArrayIndexOutOfBoundsException`. The exception is then caught and handled in a `try-catch` block. 

## The Solution

The `UncommonErrorSolution.java` provides a solution by adding bounds checking before accessing the array element.  This prevents the exception from being thrown in the first place.