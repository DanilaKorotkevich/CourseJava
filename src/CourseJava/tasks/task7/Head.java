package CourseJava.tasks.task7;

public enum Head {
    HEAD_MARK1("Head MarkI"),
    HEAD_MARK2("Head MarkII"),
    HEAD_MARK3("Head MarkIII"),
    HEAD_MARK4("Head MarkIV"),
    HEAD_MARK5("Head MarkV"),
    EVOLUTION_V1("Evolution V1"),
    EVOLUTION_V8("Evolution V8"),
    MK311HEAD("Mk311Head"),
    MK833HEAD("Mk833Head"),
    CLASSA1HEAD("ClassA1head"),
    CLASSB1HEAD("ClassB1head"),
    CLASSA2HEAD("ClassA2head"),
    CLASSC0HEAD("ClassC0head"),
    CLASSD1HEAD("ClassD1head"),
    SUPERIORCLASS("SuperiorClass");

    private final String headName;

    Head(String name) {
        this.headName = name;
    }

    public String getHeadName() {
        return headName;
    }
}
