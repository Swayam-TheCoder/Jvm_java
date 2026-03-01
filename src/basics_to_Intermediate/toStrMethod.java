package basics_to_Intermediate;

public class toStrMethod {
    int prop_1;
    String prop_2;
    int prop_3;
    String prop_4;
    int prop_5;

    public toStrMethod(int prop_1, int prop_5, String prop_4, int prop_3, String prop_2) {
        this.prop_1 = prop_1;
        this.prop_5 = prop_5;
        this.prop_4 = prop_4;
        this.prop_3 = prop_3;
        this.prop_2 = prop_2;
    }

    @Override
    public String toString() {
        return "My prop name is " +prop_4+" and it's my "+prop_2+" By combining both we get "+prop_4+prop_2;
    }

    public static void main(String[] args) {
        toStrMethod str = new toStrMethod(21, 22, "hello", 23, "world");
        System.out.println(str); // if we are not using toString method then the default statement is written as class_name@hashcode
    }

}

// toString() provides a string representation of an object
//default format: class_name@hashcode
// automatically called in string concatenation