package org.example.Task1;

@FunctionalInterface
public interface CalcFunction<T> {

    public abstract T calculationFunction(T param1, T param2);

}
