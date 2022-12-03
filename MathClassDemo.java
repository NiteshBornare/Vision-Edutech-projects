
public class MathClassDemo {
    public static void main(String[] args) 
    {
    	//this will return the positive results only
        System.out.print("Absolute :");
        System.out.println(Math.abs(-123)); 
       
        
        //this method gives the cute root of given number
        System.out.print("Cube Root :");
        System.out.println(Math.cbrt(27));
             
                
         //this will give you the truncated result of the division      
        System.out.print("Round Division :");
        System.out.println(Math.floorDiv(50, 9));
       
        System.out.print("e power x :");
        System.out.println(Math.exp(1));
        
      
       
        System.out.print("Log base 10 :");
        System.out.println(Math.log10(100));
        
        
        System.out.print("Maximum :");
        System.out.println(Math.max(100, 50));
        
        //this will give redian value of tan45
        System.out.print("Tan :");
        System.out.println(Math.tan(45*Math.PI/180));
       
       
        System.out.print("Convert to Radians :");
        System.out.println(Math.toRadians(90));
               
        
        System.out.print("Random :");
        System.out.println(Math.random()*1000);
        
        
        System.out.print("Power :");
        System.out.println(Math.pow(2, 3));
        
        //if the result is within integer range then it gives the output ow it throws exception
        System.out.print("Excact Product :");
        System.out.println(Math.multiplyExact(100, 200));
        
        
        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 11));
        
        
    }   
}
