import org.apache.maven.shared.invoker.*;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class RunMvnCommand {
    public static void main(String[] args) throws IOException, MavenInvocationException {
        //Runtime.getRuntime().exec("cmd \\c mvn clean");
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile( new File( "C:\\Users\\alexe\\IdeaProjects\\JacocoExample\\pom.xml" ) );
        request.setGoals( Collections.singletonList( "test -Dtest=TestQ#q" ) );

        Invoker invoker = new DefaultInvoker();
        invoker.execute( request );
    }
}
