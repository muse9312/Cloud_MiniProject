package entitiy;

public class CoffeeInfo extends Object {
    private String name = "";
    private String size = "";
    // private String shot = "";
    private String temp = "";
    private int price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // public String getShot() {
    // return this.shot;
    // }

    // public void setShot(String shot) {
    // this.shot = shot;
    // }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", size='" + getSize() + "'" +
                // ", shot='" + getShot() + "'" +
                ", temp='" + getTemp() + "'" +
                ", price='" + getPrice() + "'" +
                "}";
    }
};