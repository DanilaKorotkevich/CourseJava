package CourseJava.tasks.task7;

import java.util.Random;

public class HeadFactory implements Create {

    private String newHeadName;

    private final byte FIFTEEN = 15;

    Head[] heads = new Head[FIFTEEN];

    public HeadFactory() {
        setHeadName();
    }

    @Override
    public ObjectHead createPart() {
        setHeadName();
        ObjectHead objectHead = new ObjectHead(newHeadName);
        return objectHead;
    }

    private void setHeadName() {
        heads = Head.values();
        Random random = new Random();
        newHeadName = String.valueOf((heads[random.nextInt(heads.length)]).getHeadName());
    }
}
