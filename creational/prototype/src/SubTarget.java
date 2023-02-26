import java.io.Serializable;

public class SubTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;

    private String subName;

    private int subId;

    public SubTarget(String subName, int subId) {
        this.subName = subName;
        this.subId = subId;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "\t\tsubN: " + subName + "\n\t\tsubId: " + subId + "\n\t\tHS: " + Integer.toHexString(hashCode());
    }
}
