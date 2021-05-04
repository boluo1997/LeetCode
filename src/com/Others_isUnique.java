package com;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */

public class Others_isUnique {
    public static void main(String[] args) {

    }

    public boolean isUnique(String astr) {

        for (int i=0;i<astr.length();i++){
            String s=astr;
            s=s.replace(String.valueOf(s.charAt(i)),"");
            if (s.length()!=astr.length()-1)
                return false;
        }
        return true;

        //test

    }
}
