package CourseJava.tasks.task5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    private final String[] LETTER = new String[]
            {"ц","к","н","г","ш","щ","з","х","ф","в","п","р","л","д","ж","ч","с","м","т","б","у","е","ё","а","о","э","я","и","ю",
                    "Ц","К","Н","Г","Ш","Щ","З","Х","Ф","В","П","Р","Л","Д","Ж","Ч","С","М","Т","Б","У","Е","Ё","А","О","Э","Я","И","Ю"};
    private final int TEN = 10;
    private String[][] mainArray = new String[TEN][TEN];
    private String[] diagArray = new String[TEN * 2];

    private final Random random = new Random();

    public void run() {
        fillMainArr();
        createDiagArr();
        equalsDiag();
        point3();
    }

    private String createRandomNumber() {
        String randNum;
        randNum = String.valueOf((random.nextDouble(10))).substring(0,7);
        return randNum;
    }

    private String createRandomWord() {
        int letter;
        String word = "";
        while (word.length() < 7) {
            letter = (int) Math.floor(Math.random() * LETTER.length);
            word += LETTER[letter];
        }
        return word;
    }

    private void fillMainArr() {
        int x = 1;
        System.out.println("Вывод матрицы 10 на 10:");
        for (int i = 0; i < TEN; i++) {
            for (int j = 0; j < TEN; j++) {
                if ((x % 3) == 0) mainArray[i][j] = createRandomNumber();
                else mainArray[i][j] = createRandomWord();
                System.out.printf(mainArray[i][j] + " ");
                x++;
            }
            System.out.println(" ");
        }
    }

    private void equalsDiag() {
        boolean isSame = true;
        int i = 0;
        System.out.println("\n\nСравнение диагоналей:");
        while (isSame && i < TEN) {
            isSame = diagArray[i].equals(diagArray[TEN + i]);
            i++;
        }
        System.out.println("equals diagonals is " + isSame + "\n");
    }

    private void createDiagArr() {
        System.out.print("\nВывод массива из двух диагоналей:");
        for (int i = 0; i < TEN; i++) {
            diagArray[i] = mainArray[i][i];
            diagArray[TEN + i] = mainArray[(TEN-1)-i][i];
        }
       printDiagArr(false);
    }

    private void printDiagArr(boolean isUnderscore) {
        System.out.println("");
        String underscore = "";
        for (int i = 0; i < TEN * 2; i++) {
            System.out.printf(!isUnderscore ? diagArray[i] + ", " : underscore + diagArray[i]);
            underscore = "_";
        }
    }

    private void point3() {
        ArrayList<String> NumArray = new ArrayList<String>();
        StringBuilder resultString = new StringBuilder();
        String delimiter = "";
        for (int i = 0; i < TEN * 2; i++) {
            if (!diagArray[i].matches("[0-9].*")) {
                resultString.append(delimiter + diagArray[i].substring(1, 4));
                delimiter = ", ";
            } else {
                BigDecimal value = new BigDecimal(diagArray[i]);
                NumArray.add(String.valueOf((value.doubleValue() < 1.7) ? value.setScale(1, RoundingMode.HALF_DOWN) : value.setScale(1, RoundingMode.HALF_UP)));
            }
        }
        System.out.println("Вывод со 2 по 4 символ:\n" + resultString);
        System.out.println("\nМассив чисел из диагоналей:");
        System.out.println(String.join("_", NumArray));
    }
}
