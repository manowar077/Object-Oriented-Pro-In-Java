package QuestionPractice.ConstructorQuestion.Q1;
    // Define the Cat class
    class Cat {
        // Private instance variables
        private String name;
        private int age;

        // Default constructor
        public Cat() {
            // Initialize name to "Unknown"
            this.name = "Unknown";
            // Initialize age to 0
            this.age = 0;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }
        // Main method to test the Cat class

    }