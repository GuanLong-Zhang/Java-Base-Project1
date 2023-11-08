//ArrayList案例
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args){
        printArrayList();
        System.out.println("-------------------");
        printStudent();
        System.out.println("-------------------");
        ArrayList<Private> s = new ArrayList<>();
        addStudent(s);
        addStudent(s);
        addStudent(s);
        printStudent1(s);
        System.out.println("-------------------");
    }

    public static void printArrayList(){
        ArrayList<String> s = new ArrayList<>();
        s.add("hello");
        s.add("zgl");
        s.add("java");
        System.out.print("[");
        for(int i = 0; i < s.size(); i++){
            if(i != s.size() - 1){
                System.out.print(s.get(i) + ",");
            }else{
                System.out.print(s.get(i));
            }
        }
        System.out.println("]");
    }

    public static void printStudent(){
        ArrayList<Private> s = new ArrayList<>();
        Private p1 = new Private("小张",18);    //调用有参构造 创建Private对象
        Private p2 = new Private("小李",16);
        Private p3 = new Private("小红",17);
        s.add(p1);
        s.add(p2);
        s.add(p3);
        for(int i = 0; i < s.size(); i++){
            s.get(i).printNameAge();
        }
    }

    public static void addStudent(ArrayList<Private> s){
        Private p = new Private();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的姓名：");
        String name = sc.nextLine();
        System.out.print("请输入学生的年龄：");
        int age = sc.nextInt();
        p.setNameAge(name, age);
        s.add(p);
    }

    public static void printStudent1(ArrayList<Private> s){
        for(int i = 0; i < s.size(); i++){
            s.get(i).printNameAge();
        }
    }

}
