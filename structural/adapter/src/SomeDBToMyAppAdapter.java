public class SomeDBToMyAppAdapter implements MyAppDBConnectivity{
    SomeDBRepository someDBRepository;

    public SomeDBToMyAppAdapter(SomeDBRepository someDBRepository) {
        this.someDBRepository = someDBRepository;
    }

    @Override
    public void saveEntity() {
        someDBRepository.insert();
    }

    @Override
    public void selectEntity() {
        someDBRepository.select();
    }

    @Override
    public void deleteEntity() {
        someDBRepository.delete();
    }

    @Override
    public void editEntity() {
        someDBRepository.update();
    }
}
