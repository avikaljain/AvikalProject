
import java.io.InputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author avigoldi
 */
public class scanner {
    public static void main(String[] args) {
        
        Scanner console =  new Scanner(System.in) ;
        
        System.out.printf("Please enter an integer value: ");
        
        
       int number = console.nextInt();
    }
}
