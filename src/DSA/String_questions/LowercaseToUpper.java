package DSA.String_questions;

// lowercase to upper and upper to lower
// a - 97
// A - 65
// Difference - 32

public class LowercaseToUpper {

    static String makeUpper(String st){
        String result = "";

        for(char ch : st.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                result += (char)(ch - 32);
//                System.out.println(ch);
            }
            else {
                result += ch;
            }
        }
        return result;
    }

    static String makeLower(String str){
        String result = "";
        for(char ch : str.toCharArray()){
            if(ch >= 'A' && ch <= 'Z'){
                result += (char)(ch + 32);
            }
            else{
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String up = "hello WORLD";
        String lo = "its me SWAYAM";
        String upper = makeUpper(up);
        System.out.println(upper);
        String lower = makeLower(lo);
        System.out.println(lower);

    }
}
