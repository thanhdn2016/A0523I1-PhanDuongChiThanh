package ss5_access_modifier_and_static_method;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setTen("Thanh");
        student.setLop("A05");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
