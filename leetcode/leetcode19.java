//https://leetcode.com/problems/maximum-population-year/submissions/2014190549/
public class leetcode19{
    public static void main(String[] args){
        int[][] logs={{1993,1999},{2000,2010}};
        int result=maximumPopulation(logs);
        System.out.println(result);
    }
    static int maximumPopulation(int [][] logs){
     int population[]=new int[101];//to store the population of each year from 1950 to 2050
     for(int log[]:logs){
        int birth=log[0];
        int death=log[1];
        population[birth-1950]++;//increment the population for the birth year
        population[death-1950]--;//decrement the population for the death year
     }
     int maxpopulation=0;
     int maxyear=1950;
     int currentpopulation=0;
     
     for(int i=0;i<101;i++){
        currentpopulation+=population[i];
        if(currentpopulation>maxpopulation){
            maxpopulation=currentpopulation;
            maxyear=1950+i;
        }
    }
    return maxyear;
        }
    }
