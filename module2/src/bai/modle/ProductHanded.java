package bai;

import java.util.Date;

public class ProductHanded extends Product{
    private Date tmp;

    public ProductHanded(Date tmp) {
        this.tmp = tmp;
    }

    public ProductHanded(int id, String name, double price, String company, Date tmp) {
        super(id, name, price, company);
        this.tmp = tmp;
    }

    public Date getTmp() {
        return tmp;
    }

    public void setTmp(Date tmp) {
        this.tmp = tmp;
    }


    @Override
    public String toString() {
        return String.format("%s , %s, %s, %s, %s", getId(), getName(), getPrice(),getCompany(), tmp.toString());
    }
}
