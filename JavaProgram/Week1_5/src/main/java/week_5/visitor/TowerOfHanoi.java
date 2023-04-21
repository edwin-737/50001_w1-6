package week_5.visitor;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Running tower of hanoi with n = " + n);
        moveTo(n,"A", "B", "C");
    }
    public static void moveTo(int n, String source, String dest, String aux){
        if(n==1){
            System.out.println("Move "+n+" to "+dest);
        }
        else {
            moveTo(n - 1, source, aux, dest);
            System.out.println("Move "+n+" to "+dest);
            moveTo(n-1, aux, dest, source);
        }
    }
}