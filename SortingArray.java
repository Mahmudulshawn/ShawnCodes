/**
 * Sorting Array;
 */
public class SortingArray {
    public static void PrintArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,9,8,4,5,6};
        int temp;
//Buble Sort
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
               if (arr[j]<arr[j+1]) {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
               } 
            }
        }   
        PrintArr(arr);


//Selection Sort
        for (int i=0; i<arr.length; i++){
            int smallest =i;
            for (int j=i+1; j<arr.length;j++){
                if (arr[smallest]>arr[j]) {
                    smallest= j;                  
                }
            }
            int temporary = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temporary;
        }
        PrintArr(arr);
    }
}