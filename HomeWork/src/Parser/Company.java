package Parser;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Company {
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private String inn;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date founded;

    private List<Securities> securities;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getInn() {
        return inn;
    }

    public Date getFounded() {
        return founded;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    @Override
    public String toString() {
        return "Companies{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", inn=" + inn +
                ", founded=" + founded +
                ", securities=" + securities +
                '}';
    }


}
