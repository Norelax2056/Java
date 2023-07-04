package EX_4;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EX_4 {
    private static final Logger LOGGER = Logger.getGlobal();
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LOGGER.log(Level.INFO,"info start prog");
        System.out.print("Первое число: ");
        double numder1 = iScanner.nextDouble();
        System.out.print("Введите действие (+,-,*,/): ");
        char oper = iScanner.next().charAt(0);
        System.out.print("Второе число: ");
        double numder2 = iScanner.nextDouble();
        double ans;
        switch (oper) {
            case '+':
                ans = numder1 + numder2;
                break;
            case '-':
                ans = numder1 - numder2;
                break;
            case '*':
                ans = numder1 * numder2;
                break;
            case '/':
                ans = numder1 / numder2;
                break;

            default:
                System.out.println("Ведите правильно действие(+,-,*,/)");
                iScanner.close();
                LOGGER.log(Level.WARNING, "Fatal 69",new Throwable());
                return;
                

        }
        System.out.println("Ответ: " + numder1 + " " + oper + " " + numder2 + "=" + ans);
        iScanner.close();
    }
}

