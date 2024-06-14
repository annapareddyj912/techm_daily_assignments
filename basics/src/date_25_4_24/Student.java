/*Write a Java class Student with a default constructor that initializes name to "Unknown" and age to 0. Create an object of this class and print its name and age.*/
package date_25_4_24;

public class Student {
    private String name;
    private int age;
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();
        
        // Print name and age of the student
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
