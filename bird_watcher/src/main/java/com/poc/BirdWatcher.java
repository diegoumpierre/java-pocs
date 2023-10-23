package com.poc;

import java.time.DayOfWeek;

/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
public class BirdWatcher {
    private final int[] birdsPerDay;
    private int today = DayOfWeek.MONDAY.getValue();

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[today -1];
    }

    public void incrementTodaysCount() {
        if (today == DayOfWeek.SATURDAY.getValue()){
            today = DayOfWeek.MONDAY.getValue();
        }else {
            today++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if (0 ==birdsPerDay[i]) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i=0;i<numberOfDays;i++){
            sum += birdsPerDay[i];
        }
        return sum;
    }

    //Some days are busier that others. A busy day is one where five or more birds have visited your garden.
    public int getBusyDays() {
        int sum = 0;
        for(int i=0;i<birdsPerDay.length;i++){
            if (birdsPerDay[i] >= 5) sum++ ;
        }
        return sum;
    }
}
