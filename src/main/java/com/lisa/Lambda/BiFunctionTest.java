package com.lisa.Lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class BiFunctionTest {
    public static void main(String[] args) {
        /*BiFunctionTest t1 = new BiFunctionTest();
        // 使用 BiFunctioin场景, 这里是 2 + 3 = 5
        Integer biFuncResult = t1.computeForBiFunction(2, 3,
                (v1, v2) -> v1 + v2);
        System.out.println("BiFunction 结果：" + biFuncResult);

        // 使用 BiFunctioin andThen场景, 这里是 (2 * 3) + 6 = 12
        Integer biFuncAndThenResult = t1.computeForBiFunctionAndThen(2, 3,
                (v1, v2) -> v1 * v2, v1 -> v1 + 6);
        System.out.println("BiFunction andThen 结果：" + biFuncAndThenResult);*/

        BiFunction<String,String,Integer> bf = (a,b) ->a.length()+b.length();
        System.out.println(bf.apply("1234567","234567"));

        Supplier<String> sup = ()->"asdadssads";
        System.out.println(sup.get());
    }

    /**
     * @param num1
     * @param num2
     * @param biFunction
     * @return
     * @desc 使用BiFunction
     */
    private Integer computeForBiFunction(Integer num1, Integer num2,
                                         BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(num1, num2);
    }

    /**
     * @param num1
     * @param num2
     * @param biFunction
     * @param function
     * @return
     * @desc 使用BiFunction andThen方法
     */
    private Integer computeForBiFunctionAndThen(Integer num1, Integer num2,
                                                BiFunction<Integer, Integer, Integer> biFunction,
                                                Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(num1, num2);
    }

}
