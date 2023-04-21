// 1006200 Edwin Wongso

package qn3;
import java.util.ArrayList;

public class AlloyFactory {
    // No need to modify the main method
    // It is just used for the test cases
    public static void main(String[] args) {
        AlloyFactory af = new AlloyFactory();
        ArrayList<Metal> rgIng = af.getIngredients("ROSE GOLD", 10);
        System.out.println("Rose Gold ingredients: " + rgIng);
        // Rose Gold ingredients: [Gold 7.5 gr, Copper 2.5 gr]

        ArrayList<Metal> ssIng = af.getIngredients("STERLING SILVER", 10);
        System.out.println("Sterling Silver ingredients: " + ssIng);
        // Sterling Silver ingredients: [Copper 0.75 gr, Silver 9.25 gr]

        ArrayList<Metal> bIng = af.getIngredients("BILLON", 10);
        System.out.println("Billon ingredients: " + bIng);
        // Billon ingredients: [Copper 6.0 gr, Silver 4.0 gr]
    }

    // Start working from here
    public ArrayList<Metal> getIngredients(String alloy, double totalWeight) {
        final String RG="ROSE GOLD";
        final String SS="STERLING SILVER";
        final String B="BILLON";
        ArrayList<Metal> alloy_arr=new ArrayList<Metal>();
        if(alloy==RG){
            Gold metal1=new Gold();
            metal1.setWeight(0.75*totalWeight);
            Copper metal2=new Copper();
            metal2.setWeight(totalWeight-metal1.getWeight());


            alloy_arr.add(metal1);
            alloy_arr.add(metal2);
        }
        else if(alloy==SS){
            Silver metal3=new Silver();
            metal3.setWeight(0.925*totalWeight);
            Gold metal4=new Gold();
            metal4.setWeight(totalWeight-metal3.getWeight());

            alloy_arr.add(metal4);
            alloy_arr.add(metal3);
        }
        else if(alloy==B){
            Silver metal5 = new Silver();
            metal5.setWeight(0.4*totalWeight);
            Copper metal6=new Copper();
            metal6.setWeight(totalWeight-metal5.getWeight());

            alloy_arr.add(metal6);
            alloy_arr.add(metal5);
        }
        return alloy_arr;

    }
}