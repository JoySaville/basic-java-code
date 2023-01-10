package AbstractDemo;

public class frog extends Animal implements Swim{
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }


}
