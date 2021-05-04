package com;

/**
 * 657.机器人能否回到原点
 *
 */
public class LeetCode657_judgeCircle {
    public static void main(String[] args) {

    }

    public boolean judgeCircle(String moves){
        char[] cs = moves.toCharArray();     //将字符串转化成字符数组

        int x = 0,y = 0;
        for(char c : cs){
            if(c == 'U'){y+=1;}
            if(c == 'D'){y-=1;}
            if(c == 'L'){x-=1;}
            if(c == 'R'){x+=1;}
        }

        if(x == 0 && y == 0){
            return true;
        }else {
            return false;
        }
    }
}
