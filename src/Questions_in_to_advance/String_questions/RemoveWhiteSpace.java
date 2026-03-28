package Questions_in_to_advance.String_questions;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                result += ch;
            }
        }
        System.out.println(result);
    }
}
