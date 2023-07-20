package Task3;

public class UseGen {
    static void test(Gen<? extends A> o){
        //..
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Object obj = new Object();
        Gen<A> wA = new Gen<>(a);
        Gen<B> wB = new Gen<>(b);
        Gen<C> wC = new Gen<>(c);
        Gen<D> wD = new Gen<>(d);
        Gen<Object> wObj = new Gen<>(obj);

        test(wA);
        test(wB);
        test(wC);
      //  test(wD);
       // test(wObj);
    }
}
