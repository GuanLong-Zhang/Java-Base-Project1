//数据输入  Scanner
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);    //创建对象
        System.out.println("输入x(int):");
        int x = sc.nextInt();                    //接收数据
        System.out.println("输入y(float):");
        float y =sc.nextFloat();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
