package models;

/**
 * Created by SpceSmkBrain on 25/7/2561.
 */
public class Bike {
    private String id, name ,brands;
    private double prices;
    private int amounts;

    //constructor method

    public Bike(){
    }

    public Bike(String id,String name,String brands, double prices, int amounts){

        this.id = id;
        this.name = name;
        this.brands = brands;
        this.prices = prices;
        this.amounts = amounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getAmounts() {
        return amounts;
    }

    public void setAmounts(int amounts) {
        this.amounts = amounts;
    }
}
