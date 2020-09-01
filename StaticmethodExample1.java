class Test{
    static int i=10; 
    static void display()
    {
        System.out.println("i="+""+i); /* static method can call only static variable .
                                        If we did not make i as static in line 2 an error would be thrown */
    }
}
public class StaticmethodExample1 {
    public static void main(String args[])
    {
     //Test.i=12;           // If we want to assign a new value in static variable this is the way .
        
     Test.display();        /* To call static variable no need to create instance of the class , 
                                can be called directly  with class name */
    }
}
