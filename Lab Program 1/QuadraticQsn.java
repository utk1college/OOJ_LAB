import java.util.Scanner;

public class QuadraticQsn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        
        double disc = b * b - 4 * a * c;
        
        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2);
        } else if (disc == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("There are no real solutions; Discriminant is negative");
        }
        
        System.out.println("UTKRISHT UMANG\n1BM23ET056");
        sc.close();
    }
}
