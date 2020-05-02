package com;

/**
 * 首先它是四个点,所以组成的图形一定是个四边形,那四个坐标就肯定有左上,左下,右上,右下之分
 * 我们先把左上的值给A,左下B,右下C,右上D
 *
 */

public class Test16_ABCDE {
    public static void main(String[] args) {

    }

    public static boolean isInner(int x,int y){     //传入的是E点的坐标

        boolean flag = true;

        coordinate c1 = new coordinate(1,2);
        coordinate c2 = new coordinate(3,1);
        coordinate c3 = new coordinate(5,1);
        coordinate c4 = new coordinate(4,2);    //假设是随便给的四个点,现在要把左上角的点赋值给对象a,依次...

        //y坐标大的两个是左上和右上坐标,y坐标小的是左下和右下坐标
        int[] nums = {c1.getY(),c2.getY(),c3.getY(),c4.getY()};
        insertSort(nums);   //排序一下,然后取前两个值,必定一个是左上角的y坐标,一个是右上角的y坐标

        int y1 = nums[0];   int y2 = nums[1];       //这里得考虑一下 y1 == y2 的情况

        //根据y1,y2求出对应的对象,然后用两个对象的x坐标比较,x坐标小的是左上角的坐标,x大的是右上角的坐标
        coordinate a = new coordinate(1,2);     //左上角坐标       A点
        coordinate b = new coordinate(3,1);     //左下角           B点
        coordinate c = new coordinate(5,1);     //右下角           C点
        coordinate d = new coordinate(4,2);     //右上角           D点

        //这样把四个坐标确定之后,  线段AB是左边的边   BC是下边的边     CD是右边的边     AD是上边的边
        //先判断上下 (E点需要在BC下边,AD上边)    (y-y1)(x2-x1)-(y2-y1)(x-x1)
        if((y-b.getY())*(c.getX()-b.getX())-((c.getY()-b.getY())*(x-b.getX())) < 0){    //这个值<0 表示E点在BC下面,不符合情况
            flag = false;
        }

        if((y-a.getY())*(d.getX()-a.getX())-((d.getY()-a.getY())*(x-a.getX())) > 0){    //这个值<0 表示E点在AD上面,不符合情况
            flag = false;
        }

        //因为该公式只能判断上下,不能直接判断左右,所以还需再分情况
        if(a.getX() < b.getX()){      //AB斜率<0    E点在直线AB下方是不符合情况的
            //...
        }else {                     //AB斜率>0      E点在直线AB上方是不符合情况的

        }

        if(c.getX() < d.getX()){        //CD斜率<0    E点在直线CD上方不符合情况

        }else {                         //CD斜率>0    E点在直线CD下方不符合情况

        }

        return flag;
    }

    //插入排序
    public static void insertSort(int[] nums){
        for(int i=1;i<nums.length;i++){

            for(int j=i;j>0;j--){           //j从i开始,向前走

                if(nums[j-1]>nums[j]){      //如果前面的数大于后面的数,交换位置
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


}


class coordinate{       //坐标类,用来存储ABCD四个点的坐标

    private int x;      //存x坐标
    private int y;      //存y坐标

    public coordinate(){

    }

    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
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

}


