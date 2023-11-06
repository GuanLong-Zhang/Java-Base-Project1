//三目运算符案例2
public class OperatorTest1 {
    public static void main(String[] args){
        int height1 = 150;
        int height2 = 165;
        int height3 = 210;
        System.out.println("身高1为：" + height1 + "cm");
        System.out.println("身高2为：" + height2 + "cm");
        System.out.println("身高3为：" + height3 + "cm");
        int tempheight = height1 >height2 ? height1 : height2;
        int maxheight = tempheight > height3 ? tempheight : height3;
        System.out.println("三个身高中的最高的为：" + maxheight + "cm");
    }
}
