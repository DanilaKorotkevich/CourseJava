package CourseJava.tasks.task5;

import java.util.Random;

public class Main {

    private final String[] LETTER = new String[]
            {"ц","к","н","г","ш","щ","з","х","ф","в","п","р","л","д","ж","ч","с","м","т","б","у","е","ё","а","о","э","я","и","ю",
                    "Ц","К","Н","Г","Ш","Щ","З","Х","Ф","В","П","Р","Л","Д","Ж","Ч","С","М","Т","Б","У","Е","Ё","А","О","Э","Я","И","Ю"};

    private String[][] mainArray = new String[10][10];

    private final Random random = new Random();

    private String createRandomNumber() {
        String randNum;
        randNum = String.valueOf(random.nextDouble(10));
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

    public void fillMainArr() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (((i + j) % 3) == 0) mainArray[i][j] = createRandomNumber();
                else mainArray[i][j] = createRandomWord();
                System.out.printf(mainArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
