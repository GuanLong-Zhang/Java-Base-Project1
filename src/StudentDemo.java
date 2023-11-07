public class StudentDemo {
    public static void main(String[] args){
        //对象1
        Student s = new Student();
        System.out.println(s);
        s.name = "小明";
        s.age = 18;
        System.out.println("s姓名：" + s.name);
        System.out.println("s年龄：" + s.age);
        s.study();
        s.doHomework();

        //对象2
        Student s1 = new Student();
        System.out.println(s1);
        s1.name = "小红";
        s1.age = 17;
        System.out.println("s1姓名：" + s1.name);
        System.out.println("s1年龄：" + s1.age);
        s1.study();
        s1.doHomework();

        //对象3
        Student s2 = s1;   //将对象s1赋给对象s2，两个对象指向同一个地址，修改s2 s1也会跟着改变
        System.out.println(s2);
        s2.name = "小张";
        s2.age = 19;
        System.out.println("s2姓名：" + s2.name);
        System.out.println("s2年龄：" + s2.age);
        System.out.println("s1姓名：" + s1.name);
        System.out.println("s1年龄：" + s1.age);
    }
}

