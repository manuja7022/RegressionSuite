package practiceProgramDeepu;import org.checkerframework.checker.index.qual.SubstringIndexBottom;

public class Logic1 {

	public static void main(String[] args)
	{
		String str="idfcfirstbank";  //o/p  idf dfc fcf cfi fir irs rst stb tba ban ank

		for (int i = 0; i < str.length(); i++)
		{
			int m=i;
			int n=i+3;

			if(n<str.length())
			{
				System.out.println(str.substring(m,n));
			}
			else
			{
				System.out.println(str.substring(m));
				break;
			}

		}



	}

}
