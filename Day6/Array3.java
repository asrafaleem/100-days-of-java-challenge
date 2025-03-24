public class Array3 {
    public static void main(String[] args) {
        float arr[] = {12,64,78,94,99};
        float sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
        }
         float avg = sum/arr.length;
        System.out.println("avg: "+avg);
    }
}
