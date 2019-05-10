package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;

public class ViewableItem
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int versionCode;
  private String[] zzbdj;
  
  static
  {
    zzf localzzf = new com/google/android/gms/nearby/sharing/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  private ViewableItem()
  {
    this.versionCode = 1;
  }
  
  ViewableItem(int paramInt, String[] paramArrayOfString)
  {
    this.versionCode = paramInt;
    this.zzbdj = paramArrayOfString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof ViewableItem;
      String[] arrayOfString1;
      if (!bool)
      {
        bool = false;
        arrayOfString1 = null;
      }
      else
      {
        paramObject = (ViewableItem)paramObject;
        arrayOfString1 = this.zzbdj;
        String[] arrayOfString2 = ((ViewableItem)paramObject).zzbdj;
        bool = zzw.equal(arrayOfString1, arrayOfString2);
      }
    }
  }
  
  int getVersionCode()
  {
    return this.versionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    String[] arrayOfString = this.zzbdj;
    arrayOfObject[0] = arrayOfString;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ViewableItem[uris=");
    String str = Arrays.toString(this.zzbdj);
    return str + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public String[] zzEN()
  {
    return this.zzbdj;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\ViewableItem.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */