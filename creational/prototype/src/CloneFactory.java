public class CloneFactory {

    private final Target toClone;

    public CloneFactory(Target toClone) {
        this.toClone = toClone;
    }

    public Target getClone() {
        return (Target) toClone.deepClone();
    }
}
