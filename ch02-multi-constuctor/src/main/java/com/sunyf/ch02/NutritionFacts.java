package com.sunyf.ch02;

/**
 * @program: affective-java
 * @description: 多重构造方法
 * @author: Mr.Sun
 * @create: 2018-11-01 18:34
 **/
public class NutritionFacts {

    private final int servingSize; // 份数
    private final int servings; // 食物名称？
    private final int calories; // 卡路里
    private final int fat; // 卡路里
    private final int sodium; // 钠
    private final int carbohydrate; // 碳水化合物

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0); // 最后一个参数给默认值0
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0); // 最后一个参数给默认值0
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0); // 最后一个参数给默认值0
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0); // 最后一个参数给默认值0
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

}
