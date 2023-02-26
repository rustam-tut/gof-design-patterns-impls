import java.io.*;

public class Target implements Serializable {
    private String name;
    private int id;

    private SubTarget subTarget;

    public Target() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubTarget(SubTarget subTarget) {
        this.subTarget = subTarget;
    }

    public Object deepClone() {
        Object targetCopy = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            targetCopy = ois.readObject();

            bos.close();
            oos.close();
            bis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return targetCopy;
    }

    @Override
    public String toString() {
        return "name: " + name + "\nid: " + id + "\nHS: " + Integer.toHexString(hashCode()) + "\n" + subTarget;
    }
}