package Questions_Intermediate.collections;
//String Concatenation
public class varargs {

    public static void str(String ...str){
        StringBuilder sb = new StringBuilder();
        for(String Str : str){
            sb.append(Str).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        str("Hello", "world", "Hii");
    }
}
