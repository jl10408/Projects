import java.util.Scanner;

public class Pet {
    private String name; // Pet's name
    private String type; // Pet's type
    private int age; // Pet's age

    // Default constructor
    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    // Custom constructorws
    public Pet(String name, String type, int age) {
        setName(name);
        setType(type);
        setAge(age);
    }

    // Setters
    public void setName(String name) {
        this.name = name; // Set name
    }
    
    public void setType(String type) {
        this.type = type; // Set type
    }
    
    public void setAge(int age) {
        this.age = age; // Set age
    }

    // Getters
    public String getName() {
        return name; // Get name
    }
    
    public String getType() {
        return type; // Get type
    }
    
    public int getAge() {
        return age; // Get age
    }

    // Speak method
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof"; // Dog sound
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow"; // Cat sound
        } else {
            return "Yowl"; // Default sound
        }
    }

    // toString method
    public String toString() {
        return "Pet information:\n" +
               "Type: " + type + "\n" +
               "Name: " + name + "\n" +
               "Sound: " + speak() + "\n" +
               "Age: " + age; // All details
    }
}
