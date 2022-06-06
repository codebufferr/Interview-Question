public class mulipleArray {
//Nothing has really changed here 100 units of work is still constant so the runtime is O(ab)

    static void printUnorderedPair(int[] arrA,int[] arrB){
        for(int i=0;i<arrA.length;i++){
            for(int j=0;j<arrB.length;j++){
                for(int k=0;k<100;k++){
                    System.out.println(arrA[i]+"," + arrB[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrA={10,13,51,1231,2};
        int[] arrB={111,222,111,414,1111111111};

        printUnorderedPair(arrA, arrB);

    }
    
}
