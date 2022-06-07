public class fibonacci {

    static void allfib(int n){
        for(int i=0;i<n;i++){
            System.out.println(i + ":" + fib(i));
        }
    }
     static int fib(int n){
         if(n<=0){
             return 0;
         }else if(n==1){
             return 1;
         }else{
             return fib(n-1) + fib(n-2);
         }
     }
     public static void main(String[] args) {
         allfib(10);
       
         System.out.println(fib(10));
     }
    
}
