
/**
 *
 * @author Aditya Ranjan Sahoo <adityaen.official101@gmail.com>
 */
import java.util.*;
class Item{
    int weight,value;
    Item(int weight, int value){
        this.weight=weight;
        this.value=value;
        
    }
}
public class fractionalKnapsack {
    public static double fractional_knapsack(int capacity,List<Item> items){
        Collections.sort(items, (a, b) -> Double.compare((double)b.value / b.weight, (double)a.value / a.weight));
        double total_profit=0;
        int current_weight=0;
        
        for(Item item: items){
            if(current_weight+item.weight<=capacity){
                total_profit+=item.value;
                current_weight+=item.weight;
            }
            else{
                total_profit+=(capacity-current_weight)*item.value/item.weight;
                break;
            }
               
        }
        return total_profit;
    }
    
public static void main(String[] args){
    List<Item> items=new ArrayList<>();
    items.add(new Item(10,60));
    items.add(new Item(20,100));
    items.add(new Item(30,120));
    int cap=50;
    System.out.println("Given Knapsack is::\nItem-->[profit,\tweight]");
    for(Item i:items){
        System.out.println("\t "+i.value+" ,\t"+ i.weight);
    }
    System.out.println("\nMax profit:: "+fractional_knapsack(cap,items));
    
    }

}

