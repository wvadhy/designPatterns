package org.example.Misc;

@FunctionalInterface
public interface Operation<T> {
    T operate(T o1, T o2);
}
