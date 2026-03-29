package Questions_in_to_advance.String_questions;

// check str rotation
public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        if(str1.length() != str2.length()){
            System.out.println("false");
            return;
        }

        String t = str1 + str1;
        System.out.println(t.contains(str2));
        // s1 : abcd s2: bacd, abcdabcd  -->  false

    }
}
