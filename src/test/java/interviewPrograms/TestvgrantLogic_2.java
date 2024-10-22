package interviewPrograms;

public class TestvgrantLogic_2 {
	String[] srr= {"java","selenium","appium","sql","manual"};

	public static void main(String[] args) 
	{
       
		TestvgrantLogic_2 logic =new TestvgrantLogic_2();
		logic.pop();
		logic.pull();
	}

	public  void pop()
	{
		System.out.println(srr[srr.length-1]);
	}
	
	public void pull()
	{
		System.out.println(srr[srr.length-2]);
	}
}
