//ArrayList 可以改变大小的数组
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> array = new ArrayList<>();     //空构造
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.add("hello"));          //添加元素,返回boolean
        System.out.println(array.add("zgl"));
        System.out.println("array:" + array);
        System.out.println("------------------------");

        array.add(1, "java");              //在指定位置1插入新元素，原先位置的元素后移,无返回值
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.remove("hello"));    //删除元素,返回boolean
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.remove(1));       //删除索引1,并将被删除元素返回
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.set(0,"hello"));        //将位置0的元素，替换为hello,并将位置0的原始元素返回
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.get(0));                //获得索引0的元素
        System.out.println("array:" + array);
        System.out.println("------------------------");

        System.out.println(array.size());                //返回数组元素的大小
        System.out.println("------------------------");
    }
}
