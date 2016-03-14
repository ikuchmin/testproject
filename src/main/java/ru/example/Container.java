package ru.example;

/**
 * Created by ikuchmin on 14.03.16.
 */
public interface Container<V, E extends PojoB<V>> {

    Container<V, E> addContainer(Container<? extends V, ? extends E> sourceContainer);

}
