package CourseJava.tasks.task7;

public class Robot {

    private String name;
    ObjectHead objectHead;
    ObjectBody objectBody;

    public Robot(ObjectHead objectHead, ObjectBody objectBody) {
        this.objectHead = objectHead;
        this.objectBody = objectBody;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot name: " + name +
                ", Head type: " + objectHead.headName +
                ", Body type: " + objectBody.bodyName;
    }
}
