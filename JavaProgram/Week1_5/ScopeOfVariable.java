package week2;

public class ScopeOfVariable {
    private int x = 0; // x is accessible anywhere inside the class

    public static void main(String[] args) {
        int a = 3;
        shakeHands(a);

    }

    public static void shakeHands(int n) {  // n is recognized in this method only
        for (int i=0; i<n; i++) { // i is only recognized inside the for loop block
            System.out.println("Shake");
        }
    }

}
