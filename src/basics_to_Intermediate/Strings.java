package basics_to_Intermediate;

public class Strings {
    public static void main(String[] args) {
        String a = "Swayam";
        String b = "World";
        String c = new String("new str");
        int age = 20;

        System.out.println(c.length());
        System.out.println(c.charAt(1));
        System.out.println(c.substring(1,5));
        System.out.println(c.toUpperCase());
        System.out.println(c.trim());  //removes trailing or leading whitespaces
        System.out.println(c.replace("w", "xt"));
        System.out.println(c.contains("new")); // true/false
        System.out.println(c.startsWith("e")); // true/false
        System.out.println(c.indexOf("w")); // give index

    }
}

// Immutable
// Java maintains a pool of Strings for efficiency
// equals() method for value comparison, == checks for reference equality

// way to intialize a string
//        String a = "Swayam";
//        String str = new String("my name");

// String comparison
// a == b --> comparing address and a.equals(b) --> comparing strings

// concat methods
// String s = "hello" + " java" and string s2 = s.concat("world")