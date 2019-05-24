package javaapplication1;
public class MyInteger 
{
    int value;
    
    MyInteger(int value)
    {
        this.value = value;
    }
    
    int getValue()
    {
        return value;
    }
    
    boolean isEven()
    {
        if(value%2 == 0)
            return true;
        
        return false;
    }
    boolean isOdd()
    {
        if(value%2 == 1)
            return true;
        
        return false;
    }
    boolean isPrime()
    {
        if(value == 2)  //if the number is 2 it's prime
            return true;
        
        for(int i = 2; i < value; i++)  //checks if int is divisible evenly
                                        //by any # other than 1 and itself
            if(value%i == 0)
                return false;
        
        return true;
    }
    
    static boolean isEven(int value)
    {
        if(value%2 == 0)
            return true;
        
        return false;
    }
    static boolean isOdd(int value)
    {
        if(value%2 == 1)
            return true;
        
        return false;
    }
    static boolean isPrime(int value)
    {
        if(value == 2)  //if the number is 2 it's prime
            return true;
        
        for(int i = 2; i < value; i++)  //checks if int is divisible evenly
                                        //by any # other than 1 and itself
            if(value%i == 0)
                return false;
        
        return true;
    }
    
    static boolean isEven(MyInteger value)
    {
        return value.isEven();
    }
    static boolean isOdd(MyInteger value)
    {
        return value.isOdd();
    }
    static boolean isPrime(MyInteger value)
    {
        return value.isPrime();
    }
    
    boolean equals(int value)
    {
        if(this.value == value)
            return true;
        
        return false;
    }
    boolean equals(MyInteger value)
    {
        return value.equals(this.value);
    }
    
    static int parseInt(String phrase)
    {
        return Integer.parseInt(phrase);
    }
}
