package android.support.v7.widget;

class DefaultItemAnimator$ChangeInfo
{
  public int fromX;
  public int fromY;
  public RecyclerView.ViewHolder newHolder;
  public RecyclerView.ViewHolder oldHolder;
  public int toX;
  public int toY;
  
  private DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    this.oldHolder = paramViewHolder1;
    this.newHolder = paramViewHolder2;
  }
  
  DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramViewHolder1, paramViewHolder2);
    this.fromX = paramInt1;
    this.fromY = paramInt2;
    this.toX = paramInt3;
    this.toY = paramInt4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ChangeInfo{oldHolder=");
    RecyclerView.ViewHolder localViewHolder = this.oldHolder;
    localStringBuilder = localStringBuilder.append(localViewHolder).append(", newHolder=");
    localViewHolder = this.newHolder;
    localStringBuilder = localStringBuilder.append(localViewHolder).append(", fromX=");
    int i = this.fromX;
    localStringBuilder = localStringBuilder.append(i).append(", fromY=");
    i = this.fromY;
    localStringBuilder = localStringBuilder.append(i).append(", toX=");
    i = this.toX;
    localStringBuilder = localStringBuilder.append(i).append(", toY=");
    i = this.toY;
    return i + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$ChangeInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */