package Assignment7;
public class Assignment7
{
   public static void main(String[] args)
   {
      //Test for deep copy:
//      BooleanFunc bf = new BooleanFunc();
//      
//      try
//      {
//         BooleanFunc newBf =  (BooleanFunc) bf.clone();
//      } catch (CloneNotSupportedException e1)
//      {
//         // TODO Auto-generated catch block
//         e1.printStackTrace();
//      }
      int inputX, k;
      SevenSegmentLogic my7Seg, myCopy;
      
      my7Seg = new SevenSegmentLogic();
      
      try
      {
         myCopy = (SevenSegmentLogic) my7Seg.clone();
      }
      catch  ( CloneNotSupportedException e )
      {
         System.out.println("** Clone Unsuccessful **");
         myCopy = new SevenSegmentLogic();
      }
      
      for ( inputX = 0; inputX < 16; inputX++ )
      {
         myCopy.eval( inputX );
         System.out.print("\n| ");
         for ( k = 0; k < 7; k++ )
            System.out.print( myCopy.getValOfSeg( k ) + " | ");
         System.out.println();
      }
   }
}