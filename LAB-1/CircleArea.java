import java.util.*;

public class CircleArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();
        double area = Math.PI*r*r;
        System.out.println("Area of the circle is: "+area);
    }
}