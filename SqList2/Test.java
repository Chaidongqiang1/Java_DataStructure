package SqList2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        SqList A=new SqList(10);
        SqList B=new SqList(10);
        SqList C=new SqList(10);
        System.out.println("请设置A的表长（1~10）");
        int ia=sc.nextInt();
        creatSortSqList(A,ia);
        System.out.println("请设置B的表长（1~10）");
        int ib=sc.nextInt();
        creatSortSqList(B,ib);
        System.out.println("请设置C的表长（1~10）");
        int ic=sc.nextInt();
        creatSortSqList(C,ic);
        removePublic(A,B,C);
        System.out.println("删除有序表B和C中公共元素后的顺序表A:");
        A.display();

    }
    private static void removePublic(SqList A,SqList B,SqList C)throws Exception
    {
        int i=0;
        int j=0;
        int k=0;
        while (j<B.length()&&k<C.length())
        {
            if ((Integer)B.get(j)<(Integer) C.get(k))
                j++;
            else if ((Integer)B.get(j)>(Integer) C.get(k))
                k++;
            else
            {
                while (i<A.length()&&(Integer)A.get(i)<(Integer) B.get(j))
                    i++;
                if(i<A.length()&&(Integer)A.get(i)==(Integer) B.get(j))
                    A.remove(i);
                j++;
                k++;
            }
        }
    }
    private static void creatSortSqList(SqList L,int n)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入有序顺序表中的各个数据元素:");
        for (int i=0;i<n;i++)
        {
            L.insert(i,sc.nextInt());
        }
    }
}

