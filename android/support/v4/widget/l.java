package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class l
  extends d
{
  private int mDropDownLayout;
  private LayoutInflater mInflater;
  private int mLayout;
  
  public l(Context paramContext, int paramInt, Cursor paramCursor)
  {
    super(paramContext, paramCursor);
    this.mDropDownLayout = paramInt;
    this.mLayout = paramInt;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.mInflater = localLayoutInflater;
  }
  
  public l(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2)
  {
    super(paramContext, paramCursor, paramInt2);
    this.mDropDownLayout = paramInt1;
    this.mLayout = paramInt1;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.mInflater = localLayoutInflater;
  }
  
  public l(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean)
  {
    super(paramContext, paramCursor, paramBoolean);
    this.mDropDownLayout = paramInt;
    this.mLayout = paramInt;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.mInflater = localLayoutInflater;
  }
  
  public View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = this.mInflater;
    int i = this.mDropDownLayout;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = this.mInflater;
    int i = this.mLayout;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    this.mDropDownLayout = paramInt;
  }
  
  public void setViewResource(int paramInt)
  {
    this.mLayout = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */