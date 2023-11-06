//三目运算符和数据输入案例3
import java.util.Scanner;
public class OperatorScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入height1(int):");
        int height1 = sc.nextInt();
        System.out.println("输入height2(int):");
        int height2 = sc.nextInt();
        System.out.println("输入height3(int):");
        int height3 = sc.nextInt();
        System.out.println("身高1为：" + height1 + "cm");
        System.out.println("身高2为：" + height2 + "cm");
        System.out.println("身高3为：" + height3 + "cm");
        int tempheight = height1 >height2 ? height1 : height2;
        int maxheight = tempheight > height3 ? tempheight : height3;
        System.out.println("三个身高中的最高的为：" + maxheight + "cm");
    }
}
