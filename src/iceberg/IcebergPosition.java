package iceberg;

import java.util.Date;

public class IcebergPosition {
    private final Date date;
    private final Iceberg ib;
    private final Coordinates co;    
    
    public IcebergPosition(Date date, Iceberg ib, Coordinates co) {
        this.date = date;
        this.ib = ib;
        this.co = co;
    }

    public Date getDate() {
        return date;
    }

    public Iceberg getIb() {
        return ib;
    }

    public Coordinates getCo() {
        return co;
    }
}
