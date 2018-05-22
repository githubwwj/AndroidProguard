package xjyz.proguard.domain;

/**
 * Created by Administrator on 2018/5/22 0022.
 */

public class Teacher {

    private String name;
    private int age;

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

    Student student;
    class Hobby{
        String whick;

        public String getWhick() {
            return whick;
        }

        public void setWhick(String whick) {
            this.whick = whick;
        }
    }
}
