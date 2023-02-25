import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class GoodBuilder<T> {

    private final Supplier<T> inst;

    private final List<Consumer<T>> fields = new ArrayList<>();

    private GoodBuilder(Supplier<T> inst) {
        this.inst = inst;
    }

    public static <T> GoodBuilder<T> of(Supplier<T> inst) {
        return new GoodBuilder<T>(inst);
    }

    public <U> GoodBuilder<T> with(BiConsumer<T, U> setterCons, U value) {
        Consumer<T> consumer = ins -> setterCons.accept(ins, value);
        fields.add(consumer);
        return this;
    }

    public T build() {
        T result = inst.get();
        fields.forEach(m -> m.accept(result));
        fields.clear();
        return result;
    }
}
