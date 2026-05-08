public class p13 {
    //Calculate Batting Average
    public static void main(String[] args) {
        int totalRuns=500;//Total runs scored by the player in total number of times the player has batted.
        int totalInnings=20;//innings means the number of times the player has batted by the player.
        int notOuts=5;//not outs means the number of times the player has not been out.
        double battingAverage=(double)totalRuns/(totalInnings-notOuts);
        //Batting average is calculated by dividing the total runs scored by the number of times the player has been out (total innings - not outs).
        //In this case, the batting average will be 500/(20-5) = 33.33.
        //The batting average is then printed to the console.
        System.out.println("Batting Average is: "+battingAverage);
    }
}
