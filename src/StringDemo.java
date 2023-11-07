public class StringDemo {
    public static void main(String[] args){
        String s = new String();
        System.out.println("s:" + s);
        char [] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        System.out.println("s1:" + s1);
        byte [] bys = {97, 98, 99};
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        String s3 = "abc";
        System.out.println("s3:" + s3);
    }
}
