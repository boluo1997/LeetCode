package com;

import java.util.LinkedList;
import java.util.List;


//测试一下为什么别的传不上去
public class Test17_cutTree {
    public static void main(String[] args) {

    }

    public static void cutTree(int x,int y){    //要挖的矿石坐标

        Stone temp = getStone(x,y);             //先根据坐标找到这块石头
        String str = temp.getValue();           //取出它的value值,判断它是树木,或者宝石..

        //接着找出他周围8块石头的坐标    我们假设每一块矿石的长宽都是1
        Stone leftup = getStone(x-1,y+1);
        Stone up = getStone(x,y+1);
        Stone rightup = getStone(x+1,y+1);
        Stone right = getStone(x+1,y);
        Stone rightdown = getStone(x+1,y-1);
        Stone down = getStone(x,y-1);
        Stone leftdown = getStone(x-1,y-1);
        Stone left = getStone(x-1,y);

        Stone[] stones = {leftup,up,rightup,right,rightdown,down,leftdown,left};

        for(Stone s : stones){
            if(s.getValue() == temp.getValue()){        //如果周围石头的value值和这块石头的value值相等的话
                s.setStatus(1);     //改变这块石头的状态码,代表这块石头已经被采集
            }
        }

    }

    //根据坐标找到对应坐标的矿石
    public static Stone getStone(int x, int y){

        Stone stone = new Stone();
        //每块矿石的坐标都是唯一的,根据坐标找到坐标对应的矿石

        List<Stone> list = new LinkedList<>();      //假设我所有的矿石都在这里面
        for(Stone s : list){
            if(x == s.getX() && y == s.getY()){     //如果输入的坐标和集合中存储的矿石坐标一致
                stone = s;
            }
        }

        return stone;
    }

}

class Stone{        //矿石类

    private String value;   //表示它是树木,或者宝石
    private int x;
    private int y;
    private int status;     //状态码  0代表存在  1代表被挖走(不再显示)

    public Stone(){

    }

    public Stone(String value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
