package com;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 */

public class Test33_isUnique {
    public static void main(String[] args) {

    }

    public boolean isUnique(String astr) {

        for(int i=0;i<astr.length();i++){
            astr = astr.replace(String.valueOf(astr.charAt(i)),"");

            if(astr.length() != astr.length()-1){
                return false;
            }
        }

        return true;
    }
}
