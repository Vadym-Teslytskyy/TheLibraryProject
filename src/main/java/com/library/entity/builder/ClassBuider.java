package com.library.entity.builder;

public interface ClassBuider<T> {

    void buid();

    T getInstance();
}
