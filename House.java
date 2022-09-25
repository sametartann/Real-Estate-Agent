import java.text.DecimalFormat;

public class House {

    private String type;
    private double price;
    private String state;


    //CONSTRUCTORS

    public House() {

        type = "No-Type";
        setPrice(-1);
        state = "No-Type";
    }

    public House(String state) {
        this.state = state;
        type = "No-Type";
        price = -1;
    }

    // Getters and Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        if (pr >= 0) {
            this.price = pr;
        }
        else
            this.price = -1;	// Price not acceptable when less than 0
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");   // Prints 2 digits after the comma
        return "House [type=" + getType() + ", price=" + decimalFormat.format(getPrice()) + ", state=" + getState() + "]";
    }

}
