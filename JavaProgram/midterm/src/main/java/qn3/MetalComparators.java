// 1006200 Edwin Wongso

package qn3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// No need to modify public class MetalComparators.
// It is just used for the test cases.
public class MetalComparators {
    public static void main(String[] args) {
        Copper c = new Copper();
        Gold g = new Gold();
        Silver s = new Silver();
        c.setWeight(3.2);
        s.setWeight(0.5);

        ArrayList<Metal> arr = new ArrayList<>();
        arr.add(c);  arr.add(g);  arr.add(s);

        System.out.println("Before sorting: " + arr);
        // Before sorting: [Copper 3.2 gr, Gold 1.0 gr, Silver 0.5 gr]

        Collections.sort(arr, new WeightComparator());
        System.out.println("Sort by weight: " + arr);
        // Sort by weight: [Silver 0.5 gr, Gold 1.0 gr, Copper 3.2 gr]

        Collections.sort(arr, new ConductivityComparator());
        System.out.println("Sort by conductivity: " + arr);
        // Sort by conductivity: [Gold 1.0 gr, Copper 3.2 gr, Silver 0.5 gr]

        Collections.sort(arr, new ResistivityComparator());
        System.out.println("Sort by resistivity: " + arr);
        // Sort by resistivity: [Silver 0.5 gr, Copper 3.2 gr, Gold 1.0 gr]

    }
}

// Start working from here
class ConductivityComparator implements Comparator<Metal> {


    @Override
    public int compare(Metal metal, Metal t1) {
        if(metal.getConductivity()<t1.getConductivity())
            return -1;
        else if(metal.getConductivity()== t1.getConductivity())
            return 0;
        else
            return 1;
    }
}

class ResistivityComparator implements Comparator<Metal> {


    @Override
    public int compare(Metal metal, Metal t1) {
        if(metal.getResistivity()<t1.getResistivity())
            return -1;
        else if(metal.getResistivity()== t1.getResistivity())
            return 0;
        else
            return 1;
    }
}

class WeightComparator implements Comparator<Metal> {
    @Override
    public int compare(Metal metal, Metal t1) {
        if(metal.getWeight()<t1.getWeight())
            return -1;
        else if(metal.getWeight()== t1.getWeight())
            return 0;
        else
            return 1;
    }


}