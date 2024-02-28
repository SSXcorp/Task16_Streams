package org.example.Task1;


public class Main {
    public static void main(String[] args) {
        CalcFunction<Integer> addFunction = (param1, param2) -> (param1 + param2)%4-2024;
        CalcFunction<Integer> substractFunction = (param1, param2) -> param1 + param2;

        int result = addFunction.calculationFunction(55555, 3555);

        int res2 = substractFunction.calculationFunction(12,3);

    }
}