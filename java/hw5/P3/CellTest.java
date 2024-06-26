
/* CellTest.java skeleton written by Hyunyoung Lee 
   CSCE 314 [Sections 595, 596, 597] Spring 2024  
   Homework 5 Problem 3 Test class 
   class CellTest

   Student Name: 
   UIN:
   Acknowledgements: 
*/

public class CellTest {

  // 15 points for the three methods: int_sum, num_sum, print
  // implement int_sum
  public static int int_sum(Cell<Integer> list) {
    int sum = 0;
    if(list == null){
      return sum;
    }
    else{
      for(Integer num: list){
        sum += num;
      }
      return sum;
    }
  }

  // implement num_sum
  public static double num_sum(Cell<? extends Number> list) {
    double sum = 0;
    if(list == null){
      return sum;
    }
    else{
      //cell has atleast a value of type Number
      for(Number n: list){
        sum += n.doubleValue();
      }
      return sum;
    }
  }

  // implement print
  public static void print(Cell<?> list) {
    if(list == null){
      System.out.println("Linked list is empty.");
    }
    else{
      //cell has atleast a value of type Object
      for(Object o: list){
        System.out.print(o + " ");
      }
      System.out.println();
    }
  }

	
  // Feel free to "expand" the main method but do not delete whatever provided 
  public static void main (String args[]) {
    Cell<Integer> intlist = 
        new Cell<Integer>(1, 
          new Cell<Integer>(22, 
            new Cell<Integer>(21, 
              new Cell<Integer>(12, 
                new Cell<Integer>(24, 
                  new Cell<Integer>(17, null))))));
        
    Cell<Integer> nullintlist = null;

    System.out.println("===");
    print(intlist);
    System.out.println("sum of intlist is " + int_sum(intlist));
    System.out.println("sum of null list is " + int_sum(nullintlist));
    System.out.println("===");

    Cell<Double> doublelist = 
        new Cell<Double>(1., 
          new Cell<Double>(16., 
            new Cell<Double>(13.72, 
              new Cell<Double>(5., 
                new Cell<Double>(22., 
                  new Cell<Double>(7.1, null))))));

    System.out.println("===");
    print(doublelist);
    System.out.println("sum ints = " + num_sum(intlist));
    System.out.println("sum doubles = " + num_sum(doublelist));
    System.out.println("===");
  }
}

