//方法  类似与C++中的功能函数
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        isEvenNumber();
        System.out.println("-----------------------");
        selectBigNumber();
        System.out.println("-----------------------");
        int a = 10;
        int b = 20;
        getBigNumber(a, b);   //此处a和b是实参
        System.out.println("-----------------------");
        int c = 30;
        boolean bo = isEvenNumber(c);
        System.out.println("数字c是否是偶数？" + bo);
        System.out.println("-----------------------");
        int d = 10;
        int e = 20;
        int f = getBigNumber1(d, e);   //此处d和e是实参
        System.out.println("两个整数中较大的数为：" + f);
        System.out.println("-----------------------");
        System.out.println(sum(10, 20));
        System.out.println(sum(10.0, 20.0));
        System.out.println(sum(10, 20, 30));
        System.out.println("-----------------------");
        int [] arr ={1, 2, 3};
        printResult(arr);
        change(arr);   //引用传递
        printResult(arr);
        System.out.println("-----------------------");
        int [] arr1 = {11, 22, 33, 44, 55};
        printResult1(arr1);
        System.out.println("-----------------------");
        int [] arr2 ={1, 2, 3, 4, 5};
        int maxNumber = getArrayMax(arr2);
        System.out.println("数组2中的最大值为：" + maxNumber);
        System.out.println("-----------------------");

    }

    //不带参数的方法
    public static void isEvenNumber () {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("输入的数是一个偶数");
        } else {
            System.out.println("输入的数是一个奇数");
        }
    }

    //不带参数的方法
    public static void selectBigNumber () {
        System.out.println("请输入两个整数：");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (b > c) {
            System.out.println("两个整数中较大的值为：" + b);
        } else {
            System.out.println("两个整数中较大的值为：" + c);
        }
    }

    //带参数的方法
    public static void getBigNumber ( int a, int b){   //此处a和b是形参
        if (a > b) {
            System.out.println("两个整数中较大的值为：" + a);
        } else {
            System.out.println("两个整数中较大的值为：" + b);
        }
    }

    //带返回值的方法
    public static boolean isEvenNumber ( int a){
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //带返回值的方法
    public static int getBigNumber1 ( int a, int b){   //此处a和b是形参
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //方法重载  重载仅针对同一个类中的方法名称和参数进行识别，与返回值无关
    public static int sum ( int a, int b){
        System.out.println("调用int + int");
        return a + b;
    }

    public static double sum ( double a, double b){
        System.out.println("调用double + double");
        return a + b;
    }

    public static int sum ( int a, int b, int c){
        System.out.println("调用int + int + int");
        return a + b + c;
    }

    //值传递  形参改变不会影响实参
    //引用传递  形参改变影响实参
    public static void change ( int[] arr){
        arr[0] = 100;
    }

    public static void printResult(int [] arr) {
        System.out.println("数组的结果为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //引用传递
    public static void printResult1(int[] arr) {
        System.out.println("数组的结果为：");    //println 输出结果并换行
        System.out.print("[");                 //print   输出结果不换行
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }

    //引用传递
    public static int getArrayMax(int [] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}



