//流程控制
import java.util.Scanner;
public class Order {
    public static void main(String[] args){
        //顺序结构
        System.out.println("开始");
        System.out.println("语句1");
        System.out.println("语句2");
        System.out.println("语句3");
        System.out.println("结束");
        System.out.println("--------------------------");

        //分支结构
        //if else语句
        System.out.println("开始");
        int a = 10;
        int b = 20;
        if(a == b){
            System.out.println("a等于b");
        }
        else{
            System.out.println("a不等于b");
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //奇数偶数判断
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int c = sc.nextInt();
        if(c % 2 == 0){
            System.out.println("输入的整数" + c + "是一个偶数");
        }
        else{
            System.out.println("输入的整数" + c + "是一个奇数");
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //if  else if  else语句
        System.out.println("开始");
        System.out.println("请输入一个1-5的整数：");
        int d = sc.nextInt();
        if(d == 1){
            System.out.println("输入的整数是：" + d);
        }
        else if(d == 2){
            System.out.println("输入的整数是：" + d);
        }
        else if(d == 3){
            System.out.println("输入的整数是：" + d);
        }
        else if(d == 4){
            System.out.println("输入的整数是：" + d);
        }
        else{
            System.out.println("输入的整数是：" + d);
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //考试奖励
        System.out.println("开始");
        System.out.println("请输入小明的分数(0-100)：");
        int e = sc.nextInt();
        if(e >100 || e < 0){
            System.out.println("输入的分数有误");
        }
        else if(e >=90 && e <=100){
            System.out.println("奖励1");
        }
        else if(e >= 80 && e < 90){
            System.out.println("奖励2");
        }
        else if(e >=70 && e <80){
            System.out.println("奖励3");
        }
        else if(e >=60 && e <70){
            System.out.println("奖励4");
        }
        else{
            System.out.println("挨打");
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //switch语句
        System.out.println("开始");
        System.out.println("请输入一个1-5的整数：");
        int f = sc.nextInt();
        switch(f)
        {
            case 1 :
                System.out.println("输入的整数是：" + f);
                break;
            case 2 :
                System.out.println("输入的整数是：" + f);
                break;
            case 3 :
                System.out.println("输入的整数是：" + f);
                break;
            case 4 :
                System.out.println("输入的整数是：" + f);
                break;
            case 5 :
                System.out.println("输入的整数是：" + f);
                break;
            default :
                System.out.println("输入的整数有误");
                break;
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //春夏秋冬1
        System.out.println("开始");
        System.out.println("请输入一个月份(1-12)：");
        int g = sc.nextInt();
        if(g >12 || g < 1){
            System.out.println("输入的月份有误");
        }
        else if(g >= 1 && g <= 3){
            System.out.println("该月份对应的季节为春季");
        }
        else if(g >= 4 && g <= 6){
            System.out.println("该月份对应的季节为夏季");
        }
        else if(g >= 7 && g <= 9){
            System.out.println("该月份对应的季节为秋季");
        }
        else{
            System.out.println("该月份对应的季节为冬季");
        }
        System.out.println("结束");
        System.out.println("--------------------------");

        //春夏秋冬2  case穿透
        System.out.println("开始");
        System.out.println("请输入一个月份(1-12)：");
        int h = sc.nextInt();
        switch(h)
        {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("该月份对应的季节为春季");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("该月份对应的季节为夏季");
                break;
            case 7 :
            case 8 :
            case 9 :
                System.out.println("该月份对应的季节为秋季");
                break;
            case 10 :
            case 11 :
            case 12 :
                System.out.println("该月份对应的季节为冬季");
                break;
            default :
                System.out.println("输入的月份有误");
        }
        System.out.println("结束");
        System.out.println("--------------------------");

    }
}
