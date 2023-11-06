//三目运算符案例1
public class OperatorTest {
    public static void main(String[] args){
        int weight1 = 180;
        int weight2 = 200;
        System.out.println("体重1:" + weight1 + "kg");
        System.out.println("体重2:" + weight2 + "kg");
        boolean b = weight1 ==weight2 ? true : false;    //三目运算符的使用
        System.out.println("两个体重是否相等？" + b);
    }
}

