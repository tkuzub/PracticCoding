package com.practic.adaptive.task1;

import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;

public class FunctionComposition {
    IntUnaryOperator mult2 = num -> num * 2;
    IntUnaryOperator add3 = num -> num + 3;

    IntUnaryOperator combinedOperator = add3.compose(mult2.andThen(add3)).andThen(mult2);

    Consumer<Integer> printer = System.out::println;
    Consumer<Integer> devNull = (val) -> { int v = val * 2; };

    Consumer<Integer> combinedConsumer = devNull.andThen(devNull.andThen(printer));
}
