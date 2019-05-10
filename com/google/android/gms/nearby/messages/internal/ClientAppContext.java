package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public final class ClientAppContext
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  public final boolean zzbbH;
  public final String zzbco;
  public final String zzbcp;
  public final int zzbcq;
  
  static
  {
    zza localzza = new com/google/android/gms/nearby/messages/internal/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  ClientAppContext(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, int paramInt2)
  {
    this.versionCode = paramInt1;
    this.zzbco = paramString1;
    this.zzbcp = paramString2;
    this.zzbbH = paramBoolean;
    this.zzbcq = paramInt2;
  }
  
  public ClientAppContext(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, false);
  }
  
  public ClientAppContext(String paramString1, String paramString2, boolean paramBoolean)
  {
    this(paramString1, paramString2, paramBoolean, 0);
  }
  
  public ClientAppContext(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
  {
    this(1, paramString1, paramString2, paramBoolean, paramInt);
  }
  
  private static boolean zzT(String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {}
    for (bool = TextUtils.isEmpty(paramString2);; bool = paramString1.equals(paramString2)) {
      return bool;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ClientAppContext;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ClientAppContext)paramObject;
        String str1 = this.zzbco;
        String str2 = ((ClientAppContext)paramObject).zzbco;
        bool2 = zzT(str1, str2);
        if (bool2)
        {
          str1 = this.zzbcp;
          str2 = ((ClientAppContext)paramObject).zzbcp;
          bool2 = zzT(str1, str2);
          if (bool2)
          {
            bool2 = this.zzbbH;
            boolean bool3 = ((ClientAppContext)paramObject).zzbbH;
            if (bool2 == bool3)
            {
              int i = this.zzbcq;
              int j = ((ClientAppContext)paramObject).zzbcq;
              if (i == j) {
                continue;
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzbco;
    arrayOfObject[0] = localObject;
    localObject = this.zzbcp;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzbbH);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzbcq);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzbco;
    arrayOfObject[0] = localObject;
    localObject = this.zzbcp;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.zzbbH);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzbcq);
    arrayOfObject[3] = localObject;
    return String.format("{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, callingContext: %d}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\ClientAppContext.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */