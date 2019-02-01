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
    public static int fib(int n){
      /**
      if (n > 1){
        return fib(n-1) + fib(n-2);
      }
      if (n == 1){
      return 1;
    }
    else{
      return 0;
    }
    **/

      return fibHelper(n,0,1,0);


    }

    public static int fibHelper(int n,int p, int p2,int index){
      int second = p;
      int first = p2;
      if (n == 1){
        return 1;
      }
      if (n == 0){
        return 0;
      }
      if (n != index + 2 ){
        return fibHelper(n,first,second + first,index + 1);
      }
      else{
        return first + second;
      }
    }

    /*As Per classwork*/
    //public static ArrayList<Integer> makeAllSums(int n){
      //ArrayList<Integer> ans = new ArrayList<>();
      //ArrayListHelper(ans,n);
    //}
  public static void main(String args[]){
    System.out.println(sqrt(1,.001));
    System.out.println(sqrt(4,.00001));
    System.out.println(sqrt(64,.1));
    System.out.println(sqrt(1000,.0001));

    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(5));
    System.out.println(fib(25));
  }
}
