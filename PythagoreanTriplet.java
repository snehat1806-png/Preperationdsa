public class PythagoreanTriplet{
//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public static void main(String[] args) {
    int a=3, b=4, c=5;
    if(isPythagoreanTriplet(a,b,c)){
        System.out.println(a+", "+b+", "+c+" form a Pythagorean triplet.");
    }else{
        System.out.println(a+", "+b+", "+c+" do not form a Pythagorean triplet.");
    }
    
}
static boolean isPythagoreanTriplet(int x,int y,int z){
    if((pow(x,2)+pow(y,2))==pow(z,2)){
        return true;
}
else if((pow(y,2)+pow(z,2))==pow(x,2)){
    return true;
}
else if((pow(z,2)+pow(x,2))==pow(y,2)){
    return true;
}
else{
    return false;
}

}
static int pow(int base,int exponent){
    int result=1;
    for(int i=1;i<=exponent;i++){
        result *= base;
    }
    return result;
}
}