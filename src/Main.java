import Classes.MyMethods;

public class Main
{

    public static void main(String[] args)
    {
        /*
        String x = "abcdef";
        for (int i = 0; i < 5; i++) {
            System.out.print(x.substring(i, i+2) + " ");
        }

        byte byteVariable = 127;
        short mediumRangeDecimalVariable = 32767;
        int decimalVariableUpTo = 2147483647;
        long largeDecimalVariableFrom = -9223372036854775808L;
        long largeDecimalVariableUpTo = 9223372036854775807L;
        float numberWithDecimalPlaces = 8.2f;
        double veryLargeNumberWithDecimalPlaces = 12312312.1232;
        boolean isTrueOrFalse = true;
        char singleCharacter = '\u0041';
        String name = "Aldzer";

        int grades[] = new int[5];
        grades[0] = 95;
        grades[1] = 97;
        grades[2] = 94;
        grades[3] = 99;
        grades[4] = 93;

        String errorMessages[] = new String[3];
        errorMessages[0] = "Love not found! </3";
        errorMessages[1] = "Gwapo not found! x_X";
        errorMessages[2] = "Bata not found! O.o";

        //decimalVariableUpTo = largeDecimalVariableUpTo;
        //largeDecimalVariableUpTo = decimalVariableUpTo;

        System.out.println("byteVariable =" + byteVariable);
        System.out.println("mediumRangeDecimalVariable=" + mediumRangeDecimalVariable);
        System.out.println("decimalVariableUpTo=" + decimalVariableUpTo);
        System.out.println("largeDecimalVariableFrom=" + largeDecimalVariableFrom);
        System.out.println("largeDecimalVariableUpTo=" + largeDecimalVariableUpTo);
        System.out.println("numberWithDecimalPlaces=" + numberWithDecimalPlaces);
        System.out.println("veryLargeNumberWithDecimalPlaces=" + veryLargeNumberWithDecimalPlaces);
        System.out.println("isTrueOrFalse=" + isTrueOrFalse);
        System.out.println("singleCharacter=" + singleCharacter);
        System.out.println("My name is " + name);
        System.out.println("grades[0]= " + grades[0]);
        System.out.println("grades[1]= " + grades[1]);
        System.out.println("grades[2]= " + grades[2]);
        System.out.println("grades[3]= " + grades[3]);
        System.out.println("grades[4]= " + grades[4]);

        System.out.println("Error 143: " + errorMessages[0]);
        System.out.println("Error 66: " + errorMessages[1]);
        System.out.println("Error 163: " + errorMessages[2]);
        *//*
        Person student = new Person("Aldzer");
        //student.setName("Aldzer");
        student.setAge(23);
        student.setGender(true);
        student.setHeight(168.7);
        student.setWeight(59.3);
        student.setEmail("aldzer.mb@gmail.com");

        System.out.println("My name is " + student.getName() + ".");
        System.out.print("I'm " + student.getAge() + " yrs. old.");
        System.out.print(" I'm a " + ((student.isGenderMale())?"male":"female"));
        System.out.print(" with a weight of " + student.getWeight() + "kgs.");
        System.out.println(" and a height of " + student.getHeight() + "cm.");
        System.out.println("You can email me at " + student.getEmail() + ".");
        *//*
        Employee cashier = new Employee();
        cashier.setEmployeeId(235666);
        cashier.setDepartment("Foreign Affairs");
        cashier.setSssId(876324238);
        cashier.setPagibigId(89362);
        cashier.setName("Shiela");
        cashier.setAge(22);
        cashier.setGender(false);
        cashier.setHeight(149.7);
        cashier.setWeight(52.4);
        cashier.setEmail("shiela.walawala@gmail.com");

        System.out.println("My name is " + cashier.getName() + ".");
        System.out.print("I'm " + cashier.getAge() + " yrs. old.");
        System.out.print(" I'm a " + ((cashier.isGenderMale())?"male":"female"));
        System.out.print(" with a weight of " + cashier.getWeight() + "kgs.");
        System.out.println(" and a height of " + cashier.getHeight() + "cm.");
        System.out.println("You can email me at " + cashier.getEmail() + ".");
        System.out.println("Info:");
        System.out.println(" Employee ID: " + cashier.getEmployeeId());
        System.out.println(" Department: " + cashier.getDepartment());
        System.out.println(" SSS ID: " + cashier.getSssId());
        System.out.println(" PAG-IBIG ID: " + cashier.getPagibigId());

        Customer vip = new Customer();
        vip.setCustomerID(382324);
        vip.setMembershipLevel(1);
        vip.setCreditCardNumber(823299295);
        vip.setName("Richard");
        vip.setAge(25);
        vip.setGender(true);
        vip.setHeight(157.9);
        vip.setWeight(72.4);
        vip.setEmail("richard.bayot@gmail.com");
        vip.setAddress("Sitio Baho");

        System.out.println("My name is " + vip.getName() + ".");
        System.out.print("I'm " + vip.getAge() + " yrs. old.");
        System.out.print(" I'm a " + ((vip.isGenderMale())?"male":"female"));
        System.out.print(" with a weight of " + vip.getWeight() + "kgs.");
        System.out.println(" and a height of " + vip.getHeight() + "cm.");
        System.out.println("You can email me at " + vip.getEmail() + ".");
        System.out.println("Info:");
        System.out.println(" Customer ID: " + vip.getCustomerID());
        System.out.println(" Membership Level: " + vip.getMembershipLevel());
        System.out.println(" Credit Card Number: " + vip.getCreditCardNumber());

        System.out.println("Hi! I'm " + cashier.introduceYourSelf(cashier.getName(), cashier.getDepartment()));
        System.out.println("Hi! I'm " + vip.introduceYourSelf(vip.getName(), vip.getAddress()));

        int num = 2;

        if(num < 3)
        {
            System.out.println("number is less than 3");
        }
        else
        {
            System.out.println("number is greater than or equal to three");
        }

        System.out.println("***********************Saturday Activity*************************");
        */
        /*
        Problem # 1
         */
        System.out.println("Problem 1:");

        String subjects[] = {"Math", "English", "Science", "Object Oriented Programming", "Server Maintenance"};
        String days[] = {"Monday", "Tuesday"};
        String today = days[0];
        int teacher = 1;

        System.out.println("Today is " + today + "!");
        System.out.println("Current subject is " + subjects[teacher - 1] + " and Teacher " + teacher + " has a total of " + MyMethods.getTotalNumOfStudents(today, teacher) + " students.");

        /*
        Problem # 2
         */
        System.out.println("Problem 2:");
        boolean weekday = true;
        boolean holiday = true;

        System.out.println((weekday ? "Weekday" : "Weekend") + (holiday ? " and it's holiday" : "") + " = " + (MyMethods.isVacation(weekday, holiday) ? "" : "not ") + "vacation");

        /*
        Problem # 3
         */
        boolean regular = false;
        boolean working = true;
        System.out.println("Problem 3:");
        System.out.println((regular ? "Regular" : "Irregular") + " student" + (working ? " but working part-time in school" : "") + " = " + MyMethods.getNumSubjects(regular, working) + " subjects");

        MyMethods.testSwitch(4);
        MyMethods.printSquareBrackets(9);
        System.out.println();
        MyMethods.printSquareBracketsDW(5);
        System.out.println();
        /*
        Problem # 4
         */
        System.out.println("Problem 4:");
        int n = 9;
        System.out.println("\nThe sum of 1 - " + n + " is " + MyMethods.getSumOfInts(n));

        /*
        Problem # 5
         */
        String planets[] = {"Mercury","Venus","Earth","Mars","Saturn"};
        System.out.println("The first five planets are: " + MyMethods.getStrings(planets));
        System.out.println(planets[1]);

        int  rand = (int)(Math.random()*2);
        boolean boyFirst = rand == 1;
        System.out.println((boyFirst ? MyMethods.getRandomBoyFriend() : MyMethods.getRandomGirlFriend()) + " " + MyMethods.getRandomRelationship() + " " + (boyFirst ? MyMethods.getRandomGirlFriend() : MyMethods.getRandomBoyFriend()));
    }
}
