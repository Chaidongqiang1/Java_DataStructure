package SqList1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入顺序表的长度：");
        int len=sc.nextInt();
        SqList L=new SqList(20);
        L.setList(len);
        System.out.println("请输入待插入的元素值i<0~curLen>：");
        int i=sc.nextInt();
        System.out.println("请输入待插入的元素值x：");
        Object x=sc.next();
        System.out.println("插入后的顺序表为：");
        L.insert(i,x);
        L.display();
        System.out.println("请输入待删除元素的位置<0~curLen-1>:");
        int j=sc.nextInt();
        L.remove(j);
        System.out.println("删除后的顺序表为：");
        L.display();
        System.out.println("请输入待查找的元素值：");
        Object el=sc.next();
        System.out.println("值为"+el+"元素在顺序表中的第"+L.indexOf(el)+"个位置上");
    }
}
