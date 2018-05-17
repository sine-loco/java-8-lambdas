package ru.snm.tutorials.java_8_lambdas;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;


/**
 * ThreadLocal lambda expressions.
 *
 * Java has a class called ThreadLocal that acts as a
 * container for a value that’s local to your current thread. In Java 8 there is a new
 * factory method for ThreadLocal that takes a lambda expression, letting you create
 * a new ThreadLocal without the syntactic burden of subclassing.
 * a. Find the method in Javadoc or using your IDE.
 * b. The Java DateFormatter class isn’t thread-safe. Use the constructor to create a
 * thread-safe DateFormatter instance that prints dates like this: “01-Jan-1970”.
 *
 * @author sine-loco
 */
public class Task02 {
    public static DateFormatter getFormatter() {
        ThreadLocal<DateFormat> dateFormat = ThreadLocal
                .withInitial( () -> DateFormat.getDateInstance( DateFormat.MEDIUM ) );

        return new DateFormatter( dateFormat.get() );
    }
}
