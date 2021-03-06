package bgu.spl.mics;

import java.util.concurrent.TimeUnit;

/**
 * A Future object represents a promised result - an object that will
 * eventually be resolved to hold a result of some operation. The class allows
 * Retrieving the result once it is available.
 * 
 * Only private methods may be added to this class.
 * No public constructor is allowed except for the empty constructor.
 */

/**
 *
 * @inv: (this.isDone()==true && this.value!= null) || (this.isDone()==false && this.value==null)
 */
public class Future<T> {

	private boolean resolved = false;
	private T value;
	public Future() {
		//TODO: implement this
	}
	
	/**
     * retrieves the result the Future object holds if it has been resolved.
     * This is a blocking method! It waits for the computation in case it has
     * not been completed.
     * <p>
     * @return return the result of type T if it is available, if not wait until it is available.
     * 	       
     */

	/**
	 * @pre: none
	 * @post this.isDone() == true
     * @post value!=null
	 * @post this.get == value
     */
	public T get() {
		//TODO: implement this.
		return null;
	}
	
	/**
     * Resolves the result of this Future object.
	 * @pre this.isDone() == false
	 * @pre this.value == null
	 * @post this.isDone() == true
	 * @post this.get() == result
     */
	public void resolve (T result) {
		//TODO: implement this.
	}
	
	/**
     * @return true if this object has been resolved, false otherwise
	 * @pre: none
	 * @post: resolved == this.isDone()
     */
	public boolean isDone() {
		//TODO: implement this.
		return false;
	}
	
	/**
     * retrieves the result the Future object holds if it has been resolved,
     * This method is non-blocking, it has a limited amount of time determined
     * by {@code timeout}
     * <p>
     * @param timout 	the maximal amount of time units to wait for the result.
     * @param unit		the {@link TimeUnit} time units to wait.
     * @return return the result of type T if it is available, if not, 
     * 	       wait for {@code timeout} TimeUnits {@code unit}. If time has
     *         elapsed, return null.
     */

	/**
	 *
	 * @pre: none
	 * @post: (this.isDone()==true && @pre(this.value) != null && @pre(this.value)==this.value) ||
	 * (@pre(this.isDone())==this.isDone() && this.isDone()==false && this.value == null && ?????? ?????????? ??????) ||
	 * (@pre(this.isDone())==false && @pre(this.value)==null && this.isDone()==true && this.value!=null)
	 */
	public T get(long timeout, TimeUnit unit) {
		//TODO: implement this.
		return null;
	}

}
