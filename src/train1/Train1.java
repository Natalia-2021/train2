package train1;

import java.util.Arrays;
import java.util.Collections;

public class Train1 {

	public static void main(String[] args)
    {
        String arr[] = {"a","c","b","practice",
                        "quiz",
                        "code"
                       };
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
        	String arrI;
        	arrI = arr[n - 1 - i];
        	arr[n - 1 - i] = arr[i];
        	arr[i] = arrI;
        }
        System.out.printf("Reverse sorted arr[] : \n%s\n\n",
                Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("Reverse sorted arr[] : \n%s\n\n",
                Arrays.toString(arr));
        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.printf("Modified arr[] : \n%s\n\n",
                          Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.printf("Modified arr[] : \n%s\n\n",
                          Arrays.toString(arr));
        /*double q = 1.0/0.0;
        System.out.println(q);
        Double q1 = 1.0/0.0;
        System.out.println(q1);
        try{
        int q2 = 1/0;
        System.out.println(q2);
        } catch (Exception ex) {
        	System.out.println("q2 throws Exception" + ex);
        }*/
    }

}
