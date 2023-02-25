public class LazyEarth {

    private static volatile LazyEarth instant;

    private LazyEarth() {

    }

    public synchronized static LazyEarth getInstant() {
        if (instant == null) {
            instant = new LazyEarth();
        }
        return instant;
    }

    @Override
    public String toString() {
        return "Lazy Earth " + hashCode();
    }
}
