package Task2;
//Согласно четвертому принципу SOLID реализовал 2 нужных интерфейса из 3х возможных.
public class Numeric<T extends Number> implements Fraction, Reciprocal{
    T num;
    Numeric(T n){
        num = n;
    }
    @Override
    public double reciprocal(){
        return 1 / num.doubleValue();
    }
    @Override
    public double fraction(){
        return num.doubleValue() - num.intValue();
    }
}
