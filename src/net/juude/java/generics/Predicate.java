package net.juude.java.generics;

/**
 * Determines a true or false value for a given input.
 *
 * <p>The {@link Predicates} class provides common predicates and related utilities.
 *
 * <p>See the Guava User Guide article on <a href=
 * "http://code.google.com/p/guava-libraries/wiki/FunctionalExplained">the use of {@code
 * Predicate}</a>.
 *
 * @author Kevin Bourrillion
 * @since 2.0
 */
public interface Predicate<T> {

  boolean apply( T input);

  @Override
  boolean equals(Object object);
}