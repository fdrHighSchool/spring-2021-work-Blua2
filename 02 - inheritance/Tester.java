import java.util.*;

public class Tester{
    public static void main(String[] args) {
        Shop cart = new Shop();
        cart.add(new Item("bread", 3.25));
        cart.add(new Item("milk", 2.50));

        cart.add(new DiscountedItem("ice cream", 4.50, 1.50));
        cart.add(new DiscountedItem("apples", 1.35, 0.25));

        cart.printOrder();
    }
}

// DiscountedItem inherits from Item
class DiscountedItem extends Item{
    private double Discount;
   
    public DiscountedItem(String name, double price, double Discount){
        super(name, price);
    }

    public double getDiscount(){
        return Discount; 
    }
    void setDiscount(Double Discount){
        this.Discount = Discount;
    }

    public String toString(){
        return "Discount: " + super.valueToString(Discount);
    }
}

class Shop{
    private ArrayList<Item> order;
    private double total;
    private double internalDiscount;

    public Shop(){
        order = new ArrayList<Item>();
        total = 0.0;
        internalDiscount = 0.0;
    }

    public void add(Item i){
        order.add(i);
        total += i.getPrice();
        if (i instanceof DiscountedItem){
            internalDiscount += ((DiscountedItem) i).getDiscount();
        }
    }

    /** printOrder() will call toString() to print */
    public void printOrder(){
        System.out.println(this);
    }

    public String toString(){
        return discountToString();
    }

    public String discountToString(){
        return orderToString() + "\nSub-total: " + valueToString(total) + "\nDiscount: " + valueToString(internalDiscount) + "\nTotal: " + valueToString(total - internalDiscount);
    }

    private String valueToString(double value) {
        value = Math.rint(value * 100) / 100.0;
        String result = "" + Math.abs(value);
        if(result.indexOf(".") == result.length() - 2){
            result += "0";
        }
        result = "$" + result;
        return result;
    }

    public String orderToString() {
        String build = "\nOrder Items:\n";
        for(int i = 0; i < order.size(); i++){
            build += "   " + order.get(i);
            if(i != order.size() - 1){
                build += "\n";
            }
        }
        return build;
    }
}

class Item {
    private String name;
    private double price;

    public Item(){
    this.name = "";
    this.price = 0.0;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String valueToString(double value){
        String result = "" + Math.abs(value);
        if(result.indexOf(".") == result.length() - 2){
            result += "0";
        }
        result = "$" + result;
        return result;
    }

    public String toString(){
        return name + " " + valueToString(price);
    }
}