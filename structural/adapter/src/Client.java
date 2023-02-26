public class Client {
    public static void main(String[] args) {
        SomeDBToMyAppAdapter someDBToMyAppAdapter = new SomeDBToMyAppAdapter(new SomeDBRepository());
        someDBToMyAppAdapter.selectEntity();
        someDBToMyAppAdapter.editEntity();
        someDBToMyAppAdapter.deleteEntity();
        someDBToMyAppAdapter.saveEntity();
    }
}