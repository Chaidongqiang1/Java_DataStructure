package SqList3;

public class SqList implements IList{
    private Student[] listElem;
    private int curLen;
    public SqList()
    {

    }
    public SqList(int n)
    {
        listElem=new Student[n];
        curLen=0;
    }
    public void clear() {
        curLen = 0; // 置顺序表的当前长度为0

    }

    // 判断当前线性表中数据元素个数是否为0,若为0则函数返回true，否则返回false
    public boolean isEmpty() {
        return curLen == 0;
    }
    public int length() {
        return curLen; // 返回顺序表的当前长度
    }

    // 读取到线性表中的第i个数据元素并由函数返回其值。其中i取值范围为：0≤i≤length()-1,如果i值不在此范围则抛出异常
    public void get(int i) throws Exception {
        if (i < 0 || i > curLen - 1) // i小于0或者大于表长减1
            throw new Exception("第" + i + "个元素不存在"); // 输出异常
        System.out.println(listElem[i].getNum()+" "+listElem[i].getName()+" "+listElem[i].getS()+" "+listElem[i].getPhone()+" "+listElem[i].getAd());
    }
    public void insert(int i, Student x) throws Exception {
        if (curLen == listElem.length) // 判断顺序表是否已满
            throw new Exception("顺序表已满");// 输出异常

        if (i < 0 || i > curLen) // i小于0或者大于表长
            throw new Exception("插入位置不合理");// 输出异常

        for (int j = curLen; j > i; j--)
            listElem[j] = listElem[j - 1];// 插入位置及之后的元素后移

        listElem[i] = x; // 插入x
        curLen++;// 表长度增1
    }
    public void remove(int i) throws Exception {
        if (i < 0 || i > curLen - 1) // i小于1或者大于表长减1
            throw new Exception("删除位置不合理");// 输出异常

        for (int j = i; j < curLen - 1; j++)
            listElem[j] = listElem[j + 1];// 被删除元素之后的元素左移

        curLen--; // 表长度减1
    }
    public int indexOf(String x) {
        int j = 0;// j为计数器
        while (j < curLen && !listElem[j].getNum().equals(x)&&!listElem[j].getName().equals(x))
            j++;
        if (j < curLen)
            return j;
        else
            return -1;
    }
    public void display() {
        for (int j = 0; j < curLen; j++)
            System.out.println(listElem[j].getNum()+" "+listElem[j].getName()+" "+listElem[j].getS()+" "+listElem[j].getPhone()+" "+listElem[j].getAd());
        System.out.println();// 换行

    }
}
