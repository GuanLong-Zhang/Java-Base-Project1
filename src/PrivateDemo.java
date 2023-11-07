public class PrivateDemo {
    public static void main(String[] args){
        String name = "小明";
        int age = 18;
        Private p = new Private();
//        p.name = "小明";  //报错 私有属性，类外不可以进行访问
//        p.age = 18;
        p.setNameAge(name, age);
        p.printNameAge();
    }

}
