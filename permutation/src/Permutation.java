import java.util.Arrays;

public class Permutation {
    int n;
    int[] currentPermutation;

    public Permutation(int n){
        this.n = n;
        currentPermutation = new int[n];
        for (int i = 0; i < n; i++){
            currentPermutation[i] = i;
        }
    }

    public String asText(){
        String permutationText = "";
        for (int i = 0; i < n; i++){
            permutationText += currentPermutation[i] + "-";
        }

        permutationText = permutationText.substring(0, permutationText.length() - 1);

        return permutationText;
    }

    public boolean generateNext() {
        int i = currentPermutation.length - 2;
        while (i >= 0 && currentPermutation[i] >= currentPermutation[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }

        int j = currentPermutation.length - 1;
        while (currentPermutation[j] <= currentPermutation[i]) {
            j--;
        }

        int temp = currentPermutation[i];
        currentPermutation[i] = currentPermutation[j];
        currentPermutation[j] = temp;

        int left = i + 1;
        int right = currentPermutation.length - 1;
        while (left < right) {
            int tmp = currentPermutation[left];
            currentPermutation[left] = currentPermutation[right];
            currentPermutation[right] = tmp;
            left++;
            right--;
        }

        return true;
    }

    private void deleteByValue(int[] array, int value) {
        for(int i=0; i<array.length;i++){
            if(array[i]==value){
                array[i]=-1;
            }
        }
    }
}


/*
0-1-2
0-2-1
1-0-2
1-2-0
2-0-1
2-1-0
 */
