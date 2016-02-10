/**
   This class models a tally counter.
*/
public class Counter
{
   private int value;
   //Constructor wit no arguments
   public Counter()
   {
	   value = 0;
   }

   public Counter(int i)
   {
	   value = i;
}

/**
      Gets the current value of this counter.
      @return the current value
   */
   public int getValue()
   {
      return value;
   }

   /**
      Advances the value of this counter by 1.
   */
   public void click() 
   {
      value = value + 1;
   }

   /**
      Resets the value of this counter to 0.
   */
   public void reset()
   {
      value = 0;
   }
}