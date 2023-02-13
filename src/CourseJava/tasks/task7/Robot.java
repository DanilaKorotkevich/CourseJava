package CourseJava.tasks.task7;

public class Robot {

    private HeadFactory headFactory = new HeadFactory();
    private BodyFactory bodyFactory = new BodyFactory();
    private final String[] ROBOTNAMES = new String[]{"Angel", "Executor", "Megatron", "Liberator", "Ironhide", "Demon", "OptimusPrime", "Dragon", "Bumblebee"};
    private String[] robots = new String[9];
    private final String ROBOT_NAME = "Имя робота: ";
    private final String ROBOT_HEAD = "\nНазвание головы робота: ";
    private final String ROBOT_BODY = "\nНазвание тела робота: ";

    public void createRobot() {
        for (int i = 0; i < 9; i++) {
            String head = headFactory.createPart();
            String body = bodyFactory.createPart();
            robots[i] = ROBOT_NAME + ROBOTNAMES[i] + ROBOT_HEAD + head + ROBOT_BODY + body;
        }
        print();
    }

    private void print() {
        for (int i = 0; i < robots.length; i++) {
            System.out.println(robots[i] + "\n");
        }
    }
}
