package org.levi.engine;
import org.apache.ode.jacob.JacobRunnable;
/**
 * Hello world!
 *
 */
public class App extends JacobRunnable
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    @Override
    public void run() {
        System.out.println("Testing...");
    }
}
