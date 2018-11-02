package com.sunyf.ch08;

/**
 * @program: affective-java
 * @description: 对称性
 * @author: Mr.Sun
 * @create: 2018-11-02 17:02
 **/
public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString)o).s);
        // 与String代码互操作
        if (o instanceof String)
            return s.equalsIgnoreCase((String) o);
        return false;
    }

    public static void main(String[] args) {
        // 大写P
        CaseInsensitiveString s1 = new CaseInsensitiveString("Polish");
        // 小写p
        String s2 = "polish";

        // s1.equals不区分大小写
        System.out.println(s1.equals(s2)); // true

        // s2.equals要区分大小写
        System.out.println(s2.equals(s1)); // false
    }

}
