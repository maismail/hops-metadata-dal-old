/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop;

/**
 *
 * @author salman
 */
public class Common {
//  private static final int BITS_FOR_PART_KEY = 32;
//  private static long partKeyBitMask = 0xFFFFFFFFFFFFFFFFL << (64 - BITS_FOR_PART_KEY);
//  private static long idBitMask     = 0xFFFFFFFFFFFFFFFFL >>> BITS_FOR_PART_KEY;
//    
//  //upper part of long number
//  public static int getPartitionKey(final long number){
//    long upperPart = partKeyBitMask & number;
//    upperPart =  upperPart >> (64 - BITS_FOR_PART_KEY);
//    if(upperPart < 0){
//      throw new ArithmeticException("Something fucked up while storing partID and ID in same long. PartID is negative");
//    }else if( upperPart > Integer.MAX_VALUE) {
//      throw new ArithmeticException("Something fucked up while storing partID and ID in same long. PartID is very long");
//    }
//    else{
//      return (int)upperPart;
//    }
//  }
//  
//  public static long extractIdPart(final long number){    
//    long lowerPart = idBitMask & number;
//    if(lowerPart < 0 ){
//      throw new ArithmeticException("Something fucked up while storing partID and ID in same long. ID is negative");
//    }else{
//      return lowerPart;
//    }
//  }
//  
//  public static long combinePartIDandID(final long upperPart, final long lowerPart){
//    if(upperPart < 0 || lowerPart < 0){
//      throw new ArithmeticException("Something fucked up while storing to ints in a long. Got Negative number, Upper part "+upperPart+" LowerPart "+lowerPart);
//    }
//    long upperTemp = upperPart;
//    upperTemp = upperTemp << (64 - BITS_FOR_PART_KEY);
//    if(upperTemp < 0){
//      throw new ArithmeticException("PartID is too big. overflow");
//    }
//    
//    long bitMask = 0xFFFFFFFFFFFFFFFFL;
//    bitMask = bitMask >>> BITS_FOR_PART_KEY;
//    long lowerTemp = bitMask & lowerPart;
//    if(lowerTemp != lowerPart){
//      throw new ArithmeticException("ID is too big. overflow");
//    }
//    
//    long completeNumber = upperTemp | lowerPart;
//    return completeNumber;
//  }
//  
//  public static int hashFileName(final String fileName){
//    if(fileName != null){
//      return Math.abs(fileName.hashCode());
//    }else{
//      return 0;
//    }
//  }
//  
//  public static void main(String[] argv){
//    long combined = combinePartIDandID(Integer.MAX_VALUE,3);
//    System.out.println("combined "+combined+" upper: "+getPartitionKey(combined)+" lower "+extractIdPart(combined));
//    
//  }
  
  
}
