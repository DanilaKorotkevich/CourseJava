package CourseJava.tasks.task7;

import java.util.Random;

public class BodyFactory implements Create {

    private final byte NINE = 9;

    Body[] bodies = new Body[NINE];

    @Override
    public String createPart() {
        bodies = Body.values();
        Random random = new Random();
        String name = String.valueOf((bodies[random.nextInt(bodies.length)]));
        return name;

    }
}
