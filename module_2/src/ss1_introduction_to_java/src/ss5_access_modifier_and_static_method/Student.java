package ss5_access_modifier_and_static_method;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setTen(String ten) {
        this.name = ten;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setLop(String lop) {
        this.classes = lop;
    }
}
