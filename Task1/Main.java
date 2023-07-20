package Task1;

public class Main {
    public static void main(String[] args) {
        Gen<Integer, String> iOb;
        iOb = new Gen<Integer, String>(88, "Обобщение!");
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение :" + v);
        String w = iOb.getOb2();
        System.out.println("Значение :" + w);
    }
}
