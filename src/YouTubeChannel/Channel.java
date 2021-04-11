package YouTubeChannel;

import java.util.ArrayList;

public class Channel implements Subject{
	private String channelName;
	private String status;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer ob) {
		this.observers.add(ob);
		
	}

	@Override
	public void removeObserver(Observer ob) {
		this.observers.remove(ob);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(this.status);
		}
		
	}
	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

}
