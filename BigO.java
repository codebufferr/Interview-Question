//Stack space in recursive calls count too 
//O(n) time 


public class BigO{

    static int sum(int n) {
        if(n<=0){
        return 0;
        }
        return n + sum(n-1);
        
    }

    public static void main(String args[]) {

      
        System.out.println("Sum "+ sum(10));

    
        
    }
}