package tutorials.basic;

public class Loops {
    public static void main(String[] args) {
        
        forLoop();
        whileLoop();
    }

    static void forLoop() {
    for (int counter=0; counter<10; counter=counter + 1) {
  
        System.out.println(counter);
     }
    }
    
    static void whileLoop() {
    int a=0;
     while(a<10) {
   
         System.out.println("value of a is " +a);
          a=a+1;
    }

}
 
}

