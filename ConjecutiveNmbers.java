
public class ConjecutiveNmbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 9, 10, 2};
        

        int maxLength = 1;
        int currentLength = 1;

        int startIndex = 0;
        int maxStartIndex = 0;

        for (int i = 0; i < arr.length -1; i++) {

            if ((long) arr[i]+1 == (long) arr[i+1]) {

                currentLength++;

            } else {

                currentLength = 1;
                startIndex = i;
            }

            if (currentLength > maxLength) {

                maxLength = currentLength;
                maxStartIndex = startIndex;
            }
        }

        System.out.println("Maximum length: " + maxLength);

        System.out.print("Subarray: ");

        for (int i = maxStartIndex; i < maxStartIndex + maxLength; i++) {

            System.out.print(arr[i] + " ");
        }
    
    }
    
}
