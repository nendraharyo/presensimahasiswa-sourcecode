package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class zzd
  extends AbstractDataBuffer
{
  private static final String[] zzajg;
  private final Parcelable.Creator zzajh;
  
  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "data";
    zzajg = arrayOfString;
  }
  
  public zzd(DataHolder paramDataHolder, Parcelable.Creator paramCreator)
  {
    super(paramDataHolder);
    this.zzajh = paramCreator;
  }
  
  public SafeParcelable zzbG(int paramInt)
  {
    Object localObject = this.zzahi;
    int i = this.zzahi.zzbH(paramInt);
    localObject = ((DataHolder)localObject).zzg("data", paramInt, i);
    Parcel localParcel = Parcel.obtain();
    i = localObject.length;
    localParcel.unmarshall((byte[])localObject, 0, i);
    localParcel.setDataPosition(0);
    localObject = (SafeParcelable)this.zzajh.createFromParcel(localParcel);
    localParcel.recycle();
    return (SafeParcelable)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */