//package testListener;
//
//import org.jacoco.core.instr.Instrumenter;
//import org.jacoco.core.runtime.IRuntime;
//import org.jacoco.core.runtime.LoggerRuntime;
//import org.jacoco.core.runtime.RuntimeData;
//import org.junit.runner.Description;
//import org.junit.runner.notification.RunListener;
//
//import java.io.InputStream;
//
//public class Listener extends RunListener {
//
//
//    @Override
//    public void testSuiteStarted(Description description) throws Exception {
//        System.out.println("CurrentClass: "+description.getClassName());
//        final String targetName = description.getClassName();
//        final IRuntime runtime = new LoggerRuntime();
//
//        // The Instrumenter creates a modified version of our test target class
//        // that contains additional probes for execution data recording:
//        final Instrumenter instr = new Instrumenter(runtime);
//        InputStream original = getTargetClass(description.getTestClass());
//        //c.getResourceAsStream(c.getName()+".class")
//        final byte[] instrumented = instr.instrument(original, targetName);
//        original.close();
//
//        // Now we're ready to run our instrumented class and need to startup the
//        // runtime first:
//        final RuntimeData data = new RuntimeData();
//        runtime.startup(data);
//    }
//
//    @Override
//    public void testRunStarted(Description description) throws Exception {
//        System.out.println("Current test is: "+description.getClassName());
//    }
//
//    @Override
//    public void testStarted(Description description) throws Exception {
//        System.out.println("Current test method is: "+description.getMethodName());
//    }
//    private InputStream getTargetClass(final Class c) {
//        final String resource =  c.getName() + ".class";
//        return c.getResourceAsStream(resource);
//    }
//}
