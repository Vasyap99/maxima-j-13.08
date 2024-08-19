package dz13_08;

public class MathOps{
    public int sum(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        if(b==0) throw new IllegalArgumentException();
        return a*b;
    }

    public int div(int a,int b){
        if(b==0) throw new IllegalArgumentException();
        return a/b;
    }

    public int exp(int a,int b){
        int pow=1;
        for(int i=0;i<b;i++) pow*=a;
        return pow;
    }
}