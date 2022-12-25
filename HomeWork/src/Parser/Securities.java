package Parser;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Securities {
    private String name;
    private List<String> currency;
    private String code;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date date;



    public String getName() {
        return name;
    }

    public List<String> getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Securities{" +
                "name='" + name + '\'' +
                ", currency=" + currency +
                ", code=" + code +
                ", date=" + date +
                '}';
    }
}
