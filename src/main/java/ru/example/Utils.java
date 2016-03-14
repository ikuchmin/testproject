package ru.example;

/**
 * Created by ikuchmin on 14.03.16.
 */
public class Utils {

    public static <V, E extends PojoB<V>> Container<V, E> unmodifiable(Container<V, E> container) {
        return new UnmodifiedContainer<>(container);
    }
}
