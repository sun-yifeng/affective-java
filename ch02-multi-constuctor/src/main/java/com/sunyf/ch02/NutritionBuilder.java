package com.sunyf.ch02;

/**
 * @program: affective-java
 * @description: 多重构造方法, 使用建造者模式
 *
 * 1、重叠构造器：难以编写，难以阅读；
 * 2、JavaBean构造器：不能保证安全，可能处于不一致的状态；
 * 3、建造模式：多重构造器写法的变种；不可变的，
 *
 * @author: Mr.Sun
 * @create: 2018-11-01 18:34
 **/
public class NutritionBuilder {

    private final int servingSize; // 份数
    private final int servings; // 食物名称？
    private final int calories; // 卡路里
    private final int fat; // 卡路里
    private final int sodium; // 钠
    private final int carbohydrate; // 碳水化合物

    // 公有的静态内部类
    public static class Builder{
        // 必选参数
        private final int servingSize; // 份数
        private final int servings; // 食物名称？
        // 可选参数
        private int calories = 0; // 卡路里
        private int fat = 0; // 卡路里
        private int sodium = 0; // 钠
        private int carbohydrate = 0; // 碳水化合物

        // 构造方法
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            calories = val;
            return this;
        }

        public Builder fat(int val){
            fat = val;
            return this;
        }

        public Builder sodium(int val){
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val;
            return this;
        }

        public NutritionBuilder build() {
            return new NutritionBuilder(this);
        }

    }

    private NutritionBuilder(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    // 客户端程序
    public static void main(String[] args) {
        // 链式写法
        NutritionBuilder cocaCola = new NutritionBuilder.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
    }
    
}
