package tested;

public class StringOperations {
    public boolean equalsStrings(String a, String b){
        return a.compareTo(b)==0;
    }
}
//>mvn clean compile compiler:testCompile test -Dtest=MathOperationsTest#sum_2