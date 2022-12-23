package Parser;


import java.security.Security;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Companies {
    private Integer id;
    private String name;
    private String address;
    private int phoneNumber;
    private int inn;
    private Date founded;

    private List<Securities> securities;

    String format = "dd/MM/yyyy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(format);


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
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
