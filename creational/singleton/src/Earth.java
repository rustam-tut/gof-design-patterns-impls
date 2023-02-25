public class Earth {
    private static final Earth instant = new Earth();

    private Earth() {
    }

    public synchronized static Earth getInstant() {
        return instant;
    }

    @Override
    public String toString() {
        return "Earth " + hashCode();
    }
}
