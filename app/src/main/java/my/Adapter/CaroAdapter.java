package my.Adapter;

import java.util.List;

import my.caroclient.R;
import my.data.ItemCaro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CaroAdapter extends BaseAdapter
{
	private List<ItemCaro> mList;
	private LayoutInflater minflate;
	private Context mContext;
	public CaroAdapter(Context c,List<ItemCaro> ListPlayer)
	{
		this.mList = ListPlayer;
		this.minflate =LayoutInflater.from(c);
		this.mContext = c;
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
			convertView = minflate.inflate(R.layout.grid_item,null);
			holer.img =(ImageView)convertView.findViewById(R.id.imageGridItem);
			if(mList.get(position).get() =='o')
				holer.img.setImageResource(R.drawable.img_o);
			if(mList.get(position).get() =='x')
				holer.img.setImageResource(R.drawable.img_x);
			convertView.setTag(holer);
		}
		else
			holer =(ViewHoler) convertView.getTag();
		holer.img.setTag(position);
		return convertView;
	}
	class ViewHoler
	{
		ImageView img;
	}

}
