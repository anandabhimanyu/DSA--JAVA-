package Lecture4;

public class hcfOfNumbyGCD {
    
    public static void main(String[] args) {
        int dividend =60;
        int divisor =36;
        while (dividend % divisor !=0) {
            int rem = dividend % divisor;
            dividend =divisor;
            divisor = rem;
        }
        System.out.println(divisor);

        //Wecan also do this by FOr loop but for nu caluculation we will prefer while loop
    // for(;dividend % divisor !=0){
    //     int rem = dividend % divisor;
    //         dividend =divisor;
    //         divisor = rem;
    // }
    }

    
}
