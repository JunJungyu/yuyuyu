package java1.ch8인터페이스;

public abstract class Audio implements Rmotecontrol{
	
	private int volume;
	@Override
	public void turnOn() {System.out.println("오디오를 켭니다.");}
	@Override
	public void turnOFf() {System.out.println("오디오를 끕니다");}
	public void setVOLUME( int volume ) {
		if( volume > Rmotecontrol.MAX_VOLUME ) {
			this.volume = Rmotecontrol.MAX_VOLUME;
		}else if( volume < Rmotecontrol.MIN_VOLUME ) {
			this.volume = Rmotecontrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
			
	}
}
