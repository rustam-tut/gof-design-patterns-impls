public class SomeDBRepository implements DBRepository{
    @Override
    public void insert() {
        System.out.println("Insert smth to SomeDM...");
    }

    @Override
    public void select() {
        System.out.println("Select smth from SomeDB...");
    }

    @Override
    public void update() {
        System.out.println("Update smth in SomeDB...");
    }

    @Override
    public void delete() {
        System.out.println("Delete smth from SomeDB...");
    }
}
