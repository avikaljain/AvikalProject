package tutorials.basic;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Objects {
    public static void main(String[] args){
       JFrame window = new JFrame(); //here we are creating a window variable that holds JFrame objects
       
       window.setTitle("Ths is my first Window"); //press control enter to see options available, here we are calling methohd to on our JFrame object to configure it
               
       window.setSize(800, 1000);
       
       JLabel label = new JLabel(); //label variable hold JLabel objects nd we are creating new JLable to assign it to variable
        
       label.setText("Hi my name is Avikal");//we are calling the setText method on our JLabel object a
        
       window.add(label); //we are calling add method  of our JFrame object to add our label to window.
               
       window.setVisible(true);
       
       String name = "avikal";
       String upper=name.toUpperCase();
       System.out.println(upper);
    
     
    }
    
}
