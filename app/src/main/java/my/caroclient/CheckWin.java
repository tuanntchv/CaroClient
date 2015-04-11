package my.caroclient;

import java.util.List;

import android.util.Log;

import my.data.ItemCaro;

public class CheckWin 
{
	public static Boolean isWin(int pos,Character c,List<ItemCaro> mList)
	{
		if(checkHorizontion(pos, c, mList))
			return true;
		if(checkVertical(pos, c, mList))
			return true;
		if(checkCross1(pos, c, mList)) // chéo chính
			return true;
		if(checkCross2(pos, c, mList)) // chéo phụ
			return true;
		return false;
	}
	private static Boolean checkHorizontion(int pos,Character c,List<ItemCaro> mList)
	{
		int count=0;
		pos = pos % 10;
		for(int i=0;i<10;i++)
		{
			if(mList.get(i*10+pos).get() == c)
			{
				count++;
				if(count ==5)
				 return true;
			}
			else
				count=0;
		}
		return false;
	}
	private static Boolean checkVertical(int pos,Character c,List<ItemCaro> mList)
	{
		int count=0;
		pos = pos / 10;
		for(int i=0;i<10;i++)
		{
			if(mList.get(pos*10+i).get() == c)
			{
				count++;
				if(count ==5)
				 return true;
			}
			else
				count=0;
		}
		return false;
	}
	private static Boolean checkCross2(int pos,Character c,List<ItemCaro> mList)
	{
		int count = 0;
		while( pos > 10 && pos % 10 < 10 )
			pos -=9;
		while(pos % 10 !=0 && pos / 10 < 10)
		{
			if(mList.get(pos).get() == c)
			{
				count++;
				if(count == 5)
					return true;
			}
			else
				count = 0;
			pos +=9;
		}
		return false;
	}
	private static Boolean checkCross1(int pos,Character c,List<ItemCaro> mList)
	{
		int count = 0;
		while( pos > 10 && pos % 10 !=0 )
			pos -=11;
		while(pos / 10 < 10 && pos % 10 < 10)
		{
			if(mList.get(pos).get() == c)
			{
				count++;
				if(count == 5)
					return true;
			}
			else
				count = 0;
			pos +=11;
		}
		return false;
	}
}
