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

        //String对象的特点
        String s4 = new String(chs);    //通过new创建的字符串对象，内容虽然相同，但是每一次的地址都是不同的
        String s5 = new String(chs);
        System.out.println("两个字符串地址是否相同：" + (s4 == s5));   //false  字符串地址比较
        String s6 = "abc";
        String s7 = "abc";
        System.out.println("两个字符串地址是否相同：" + (s6 == s7));   //通过" "创建的字符串对象，只要字符序列相同，那么他们的地址就都一样
        System.out.println("两个字符串内容是否相同：" + s4.equals(s5));   //equals用于比较字符串的内容   true
        System.out.println("两个字符串内容是否相同：" + s4.equals(s6));   //true
    }
}
