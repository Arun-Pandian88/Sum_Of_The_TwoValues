import java.util.Scanner;

class Shape {
    int length;
    int Breadh;
    static Scanner input = new Scanner(System.in);
    public void Area() {
        length = input.nextInt();
        Breadh = input.nextInt();
    }
}
class Rectangle extends Shape {
    public void Area() {
        super.Area();
        int multiple = length * Breadh;
        System.out.println(multiple);
    }
}
public class Solution {
    public static void main(String args[]) {
        Shape object = new Rectangle();
        object.Area();
    }
}