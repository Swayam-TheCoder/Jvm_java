package Questions_Intermediate.OOPS.Encapsulation.com.example.geometry;

public class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length * breadth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append("area=").append(area());
        sb.append('}');
        return sb.toString();
    }
}
