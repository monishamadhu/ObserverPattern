package YouTubeChannel;

public class Follower implements Observer{
	private String followerName;
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}
	@Override
	public void update(String status) {
		//channel live		
	}
	public String getFollower() {
		return this.followerName;
	}
	public void setFollower(String name) {
		this.followerName = name;
	}
	public void play() {
		//play
	}
}
