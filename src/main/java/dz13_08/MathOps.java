package dz13_08;

public class MathOps{
    //�����, ������� ���������� ��� �����. 
    public int sum(int a,int b){
        return a+b;
    }

    //�����, ������� ����������� �������� ���� �����
    public int sub(int a,int b){
        return a-b;
    }

    //�����, ������� ����������� ��� �����
    public int mul(int a,int b){
        return a*b;
    }

    //�����, ������� ������� ������� ���� �����
    public int div(int a,int b){
        return a/b;
    }

    //�����, ������� �������� ������ ����� � �������, ������ ������� ����� (������: � ����� �������� ��� ����� - 2 � 3. ����� �������� 2 � ������� 3)
    public int exp(int a,int b){
        return (int) Math.pow(a, b);
    }
}