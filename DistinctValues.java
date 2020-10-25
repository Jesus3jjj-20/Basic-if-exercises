public class DistinctValues {
    public static void main(String args[]) {
      
      int args1 = Integer.parseInt(args[0]);
      int args2 = Integer.parseInt(args[1]);
      int args3 = Integer.parseInt(args[2]);

    if(args1 == args2 && args1 == args3){
        
        System.out.println(1);
        
    } else if((args1 == args2 && args1 != args3) || (args1 == args3 && args1 != args2) || (args2 == args1 && args2 != args3) || (args2 == args3 && args2 != args1) || (args3 == args1 && args3 != args2) || (args3 == args2 && args3 != args1) ){
        
        System.out.println(2);
        
    }else{
        
        System.out.println(3);
    }
    
    }
}