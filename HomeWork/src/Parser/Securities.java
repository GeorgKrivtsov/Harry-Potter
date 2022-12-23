package Parser;

import java.util.Arrays;
import java.util.Date;

public class Securities {
    private String name;
    private String[] currency;
    private int code;
    private Date date;

    public Securities(String name, String[] currency, int code, Date date) {
        this.name = name;
        this.currency = currency;
        this.code = code;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String[] getCurrency() {
        return currency;
    }

    public int getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Securities{" +
                "name='" + name + '\'' +
                ", currency=" + Arrays.toString(currency) +
                ", code=" + code +
                ", date=" + date +
                '}';
    }
}
