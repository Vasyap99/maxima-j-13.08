package dz13_08;

public class MathOps{
    //метод, который складывает два числа. 
    public int sum(int a,int b){
        return a+b;
    }

    //метод, который высчитывает разность двух чисел
    public int sub(int a,int b){
        return a-b;
    }

    //метод, который перемножает два числа
    public int mul(int a,int b){
        return a*b;
    }

    //метод, который находит частное двух чисел
    public int div(int a,int b){
        return a/b;
    }

    //метод, который возводит первое число в степень, равной второму числу (Пример: в метод передано два числа - 2 и 3. Метод возведет 2 в степень 3)
    public int exp(int a,int b){
        return (int) Math.pow(a, b);
    }
}