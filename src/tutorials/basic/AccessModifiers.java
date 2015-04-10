package tutorials.basic;

public class AccessModifiers {
    public static void main(String[] args) {
   
}
    //public visibility mean this can be accessed from anywhere in program as long as we have instance of this class created
   public void doSomethingPublic() {
       
   }
   //private visibility means this method cant be accessed anywhere other then inside of this class
   private void doSomethingPrivate() {
       
   }
   //protected means this method can only be accessed inside of this package and from subclasses of this class
   protected void doSomethingProtected(){
       
   }
   
   //default means this method can only be accessed inside of this package
   void doSomething() {
       
   }

}

//private is most restricted
//default is second
//protected is third
//finally public

//all of this modifiers are also applicable for variables



