public class PhoneDemo {
    public static void main(String[] args){
        //创建对象
        Phone p = new Phone();

        //使用对象  成员变量
        System.out.println(p.brand);   //输出默认值null和0
        System.out.println(p.price);

        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);   //输出修改值
        System.out.println(p.price);

        //成员方法
        p.call();
        p.sendMessage();
    }

}
