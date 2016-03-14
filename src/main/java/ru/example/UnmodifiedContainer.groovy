package ru.example;

class UnmodifiedContainer<V, E extends PojoB<V>> implements Container<V, E> {
    @Delegate
    private final Container<V, E> container

    UnmodifiedContainer(Container<V, E> unmodifiedContainer) {
        this.container = unmodifiedContainer
    }

    @Override
    Container<V, E> addContainer(Container<? extends V, ? extends E> sourceContainer) {
        throw new UnsupportedOperationException("not support")
    }
}