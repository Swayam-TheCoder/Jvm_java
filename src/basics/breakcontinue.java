package basics;

public class breakcontinue {
    public static void main(String[] args) {
        for(int i=0; true; i++){ // infinte loop
            if(i == 5){
                break; // break out of the loop
            }
            System.out.println(i);
        }
        System.out.println();

        for(int j = 0; j<10; j++){
            if(j == 5 || j == 7 || j == 9){
                continue; // skip one iteration
            }
            System.out.println(j);
        }
    }
}
