package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zznv;
import com.google.android.gms.internal.zzoz;

public final class Device
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int TYPE_CHEST_STRAP = 4;
  public static final int TYPE_PHONE = 1;
  public static final int TYPE_SCALE = 5;
  public static final int TYPE_TABLET = 2;
  public static final int TYPE_UNKNOWN = 0;
  public static final int TYPE_WATCH = 3;
  private final int mVersionCode;
  private final int zzabB;
  private final String zzadc;
  private final String zzawI;
  private final String zzawJ;
  private final String zzawK;
  private final int zzawL;
  
  static
  {
    zzi localzzi = new com/google/android/gms/fitness/data/zzi;
    localzzi.<init>();
    CREATOR = localzzi;
  }
  
  Device(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    this.mVersionCode = paramInt1;
    String str = (String)zzx.zzz(paramString1);
    this.zzawI = str;
    str = (String)zzx.zzz(paramString2);
    this.zzawJ = str;
    this.zzadc = "";
    str = (String)zzx.zzz(paramString4);
    this.zzawK = str;
    this.zzabB = paramInt2;
    this.zzawL = paramInt3;
  }
  
  public Device(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    this(paramString1, paramString2, "", paramString3, paramInt, 0);
  }
  
  public Device(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    this(1, paramString1, paramString2, "", paramString4, paramInt1, paramInt2);
  }
  
  public static Device getLocalDevice(Context paramContext)
  {
    int i = zznv.zzaG(paramContext);
    String str1 = zzaC(paramContext);
    Device localDevice = new com/google/android/gms/fitness/data/Device;
    String str2 = Build.MANUFACTURER;
    String str3 = Build.MODEL;
    String str4 = Build.VERSION.RELEASE;
    localDevice.<init>(str2, str3, str4, str1, i, 2);
    return localDevice;
  }
  
  private boolean zza(Device paramDevice)
  {
    String str1 = this.zzawI;
    String str2 = paramDevice.zzawI;
    boolean bool = zzw.equal(str1, str2);
    int i;
    if (bool)
    {
      str1 = this.zzawJ;
      str2 = paramDevice.zzawJ;
      bool = zzw.equal(str1, str2);
      if (bool)
      {
        str1 = this.zzadc;
        str2 = paramDevice.zzadc;
        bool = zzw.equal(str1, str2);
        if (bool)
        {
          str1 = this.zzawK;
          str2 = paramDevice.zzawK;
          bool = zzw.equal(str1, str2);
          if (bool)
          {
            i = this.zzabB;
            int k = paramDevice.zzabB;
            if (i == k)
            {
              i = this.zzawL;
              int m = paramDevice.zzawL;
              if (i == m) {
                i = 1;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 0;
      str1 = null;
    }
  }
  
  private static String zzaC(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
  
  private boolean zzus()
  {
    int i = 1;
    int j = zzur();
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof Device;
      if (!bool) {
        break label33;
      }
      paramObject = (Device)paramObject;
      bool = zza((Device)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public String getManufacturer()
  {
    return this.zzawI;
  }
  
  public String getModel()
  {
    return this.zzawJ;
  }
  
  String getStreamIdentifier()
  {
    Object[] arrayOfObject = new Object[3];
    String str = this.zzawI;
    arrayOfObject[0] = str;
    str = this.zzawJ;
    arrayOfObject[1] = str;
    str = this.zzawK;
    arrayOfObject[2] = str;
    return String.format("%s:%s:%s", arrayOfObject);
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public String getUid()
  {
    return this.zzawK;
  }
  
  public String getVersion()
  {
    return this.zzadc;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.zzawI;
    arrayOfObject[0] = localObject;
    localObject = this.zzawJ;
    arrayOfObject[1] = localObject;
    localObject = this.zzadc;
    arrayOfObject[2] = localObject;
    localObject = this.zzawK;
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzabB);
    arrayOfObject[4] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = getStreamIdentifier();
    arrayOfObject[0] = localObject;
    localObject = this.zzadc;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzabB);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzawL);
    arrayOfObject[3] = localObject;
    return String.format("Device{%s:%s:%s:%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public int zzur()
  {
    return this.zzawL;
  }
  
  public String zzut()
  {
    boolean bool = zzus();
    if (bool) {}
    for (String str = this.zzawK;; str = zzoz.zzdF(this.zzawK)) {
      return str;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\Device.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */