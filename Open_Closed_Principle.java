public class Open_Closed_Principle {
    // Step 1: Create an interface for all animals
    interface Animal {
        void makeSound();  // Every animal must make a sound
    }

    // Step 2: Dog class
    static class Dog implements Animal {
        public void makeSound() {
            System.out.println("Dog: Woof!");
        }
    }

    // Step 3: Cat class
    static class Cat implements Animal {
        public void makeSound() {
            System.out.println("Cat:Meow!");
        }
    }

    // Step 4: Zoo class — asks animals to make their sound
    static class Zoo {
        public void hearAnimal(Animal animal) {
            animal.makeSound();  // Just asks the animal to speak
        }
    }

    //  Step 5: Main method to run the program
    public static void main(String[] args) {
        Zoo zoo = new Zoo();  // Create the zoo

        Animal dog = new Dog();  // Create a dog
        Animal cat = new Cat();  // Create a cat

        zoo.hearAnimal(dog);  // Zoo hears the dog
        zoo.hearAnimal(cat);  // Zoo hears the cat
}
}