package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class LocalContent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private int type;
  private final int versionCode;
  private String zzbdf;
  
  static
  {
    zzb localzzb = new com/google/android/gms/nearby/sharing/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  private LocalContent()
  {
    this.versionCode = 1;
  }
  
  LocalContent(int paramInt1, int paramInt2, String paramString)
  {
    this.versionCode = paramInt1;
    this.type = paramInt2;
    this.zzbdf = paramString;
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
      boolean bool2 = paramObject instanceof LocalContent;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (LocalContent)paramObject;
        Object localObject1 = Integer.valueOf(this.type);
        int i = ((LocalContent)paramObject).type;
        Object localObject2 = Integer.valueOf(i);
        bool2 = zzw.equal(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzbdf;
          localObject2 = ((LocalContent)paramObject).zzbdf;
          bool2 = zzw.equal(localObject1, localObject2);
          if (bool2) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public int getType()
  {
    return this.type;
  }
  
  int getVersionCode()
  {
    return this.versionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = Integer.valueOf(this.type);
    arrayOfObject[0] = localObject;
    localObject = this.zzbdf;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("LocalContent[contentUri=");
    Object localObject2 = this.zzbdf;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = ((StringBuilder)localObject1).append(", type=");
    int i = this.type;
    int j = 1;
    if (i == j) {}
    for (localObject1 = "PUBLIC_CONTENT";; localObject1 = "APP_CONTENT") {
      return (String)localObject1 + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzEK()
  {
    return this.zzbdf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\LocalContent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */