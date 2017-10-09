import java.util.ArrayList;
import java.util.List;

public class pascal {


  public static void main (String [] args) {

      int[] printedVals = {0,1,0,0,0,0,0,0,0,0,0,0,0};
      int sum;
      int previousVal = 0;
      int oneCount = 0;

      /*for (int v : printedVals) {
        System.out.println(v);
      }*/
      for (int c=0;c<11;c++) {


        for (int i=1; i <= printedVals.length; i++) {
          sum = previousVal + printedVals[i-1];
          if (printedVals[i-1] == 1) {
            oneCount++;
          }

          if (sum != 0 && c != 0) {
            System.out.printf(sum + " ");
          } else if (sum != 0 && c == 0) {
            System.out.printf("1");
            break;
          }



          previousVal = printedVals[i-1];

          printedVals[i-1] = sum;

          if (oneCount == 2) {
            printedVals[i] = 0;
            oneCount = 0;
          }
        }




        System.out.println();

      }




      /*for (int v : printedVals) {
        System.out.println(v);
      }*/

      /*for (int val : printedVals) {
        sum = previousVal + val;
        if (sum != 0) {
            System.out.println(sum);
        }
        previousVal = val;

      }*/
  }

}
