package com.poc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Year;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;


/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 12 2023
 */
public class Solution {
    public boolean basicMethod(int number){
        if (number > 2 ) return true;
        return false;
    }


    public Date calculateGigaSecond(Date startDate) throws ParseException {

        //gigasecond == thousand million seconds
        Long addSeconds = 10000000000L;

        //If you were born on January 24th, 2015 at 22:00 (10:00:00pm),
        // then you would be a gigasecond old on
        // October 2nd, 2046 at 23:46:40 (11:46:40pm).

        final String dateStr = "2015-01-24 22:00:00";
        final DateFormat df = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss", Locale.ENGLISH);
        final Date date = df.parse(dateStr);


        System.out.println(date.toString());


        return null;
    }


}
