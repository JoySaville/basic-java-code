package Util01;

public class Student {
    private String name;
    private String gander;
    private int age;

    public Student() {
    }

    public Student(String name, String gander, int age) {
        this.name = name;
        this.gander = gander;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gander
     */
    public String getGander() {
        return gander;
    }

    /**
     * 设置
     * @param gander
     */
    public void setGander(String gander) {
        this.gander = gander;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", gander = " + gander + ", age = " + age + "}";
    }
}
