import java.util.Scanner;

public class Golomb_code {

	public static void  main(String args[]) {
		int  M=0, N=0, r, q=0, bb;
		String Q = "1", R=null;
		float b=0;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Enter M:");
		M = x.nextInt();
		System.out.println("Enter N:");
		N = x.nextInt();
		
		q = ( N / M );
		//System.out.println("q="+q);
		r = ( N % M );
		//System.out.println("r="+r);
		
		if(q!=0)
		{
			for(int i=1; i<q ;i++)
			{
				Q= Q+1; 
			}
		}
		else if (q==0)
			Q="";
		
		Q=Q+0;
		
		b = (float) (Math.log10(M) / 0.3010);
		 bb = (int) b+1;
		//System.out.println("BB=" + bb);
		
		double ee =Math.pow((double)2, (double)bb);
		//System.out.println("ee=" + ee);
		double e = ee - M;
		 //System.out.println("e=" + e);
		
		if(r  < e)
		{
			//System.out.println("if");
			R=Integer.toBinaryString(r);
			String RR = R.toString();
			
			int RRlen = RR.length();
			//System.out.println("Before length = "+ RRlen);
			RRlen = 8 - RRlen;
			//System.out.println("After length = "+ RRlen);
			String hp="0";
			for (int i=1; i<RRlen;i++)
			{
				hp = hp+"0";
			}
			
			
			//System.out.println("R=" + R);
			bb = bb-1; 
			RR = hp+RR;
			//System.out.println("New RR= " + RR);
			
			if(RR.length() != bb)
			{
				int l = RR.length() - bb;
				//System.out.println("RR Length="+RR.length());
				
				R = RR.substring(l);
			}
		}
		else if (r >= e)
		{
			//System.out.println("else");
			R=Integer.toBinaryString((int) (r+bb));
			//R=R.substring(0, bb);
		}
		
		//System.out.println("Q=" + Q);
		//System.out.println("R=" + R);
		System.out.println("Golomb code =" + Q+R);
		
		x.close();
	}

}
