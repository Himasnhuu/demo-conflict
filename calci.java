import java.util.*;
public class calci {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int c = n1 + n2;
        System.out.println(c);
        sc.close();
    }

    static int subtract(int a, int b){
        return a-b;
    }
}

