package my.Adapter;

import java.util.List;

import my.caroclient.R;
import my.data.ItemChat;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChatAdapter extends BaseAdapter
{
	private List<ItemChat> mListData;
	private Context mContext;
	private LayoutInflater mInflate;
	public ChatAdapter(List<ItemChat> list,Context c)
	{
		this.mContext = c;
		this.mListData = list;
		this.mInflate = LayoutInflater.from(mContext);
	}
	@Override
	public int getCount() 
	{
		// TODO Auto-generated method stub
		return mListData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		ViewHoler holer;
		holer = new ViewHoler();
		if(mListData.get(position).getIsMe())
			convertView = mInflate.inflate(R.layout.chat_item_left,null);
		else
			convertView = mInflate.inflate(R.layout.chat_item_right,null);
		holer.lableMes =(TextView)convertView.findViewById(R.id.labelChatItem);
		convertView.setTag(holer);
		holer.lableMes.setTag(position);
		holer.lableMes.setText(mListData.get(position).getMes());
		return convertView;
	}
	class ViewHoler
	{
		TextView lableMes;
	}

}
