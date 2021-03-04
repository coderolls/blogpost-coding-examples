/** 
 * A java program to convert double to int using 
 * Math.round() method 
 * @author Gaurav Kukade at coderolls.com
 **/
public class DoubleToIntUsingRoundMethod{

     public static void main(String []args){
        
        // case 1
        double doubleValue = 82.14; // 82.14
        
        System.out.println("doubleValue: "+doubleValue);
        
        //typecase double to int
        int intValue = (int) Math.round(doubleValue); // 82
        
        System.out.println("intValue: "+intValue);
        
        System.out.println();
        
        // case 2
        double nextDoubleValue = 82.99; // 

        
        System.out.println("nextDoubleValue: "+nextDoubleValue);
        
        // Math.round(nextDoubleValue) returns long value
        //typecase long to int
        int nextIntValue = (int) Math.round(nextDoubleValue); // 83
        
        System.out.println("nextIntValue: "+nextIntValue);              
     }
}
