package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;

public class SharedContent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int versionCode;
  private String zzbdg;
  private ViewableItem[] zzbdh;
  private LocalContent[] zzbdi;
  
  static
  {
    zzc localzzc = new com/google/android/gms/nearby/sharing/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  private SharedContent()
  {
    this.versionCode = 2;
  }
  
  SharedContent(int paramInt, String paramString, ViewableItem[] paramArrayOfViewableItem, LocalContent[] paramArrayOfLocalContent)
  {
    this.versionCode = paramInt;
    this.zzbdg = paramString;
    this.zzbdh = paramArrayOfViewableItem;
    this.zzbdi = paramArrayOfLocalContent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof SharedContent;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (SharedContent)paramObject;
        Object localObject1 = this.zzbdh;
        Object localObject2 = ((SharedContent)paramObject).zzbdh;
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzbdi;
          localObject2 = ((SharedContent)paramObject).zzbdi;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.zzbdg;
            localObject2 = ((SharedContent)paramObject).zzbdg;
            bool2 = zzw.equal(localObject1, localObject2);
            if (bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public String getUri()
  {
    return this.zzbdg;
  }
  
  int getVersionCode()
  {
    return this.versionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzbdh;
    arrayOfObject[0] = localObject;
    localObject = this.zzbdi;
    arrayOfObject[1] = localObject;
    localObject = this.zzbdg;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SharedContent[viewableItems=");
    String str = Arrays.toString(this.zzbdh);
    localStringBuilder = localStringBuilder.append(str).append(", localContents=");
    str = Arrays.toString(this.zzbdi);
    return str + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public ViewableItem[] zzEL()
  {
    return this.zzbdh;
  }
  
  public LocalContent[] zzEM()
  {
    return this.zzbdi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\SharedContent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */