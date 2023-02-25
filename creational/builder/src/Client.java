import java.util.UUID;

public class Client {
    public static void main(String[] args) {
        Good good1 = GoodBuilder.of(Good::new)
                .with(Good::setName, "Растишка")
                .with(Good::setId, UUID.randomUUID().toString())
                .with(Good::setBarcode, 100_500L).build();

        Good good2 = GoodBuilder.of(Good::new)
                .build();
        Good good3 = GoodBuilder.of(Good::new)
                .with(Good::setName, "пельмени Снежановские")
                .with(Good::setId, "asdasdasd")
                .with(Good::setNetto, 1.002D)
                .with(Good::setBrutto, 1.100D)
                .with(Good::setExpirationDateByDays, 365).build();

        System.out.println(good1 + "\n-------------");
        System.out.println(good2 + "\n-------------");
        System.out.println(good3 + "\n-------------");

    }
}