package io.hops;

/**
 * store two ints in one long variable
 */

public class IntMerge {
  private static final int SPLIT = 32;
  private static long partKeyBitMask = 0xFFFFFFFFFFFFFFFFL << (64 - SPLIT);
  private static long idBitMask     = 0xFFFFFFFFFFFFFFFFL >>> SPLIT;
    
  //upper part of long number
  public static int getUpperNumber(final long number){
    long upperPart = partKeyBitMask & number;
    upperPart =  upperPart >> (64 - SPLIT);
    if(upperPart < 0){
      throw new ArithmeticException("Can not handle negative numbers");
    }else if( upperPart > Integer.MAX_VALUE) {
      throw new ArithmeticException("Number is greater than "+Integer.MAX_VALUE);
    }
    else{
      return (int)upperPart;
    }
  }
  
  public static long getLowerNumber(final long number){    
    long lowerPart = idBitMask & number;
    if(lowerPart < 0 ){
      throw new ArithmeticException("Can not handle negative numbers");
    }else{
      return lowerPart;
    }
  }
  
  public static long combineTwoNumbers(final long upperPart, final long lowerPart){
    if(upperPart < 0 || lowerPart < 0){
      throw new ArithmeticException("Can not handle negative numbers. Upper part "+upperPart+" LowerPart "+lowerPart);
    }
    long upperTemp = upperPart;
    upperTemp = upperTemp << (64 - SPLIT);
    if(upperTemp < 0){
      throw new ArithmeticException("Upper part number is too big. overflow");
    }
    
    long bitMask = 0xFFFFFFFFFFFFFFFFL;
    bitMask = bitMask >>> SPLIT;
    long lowerTemp = bitMask & lowerPart;
    if(lowerTemp != lowerPart){
      throw new ArithmeticException("Lower part number is too big. overflow");
    }
    
    long completeNumber = upperTemp | lowerPart;
    return completeNumber;
  } 
   
  public static void main(String[] argv){
    long combined = combineTwoNumbers(Integer.MAX_VALUE,Integer.MAX_VALUE);
    combined = combineTwoNumbers(0,0);
    System.out.println("combined "+combined+" upper: "+getUpperNumber(combined)+" lower "+getLowerNumber(combined));
    
  }
  
  
}
