public class Test {

    public void m1(){
        System.out.println("This test m1 method..");
    }
    public static void m2() {
        System.out.println("This test static m2 method..");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        System.out.println("Hello Pruthviraj..");
        m2();
    }
}
