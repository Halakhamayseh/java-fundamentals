/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Library {



        public static void main(String[] args) {
            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            int[][] arraytest2 = {
                    {1, 2, 3},
                    {3, 3, 3}
            };
            ///////////////////tally funactions///////////////
            //List<String> votes = new ArrayList<>();
            //votes.add("Bush");
            //votes.add("Bush");
            //votes.add("Bush");
            //votes.add("Shrub");
            //votes.add("Hedge");
            //votes.add("Shrub");
            //votes.add("Bush");
            //votes.add("Hedge");
            //votes.add("Bush");
            //String winner = tally(votes);
            //System.out.println(winner + " received the most votes!");
            ///////////////////////////////////////////////////////////
            //int[] testroll = roll(6); done
            //System.out.println(Arrays.toString(testroll));
            int[] containsDuplicatestest1 = {3, 4, 2};
            int[] containsDuplicatestest2 = {1, 2, 3, 4, 5, 6, 7, 8};
            //containsDuplicatestest1.contains(containsDuplicatestest2));
            //int[] testCalculatingAverages = CalculatingAverages(containsDuplicatestest1);

            //System.out.println(containsDuplicates(containsDuplicatestest1)); done
            //System.out.println(CalculatingAverages(containsDuplicatestest1));
            // int[] testArraysOfArrays = ArraysOfArrays(weeklyMonthTemperatures);
            //System.out.println(testArraysOfArrays));
            String weeklyMonthTemperaturestest = weeklyMonthTemperaturesFuncation(weeklyMonthTemperatures);
            System.out.println((weeklyMonthTemperaturestest));//done
           int[] testArraysOfArrays = ArraysOfArrays(weeklyMonthTemperatures);
            System.out.println(Arrays.toString(testArraysOfArrays)); //finally done

        }

        public static int[] roll(int number) {
            int[] newArr = new int[number];
            int minimum = 1;
            int maximum = 6;

            for (int i = 0; i < number; i++) {
                int randomNum = minimum + (int) (Math.random() * maximum);
                newArr[i] = randomNum;
            }
            return newArr;
        }

        public static Boolean containsDuplicates(int[] containArray) {
            //int[] NewContainArray = new int[containArray.length];
            //System.out.println(Arrays.toString(NewContainArray));
            //List<Integer> NewContainArrays= new ArrayList<Integer>();
            //NewContainArrays.contains());
            int indexi = 0;
            int indexj = 0;
            for (int i : containArray) {
                //System.out.println(Arrays.toString(containArray));
                //System.out.println((containArray[0]));
                indexi++;
                for (int j : containArray) {
                    indexj++;
                    //System.out.println((containArray[indexi-1]));
                    //System.out.println((containArray[indexj]));
                    if (i != j) {
                        //System.out.println(i);
                        //System.out.println(j);
                        if (containArray[indexi] == containArray[indexj]) {
                            //System.out.println((containArray[indexi]));
                            //System.out.println((containArray[indexj]));

                            return true;
                        }
                    }
                }
            }
            return false;

        }

        public static float CalculatingAverages(int[] CalculatingArray) {
            int totals = 0;
            for (int i : CalculatingArray) {
                totals += i;

            }
            return totals / (CalculatingArray.length);
        }

        public static int[] ArraysOfArrays(int[][] CalculatingArrayOfArrays) {
            //int []arr2=CalculatingArrayOfArrays[0];
            List<Integer> CalculatingArrayOfArray = new ArrayList<Integer>();
            int[] arr2 = new int[CalculatingArrayOfArrays.length];
            int[] arrI = new int[CalculatingArrayOfArrays[0].length];
            //int indexi=0;
            //int indexj=0;
            //int indexf=0;
            //int indexm=0;

            for (int i = 0; i < CalculatingArrayOfArrays.length; i++) {
                int total = 0;
                int avg = 0;
                int index = 0;
                for (int j = 0; j < CalculatingArrayOfArrays[i].length; j++) {

                    total += CalculatingArrayOfArrays[i][j];
                    avg = total / (CalculatingArrayOfArrays[i].length);

                    arr2[i] = (avg);
                    index++;

                }

                System.out.println((Arrays.toString(arrI)));


            }
            int indexofmin = 0;
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    if (j != k) {
                        if (j < k) {

                            //System.out.println("arr2[j]"+arr2[j]);
                            // this way to find indexof after find min
                            indexofmin = Ints.indexOf(arr2, arr2[j]);
                            System.out.println("indexof" + indexofmin);
                        }
                    }
                }
            }


            //for (int f : arr2) {
            // indexf++;
            //for (int m : arr2) {
            //  indexm++;
            // if(f!=m){

            //System.out.println(f);
            //System.out.println(arr2[indexf]);
            // if (f < m){
            //System.out.println("t");
            // f=m;
            // }else{//System.out.println("ll");
            // }
            // }

            // }

            // }
//int lowestAverage=arr2[0];
            //System.out.println(lowestAverage);
            //ArrayList<Integer>lowestAverageArray=new ArrayList<Integer>();
            //lowestAverageArray.add(lowestAverage);
            //System.out.println(lowestAverageArray);
            System.out.println(Arrays.toString(CalculatingArrayOfArrays[indexofmin]));
            return CalculatingArrayOfArrays[indexofmin];
        }

        public static String weeklyMonthTemperaturesFuncation(int[][] weeklyMonthTemperaturesArrays) {
            //create array with hashset to add unique values
            int notSeen=0;
            Set<Integer> unique = new HashSet<Integer>();

            // make 2 for loop to access elements and the added to array
            for (int i = 0; i < weeklyMonthTemperaturesArrays.length; i++) {
                for (int j = 0; j < weeklyMonthTemperaturesArrays[i].length; j++) {
                    unique.add(weeklyMonthTemperaturesArrays[i][j]);
                }
                //find min,max in array using Collections
                int min = Collections.min(unique);
                int max = Collections.max(unique);
                //System.out.println("low: " + min);
                //System.out.println("high: : " + max);
                //iterate from the min temp to the max temp and create a String containing any temperature

                for ( notSeen=min; notSeen <= max; notSeen++) {
                    if (!unique.contains(notSeen)) {
                        System.out.println("Never saw temperature: " + notSeen);
                    }
                }
            }

            String result = "Never saw temperature: " + notSeen;

            return result;
        }

        public static void tally(String[]ListString) {


         }

    }

