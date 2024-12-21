import java.util.ArrayList;

public class deadAntCount {
    /* public static int deadAntCount(final String ants) {
         String ant = "ant";
         int count = 0;
     }

     static ArrayList<Integer> searchNaive(String ants) {
         String sample = "ant";
         ArrayList<Integer> foundPosition = new ArrayList<>();
         for (int i = 0; i < ants.length(); i++) {
             int j = 0;
             while (j < sample.length() && i + j < ants.length() && sample.charAt(j) == ants.charAt(j)) {
                 j++;
             }
             if (j == sample.length()) {
                 foundPosition.add(i);
             }
         }
         return foundPosition;

     }*/

        public static void main(String[] args) {
            int[][] twoD = new int[4][5];
            int i, j, k = 0;
          //  var myArray = new int [10];
            for (i = 0; i < 4; i++)
                for (j = 0; j < 5; j++) {
                    twoD[i][j] = k;
                    k++;
                }
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 5; j++)
                    System.out.print(twoD[i][j] + " ");
                System.out.println();
            }
        }

}
