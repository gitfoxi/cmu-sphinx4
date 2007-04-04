package edu.cmu.sphinx.util.props.newconman;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * * A double property.
 *
 * @author Holger Brandl
 * @see edu.cmu.sphinx.util.props.newconman.ConMan
 */
@Retention(RetentionPolicy.RUNTIME)
@S4Property
public @interface S4Double {

    double defaultValue();


    double[] range() default {-Double.MAX_VALUE, Double.MAX_VALUE};
}
