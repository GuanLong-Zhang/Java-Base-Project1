public class PrivateDemo {
    public static void main(String[] args){
        String name = "小明";
        int age = 18;
        //对象1
        Private p = new Private();
//        p.name = "小明";  //报错 私有属性，类外不可以进行访问
//        p.age = 18;
        p.setNameAge(name, age);
        p.printNameAge();

        //对象2
        String name1 = "小李";
        int age1 = 17;
        Private p1 = new Private(name1, age1);   //通过有参构造方法进行初始化
        p1.printNameAge();


    }

}
