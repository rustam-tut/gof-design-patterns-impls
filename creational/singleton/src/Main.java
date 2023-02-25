public class Main {
    public static void main(String[] args) {
        System.out.println(Earth.getInstant());

        Earth e1 = Earth.getInstant();
        Earth e2 = Earth.getInstant();
        Earth e3 = Earth.getInstant();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println(LazyEarth.getInstant());
        LazyEarth le1 = LazyEarth.getInstant();
        LazyEarth le2 = LazyEarth.getInstant();

        System.out.println(le1);
        System.out.println(le2);
    }
}