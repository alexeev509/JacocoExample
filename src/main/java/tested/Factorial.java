package tested;

public class Factorial {
    public int factorial(int z){
        int factorial=1;
        for(int i =1; i<z; ++i){
            factorial*=i;
        }
        return factorial;
    }
}
