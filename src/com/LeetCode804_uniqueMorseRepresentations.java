package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。
 * 例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。
 * 我们将这样一个连接过程称作单词翻译。
 *
 * 返回我们可以获得所有词不同单词翻译的数量。
 *
 */

public class LeetCode804_uniqueMorseRepresentations {
    public static void main(String[] args) {

    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet<>();
        for (String word : words) {     //把字符串数组中的每个字符串取出来

            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){       //把字符串转成字符数组，然后把字符数组中的每个字符取出来
                sb.append(MORSE[c-'a']);            //把字母对应的摩斯码拼接到sb中
            }
            seen.add(sb.toString());
        }

        return seen.size();
    }

}


























