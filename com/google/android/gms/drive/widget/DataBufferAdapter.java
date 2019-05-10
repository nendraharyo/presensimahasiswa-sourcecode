package com.google.android.gms.drive.widget;

import android.content.Context;
import android.database.CursorIndexOutOfBoundsException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.drive.internal.zzz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBufferAdapter
  extends BaseAdapter
{
  private final Context mContext;
  private final LayoutInflater mInflater;
  private final int zzavs;
  private int zzavt;
  private final int zzavu;
  private final List zzavv;
  private boolean zzavw = true;
  
  public DataBufferAdapter(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, 0, localArrayList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2)
  {
    this(paramContext, paramInt1, paramInt2, localArrayList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, List paramList)
  {
    this.mContext = paramContext;
    this.zzavt = paramInt1;
    this.zzavs = paramInt1;
    this.zzavu = paramInt2;
    this.zzavv = paramList;
    LayoutInflater localLayoutInflater = (LayoutInflater)paramContext.getSystemService("layout_inflater");
    this.mInflater = localLayoutInflater;
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt1, int paramInt2, DataBuffer... paramVarArgs)
  {
    this(paramContext, paramInt1, paramInt2, localList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, List paramList)
  {
    this(paramContext, paramInt, 0, paramList);
  }
  
  public DataBufferAdapter(Context paramContext, int paramInt, DataBuffer... paramVarArgs)
  {
    this(paramContext, paramInt, 0, localList);
  }
  
  private View zza(int paramInt1, View paramView, ViewGroup paramViewGroup, int paramInt2)
  {
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = this.mInflater;
      localObject2 = ((LayoutInflater)localObject1).inflate(paramInt2, paramViewGroup, false);
    }
    for (;;)
    {
      Object localObject4;
      try
      {
        int i = this.zzavu;
        if (i == 0)
        {
          Object localObject3 = localObject2;
          localObject3 = (TextView)localObject2;
          localObject1 = localObject3;
          localObject4 = localObject3;
          localObject1 = getItem(paramInt1);
          boolean bool = localObject1 instanceof CharSequence;
          if (bool)
          {
            localObject1 = (CharSequence)localObject1;
            ((TextView)localObject4).setText((CharSequence)localObject1);
            return (View)localObject2;
            localObject2 = paramView;
          }
        }
        else
        {
          i = this.zzavu;
          localObject1 = ((View)localObject2).findViewById(i);
          localObject1 = (TextView)localObject1;
          localObject4 = localObject1;
          continue;
        }
        str = localClassCastException.toString();
      }
      catch (ClassCastException localClassCastException)
      {
        zzz.zza("DataBufferAdapter", localClassCastException, "You must supply a resource ID for a TextView");
        localObject2 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject2).<init>("DataBufferAdapter requires the resource ID to be a TextView", localClassCastException);
        throw ((Throwable)localObject2);
      }
      String str;
      ((TextView)localObject4).setText(str);
    }
  }
  
  public void append(DataBuffer paramDataBuffer)
  {
    List localList = this.zzavv;
    localList.add(paramDataBuffer);
    boolean bool = this.zzavw;
    if (bool) {
      notifyDataSetChanged();
    }
  }
  
  public void clear()
  {
    Object localObject = this.zzavv;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataBuffer)localIterator.next();
      ((DataBuffer)localObject).release();
    }
    localObject = this.zzavv;
    ((List)localObject).clear();
    boolean bool = this.zzavw;
    if (bool) {
      notifyDataSetChanged();
    }
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public int getCount()
  {
    boolean bool = false;
    DataBuffer localDataBuffer = null;
    Iterator localIterator = this.zzavv.iterator();
    int i;
    for (int j = 0;; j = i)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localDataBuffer = (DataBuffer)localIterator.next();
      i = localDataBuffer.getCount() + j;
    }
    return j;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = this.zzavt;
    return zza(paramInt, paramView, paramViewGroup, i);
  }
  
  public Object getItem(int paramInt)
  {
    Object localObject = this.zzavv;
    Iterator localIterator = ((List)localObject).iterator();
    int j;
    for (int i = paramInt;; i = j)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break label96;
      }
      localObject = (DataBuffer)localIterator.next();
      int k = ((DataBuffer)localObject).getCount();
      if (k > i) {
        break;
      }
      j = i - k;
    }
    try
    {
      return ((DataBuffer)localObject).get(i);
    }
    catch (CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException1)
    {
      localCursorIndexOutOfBoundsException2 = new android/database/CursorIndexOutOfBoundsException;
      i = getCount();
      localCursorIndexOutOfBoundsException2.<init>(paramInt, i);
      throw localCursorIndexOutOfBoundsException2;
    }
    label96:
    CursorIndexOutOfBoundsException localCursorIndexOutOfBoundsException2 = new android/database/CursorIndexOutOfBoundsException;
    i = getCount();
    localCursorIndexOutOfBoundsException2.<init>(paramInt, i);
    throw localCursorIndexOutOfBoundsException2;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = this.zzavs;
    return zza(paramInt, paramView, paramViewGroup, i);
  }
  
  public void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
    this.zzavw = true;
  }
  
  public void setDropDownViewResource(int paramInt)
  {
    this.zzavt = paramInt;
  }
  
  public void setNotifyOnChange(boolean paramBoolean)
  {
    this.zzavw = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\widget\DataBufferAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */