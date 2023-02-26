public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        target.setName("MAIN TARGET");
        target.setId(100300);
        target.setSubTarget(new SubTarget("SUB TARGET", 999000));

        CloneFactory cloneFactory = new CloneFactory(target);
        Target targetClone = cloneFactory.getClone();

        System.out.println("original:\n" + target);
        System.out.println();
        System.out.println("clone:\n" + targetClone);

        targetClone.setName("EDITED TARGET");
        targetClone.setId(-900000);

        System.out.println("original:\n" + target);
        System.out.println();
        System.out.println("clone:\n" + targetClone);
    }
}