package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;
import ru.javawebinar.topjava.model.UserMealWithExceed;


import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(6, 0), LocalTime.of(11, 0), 2000);

        //.toLocalDate();
        // .toLocalTime();
    }

    public static List<UserMealWithExceed> getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {

        UserMealWithExceed userMealWithExceed;
        List<UserMealWithExceed> Fls = new <UserMealWithExceed>ArrayList();
/*
            for (UserMeal um : mealList
            ) {
                if (TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime)) // требуется доработка
                { System.out.println(um.getDescription());
                    System.out.println(um.getDateTime());
                    System.out.println(um.getCalories());

                } else continue;

                if (um.getCalories() < caloriesPerDay) {
                    userMealWithExceed = new UserMealWithExceed(um.getDateTime(), um.getDescription(), um.getCalories(), true);
                    System.out.println(userMealWithExceed.getCalories());
                    System.out.println(userMealWithExceed.getExceed());
                    Fls.add(userMealWithExceed);

                } else {
                    userMealWithExceed = new UserMealWithExceed(um.getDateTime(), um.getDescription(), um.getCalories(), false);
                    Fls.add(userMealWithExceed);
                    System.out.println(userMealWithExceed.getDateTime());
                    System.out.println(userMealWithExceed.getCalories());
                    System.out.println(userMealWithExceed.getExceed());
                }


            } return Fls;



 */
        for (UserMeal um : mealList
        ) {
            if (TimeUtil.isBetween(um.getDateTime().toLocalTime(), startTime, endTime)) // требуется доработка
            {
                // System.out.println(um.getDescription());
                // System.out.println(um.getDateTime());
                //  System.out.println(um.getCalories());

            }else continue;


            if (um.getCalories() < caloriesPerDay) {
                userMealWithExceed = new UserMealWithExceed(um.getDateTime(), um.getDescription(), um.getCalories(), true);
                //System.out.println(userMealWithExceed.getCalories());
                // System.out.println(userMealWithExceed.getExceed());
                Fls.add(userMealWithExceed);

            } else {
                userMealWithExceed = new UserMealWithExceed(um.getDateTime(), um.getDescription(), um.getCalories(), false);
                Fls.add(userMealWithExceed);
                // System.out.println(userMealWithExceed.getDateTime());
                // System.out.println(userMealWithExceed.getCalories());
                // System.out.println(userMealWithExceed.getExceed());
            }


        }
/*
        for (UserMealWithExceed s: Fls
        )
        {
            UserMeal ms = new UserMeal(s.getDateTime(),s.getDescription(),s.getCalories());


            if(ms.getCalories() < caloriesPerDay) {


                ms.getCalories();

            }else
            {ms.getDate.plusDays(1);}







 */

return Fls;
    }
}

