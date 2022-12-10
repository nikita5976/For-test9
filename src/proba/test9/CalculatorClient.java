package proba.test9;
// обработал ошибки ввода
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
    byte flag = 1;
        while (flag ==1) {
            System.out.println("magic Calculator \n введите формулу - ");
            Scanner scanner = new Scanner(System.in);
            String formula = scanner.nextLine();
            CalculatorImpl clientCalculator = new CalculatorImpl();
            try {
                double clientResult = clientCalculator.calculate(formula);
                System.out.println("получите ответ \n"+clientResult);
            }
            catch (IllegalArgumentException eс ) { System.out.println("не могу прочитать");}
            System.out.println("продолжить? \n  да-1 / нет-любую клавишу");
        try {
            flag = scanner.nextByte();
        }   catch (Exception e) {
            System.out.println("До свидания!!!");
            flag = 0;
            }
        }
        System.out.println("пожалуйста");
    }
}
