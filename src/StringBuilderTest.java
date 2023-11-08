import java.util.Scanner;

//StringBuilder案例
public class StringBuilderTest {
    public static void main(String[] args){
        System.out.println("案例1字符串拼接");
        connectStringBuilder();
        System.out.println("案例2字符串反转");
        reverseStringBuilder();
    }

    public static void connectStringBuilder(){
        int [] arr = {1, 2, 3};
        System.out.print("拼接结果为：");
        String s = "";
        StringBuilder s1 = new StringBuilder(s);   //将String转换为StringBuilder
        s1.append("[");
        for(int i = 0; i < arr.length; i++)
        {
            if(i != arr.length - 1){
                s1.append(arr[i]).append(",");
            }else{
                s1.append(arr[i]);
            }
        }
        s1.append("]");
        s = s1.toString();    //将StringBuilder转换为String
        System.out.println(s);
    }

    public static void reverseStringBuilder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String s1 = sc.nextLine();
        System.out.println("反转前的字符串为：" + s1);
        StringBuilder s2 = new StringBuilder(s1);   //将String转换为StringBuilder
        s2.reverse();
        s1 = s2.toString();                         //将StringBuilder转换为String
        System.out.println("反转后的字符串为：" + s1);
    }

}
