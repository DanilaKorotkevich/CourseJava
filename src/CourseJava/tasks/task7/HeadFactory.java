package CourseJava.tasks.task7;

import java.util.Random;

public class HeadFactory implements Create {

    private final byte FIFTEEN = 15;

    Head[] heads = new Head[FIFTEEN];

    @Override
    public String createPart() {
        heads = Head.values();
        Random random = new Random();
        String name = String.valueOf((heads[random.nextInt(heads.length)]));
        return name;
    }
}
