package hi;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //第一步_创建电影类

        //第二步_准备电影数据 由一个个的电影对象存储
        cinema[] c = new cinema[5];
        c[0] = new cinema(1, "热麻辣烫", 45, "贾玲");
        c[1] = new cinema(2, "飞驰人生", 49.9, "沈腾");
        c[2] = new cinema(3, "唐人街探案", 39.9, "王宝强");
        c[3] = new cinema(4, "哪吒", 49.9, "未知");
        c[4] = new cinema(5, "狂飙", 10, "高启强");


        //第三步_电影数据交给电影操作对象进行业务处理
        cinemaOperation co = new cinemaOperation(c);

        co.idMovie(3);
        co.showMovie();

    }


}


