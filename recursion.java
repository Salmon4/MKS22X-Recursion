public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return squareRootHelper(n,1,tolerance);
    }

    public static double squareRootHelper(double n, double guess,double tolerance){
      if (guess * guess % n  <= tolerance){
        return guess;
      }
      guess = (n / guess + guess) / 2;
      return squareRootHelper(n,guess,tolerance);
    }
    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    //public static int fib(int n){

  //  }

    /*As Per classwork*/
  //  public static ArrayList<Integer> makeAllSums(){
  //  }
  public static void main(String args[]){
    System.out.println(sqrt(1,.001));
    System.out.println(sqrt(4,.00001));
    System.out.println(sqrt(64,.1));
    System.out.println(sqrt(1000,.0001));
  }
}
