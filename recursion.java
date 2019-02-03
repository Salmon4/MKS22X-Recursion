import java.util.ArrayList;
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
      return fibHelper(n,0,1,2);
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
      if (n != index){
        return fibHelper(n,first,second + first,index + 1);
      }
      else{
        return first + second;
      }
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> ans = new ArrayList<>();
      ArrayListHelper(ans,0, 1, n);
      //ArrayListHelper(ans,0, 1, n);
      return ans;
    }

    public static boolean ArrayListHelper(ArrayList<Integer> ans, int sum, int current, int n){
      if (current < n+1){
        return ArrayListHelper(ans, sum + current, current + 1, n) && ArrayListHelper(ans, sum, current + 1, n);
      }
      ans.add(sum);
      return true;
    }

  public static void main(String args[]){
    System.out.println("Square Root Tests:");
    System.out.println("Suppose to print about 1");
    System.out.println(sqrt(1,.001));
    System.out.println("Suppose to print about 2");
    System.out.println(sqrt(4,.00001));
    System.out.println("Suppose to print about 8");
    System.out.println(sqrt(64,.1));
    System.out.println("Suppose to print about 22.36");
    System.out.println(sqrt(500,.01));
    System.out.println("Suppose to print about 31.622");
    System.out.println(sqrt(1000,.0001));
    System.out.println("Suppose to print about 316.227");
    System.out.println(sqrt(100000, .00001));

    System.out.println("");

    System.out.println("Fib Tests:");
    System.out.println("Suppose to print 0");
    System.out.println(fib(0));
    System.out.println("Suppose to print 1");
    System.out.println(fib(1));
    System.out.println("Suppose to print 5");
    System.out.println(fib(5));
    System.out.println("Suppose to print 55");
    System.out.println(fib(10));
    System.out.println("Suppose to print 75025");
    System.out.println(fib(25));
    System.out.println("Suppose to print 832040");
    System.out.println(fib(30));
    System.out.println("Suppose to print 701408733");
    System.out.println(fib(44));
    System.out.println("Suppose to print 1134903170");
    System.out.println(fib(45));
    System.out.println("Suppose to print 1836311903");
    System.out.println(fib(46));
    System.out.println("Suppose to print 2971215073");
    System.out.println(fib(47));


    System.out.println(makeAllSums(3).toString());
  }
}
