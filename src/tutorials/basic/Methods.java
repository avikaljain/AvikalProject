package tutorials.basic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author avigoldi
 */
public class Methods {
    public static void main(String[] args) {
        sayHelloWorld(); 
            //anything folowed by parenthesis is calling a method is java
            //so whenever we see something like test(); - it means we are calling a method test
        
        avikal("Goldi!");
        
        int x = returnValue();
        System.out.println(x);
        
        int y = square(6);
        System.out.println(y);
        
        
    }
    
    static void sayHelloWorld() { //simple method to print some string, you call it above in main method
            System.out.println("Hello, World!");
    }
    
    //we can also define method which takes certain values, for example
    static void avikal(String name) {
        System.out.println("Hello, " + name);
    }
    
    //now above methods were void methods which doesnt return any value
    //in this example , we will return a value from a a method
    static int returnValue() {
        return 5;
    }
        
    //Methods can return and take values
    static int square(int a) {
            return a * a;
        }
        
        
    
}

