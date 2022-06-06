
public class Array {
    public static void main(String[] args) {
        int [] array = {1,4,2,1,4,1};
        for(int i=0; i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                System.out.println(array[i] + "," + array[j]);
            }
        }
        
    }


    
}
