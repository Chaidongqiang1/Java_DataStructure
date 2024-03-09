package SqList3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        SqList L=new SqList(10);
        Student std1=new Student("2008001","Alan",'F',"13305731238","浙江省嘉兴市");
        Student std2=new Student("2008002","Danie",'M',"0573-82283288","浙江省嘉兴市");
        Student std3=new Student("2008003","Helen",'M',"13507942222","江西省抚州市");
        Student std4=new Student("2008004","Bill",'F',"0571-72529911","浙江省杭州市");
        Student std5=new Student("2008006","Peter",'M',"13857354444","浙江省嘉兴市");
        Student std6=new Student("2008006","Amy",'F',"13956367777","安徽省蚌埠市");
        L.insert(0,std1);
        L.insert(1,std2);
        L.insert(2,std3);
        L.insert(3,std4);
        L.insert(4,std5);
        L.insert(5,std6);
        System.out.println("请输入要查找的学生的学号或姓名:");
        String x=sc.next();
        int i=L.indexOf(x);
        if(i<0)
            System.out.println("不存在此学生，请检查输入的学号或姓名是否正确");
        else
            L.get(i);
        Student std_new=new Student();
        System.out.println("请依次输入新学生的学号、姓名、性别、电话和地址:");
        std_new.setNum(sc.next());
        std_new.setName(sc.next());
        std_new.setS(sc.next().charAt(0));
        std_new.setPhone(sc.next());
        std_new.setAd(sc.next());
        L.insert(6,std_new);
        System.out.println("插入新学生后，通讯录顺序表的所有学生信息为:");
        L.display();
        System.out.println("请输入所要删除学生的学号:");
        L.remove(L.indexOf(sc.next()));
        System.out.println("删除后，通讯录顺序表的所有学生信息为:");
        L.display();
    }
}
