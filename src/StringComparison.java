public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "java";


        System.out.println("== Comparison:");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));


        System.out.println("\nequals() Comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str4): " + str1.equals(str4));


        System.out.println("\nequalsIgnoreCase() Comparison:");
        System.out.println("str1.equalsIgnoreCase(str4): " + str1.equalsIgnoreCase(str4));


        System.out.println("\ncompareTo() Comparison:");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));
        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4));


        System.out.println("\ncompareToIgnoreCase() Comparison:");
        System.out.println("str1.compareToIgnoreCase(str4): " + str1.compareToIgnoreCase(str4));
    }

}
