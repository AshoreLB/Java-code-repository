package hi;
public class cinema {
    //私有化成员变量
    private int id;
    private String name;
    private double price;
    private String author;

    //无参构造器
    public cinema(){

    }
    //有参构造器
    public cinema(int id,String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.id = id;

    }

    //get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}