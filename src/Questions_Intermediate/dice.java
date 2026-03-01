package Questions_Intermediate;

public class dice {

    int roll(){
        double random = Math.random() * 6;
        return (int)Math.ceil(random);
    }

    public static void main(String[] args) {
        dice random = new dice();
        System.out.println(random.roll());
    }

}
