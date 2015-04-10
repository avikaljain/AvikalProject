package tutorials.basic;


public class Person2 {
    private String name; //here we have defined a variable name
    private int age;
    
    public Person2(String name) { //and here we have defined a constructor Person2 which takes one value name as well, so if we have to assign the value to name variable value
                                  //to name variable declared above, we use this. keyword
       
        this.name = name;
        System.out.println("Person created");

    }

  
    //below code is called getters and setters, go to refactor and click on Encapsulate fields, it will create a wrapper for our variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
