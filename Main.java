package com.company;
import java.util.Stack;
public class Main {
public static void main(String[] args) {

/* Stacks
important:
*push(): add an element to the stack
* pop(): display before delete the last element
* peek(): this method display the last element (but without deleting it)
* empty(): this method is used to test if this stack is or not.
 */

//we create a new stack
    Stack pila = new Stack();
    // we use the method push() to add an element to the stack
     //   the stack always show the last element

    pila.push("Wilfredo");
    pila.push("Enrique");
    pila.push("Sorto");
    pila.push("Serrano");

    //method peek
        System.out.println("Last element: " +pila.peek());

//using this while we can show the elements backwards using the .pop

        while(pila.empty()==false){
            System.out.println(pila.pop());
        }
    }
    }











