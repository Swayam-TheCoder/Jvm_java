package Questions_in_to_advance.String_questions;

public class SubstringOfStr {
    public static void main(String[] args) {
        String s = "swayam";
//        System.out.println(s.substring(2));
//        System.out.println(s.substring(1,3));
//        System.out.println(s.substring(1,s.length() - 1));

        // I want all substrings of my name

        for (int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
