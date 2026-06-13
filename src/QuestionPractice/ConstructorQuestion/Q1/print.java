package QuestionPractice.ConstructorQuestion.Q1;

public class print {
    public static void main(String[] args) {
        // Create a new Cat object using the default constructor
        Cat myCat = new Cat();
        // Use the getter methods to access private variables
        System.out.println("Cat's Name: " + myCat.getName());
        System.out.println("Cat's Age: " + myCat.getAge());
    }
}
