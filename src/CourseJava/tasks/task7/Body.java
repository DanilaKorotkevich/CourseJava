package CourseJava.tasks.task7;

public enum Body {
    BODY_MARK1("Body MarkI"),
    BODY_MARK2("Body MarkII"),
    BODY_MARK3("Body MarkIII"),
    BODY_MARK4("Body MarkIV"),
    BODY_MARK5("Body MarkV"),
    MECHANIC15("Mechanic15"),
    MECHANIC15_V2("Mechanic15V2"),
    MECHANIC15_V4("Mechanic15V4"),
    MECHANIC2_0("Mechanic2.0");

    private final String bodyName;

    Body(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getBodyName() {
        return bodyName;
    }
}
