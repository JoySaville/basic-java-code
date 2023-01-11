package ExceptionDemo;

public class GirlFriend {
    private String girlName;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String girlName, int age) {
        if (girlName.length() > 10 || girlName.length() < 3) {
            throw new NameFormatException(girlName+"格式有误，长度应该在3~10");
        }
        if (age < 18 || age >25) {
            throw new AgeOutBoundsException(age+"超出了年龄范围");
        }
        this.girlName = girlName;
        this.age = age;
    }

    /**
     * 获取
     * @return girlName
     */
    public String getGirlName() {
        return girlName;
    }

    /**
     * 设置
     * @param girlName
     */
    public void setGirlName(String girlName) {
        if (girlName.length() > 10 || girlName.length() < 3) {
            throw new NameFormatException(girlName+"格式有误，长度应该在3~10");
        }
        this.girlName = girlName;
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
        if (age < 18 || age >25) {
            throw new AgeOutBoundsException(age+"超出了年龄范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{girlName = " + girlName + ", age = " + age + "}";
    }
}
