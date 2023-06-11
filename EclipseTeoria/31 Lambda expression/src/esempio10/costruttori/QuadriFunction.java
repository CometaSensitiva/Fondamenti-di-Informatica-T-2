package esempio10.costruttori;

/**
 * 
 * QuadriFunction is a functional interface that represents a function with four
 * input arguments and produces a result of type R.
 * 
 * @param <T> the type of the first input argument
 * @param <U> the type of the second input argument
 * @param <V> the type of the third input argument
 * @param <W> the type of the fourth input argument
 * @param <R> the type of the result
 * @author michelemazzaa
 */
public interface QuadriFunction<T, U, V, W, R> {
	R apply(T t, U u, V v, W w);
}