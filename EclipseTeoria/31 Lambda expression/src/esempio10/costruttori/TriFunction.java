package esempio10.costruttori;

/**
 * 
 * TriFunction is a functional interface that represents a function with three
 * input arguments and produces a result of type R.
 * 
 * @param <T> the type of the first input argument
 * @param <U> the type of the second input argument
 * @param <V> the type of the third input argument
 * @param <R> the type of the result
 * @author michelemazzaa
 */
public interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}
