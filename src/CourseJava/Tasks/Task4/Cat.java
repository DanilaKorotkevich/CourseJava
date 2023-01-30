package CourseJava.Tasks.Task4;

import java.util.Random;

public class Cat {
    public static String defaultName = "Рыжик";
    public static int defaultAge = 1;
    private String name;
    private int age;
    private String[] vowels = new String[]{"у","е","ё","а","о","э","я","и","ю"};
    private String[] consonants = new String[]{"ц","к","н","г","ш","щ","з","х","ф","в","п","р","л","д","ж","ч","с","м","т","б"};

    public Cat(String _name, int _age) {
        this.name = _name;
        this.age = _age;
    }

    public static String printDefaults() {
        return "Имя по умолчанию:" + defaultName + ", возраст по умолчанию: " + defaultAge + " год";
    }

    public void print() {
        System.out.println("Имя:" + name + ", возраст: " + age + " год");
    }

    public Cat() {
        this.name = defaultName;
        this.age = defaultAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    public void catName() {
        boolean b = true;
        String newName = "";
        while(b) {
            int v = (int) Math.floor(Math.random() * vowels.length);
            int c = (int) Math.floor(Math.random() * consonants.length);
            newName += String.valueOf(consonants[c] + vowels[v]);
            if(newName.length() > 6) {
                b = false;
            }
        }
        setName(newName);
    }

    public String getRandomCatName() {
        boolean b = true;
        String newName = "";
        while(b) {
            int v = (int) Math.floor(Math.random() * vowels.length);
            int c = (int) Math.floor(Math.random() * consonants.length);
            newName += String.valueOf(consonants[c] + vowels[v]);
            if(newName.length() > 6) {
                b = false;
            }
        }
        return newName;
    }


}
