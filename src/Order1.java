//流程控制1
import java.util.Random;
import java.util.Scanner;
public class Order1 {
    public static void main(String[] args){
        //循环结构

        //for循环
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloJava");
        }
        System.out.println("--------------------");

        //输出1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------");

        //求1-5的数据之和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("1-5的数据之和为：" + sum);
        System.out.println("--------------------");

        //求1-100的偶数之和
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 ==0){
                sum1 = sum1 + i;
            }
        }
        System.out.println("1-100的偶数之和为：" + sum1);
        System.out.println("--------------------");

        //水仙花数
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;       //百位
            int b = i / 10 % 10;   //十位
            int c = i % 10;        //个位
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println("水仙花数为：" + i);
            }
        }
        System.out.println("--------------------");

        //统计
        int count_num = 0;
        for (int i = 100; i < 1000; i++) {
            int d = i / 100;       //百位
            int e = i / 10 % 10;   //十位
            int f = i % 10;        //个位
            if (d * d * d + e * e * e + f * f * f == i) {
                count_num++;
            }
        }
        System.out.println("水仙花的个数为：" + count_num);
        System.out.println("--------------------");

        //while循环
        int g = 0;
        while(g < 5) {
            System.out.println("HelloJava");
            g++;
        }
        System.out.println("--------------------");

        //珠穆朗玛峰
        double h = 8844.43 * 1000;
        double paper = 0.1;
        int count_num_1 = 0;
        while (paper <= h) {
            paper = paper * 2;
            count_num_1++;
        }
        System.out.println("折叠次数为：" + count_num_1);
        System.out.println("--------------------");

        //do while
        int i = 0;
        do{
            System.out.println("HelloJava");
            i++;
        }while(i < 5);
        System.out.println("--------------------");

        //跳转控制语句
        for(int j = 1; j <= 5; j++){
            if(j % 2 ==0){
//                break;       //跳出循环，终止执行    1
                continue;    //跳出本次循环，接着执行别的循环    1  3  5
            }
            System.out.println(j);
        }
        System.out.println("--------------------");

        //循环嵌套
        //输出一天的时间 小时 分钟
        for(int k = 0; k < 24; k++){
            for(int l = 0; l < 60; l++){
                System.out.println(k + "时" + l + "分");
            }
        }
        System.out.println("--------------------");

        //Random
        //生成10个随机数
        Random r = new Random();
        for(int n = 0;n < 10; n++){
            int m = r.nextInt(10);    //生成一个0到10的随机数，包括0但是不包括10   0-9
            System.out.println("随机数为：" + m);
        }
        System.out.println("--------------------");

        //猜数字
        int o =r.nextInt(100) + 1;    //1-100
        System.out.println("随机数为：" + o);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int p = sc.nextInt();
            if(p < o){
                System.out.println("输入的数" + p + "小于随机数");
            }
            else if(p > o){
                System.out.println("输入的数" + p + "大于随机数");
            }
            else{
                System.out.println("恭喜你猜对了");
                break;
            }
        }
        System.out.println("--------------------");

    }
}
