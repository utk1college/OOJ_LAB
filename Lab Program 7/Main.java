import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    int age;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative.");
        }
        this.age = age;
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age.");
        }
        this.sonAge = sonAge;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Father's age: ");
            int fatherAge = sc.nextInt();
            
            System.out.print("Enter Son's age: ");
            int sonAge = sc.nextInt();

            Father father = new Father(fatherAge);
            Son son = new Son(fatherAge, sonAge);

            System.out.println("Father's age: " + father.age);
            System.out.println("Son's age: " + son.sonAge);

        } catch (WrongAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("UTKRISHT UMANG\n1BM23ET056");

        sc.close();
    }
}
