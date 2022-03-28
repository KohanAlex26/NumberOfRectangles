import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        List<Pair<Integer, Integer>> points=new ArrayList<Pair<Integer, Integer>>();
        points.add(new Pair<Integer, Integer>(1,1));
        points.add(new Pair<Integer, Integer>(1,3));
        points.add(new Pair<Integer, Integer>(2,1));
        points.add(new Pair<Integer, Integer>(2,3));
        points.add(new Pair<Integer, Integer>(3,1));
        points.add(new Pair<Integer, Integer>(3,3));



    for(Pair<Integer,Integer> x:points)
    {
        for(Pair<Integer,Integer> y:points)
        {
            Pair<Integer, Integer> p1 = x;
            Pair<Integer, Integer> p2 = y;

            if(p1.first!=p2.first && p1.second!=p2.second) {
                Boolean ok1 = false;
                Boolean ok2 = false;


                Pair<Integer, Integer> p3 = new Pair(p1.first, p2.second);
                Pair<Integer, Integer> p4 = new Pair(p2.first, p1.second);
//                System.out.println(p1+" "+p2+" "+p3 + " " + p4);


                for(Pair<Integer,Integer> p:points)
                {
                    if(p3.equals(p))
                        ok1=true;
                }

                for(Pair<Integer,Integer> p:points)
                {
                    if(p4.equals(p))
                        ok2=true;
                }

                if (ok1 && ok2)
                    ++answer;

//                System.out.println(answer);
            }
        }
    }


        System.out.println(answer/4);
    }
}
