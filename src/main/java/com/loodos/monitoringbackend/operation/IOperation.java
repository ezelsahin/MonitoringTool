package com.loodos.monitoringbackend.operation;

public interface IOperation<T> {
    T apply(T t1, T t2);
}
