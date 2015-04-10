package tutorials.basic;

//this class is used by ClassesAndObjects class
//constructor name should always be same as class name
public class Person { //this is a default contructor, if no constructor is defined further in this program default constructor is called

    int a;
    int b;
    
   
    
    public Person(int a, int b){ //this is how we create a constructor, constructor since it is a method it can take values
        System.out.println("Person created");
        System.out.println("Value of a and b are" + a +" "+b);
        
        
        
    }
   
}
 