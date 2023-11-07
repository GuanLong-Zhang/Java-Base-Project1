public class Private {
    private String name;
    private int age;

    //无参构造方法
    public Private(){
        System.out.println("无参构造方法");
    }

    //有参构造方法
    public Private(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printNameAge(){      //对外访问的接口
        System.out.println(name);
        System.out.println(age);
    }

    public void setNameAge(String name, int age){   //对外访问的接口
        this.name = name;
        if(age < 0 || age > 120){
            System.out.println("输入年龄有误");
        }else{
            this.age = age;
        }
    }

}
