//数组
public class Array {
    public static void main(String[] args) {
        //数组动态初始化
        int [] array = new int[3];   //此处的3表示数组的长度
        System.out.println(array);   //输出数组的地址  [I@b4c966a
        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------");

        array[0] = 100;
        array[2] = 200;
        System.out.println(array);   //输出数组的地址  [I@b4c966a
        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------");

        int [] array1 = new int[3];
        int [] array2 = new int[3];
        System.out.println("数组1：" + array1);    //[I@2f4d3709
        System.out.println("数组2：" + array2);    //[I@7291c18f
        System.out.println("----------------------------------");

        int [] array3 = new int[3];
        for(int i = 0; i < 3; i++){
            array3[i] = i;
        }
        System.out.println("数组3：");
        for(int i = 0; i < 3; i++){
            System.out.println(array3[i]);
        }
        int [] array4 = array3;    //将数组3的地址赋值给数组4
        System.out.println("数组4：");
        for(int i = 0; i < 3; i++){
            System.out.println(array4[i]);
        }
        //对数组4进行值的修改，因为数组4和数组3指向同一个地址，所以两个都发生了改变
        for(int i = 3; i < 6; i++){
            array4[i - 3] = i;
        }
        System.out.println("数组4：");
        for(int i = 0; i < 3; i++){
            System.out.println(array4[i]);
        }
        System.out.println("数组3：");
        for(int i = 0; i < 3; i++){
            System.out.println(array3[i]);
        }
        System.out.println("----------------------------------");

        //数组静态初始化
        int [] array5 = {1, 2, 3};
        System.out.println("数组5：");
        for(int i = 0; i < 3; i++){
            System.out.println(array5[i]);
        }
//        System.out.println(array5[3]);     //报错1 索引越界 ArrayIndexOutOfBoundsException
//        array5 = null;                     //空指针赋值给array5
//        System.out.println(array5[0]);     //报错2 空指针异常 NullPointerException
        System.out.println("----------------------------------");

        //遍历
        char [] array6 = {'.','.','.','.','.','.','.','.','.','.'};
        System.out.println("数组6：");
        for(int i = 0; i < array6.length; i++){
            System.out.println(array6[i]);
        }
        System.out.println("----------------------------------");

        int [] array7 = new int[10];
        for(int i = 0; i < array7.length; i++){
            array7[i] = i;
        }
        for(int i = 0; i < array7.length; i++){
            System.out.println(array7[i]);
        }
        int max = array7[0];
        for(int i = 1; i < array7.length; i++){
            if(max < array7[i]){
                max = array7[i];
            }
        }
        System.out.println("数组7的最大值为：" + max);
        System.out.println("----------------------------------");

     }
}
