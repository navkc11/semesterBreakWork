package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] arrExample = { 8, 12, 8, 25, 12 };
        Point x = new Point(4,6);
        Point y = new Point(8,2);
        Point z = new Point(10,5);
        Point[] dots = new Point[]{x, y, z};
        Date latest = new Date(3,8,2022);
        Date earliest = new Date(2,9,2021);
        Date middle = new Date(3,10,2021);
        Date[] dates = new Date[]{latest, earliest, middle};
//        //Targil 1
//        printRand();
//        //Targil 2
//        System.out.println(pow(7,7));
//        //Targil 3
//        System.out.println(countWords("kampus gan yavne"));
//        //Targil 4
//        System.out.println(netIncome(19500));
//        //Targil 5
//        System.out.println(sumArr(arrExample));
//        //Targil 6
//        System.out.println(arrDuplicates(arrExample));
//        //Targil 7
//        pointMerge(dots,dots);
//        //Targil 8
//        sharpestSlope(dots);
//        //Targil 9
//        ArrayList<Date> arranged = sortDates(dates);
//        for (Date d:arranged) {
//            System.out.println( d.day + "/"+ d.month+"/"+d.year+"\n");
//        }
    }

    //Targil 1
    public static void printRand() {
        for (int i = 1; i<=1000;i++){
            if(i%2==0^i%3==0) System.out.println(i + "\n");
        }
    }

    //Targil 2
    public static int pow(int a, int b){
        int result = 1;
        for (int i = 0; i<b; i++){
            result *= a;
        }
        return result;
    }

    //Targil 3
    public static int countWords(String str){
        if (str.equals("") || str.charAt(0)==' ') {
            System.out.println("Please enter words correctly");
            return 0;
        }
        int numWords = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                numWords++;
            }
        }
        return numWords;
    }

    //Targil 4
    public static double netIncome(int salary){
        if (salary <= 6290) return salary*0.9;
        else if (salary <= 9030) return salary*0.86;
        else if (salary <= 14490) return salary*0.8;
        else if (salary <= 20140) return salary*0.69;
        else if (salary <= 41910) return salary*0.65;
        else if (salary <= 53970) return salary*0.53;
        else return salary*0.5;
    }

    //Targil 5
    public static int sumArr(int[] arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }

    //Targil 6
    public static int arrDuplicates(int[] arr){
        Arrays.sort(arr);
        int duplicates = 0;
        for (int i = 0; i<arr.length-1; i++){
            if(i==0){
                if (arr[i] == arr[i + 1]) duplicates++;
            }
            else if(arr[i]!=arr[i-1]) {
                if (arr[i] == arr[i + 1]) duplicates++;
            }
        }
        return duplicates;
    }

    //Targil 7
    public static Point[] pointMerge(Point[] x, Point[] y){
        Point[] result = new Point[x.length+ y.length];
        for (int i = 0; i<x.length+y.length; i++){
            if (i<x.length){
                result[i] = x[i];
            }
            else result[i] = y[i- x.length];
        }
        return result;
    }

    //Targil 8
    public static void sharpestSlope(Point[] x){
        Point a = x[0];
        Point b = x[0];
        double sharpest = x[0].slope(x[1]);
        for (Point t:x) {
            for (int i = 0; i < x.length; i++){
                if (t.slope(x[i])>= sharpest){
                    a = t;
                    b = x[i];
                }
            }
        }
        System.out.println("x1 is "+ a.x + " y1 is "+ a.y+" x2 is "+b.x+" y2 is "+b.y);
    }

    //Targil 9
    public static ArrayList<Date> sortDates(Date[] dates){
        ArrayList<Date> list = new ArrayList<Date>();
        Collections.addAll(list, dates);
        list.sort(new Comparator<Date>() {
            @Override
            public int compare(Date o1, Date o2) {return o1.dateInDays().compareTo(o2.dateInDays());}
        });
        return list;
    }
    //Targil 10
    public static ArrayList<Date> earliestAverage(ArrayList<ArrayList<Date>> listOfDateLists){
        boolean first = true;
        int smallest = 0;
        int total = 0;
        ArrayList<Date> earliest = listOfDateLists.get(0);
        for (ArrayList<Date> dateList:listOfDateLists) {
            for (Date d:dateList) {
                total+=d.dateInDays();
            }
            if(total/dateList.size()<smallest || first){
                smallest = total/dateList.size();
                earliest = dateList;
                first = false;
            }
            total=0;
        }
        return earliest;
    }
}