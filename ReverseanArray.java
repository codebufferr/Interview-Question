public class ReverseanArray {
    static void reverse(int[] array){
        for(int i=0;i<array.length/2 ;i++){
            int other= array.length - i - 1 ;
            int temp= array[i];
            array[i]=array[other];
            array[other]=temp;

        }
        System.out.print("Reversed Array is : "  );
         for(int j=0; j<array.length;j++){
             System.out.print(array[j] + ",");
         }
        
    }
    public static void main(String[] args) {
        int[] array={1,4,21,131};
       
        reverse(array);
    }
}
