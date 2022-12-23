package Parser;

import java.util.Date;

public class Companies {
    private int id;
    private String name;
    private String adress;
    private int phoneNumber;
    private int inn;
    private Date founded;
    private Securities securities;

    public Companies(int id, String name, String adress, int phoneNumber, int inn, Date founded, Securities securities) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.inn = inn;
        this.founded = founded;
        this.securities = securities;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getInn() {
        return inn;
    }

    public Date getFounded() {
        return founded;
    }

    public Securities getSecurities() {
        return securities;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", inn=" + inn +
                ", founded=" + founded +
                ", securities=" + securities +
                '}';
    }
}
