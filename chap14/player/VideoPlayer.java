
public class VideoPlayer implements Playar {
	private int id;
	private static int count = 0;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	@Override
	public void play() {
		System.out.println("ビデオ再生開始");
	}

	@Override
	public void stop() {
		System.out.println("ビデオ再生終了");
	}
	
	public void printInfo() {
		System.out.println("本機の製造番号は[" + id + "です。");
	}
}
