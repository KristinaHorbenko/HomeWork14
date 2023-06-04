import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayValueCalculator calculator = new ArrayValueCalculator();
            String [][] array = new String[4][4];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть значення елементів масиву 4x4 або ведіть [.], щоб запустити програму");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase(".")) {
                        break;
                    }
                    array[i][j] = input;
                }
            }

            int result = calculator.doCalc(array);
            System.out.println("Результат розрахунку: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Помилка розміру масиву: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Помилка даних масиву: " + e.getMessage());
        }
    }
}