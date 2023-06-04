public class ArrayValueCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException("Невірний розмір масиву!");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Недійсні дані в індексі [" + (i + 1) + "][" + (j + 1) + "]!");
                } catch (Exception e) {
                    System.out.println("Помилка: " + e.getMessage());
                }
            }
        }
        return sum;
        }
    }

