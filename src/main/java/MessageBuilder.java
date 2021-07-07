
//https://mkyong.com/maven/maven-jacoco-code-coverage-example/
//https://www.jacoco.org/jacoco/trunk/doc/repo.html
public class MessageBuilder {
    public String getMessage(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        return result.toString();
    }

    void choise() {
        int i = 1;
        switch (i) {
            case 1:
                i += 1;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

}
