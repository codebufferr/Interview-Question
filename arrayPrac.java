public class arrayPrac {
    static void printUnorderedPair(int[] arrA,int[] arrB){
        for (int i=0;i<arrA.length;i++){
            for(int j=0;j<arrB.length;j++){
                if(arrA[i]<arrB[j]){
                    System.out.print(  arrA[i] + " " + arrB[j]  );
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arrA={0,1,2,4,5,2};
        int[] arrB={2,1,0,4,8,5};

        printUnorderedPair(arrA,arrB);
    }
    
    
}
