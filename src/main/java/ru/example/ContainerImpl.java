package ru.example;

/**
 * Created by ikuchmin on 14.03.16.
 */
public class ContainerImpl<V, E extends PojoB<V>> implements Container<V, E> {

    @Override
    public Container<V, E> addContainer(Container<? extends V, ? extends E> sourceContainer) {
        return null;
    }
}
