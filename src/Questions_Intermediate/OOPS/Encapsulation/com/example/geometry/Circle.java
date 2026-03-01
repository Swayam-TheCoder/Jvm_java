package Questions_Intermediate.OOPS.Encapsulation.com.example.geometry;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("area=").append(area());
        sb.append('}');
        return sb.toString();
    }
}
