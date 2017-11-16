package Assignment7;

public class Assignment7
{
   public static void main(String[] args)
   {
      int inputX, k;
      SevenSegmentLogic my7Seg, myCopy;

      my7Seg = new SevenSegmentLogic();

      try
      {
         myCopy = (SevenSegmentLogic) my7Seg.clone();
      } catch (CloneNotSupportedException e)
      {
         System.out.println("** Clone Unsuccessful **");
         myCopy = new SevenSegmentLogic();
      }

      System.out.println("The reference address before clone: " + myCopy.hashCode());
      System.out.println("The reference address after clone: " + my7Seg.hashCode());

      System.out.println("Boolean funcions reference address before clone: " + myCopy.segs.hashCode());
      System.out.println("Boolean funcions reference address after clone: " + my7Seg.segs.hashCode());

      for (inputX = 0; inputX < 16; inputX++)
      {
         myCopy.eval(inputX);
         System.out.print("\n| ");
         for (k = 0; k < 7; k++)
            System.out.print(myCopy.getValOfSeg(k) + " | ");
         System.out.println();
      }
   }
}