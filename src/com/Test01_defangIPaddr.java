package com;

/**
 * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 *
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."
 */
public class Test01_defangIPaddr {
    public static void main(String[] args) {

    }

    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++){
            char c = address.charAt(i);

            if(c == '.'){
                sb.append("[.]");
            }else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
