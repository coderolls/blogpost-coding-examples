/**
 * 
 * A java program to convert double to int using 
 * Double.intValue() method  
 * @author Gaurav Kukade at coderolls.com
 * 
 **/
public class DoubleToIntUsingIntValueMethod{

     public static void main(String []args){

        double doubleValue = 82.14; // 82.14
        
        System.out.println("doubleValue: "+doubleValue);
        
        //create Double wrapper object
        Double doubleValueObject = new Double(doubleValue);
        
        
        //typecase double to int
        int intValue = doubleValueObject.intValue(); // 82
        
        System.out.println("intValue: "+intValue);
     }
}
