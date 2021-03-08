package Controller;

public class threadId extends Thread{
	private long IdThread;
	
	public threadId() {
		this.IdThread =getId();
	}
	
	@Override
	public void run(){
		System.out.println(IdThread);
	}

}
