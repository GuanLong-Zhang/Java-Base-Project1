public class StringDemo {
    public static void main(String[] args){
        String s = new String();          //空构造
        System.out.println("s:" + s);
        char [] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);      //有参构造  字符数组名
        System.out.println("s1:" + s1);
        byte [] bys = {97, 98, 99};
        String s2 = new String(bys);      //有参构造  字节数组名
        System.out.println("s2:" + s2);
        String s3 = "abc";                //直接赋值
        System.out.println("s3:" + s3);
    }
}
