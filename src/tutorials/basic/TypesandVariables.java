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
public class TypesandVariables {
    public static void main (String[] args){
        //this is how we create a int type variable
        
        int myVariable; //declare the variable of type int
        myVariable=5; //initializing myvariable to the value 5
        System.out.println(myVariable);
        
        myVariable=10; //variable value can be overwritten, this will now print 10
        System.out.println(myVariable);
        
        myVariable = myVariable +1; //this is not a mathamatical statement, right side is evaluated and stored in the left side variable
        System.out.println(myVariable);
        
        //we can declare and initialize the variable in a single line
        
        int myvar2=7;
        System.out.println(myvar2);
        
        double myvar3 = 2.5; //here we have decalared a variable of type double.
        System.out.println(myvar3);
        
        //int type variable cannot be assinged double/floating type values
        //but double type variable can be assigned a integer type values
        
        myvar3=myvar2;
        System.out.println(myvar3); //this will convert int variable to double type since we are assigning it to double type variable.
        
        String hello = "Hello, World"; //String type variables
        System.out.println(hello);
        
        String a="Hello, ";
        String b="Avikal!";
        
        System.out.println(a + b); //this is string concatenation
    }
    
}
