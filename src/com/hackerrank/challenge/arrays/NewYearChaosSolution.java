package com.hackerrank.challenge.arrays;

/**
 * Bubble Sort concepts
 * @author walterjardim
 *
 */
public class NewYearChaosSolution {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 5, 3, 7, 8, 6, 4 };
		int[] arr = {2,5,1,3,4}; // Chaotic

		minimumBribes(arr);
	}

	private static void minimumBribes(int[] q) {
		int swaps = 0;

        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i + 1) > 2)) {
                System.out.println("Too chaotic");
                return;
            }
        }
        
        boolean swaped = false;

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q.length; j++) {
                if (j + 1 < q.length) {
                    if (q[j] > q[j + 1]) {
                        int temp = q[j];
                        q[j] = q[j + 1];
                        q[j + 1] = temp;
                        ++swaps;
                        swaped = true;
                    }                    
                }
            }
            
            if (swaped) {
                swaped = false;
            } else {
                break;
            }
        }

        System.out.println(swaps);
	}
}
