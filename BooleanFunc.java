package Assignment7;

public class BooleanFunc implements Cloneable
{
   public static int MAX_TABLE_FOR_CLASS = 65536; // 16 binary input lines
   public static int DEFAULT_TABLE_SIZE = 16;
   private int tableSize;
   private boolean[] truthTable;
   private boolean evalReturnIfError;
   private boolean state;

   // Constructors
   public BooleanFunc()
   {
      this(DEFAULT_TABLE_SIZE);
   }

   public BooleanFunc(int tableSize)
   {
      this(tableSize, false);
   }

   // Mutators
   public BooleanFunc(int tableSize, boolean evalReturnIfError)
   {
      this.tableSize = tableSize;
      this.evalReturnIfError = evalReturnIfError;
      this.truthTable = new boolean[tableSize];
      this.state = evalReturnIfError;
   }

   public boolean setTruthTableUsingTrue(int[] inputsThatProduceTrue)
   {
      if (inputsThatProduceTrue.length > truthTable.length)
      {
         return false;
      }
      for (int num : inputsThatProduceTrue)
      {
         if (num < tableSize)
         {
            truthTable[num] = true;
         }
      }
      return true;
   }

   public boolean setTruthTableUsingFalse(int[] inputsThatProduceFalse)
   {
      if (inputsThatProduceFalse.length > truthTable.length)
      {
         return false;
      }
      for (int i = 0; i < truthTable.length; i++)
      {
         truthTable[i] = true;
      }
      for (int num : inputsThatProduceFalse)
      {
         if (num < DEFAULT_TABLE_SIZE)
         {
            truthTable[num] = false;
         }
      }
      return true;
   }

   public boolean eval(int input)
   {
      if (input > DEFAULT_TABLE_SIZE)
      {
         return evalReturnIfError;
      }
      state = truthTable[input];
      return state;
   }

   public boolean getState()
   {
      return this.state;
   }

   // Deep memory method and make a deep copy of truth table
   public Object clone() throws CloneNotSupportedException
   {
      BooleanFunc newObj = (BooleanFunc) super.clone();
      newObj.truthTable = new boolean[tableSize];
      for (int i = 0; i < tableSize; i++)
      {
         newObj.truthTable[i] = this.truthTable[i];
      }
      return newObj;
   }
}
