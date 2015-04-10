package tutorials.basic;

//instantiating objects means creating instance of a class
//instantiatng also means constrution
public class ClassesAndObjects {
    public static void main(String[] args) {
        
        Person add = new Person(50, 57); //this is how we create an object from a class Person we wrote
//         |          |
//    is a class      |
//  and we are creating an instance of a classs by new keyword here and calling what is called as a constuctor (Person())
//  each class has a default constructor but we can write our own constuctor in a class which takes some values and instantiate them here        
          
        add.a=15; //so here we are accessing variables a and b from class Person using the object
        add.b=10;

        Person substract = new Person(65, 89);  
        substract.a=10; //here we are accessing variables a and b from class Person but this is a different instance
        substract.b=5;
    
        System.out.println(add.a + add.b);
        System.out.println(substract.a - substract.b);
        //so if we print values of a and b in both the instance,, they will be printed as we have defined even though they are from same class, values are independent, they are different in memroy
        //if we define a variable as type static in class Person, thing changes and only the last value assigned will get printed both the times since satic variables becomes member of class itself.
        //change b to static in person and try running it, if variable is not static it is called as instance variable.
        
        //Now understaning constructor, as mentioned earlier each class has a default constructor which was Person() and we can create our own constructors in a class
        //constructors are like method except there are no return type
        
        //lets call construtor Person2() from class Person2
        
        Person2 input = new Person2("Avikal"); //this is instantiating the constructor from class Person2, which takes one input value a String
        
        input.setAge(20);
        
        System.out.println(input.getName() + "is " + input.getAge() + "years old");
               
        
        
        
        
    }
}
