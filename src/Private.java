public class Private {
    private String name;
    private int age;

    public void printNameAge(){      //对外访问的接口
        System.out.println(name);
        System.out.println(age);
    }

    public void setNameAge(String n, int a){   //对外访问的接口
        name = n;
        if(a < 0 || a > 120){
            System.out.println("输入年龄有误");
        }else{
            age = a;
        }
    }

}
