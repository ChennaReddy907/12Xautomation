public class String_Operations {
    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);


        int length = fullName.length();
        System.out.println("Length: " + length);


        String sub = fullName.substring(0, 4); // Extracts "John"
        System.out.println("Substring (0 to 4): " + sub);


        char ch = fullName.charAt(5); // Gets the character at index 5 ('D')
        System.out.println("Character at index 5: " + ch);
    }
}

