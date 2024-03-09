package SqList3;

public class Student {
   private String num;
    private String name;
    private char s;
    private String phone;
    private String ad;

    public Student() {
    }

    public Student(String num, String name, char s, String phone, String ad) {
        this.num = num;
        this.name = name;
        this.s = s;
        this.phone = phone;
        this.ad = ad;
    }
    public String getNum() {
        return num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getS() {
        return s;
    }
    public void setS(char s) {
        this.s = s;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public String toString() {
        return "Student{num = " + num + ", name = " + name + ", s = " + s + ", phone = " + phone + ", ad = " + ad + "}";
    }
}
