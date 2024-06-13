/*
 * Data Structures and Algorithms--Greedy
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aditya Ranjan Sahoo <adityaen.official101@gmail.com>
 */
import java.util.*;
class Interval implements Comparable<Interval>{
    int start,end;
    public Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    public int compareTo(Interval next){
        return this.end-next.end;
    }
}

public class Interval_Scheduling {
    public static List<Interval> interval_Scheduling(List<Interval> intervals){
        Collections.sort(intervals);
        List<Interval> result=new ArrayList<>();
        int currentEnd=-1;
        for(Interval interval:intervals){
            if(interval.start>=currentEnd){
                result.add(interval);
                currentEnd=interval.end;
            }
        }
        return result;
    }
    
    public static void main(String[] args){
        List<Interval> list=new ArrayList<>();
        list.add(new Interval(1,4));
        list.add(new Interval(2,3));
        list.add(new Interval(3,8));
        list.add(new Interval(4,7));
        list.add(new Interval(7,8));
        Interval_Scheduling IS=new Interval_Scheduling();
        List<Interval> scheduled_intervals=IS.interval_Scheduling(list);
        System.out.println("Selected Intervals: "+scheduled_intervals.size());
        for(Interval interval: scheduled_intervals){
            System.out.println(interval.start+"-->"+interval.end);
        }
                
    }

}
