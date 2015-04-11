package my.data;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import android.util.Log;

public class TransData 
{
	public static boolean Send(Boolean isConnect,String strAction,String strData)
	{
		try
		{
			Socket socReceive = new Socket(StrData.strHost,StrData.intPort);
			PrintWriter pwOut = new PrintWriter(socReceive.getOutputStream(),true);
			pwOut.println(strAction);
			if(isConnect)
				pwOut.println("0");
			pwOut.println(strData);
			socReceive.close();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public static String FunReceive(Boolean isConnect)
	{
				try
				{
					Socket socReceive = new Socket(StrData.strHost,StrData.intPort);
					PrintWriter pwOut = new PrintWriter(socReceive.getOutputStream(),true);
					pwOut.println("0");
					if(isConnect)
						pwOut.println("1");
					InputStreamReader inStream = new InputStreamReader(socReceive.getInputStream());
					BufferedReader buffReader = new BufferedReader(inStream);
					String strData = buffReader.readLine();
					Log.d("reslut",strData+"");
					return strData;
				}
				catch(Exception ex)
				{
					Log.d("receice lỗi",ex.toString());
					return null;
				}
	}
}
