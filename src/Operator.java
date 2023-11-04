//运算符
public class Operator {
    public static void main(String[] args){
        //算数运算符
        int a = 20;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("-------------------------");
        //字符的+操作    与int相加，将字符值转换为ASCII码值与int进行相加
        char c = 'a';   // 'a'的ASCII码值为97
        System.out.println(a + c);    //20+97=117
        System.out.println("-------------------------");
        //字符串的+操作    字符串的拼接
        String d = "Hello";
        String e = "World";
        System.out.println(d + e);   //String + String
        System.out.println(d + a);   //String + int
        System.out.println(a + d);   //int + String
        System.out.println(d + a + b);  //String + int + int
        System.out.println(a + b + d);  //int + int + String
        System.out.println("-------------------------");
        //赋值运算符
        int f = 30;
        System.out.println("f = " + f);
        f += 30.14;    //扩展的赋值运算符隐含了强制类型转换   +=  -=  /=  *=  %=
        System.out.println("f = " + f);   //结果为60  将double强制转换为了int
        System.out.println("-------------------------");
        //自增自减运算符
        int g = 40;
        System.out.println("g = " + g);
        g++;
        System.out.println("g++ = " + g);
        int h = g++;    //后缀先运算，再自增   前缀正好相反 先自增，再运算
        System.out.println("h = " + h);
        System.out.println("g = " + g);
        System.out.println("-------------------------");
        //关系运算符  ==  !=  >=  <=  <  >
        int k = 10;
        int l = 20;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("k == l :" + (k == l));
        System.out.println("k != l :" + (k != l));
        System.out.println("k >= l :" + (k >= l));
        System.out.println("k <= l :" + (k <= l));
        System.out.println("k > l :" + (k > l));
        System.out.println("k < l :" + (k < l));
        System.out.println("-------------------------");
        //逻辑运算符   & | ! ^
        int m = 10;
        int n = 20;
        int o = 30;
        System.out.println((m < n)&(m < o));    //全真才是真
        System.out.println((m < n)|(m > o));    //有真就是真
        System.out.println(!(m > n));           //结果相反
        System.out.println((m < n)^(m > o));    //不同才为真
        System.out.println("-------------------------");
        //短路逻辑运算符   &&  ||
        System.out.println((m++ > 100)&&(n++ > 100));    //逻辑判断依然不变，但是当左边为false,右边的运算就不执行了
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println((m++ < 100 )||(n++ > 100));    //逻辑判断依然不变，但是当左边为true,右边的运算就不执行了
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("-------------------------");
        //三目运算符
        int p = 10;
        int q = 20;
        int max = p > q ? p : q;   //求两个值的最大值
        System.out.println("max = " + max);
        System.out.println("-------------------------");
    }
}
