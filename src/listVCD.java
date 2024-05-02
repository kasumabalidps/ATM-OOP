import java.util.ArrayList;

public class listVCD {
    private ArrayList<VCD> vcdList = new ArrayList<>();

    public void addVCD(VCD vcd) {
        vcdList.add(vcd);
    }

    public void displayVCDs() {
        for (VCD vcd : vcdList) {
            System.out.println("---------------------");
            vcd.displayInfo();
            System.out.println("---------------------");
        }
    }
}