package Abstract;

public class Businessman implements RichMan,SocialWorker {

	@Override
	public void earnMoney() {
		System.out.println("help to other ");
		
	}

	@Override
	public void donation() {
      System.out.println("earning money");
		
	}

	@Override
	public void party() {
	 System.out.println("doing party");
		
	}
public void helpToOther() {
	System.out.println("property");
}
}
