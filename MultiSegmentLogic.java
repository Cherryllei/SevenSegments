package Assignment7;

public class MultiSegmentLogic implements Cloneable
{
   protected int numSegs;
   protected BooleanFunc[] segs;

   // Constructors
   public MultiSegmentLogic()
   {
   }

   public MultiSegmentLogic(int numSegs)
   {
      this.numSegs = numSegs;
      this.segs = new BooleanFunc[numSegs];
   }

   // Mutators
   public boolean setNumSegs(int numSegs)
   {
      if (numSegs < 0)
      {
         return false;
      }
      this.numSegs = numSegs;
      this.segs = new BooleanFunc[numSegs];
      return true;
   }

   public boolean setSegment(int segNum, BooleanFunc funcForThisSeg)
   {
      if (segNum >= numSegs)
      {
         return false;
      }
      segs[segNum] = funcForThisSeg;
      return true;
   }

   public void eval(int input)
   {
      for (BooleanFunc seg : segs) {
         seg.eval(input);
      }
   }

   // Deep memory methods and make deep copy of segs
   public Object clone() throws CloneNotSupportedException
   {
      MultiSegmentLogic newObj = (MultiSegmentLogic) super.clone();
      newObj.segs = new BooleanFunc[segs.length];
      for (int i = 0; i < segs.length; i++) {
         newObj.segs[i] = (BooleanFunc) this.segs[i].clone();
      }
      return newObj;
   }
}
