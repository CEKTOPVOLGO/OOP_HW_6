package Task2;
//Согласно четвертому принципу SOLID реализовал 2 нужных интерфейса из 3х возможных.
public class Main {
    public static void main(String[] args) {
        Numeric<Integer> iOb = new Numeric<>(5);
        System.out.println("Обратная величина iOb = " + iOb.reciprocal());
        System.out.println("Дробная часть iOb = " + iOb.fraction());
        System.out.println();
        Numeric<Double> iOb2 = new Numeric<>(5.25);
        System.out.println("Обратная величина iOb2 = " + iOb2.reciprocal());
        System.out.println("Дробная часть iOb2 = " + iOb2.fraction());

    }
}
