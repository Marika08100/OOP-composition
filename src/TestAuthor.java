public class TestAuthor {

    static Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor

    /**
     * Constructs a new object.
     */
    public TestAuthor() {
    }

    public static void main(String[] args) {


        System.out.println(ahTeck.toString());  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter
    }
}
