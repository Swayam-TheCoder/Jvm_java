package Questions_in_to_advance.String_questions;

public class SumOfSubstringOfNum {
    public static void main(String[] args) {
        String s = "12";
        int updated = 0;
        for (int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                updated += Integer.parseInt(s.substring(i,j));
            }
        }
        System.out.println(updated);
    }
}
