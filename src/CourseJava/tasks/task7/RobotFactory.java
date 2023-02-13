package CourseJava.tasks.task7;

public class RobotFactory {

    private final int NINE = 9;
    Robot[] robots = new Robot[NINE];

    public void print() {
        for (int i = 0; i < NINE; i++) {
            System.out.println(robots[i].toString());
        }
    }

    public RobotFactory(String name1, String name2, String name3) {
        String currentName = name1;
        for (int i = 0; i < NINE; i++) {
            robots[i] = new Robot(new HeadFactory().createPart(), new BodyFactory().createPart());
            robots[i].setName(currentName);
            if (i == 2) {
                currentName = name2;
            }
            if (i == 5) {
                currentName = name3;
            }
        }
    }
}
