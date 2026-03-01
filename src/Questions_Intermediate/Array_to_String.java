package Questions_Intermediate;


public class Array_to_String {
    public static void main(String[] args) {
        String[] str = new String[] {
                "I","am","a","Strong","person."
        };
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        for(String s: str){
            sb.append(s).append(" ");
        }
        System.out.println(sb);
    }
}
