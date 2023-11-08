//StingBuilder内容可变，可以将其视为一个容器；而String内容不可变
public class StingBuilderDemo {
    public static void main(String[] args){
        //构造方法
        StringBuilder s1 = new StringBuilder();  //空构造
        System.out.println("s1:" + s1);
        System.out.println("s1.length:" + s1.length());
        StringBuilder s2 = new StringBuilder("helloWorld");   //字符串构造
        System.out.println("s2:" + s2);
        System.out.println("s2.length:" + s2.length());

        //添加和反转
        StringBuilder s3 = new StringBuilder();
        s3.append("zgl").append(123456).append("努力，奋斗");   //链式添加
        System.out.println("s3:" + s3);
        s3.reverse();       //反转
        System.out.println("s3:" + s3);

        //StringBuilder和String的相互转换
        StringBuilder s4 = new StringBuilder("zglnb");
        System.out.println("s4:" + s4);
//        String s5 = s4;   //直接赋值会报错
        String s5 = s4.toString();    //利用toString()进行转换
        System.out.println("s5:" + s5);

//        StringBuilder s6 = s5;   //直接赋值会报错
        StringBuilder s6 = new StringBuilder(s5);   //利用构造方法进行转换
        System.out.println("s6:" + s6);



    }



}
