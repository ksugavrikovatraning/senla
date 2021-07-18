package seven;

public class Item {
    public String name;
    public int volume;
    public int price;

    public Item(String name, int volume, int price) {
        super();
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Объем = " + volume + ", Ценность = " + price + ", Наименование = " + name;
    }

}
