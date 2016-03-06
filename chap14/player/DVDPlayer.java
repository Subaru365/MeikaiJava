
public class DVDPlayer implements ExPlayer{

	@Override
	public void play() {
		System.out.println("DVD再生開始");
	}

	@Override
	public void stop() {
		System.out.println("DVD再生終了");		
	}

	@Override
	public void slow() {
		System.out.println("DVDスロー再生開始");		
	}

}
