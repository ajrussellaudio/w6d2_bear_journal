import java.util.ArrayList;
import java.util.HashMap;

public class Bear{

  private String name;
  private ArrayList<Edible> belly;
  private HashMap<String, Edible> journal;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
    this.journal = new HashMap<String, Edible>();
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return belly.size();
  }

  public void eat(Edible food, String day){
    belly.add(food);
    journal.put(day, food);
    // System.out.println(journal);
  }

  public void sleep(){
    belly.clear();
  }

  public Edible throwUp() {
    if(foodCount() > 0) {
      return belly.remove(0);
    }
    return null;
  }

  public int totalNutritionalValue() {
    int total = 0;
    for(Edible food : belly) {
      total += food.nutritionalValue();
    }
    return total;
  }

}