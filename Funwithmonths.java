public class Funwithmonths {
    //Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
    public static void main(String[] args) {
        int month=8;
        int year=2024;
        int daysInMonth=0;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            daysInMonth=31;
        }else if(month==4 || month==6 || month==9 || month==11){
            daysInMonth=30;
        }else if(month==2){
            if((year%4==0 && year%100!=0) || (year%400==0)){
                daysInMonth=29;
            }else{
                daysInMonth=28;
            }
        }
        int evenDays=daysInMonth/2;
        System.out.println("Kunal can go out with his friends on "+evenDays+" days in the month of August.");
    }
}
