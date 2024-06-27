import javax.xml.crypto.Data;
import java.util.Date;

public class ObjectCreator {

    @RandomDate()
    public Date data;

    public String count;

    @RandomDate
    public Date nowData;

    public Date getData() {
        return data;
    }

    public Date getNowData() {
        return nowData;
    }
}
