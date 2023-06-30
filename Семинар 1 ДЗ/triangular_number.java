import java.util.Scanner;

public class triangular_number {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int numb = in.nextInt();
            int s=0;
            int f=1;
            for (int i = 1; i <= numb; i++) {                
               s+=i;
               f*=i;
            }
            System.out.println("Треугольного число: " + s);
            System.out.println("Факториал числа: " + f);
        }
    }
}
