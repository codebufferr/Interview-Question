public class ComplexityPractive {

    static int pairSumSequence(int n ){
        int sum=0;
        for(int i=0;i<n;i++){
            sum += pairSum(i,i+1);
        }
        return sum;
     }

     static int pairSum(int a , int b){
         return a+b;
     }
     public static void main(String[] args) {
         
        System.out.println("Sequence " + pairSumSequence(10));
        System.out.println("Pair Sum " + pairSum(3,4));
        
        //System.out.println(sum);
     }
    
}
