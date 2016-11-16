package Classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JPMPC-B215 on 11/12/2016.
 */
public class MyMethods {
    /**
     * Gets the total number of students depending on the day and teacher
     * @param today the day today
     * @param teacher the teacher on that day
     * @return returns the total number of students
     */
    public static int getTotalNumOfStudents(String today, int teacher)
    {
        int numStudents = 20;

        if(today.equals("Monday"))
        {
            if(teacher == 1)
            {
                numStudents = 15;
            }
        }
        else
        {
            if(teacher == 2 || teacher == 4 || teacher == 5)
            {
                numStudents = 21;
            }
        }

        return numStudents;
    }

    public static boolean isVacation(boolean weekday, boolean holiday)
    {
        return holiday || !weekday;
    }

    public static int getNumSubjects(boolean regular, boolean working)
    {
        int numSubjects = 6;

        if(!working)
        {
            numSubjects = regular ? 7 : 5;
        }

        return numSubjects;
    }

    public static void testSwitch(int testVal)
    {
        switch(testVal)
        {
            case 1:
                System.out.println("Hi I'm Baymax");
            case 2:
                System.out.println("Your personal health care companion");
            case 3:
                System.out.println("Shutting down system!");
                break;
            default:
                System.out.println("This is not included in my database");
        }
    }

    public static void printSquareBrackets(int n)
    {
        int i = 1;
        while(i <= n)
        {
            System.out.print("[" + i + "] ");
            i++;
        }
    }

    public static void printSquareBracketsDW(int n)
    {
        int i = 1;
        do
        {
            System.out.print("[" + i + "] ");
            i++;
        }while(i <= n);
    }

    public static String getStrings(String[] str)
    {
        String res = "";
        for (int i = 0; i < str.length; i++)
        {
            res += str[i] + "; ";
        }

        return res;
    }

    public static int getSumOfInts(int n)
    {
        int sum = 0;
        int i = 1;
        while(i <= n)
        {
            sum += i;
            i++;
        }

        return sum;
    }

    public static String getRandomBoyFriend()
    {
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Richard");
        myFriends.add("Pogadz");
        myFriends.add("Amille");
        myFriends.add("Aldzer");
        myFriends.add("Adrian");
        myFriends.add("James");
        myFriends.add("Robert");
        return myFriends.get((int)(Math.random()*myFriends.size()));
    }

    public static String getRandomGirlFriend()
    {
        List<String> myFriends = new ArrayList<String>();
        myFriends.add("Kim");
        myFriends.add("Princess");
        myFriends.add("Camille");
        myFriends.add("Rose");
        myFriends.add("Jane");
        myFriends.add("Fe");
        myFriends.add("Irish");
        return myFriends.get((int)(Math.random()*myFriends.size()));
    }

    public static String getRandomRelationship()
    {
        List<String> relationships = new ArrayList<String>();
        relationships.add("loves");
        relationships.add("hates");
        relationships.add("had a crush on");
        relationships.add("admires");
        relationships.add("respects");
        relationships.add("acknowledged");
        relationships.add("enslaved");
        return relationships.get((int)(Math.random()*relationships.size()));
    }
}
