package com;

public class Test17 {

    public static void main(String[] args) {
        int b1=1,b2=2;
        int a1=3,a2=1;
        int d1=5,d2=1;
        int c1=4,c2=2;
        int a=3,b=1;
        int flage=0;

        flage = flage + point(a, b, a1, a2, b1, b2);
        flage = flage + point(a, b, b1, b2, c1, c2);
        flage = flage + point(a, b, c1, c2, d1, d2);
        flage = flage + point(a, b, d1, d2, a1, a2);

        if(flage==0){
            System.out.println("不在!");
        }else{
            System.out.println("在!");
        }
    }


    public static int point(int x,int y,int m,int n,int m1,int n1){
        double a = Math.pow((x-m), 2)+Math.pow((x-n), 2);
        double b = Math.pow((m1-x), 2)+Math.pow((n1-y), 2);
        double c = Math.pow((m-m1), 2)+Math.pow((n-n1), 2);
        double cos = (a+b-c)/2*Math.sqrt(a*b);
        if(cos<0){
            return 1;
        }else {
            return 0;
        }
    }

}




