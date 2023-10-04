class Task1 {
    // 1.1. Class declaration
    // This is a simple class declaration.
}

class Task2 {
    // 1.2. Public method
    // This class has a public method and its call.
    public void publicMethod() {
        System.out.println("Public method.");
    }
}

class Task3 {
    // 3. Demonstrate a class with a private method.
    // This class has a private method that cannot be called outside the class.
    private void privateMethod() {
        System.out.println("Private method.");
    }

    public void tryToCallPrivateMethod() {
        // Try to call the private method outside the class for an object.
        // This will result in a compilation error.
        // privateMethod(); // Uncommenting this line will produce an error.
    }
}

class Task4 {
    // 4. Demonstrate the use of a constructor.
    // This class has a constructor that prints a message when an object is created.
    public Task4() {
        System.out.println("Constructor has been called during object creation.");
    }
}

class Task5 {
    // 5. Demonstrate public properties of various data types.
    // This class has public properties of different data types.
    public int intValue = 222;
    public double doubleValue = 3.14;
    public boolean boolValue = false;
    public String stringValue = "My name is Dmitriy";

    public void accessProperties() {
        // Access to these properties inside the class from the methods.
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(boolValue);
        System.out.println(stringValue);
    }
}

class Task6 {
    // 6. Demonstrate private properties.
    // This class has private properties that cannot be accessed from outside the class.
    private int privateIntValue = 5;

    public void accessProperties() {
        // Access to private properties inside the class from the methods.
        System.out.println(privateIntValue);
    }

    public void tryToAccessPrivateProperty() {
        // Try to access the private property through an object.
        // This will result in a compilation error.
        // System.out.println(privateIntValue); // Uncommenting this line will produce an error.
    }
}

class Task7 {
    // 7. Create getters and setters for several private properties.
    // This class has private properties with corresponding getters and setters.
    private int intValue;
    private double doubleValue;
    private boolean boolValue;
    private String stringValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int value) {
        intValue = value;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double value) {
        doubleValue = value;
    }

    public boolean isBoolValue() {
        return boolValue;
    }

    public void setBoolValue(boolean value) {
        boolValue = value;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String value) {
        stringValue = value;
    }
}

class Task8 {
    // 8. Demonstrate the use of constructors with arguments.
    // This class has a constructor with arguments and displays the values.
    private int intValue;
    private double doubleValue;

    public Task8(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void displayValues() {
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 1
        Task1 obj1 = new Task1();

        // Task 2
        Task2 obj2 = new Task2();
        obj2.publicMethod();

        // Task 3 (Will result in a compilation error)
        Task3 obj3 = new Task3();
        // obj3.tryToCallPrivateMethod();

        // Task 4
        Task4 obj4 = new Task4();

        // Task 5
        Task5 obj5 = new Task5();
        obj5.accessProperties();

        // Task 6 (Will result in a compilation error)
        Task6 obj6 = new Task6();
        // obj6.tryToAccessPrivateProperty();

        // Task 7
        Task7 obj7 = new Task7();
        obj7.setIntValue(777);
        obj7.setDoubleValue(6.157);
        obj7.setBoolValue(true);
        obj7.setStringValue("Hello world!");
        System.out.println(obj7.getIntValue());
        System.out.println(obj7.getDoubleValue());
        System.out.println(obj7.isBoolValue());
        System.out.println(obj7.getStringValue());

        // Task 8
        Task8 obj8 = new Task8(66, 2);
        obj8.displayValues();
    }
}
