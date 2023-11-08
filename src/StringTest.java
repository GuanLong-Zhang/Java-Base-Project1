//String案例
import java.util.Scanner;
public class StringTest {
    public static void main(String[] args){
        System.out.println("案例1用户登录");   //输出并换行
        logon();
        System.out.println("案例2字符串遍历");
        forString();
        System.out.println("案例3统计字符个数");
        countChar();
        System.out.println("案例4字符串拼接");
        connectString();
        System.out.println("案例5字符串反转");
        reverseString();

    }

    public static void logon(){
        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入用户名：");   //输出不换行
            String s1 = sc.nextLine();
            System.out.print("请输入用户名密码：");
            String s2 = sc.nextLine();
            if(s1.equals("zgl") && s2.equals("123456")){
                System.out.println("登录成功");
                break;
            }else {
                if(2 - i == 0){
                    System.out.println("你的账户被锁定，请与管理员联系");
                }else{
                    System.out.println("登录失败你还有" + (2 - i) + "次机会");
                }
            }
        }
    }

    public static void forString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1 = sc.nextLine();
        System.out.print("输出字符串：");
        for(int i = 0; i < s1.length(); i++){
            if(i != s1.length() - 1){
                System.out.print(s1.charAt(i));    //charAt可以根据字符串索引，返回索引处的char值
            }else{
                System.out.println(s1.charAt(i));
            }
        }
    }

    public static void countChar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串(包含大写字母，小写字母和数字)：");
        String s1 = sc.nextLine();
        int num0 = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z'){
                num0++;
            }else if(s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'){
                num1++;
            }else{
                num2++;
            }
        }
        System.out.println("字符串中大写字母的个数为：" + num0);
        System.out.println("字符串中小写字母的个数为：" + num1);
        System.out.println("字符串中数字的个数为：" + num2);
    }

    public static void connectString(){
        int [] arr = {1, 2, 3};
        System.out.print("拼接结果为：");
        String s = "";
        s = s +"[";
        for(int i = 0; i < arr.length; i++)
        {
            if(i != arr.length - 1){
                s = s + arr[i] + ",";
            }else{
                s = s + arr[i];
            }
        }
        System.out.println(s + "]");
    }

    public static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1 = sc.nextLine();
        System.out.println("反转前的字符串为：" + s1);
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0 ; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("反转后的字符串为：" + s2);
    }

}
