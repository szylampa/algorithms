package zadania;

public class Zadanie1 {

    public int NWD (int a, int b){
        int c = 0;
        while (b != 0){
            c = a%b;
            a=b;
            b=c;
        }
        return a;
    }

    public static void main(String[] args) {

        Zadanie1 m = new Zadanie1();
        System.out.println(m.NWD(100, 8));

    }
}