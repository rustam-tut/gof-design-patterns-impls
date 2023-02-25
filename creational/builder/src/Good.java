public class Good {
    private String id;
    private String name;
    private double netto;
    private double brutto;

    private long barcode;

    private int expirationDateByDays;

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

    public double getNetto() {
        return netto;
    }

    public void setNetto(double netto) {
        this.netto = netto;
    }

    public double getBrutto() {
        return brutto;
    }

    public void setBrutto(double brutto) {
        this.brutto = brutto;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public int getExpirationDateByDays() {
        return expirationDateByDays;
    }

    public void setExpirationDateByDays(int expirationDateByDays) {
        this.expirationDateByDays = expirationDateByDays;
    }


    @Override
    public String toString() {
        return "Good{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", netto=" + netto +
                ", brutto=" + brutto +
                ", barcode=" + barcode +
                ", expirationDateByDays=" + expirationDateByDays +
                '}';
    }
}
