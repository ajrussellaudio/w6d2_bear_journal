import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Human human;
  Salmon salmon;
  Chicken chicken;


  @Before 
  public void before() {
    bear = new Bear("Baloo");
    human = new Human();
    salmon = new Salmon(); 
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon, "Friday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatHuman(){
    bear.eat(human, "Monday");
    assertEquals(1, bear.foodCount());
  }

  // @Test // not needed anymore
  // public void bellyIsFull(){
  //   for(int i = 0; i<5; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(bear.bellyFull(), true);
  // }

  // @Test // not needed anymore
  // public void canNotEatSalmonWhenBellyFull(){
  //   for(int i = 0; i<10; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(bear.foodCount(), 5);
  // }

  // @Test
  // public void shouldEmptyBellyAfterSleeping(){
  //   bear.eat(salmon);
  //   bear.eat(human);
  //   bear.sleep();
  //   assertEquals(0, bear.foodCount());
  // }

  // @Test
  // public void canThrowUp() {
  //   bear.eat(human);
  //   Edible food = bear.throwUp();
  //   // Salmon original = (Salmon)food;
  //   assertEquals(human.swim(), food.swim());
  // }

  @Test
  public void canThrowUpChicken() {
    bear.eat(chicken, "Tuesday");
    Edible food = bear.throwUp();
    Chicken original = (Chicken)food;
    assertEquals(chicken.cluck(), original.cluck());
  }

  // // @Test
  // // public void canThrowUp() {
  // //   bear.eat(human);
  // //   Edible food = bear.throwUp();
  // //   assertNotNull(food);
  // // }

  // @Test
  // public void hasTotalNutritionalValue() {
  //   bear.eat(chicken);
  //   bear.eat(salmon);
  //   bear.eat(human);
  //   assertEquals( 310, bear.totalNutritionalValue() );
  // }
}
