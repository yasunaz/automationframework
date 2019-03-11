package base;

public abstract class PageBase {
	protected void waitfor(int seocnds) {
		try {
			Thread.sleep(seocnds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public void hello() {
		int num = 4;
	}

}
