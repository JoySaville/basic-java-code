package Case01;
public class Phone {
    private String name;
    private String color;
    private double price;
    private int num;

    public Phone() {
    }

    public Phone(String name, String color, double price, int num) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean equals(String name, String color) {
        return this.name.equals(name) && this.color.equals(color);
    }

}
