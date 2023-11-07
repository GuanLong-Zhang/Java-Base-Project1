//练习 学生案例
public class Student {
    String name;   //成员变量   类中方法外的变量
    int age;

    public void study(){
        int i = 0;    //局部变量   方法中的变量
        System.out.println("好好学习");
    }

    public void doHomework(){
        int j = 0;    //局部变量
        System.out.println("做作业");
    }

}
