
public class Calculator {
	
	public static int CalculateSumm(int... numbresOfSumm)
	{
		int summ=0;
		for (int i = 0; i < numbresOfSumm.length; i++) {
			summ+=numbresOfSumm[i];	
		}
		return summ;
	}
	public static int CalculateMylt(int... numbresOfSumm)
	{
		int summ=1;
		for (int i = 0; i < numbresOfSumm.length; i++) {
			summ*=numbresOfSumm[i];	
		}
		return summ;
	}
}
