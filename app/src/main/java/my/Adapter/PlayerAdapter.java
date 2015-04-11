package my.Adapter;

import java.util.List;

import my.caroclient.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class PlayerAdapter extends BaseAdapter
{
	private List<String> mList;
	private LayoutInflater minflate;
	public PlayerAdapter(Context c,List<String> ListPlayer)
	{
		this.mList = ListPlayer;
		this.minflate =LayoutInflater.from(c);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		// TODO Auto-generated method stub
		final ViewHoler holer;
		if(convertView == null)
		{
			holer = new ViewHoler();
			convertView = minflate.inflate(R.layout.list_item,null);
			holer.lableName =(TextView)convertView.findViewById(R.id.labelPlayerItem);
			convertView.setTag(holer);
		}
		else
			holer =(ViewHoler) convertView.getTag();
		holer.lableName.setTag(position);
		holer.lableName.setText(mList.get(position));
		return convertView;
	}
	class ViewHoler
	{
		TextView lableName;
	}

}
