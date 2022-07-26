package bgu.spl.mics;


/**
 * The {@link MessageBusImpl class is the implementation of the MessageBus interface.
 * Write your implementation here!
 * Only private fields and methods can be added to this class.
 */
public class MessageBusImpl implements MessageBus {


	/**
	 * @pre: isRegistered(m) == true
	 * @pre: isSubscribedToEvent(type, m) == false
	 * @post isSubscribedToEvent(type, m) == true
	 */
	public <T> void subscribeEvent(Class<? extends Event<T>> type, MicroService m) {
		// TODO Auto-generated method stub

	}

	/**
	 * @pre isRegistered(m) == true
	 * @post isSubscribedToBroadcast(type, m) == true
	 */
	public void subscribeBroadcast(Class<? extends Broadcast> type, MicroService m) {
		// TODO Auto-generated method stub

	}

	/**
	 * @pre: e.isDone()==false
	 * @post: e.isDone()==true
	 * @post: futureOfe.get == result
	 */
	public <T> void complete(Event<T> e, T result) {
		// TODO Auto-generated method stub

	}

	public <T> boolean isComplete(Event<T> e){
		return false;
	}


	/**
	 * @pre: none
	 * @post: each MicroService that subscribed to the Broadcast type wll get it
	 */
	public void sendBroadcast(Broadcast b) {
		// TODO Auto-generated method stub

	}

	/**
	 * @pre: none
	 * @post: one MicroService that subscribed to the event type wll get it
	 * @post: the microservice got mew Future Object
	 */
	public <T> Future<T> sendEvent(Event<T> e) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @pre isRegistered(m) == false
	 * @post isRegistered(m) == true
	 */
	public void register(MicroService m) {
		// TODO Auto-generated method stub
	}

	/**
	 * @pre isRegistered(m) == true
	 * @post isRegistered(m) == false
	 */
	public void unregister(MicroService m) {
		// TODO Auto-generated method stub
	}

	/**
	 * @pre: isRegistered(m) == true
	 * @post: microservice get message, else he's waiting
	 */
	public Message awaitMessage(MicroService m) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean isRegistered(MicroService m){
		return false;
	}

	public boolean isSubscribedToBroadcast(Class<? extends Broadcast> type, MicroService m) {
		return false;
	}

	public <T> boolean isSubscribedToEvent(Class<? extends Event<T>> type, MicroService m){
		return false;
	}

	public boolean gotMessage(Message message, MicroService m){
		return false;
	}
}

