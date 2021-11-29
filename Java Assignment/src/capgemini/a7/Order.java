package capgemini.a7;

public class Order{
    private int price;
    private String status;

    public Order(int price,String status){
        this.price = price;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return getStatus() +" " + getPrice();
    }
}

