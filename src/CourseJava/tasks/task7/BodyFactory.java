package CourseJava.tasks.task7;

import java.util.Random;

public class BodyFactory implements Create {

    private String newBodyName;

    private final byte NINE = 9;

    Body[] bodies = new Body[NINE];

    public BodyFactory() {
        setBodyName();
    }

    @Override
    public ObjectBody createPart() {
        setBodyName();
        ObjectBody objectBody = new ObjectBody(newBodyName);
        return objectBody;
    }

    private void setBodyName() {
        bodies = Body.values();
        Random random = new Random();
        newBodyName = String.valueOf((bodies[random.nextInt(bodies.length)]).getBodyName());
    }
}
