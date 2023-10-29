package Sorting;



public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,6,3,7,1};
        int n=arr.length;
        int min_idx;
        for(int i=0;i<n-1;i++){
            min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                    int temp=arr[min_idx];
                    arr[min_idx]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
