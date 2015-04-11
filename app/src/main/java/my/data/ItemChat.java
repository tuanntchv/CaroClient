package my.data;

public class ItemChat
{
	private Boolean isMe;
	private String messg;
	public ItemChat(Boolean isMe,String mes)
	{
		this.isMe = isMe;
		this.messg = mes;
	}
	public Boolean getIsMe()
	{
		return this.isMe;
	}
	public String getMes()
	{
		return this.messg;
	}
}
