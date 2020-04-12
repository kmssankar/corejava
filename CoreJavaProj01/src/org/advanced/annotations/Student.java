/**
 * 
 */
package org.advanced.annotations;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(METHOD)
/**
 * @author Sankar
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Student {
	
	

}
