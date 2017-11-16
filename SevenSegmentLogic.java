package Assignment7;

public class SevenSegmentLogic extends MultiSegmentLogic
{
   public SevenSegmentLogic()
   {
      super(7);
      loadSeg();
   }

   public boolean getValOfSeg(int seg)
   {

      if (seg > super.segs.length)
      {
         return false;
      }
      return super.segs[seg].getState();
   }

   private void loadSeg()
   {
      BooleanFunc a = new BooleanFunc();
      int inputsOfA[] =
      { 0, 2, 3, 5, 6, 7, 8, 9, 10, 14, 15 };
      a.setTruthTableUsingTrue(inputsOfA);
      BooleanFunc b = new BooleanFunc();
      int inputsOfB[] =
      { 5, 6, 11, 12, 14, 15 };
      b.setTruthTableUsingFalse(inputsOfB);
      BooleanFunc c = new BooleanFunc();
      int inputsOfC[] =
      { 2, 12, 14, 15 };
      c.setTruthTableUsingFalse(inputsOfC);
      BooleanFunc d = new BooleanFunc();
      int inputsOfD[] =
      { 1, 4, 7, 9, 10, 15 };
      d.setTruthTableUsingFalse(inputsOfD);
      BooleanFunc e = new BooleanFunc();
      int inputsOfE[] =
      { 1, 3, 4, 5, 7, 9 };
      e.setTruthTableUsingFalse(inputsOfE);
      BooleanFunc f = new BooleanFunc();
      int inputsOfF[] =
      { 1, 2, 3, 7, 13 };
      f.setTruthTableUsingFalse(inputsOfF);
      BooleanFunc g = new BooleanFunc();
      int inputsOfG[] =
      { 0, 1, 7, 12 };
      g.setTruthTableUsingFalse(inputsOfG);
      super.setSegment(0, a);
      super.setSegment(1, b);
      super.setSegment(2, c);
      super.setSegment(3, d);
      super.setSegment(4, e);
      super.setSegment(5, f);
      super.setSegment(6, g);
   }

}
