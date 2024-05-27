class A{
    public  void m1(){
        System.out.println("hai");
    }
}
public class B extends A{
    public  void m1(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        A obj1=new A();
        A obj2=new B();
        obj1.m1();
        obj2.m1();
    }
}