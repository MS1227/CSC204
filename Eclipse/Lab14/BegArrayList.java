import java.util.ArrayList;
public class BegArrayList
{
        public static void main(String[] args)
        {
                ArrayList<Integer> a = new ArrayList<Integer> ();


                for (int k = 0;  k < 10;  k++)
                        a.add (new Integer (k * k));


                a.set( 2 + 4 / 3 , -1);
                a.add(100, new Integer (-99));


                System.out.println(a);
                


        }
}
