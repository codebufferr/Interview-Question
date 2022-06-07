public class Pracitce {

    //Product of two Integer
    static int product(int a, int b){
        int sum=0;
        for(int i=0;i<b;i++){
            sum+=a;
        }
        return sum;
    }

    //Power of two integer

    static int power(int a, int b){
        if(b<0){
            return 0;
        }else if(b==0){
            return 1;
        }else{
            return a*power(a,b-1);
        }
    }

    //Mod of two integer

    static int mod(int a , int b){
        if(b<=0){
            return -1;
        }
        int div= a/b;
        return a- div*b;
    }

    //Division 

    static int division(int a , int b){
        int count=0;
        int sum=b;
        while(sum<=a){
            sum +=b;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Product: " + product(5,6));
    
        System.out.println("Power: "+ power(2,4));
    
        System.out.println("Mod: " + mod(10,2) );
        
        System.out.println("Interger Division : " +  division(20,10));
       

    }


    
}
