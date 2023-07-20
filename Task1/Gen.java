package Task1;

public class Gen<T, V> {
    T ob;
    V ob2;
    Gen(T o, V o2){
        ob = o;
        ob2 = o2;
    }
    T getOb(){
        return ob;
    }
    V getOb2(){
        return ob2;
    }
    void showType(){
        System.out.println("Тип Т это " + ob.getClass().getName());
        System.out.println("Тип V это " + ob2.getClass().getName());
    }
}
