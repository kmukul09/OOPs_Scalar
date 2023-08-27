class Student{
    int age;
    String Name;
    
    void display(){
        System.out.println("My name is " + this.Name + " And my age is " + this.age + ".");
    }

    void sayHello( String Name){
        System.out.println(this.Name + " Says Hello to " + Name + ".");
    }
}



public class OOP_L1_Assignment1{
    /* 
    public static void main(String[] args){

        System.out.println("Hello world");

        Student s1 = new Student();
        s1.Name = "Arjun";
        s1.age = 23;

        s1.display();

        Student s2 = new Student();
        s2 = s1;  // new object s2 ko s1 ka copy bnayan gya copy constructor called internally 
        s2.age = 25;
        s2.Name = "Karn";
        
        s2.display();

        s1.display();

    }
    */
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.Name = "A";
 
        Student s2 = new Student();
        s2.age = 20;
        s2.Name = "B";
 
        swap(s1, s2);
 
        s1.display();
    }
 
    private static void swap(Student s1, Student s2) {
         Student temp = s1;
         s1 = s2;
         s2 = temp;
    }
    
    /* 
    the code as written won't achieve the desired swapping effect.
    In Java, when you pass objects to a method, you're actually passing references to those objects.
    The references themselves are passed by value, which means that modifying the references inside 
    the method won't affect the original references outside the method.

    In your swap method, you're swapping the references s1 and s2, but these changes won't be reflected 
    outside the method. As a result, after calling the swap function, s1 and s2 outside the 
    function will still point to the original objects they were assigned to. 
    Thus, calling s1.display() will still print the details of the original s1 object, not the swapped object.
    */

    
    
}
