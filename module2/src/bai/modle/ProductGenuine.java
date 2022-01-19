package bai;

import java.util.Date;

public class ProductGenuine extends Product{
    private Date tmr;
    private String country;

    public ProductGenuine(Date tmr, String country) {
        this.tmr = tmr;
        this.country = country;
    }

    public ProductGenuine(int id, String name, double price, String company, Date tmr, String country) {
        super(id, name, price, company);
        this.tmr = tmr;
        this.country = country;
    }

    public Date getTmr() {
        return tmr;
    }

    public void setTmr(Date tmr) {
        this.tmr = tmr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("%s , %s, %s, %s, %s, %s", getId(), getName(), getPrice(),getCompany(),tmr, country.toString());
    }
}
