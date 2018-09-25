package com.oldboy.miamshi;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class Demo {

    class HungrySingleton {
        private HungrySingleton hs = new HungrySingleton();

        public HungrySingleton getInstance() {

            return hs;
        }

    }

    /**
     * 无序栈A，有序栈B，要从无序栈中取出元素放到有序栈B中使得有序，只能有一个临时变量，只能存储一个元素。
     */


    @Test
    public void stackSort() {
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> B = new Stack<Integer>();
        int a = 6;
        int b = 2;
        int c = 1;
        int d = 4;


        A.add(a);
        A.add(b);
        A.add(c);
        A.add(d);

        while (!A.isEmpty()) {
            int pop = A.pop();

            while (!B.isEmpty() && B.peek() < pop) {
                A.push(B.pop());
            }
            B.push(pop);
        }


        System.out.println(B);


    }


    public static void sort(Stack<Integer> A) {
        Stack<Integer> B = new Stack<Integer>();//新建一个辅助栈
        while (!A.isEmpty()) {//判断当前需要排序的栈不为空
            int pop = A.pop();//将排序的栈顶元素弹出
            while (!B.isEmpty() && B.peek() < pop) {//里面的判断顺序不能颠倒，否则出现 java.util.EmptyStackException
                A.push(B.pop());//当满足help不为空，且help的元素小于pop(这样排出的顺序顶到底是从小到大的)
            }                      //将help里的元素返回到stack中

            B.push(pop);//无论什么情况，只要stack不为空，都将pop压入help
        }
        while (!B.isEmpty()) {//当help不为空的时候，help里面的元素顶到底是从小到大的，
            A.push(B.pop());//所以将help弹到stack中是顶到底是从大到小的
        }
    }

//   public void connectDB() throws SQLException {
//       Class.forName("com.jdbc.mysql.Driver");
//       String url="jdbc:mysql:localhost:mybd";
//        String user="root";
//        String pass="root";
//       Connection conn = DriverManager.getConnection("url", user, pass);
//
//       Statement sta = conn.createStatement();
//        sta.execute("insert int table person values (1,'zhangsan',20)")


    public void copytest() {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("d:/wc/1.txt");
            fos = new FileOutputStream("d:/wc/111111.txt");


            int len = 0;

            byte[] bys = new byte[1024];

            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
            fos.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void stringCount() {
        String s = "hello";
        byte[] bys = s.getBytes();
        int len = bys.length;
        String newStr = "";
        for (int i = len; i > 0; i--) {
            //System.out.println((bys[i-1]));
            newStr = newStr + bys[i - 1];
        }

        System.out.println(newStr);


    }


    //实现一个输入输入字符串，并逆序输出的代码，要求手写


    @Test
    public void stringCount2() {
        String s = "hello";
        char[] ch = s.toCharArray();
        int len = ch.length;
        String newStr = "";
        for (int i = len; i > 0; i--) {
            //System.out.println((bys[i-1]));
            newStr = newStr + ch[i - 1];
        }

        System.out.println(newStr);


    }


//    1.一个n位数组，连续三个相加，求哪个位置的和最大？
//
//    例：a[]={1,2,5,4,8,5,6,3,2},得到下标为3时值最大。和为4+8+5=17

    /**
     *0,1,2,
     * 1,2,3
     * 2,3,4
     */


//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7,4,5,6,7,8,8,9,0,0,8,87,7,67,6,6,56,5};
//        getMaxSum(arr);
//    }
    public static void getMaxSum(int[] arr){
        //数字的长度
        int len=arr.length;
        //三为一组，假设有4个数，那么和有三个
        //求和数组的长度是len-2
        int sumLen=len-2;
        //定义求和数组
        int[] sum=new int[len-2];
        //得到三个数的和数组
        for (int i=2;i<len;i++){
            sum[i-2]=arr[i-2]+arr[i-1]+arr[i];
        }

        System.out.println(sum);
        int max=sum[0];
        int index=0;

        for (int i =1 ;i<len-2;i++){
             if(sum[i]>max){
                 max=sum[i];
                 index=i;
             }
        }

        //System.out.println("sum 数组中最大值是:" +max+",    下标索引是"+index );

        System.out.println("arr数组最大求和位置是："+arr[index]);


        }


    //        2.手写二分查找，快排（这些都是最简单的了，肯定要会的）


    public static void main(String[] args) { int[] arr = {1, 2, 3, 4, 5, 6, 7,4,5,6,7,8,8,9,0,0,8,87,7,67,6,6,56,5};
        int m = binarySearch(7);
        System.out.println(m);
    }
    public static int  binarySearch(int n){
        int[] arr={1,2,3,4,5,6,7,8,9};

        int max =arr.length;
        int min=0;
        int mid=(max+min)/2;

       while (true){
           if (arr[mid]==n){
               return mid;
           } else  if(arr[mid]>n){
               max=mid-1;
               min=min;
               mid=(max+min)/2;
           }else if(arr[mid]<n){
               max=max;
               min=mid+1;
               mid=(max+min)/2;
           }
       }


    }

    @Test
    public void stringFromat(){
        String lanyu = String.format("helloworld %s", "蓝雨");
        System.out.println(lanyu);


    }




}





