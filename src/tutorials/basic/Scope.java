package tutorials.basic;

/*
 * @author avigoldi
 */
//demonstraton of variable scope
//if we define any variable in a articular method, it wont be accessible in other methods
//variable defined in main method cant be resolved in doSomething, so inorder to resolve this
//we define a variable outside of even main method, variable thus defined will be accessible to all the methods
public class Scope {
    static int x = 5; //this variable is now accessible in any method it is called in
    static int y; // this as well
    public static void main(String[] args) {
        //any variable defined in this method will only be accessible in this method only, cant use that variable in for eg. doSomething method
        System.out.println(x);
        y = 10;
        System.out.println(y);
        
        doSomething();
    }
    
    static void doSomething() {
        System.out.println(x);
        y=15;
        System.out.println(y);
        
    }
}
