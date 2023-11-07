//学会如何调试+数组案例
import java.util.Scanner;
public class Debug {
    public static void main(String[] args) {
        DebugDemo();
        DebugDemo1();
        System.out.println("---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();
        weightReduction(week);    //if版本
        weightReduction1(week);   //switch版本
        System.out.println("---------------------");
        int num = sevenPass();
        System.out.println("逢7过的数字个数为：" + num);
        System.out.println("---------------------");
        int a = 20;
        int num1 = countRabbit(a);
        System.out.println("第" + a + "个月的不死神兔的对数为：" + num1);
        System.out.println("---------------------");
        System.out.println("百钱百鸡案例：");
        hundredChicken();
        System.out.println("---------------------");
        int [] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        addCondition(arr);
        System.out.println("---------------------");
        int [] arr1 = {68, 27, 95, 88, 171, 996, 51, 210};
        int [] arr2 = {68, 27, 95, 88, 171, 996, 51, 210};
        boolean bo = compareArray(arr1, arr2);
        System.out.println("数组1和数组2是否相同？" + bo);
        System.out.println("---------------------");
        int [] arr3 = {68, 27, 95, 88, 171};
        System.out.println("请输入待查找的元素：");
        int b = sc.nextInt();
        int c = findArray(arr3, b);
        if(c == -1){
            System.out.println("未查找到待查元素");
        }else{
            System.out.println("在数组中查找到该元素");
            System.out.println("待查找元素" + b + "在数组3中的索引为" + c);
        }
        System.out.println("---------------------");
        int [] arr4 = {68, 27, 95, 88, 171, 100};
        int [] arr5 = new int[arr4.length];   //动态初始化  全部为0
        printArray(arr4);
        reverseArray(arr4, arr5);
        printArray(arr5);
        System.out.println("---------------------");

    }

    public static void DebugDemo() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("两数之和为：" + sum);
    }

    public static void DebugDemo1() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("0-10之间的偶数之和为：" + sum);
    }

    public static void weightReduction(int a) {
        if (a < 1 || a > 7) {
            System.out.println("你输入的星期数有误！");
        } else if(a == 1){
            System.out.println("跑步");
        } else if(a == 2){
            System.out.println("足球");
        } else if(a == 3){
            System.out.println("爬山");
        } else if(a == 4){
            System.out.println("篮球");
        } else if(a == 5){
            System.out.println("排球");
        } else if(a == 6){
            System.out.println("羽毛球");
        } else{
            System.out.println("台球");
        }
    }

    public static void weightReduction1(int a) {
        switch(a){
            case 1 :
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("足球");
                break;
            case 3:
                System.out.println("爬山");
                break;
            case 4:
                System.out.println("篮球");
                break;
            case 5:
                System.out.println("排球");
                break;
            case 6:
                System.out.println("羽毛球");
                break;
            case 7:
                System.out.println("台球");
                break;
            default:
                System.out.println("你输入的星期数有误！");
        }
    }

    public static int sevenPass(){
        int count = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7){
                System.out.println("过" + i);
                count++;
            }
        }
        return count;
    }

    public static int countRabbit(int a){
        int [] arr = new int [a];   //动态开辟数组
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < a; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[a - 1];
    }

    public static void hundredChicken(){
        for(int x = 0;x <= 20; x++){
            for(int y = 0; y <= 33; y++){
                int z = 100 - x - y;
                if(z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100){
                    System.out.println("鸡公的数量为：" + x);
                    System.out.println("鸡母的数量为：" + y);
                    System.out.println("鸡雏的数量为：" + z);
                    System.out.println("---------------------");
                }
            }
        }
    }

    public static void addCondition(int [] arr){
        int addNumber = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 ==0){
                addNumber = addNumber + arr[i];
            }
        }
        System.out.println("满足条件的数组元素之和为：" + addNumber);
    }

    public static int compareTwoNumber(int a, int b){
        if(a < b){
            a = b;
        }
        return a;
    }
    public static boolean compareArray(int [] a, int [] b){
        if(a.length != b.length){
            return false;
        } else{
            for(int i = 0; i < compareTwoNumber(a.length, b.length); i++){
                if(a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int findArray(int [] a,int b){
        int c = -1;
        for(int i = 0; i < a.length; i++){
            if(b == a[i]){
                c = i;
            }
        }
        return c;
    }

    public static void printArray(int [] a){
        for(int i = 0; i < a.length; i++){
            if(i != a.length - 1){
                System.out.print(a[i] + ",");
            }else{
                System.out.println(a[i]);
            }
        }
    }

    public static void reverseArray(int [] a,int [] b){
        for(int i = 0, j =a.length - 1; i < a.length&& j >= 0; i++, j--){
            b[j] = a[i];
        }
    }


}
