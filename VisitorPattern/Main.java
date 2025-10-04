import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VisitableProduct> products = Arrays.asList(new Electronics(10), new Electronics(23), new Food(34), new Clothing(45), new Food(3));
        TaxVisitor tx = new IndiaTaxVisitor();
        double totalTax = 0;
        for(int i=0;i<products.size();i++) {
            totalTax += products.get(i).accept(tx);
        }

        System.out.println("Total Tax for "+tx.getTitle()+" is "+totalTax);
    }
    
}
