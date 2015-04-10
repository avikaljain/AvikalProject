/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorials.basic;

/**
 *
 * @author avigoldi
 */
public class Arrays {
    public static void main(String[] args) {
        
        int x = 5; //we are creating one box of memory
        int[] myArray; //decalaring an array of int type
        myArray = new int[4]; //inistializing here, we are creating four box of memory
        
        myArray[0] = 189;
        myArray[1] = 165;
        myArray[2] = 123;
        myArray[3] = 0;
        //myArray[4] = 1; //since array can only hold 4 int values, this will give out of bound exception
        
        System.out.println(myArray[2]);
        System.out.println(myArray.length);
        
        //this is iterating over an array
        for (int i=0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        
    }
    
}
