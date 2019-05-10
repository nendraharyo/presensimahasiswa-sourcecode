package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import java.util.Arrays;

public class NearbyDevice
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private static final NearbyDeviceId[] zzbcb;
  private static final String[] zzbcc;
  public static final NearbyDevice zzbcd;
  final int mVersionCode;
  private final String zzF;
  private final NearbyDeviceId zzbce;
  private final String zzbcf;
  private final NearbyDeviceId[] zzbcg;
  private final String[] zzbch;
  
  static
  {
    Object localObject = new com/google/android/gms/nearby/messages/devices/zzf;
    ((zzf)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    zzbcb = new NearbyDeviceId[0];
    zzbcc = new String[0];
    localObject = new com/google/android/gms/nearby/messages/devices/NearbyDevice;
    NearbyDeviceId[] arrayOfNearbyDeviceId = zzbcb;
    String[] arrayOfString = zzbcc;
    ((NearbyDevice)localObject).<init>("", arrayOfNearbyDeviceId, arrayOfString);
    zzbcd = (NearbyDevice)localObject;
  }
  
  NearbyDevice(int paramInt, NearbyDeviceId paramNearbyDeviceId, String paramString1, String paramString2, NearbyDeviceId[] paramArrayOfNearbyDeviceId, String[] paramArrayOfString)
  {
    Object localObject = (Integer)zzx.zzz(Integer.valueOf(paramInt));
    int i = ((Integer)localObject).intValue();
    this.mVersionCode = i;
    if (paramString2 == null) {
      paramString2 = "";
    }
    this.zzbcf = paramString2;
    if (paramArrayOfNearbyDeviceId == null) {
      paramArrayOfNearbyDeviceId = zzbcb;
    }
    this.zzbcg = paramArrayOfNearbyDeviceId;
    if (paramArrayOfString == null) {
      paramArrayOfString = zzbcc;
    }
    this.zzbch = paramArrayOfString;
    localObject = this.zzbcg;
    i = localObject.length;
    if (i == 0)
    {
      localObject = NearbyDeviceId.zzbcl;
      this.zzbce = ((NearbyDeviceId)localObject);
      localObject = this.zzbch;
      i = localObject.length;
      if (i != 0) {
        break label143;
      }
      i = 0;
    }
    label143:
    for (localObject = null;; localObject = this.zzbch[0])
    {
      this.zzF = ((String)localObject);
      return;
      localObject = this.zzbcg[0];
      break;
    }
  }
  
  public NearbyDevice(String paramString, NearbyDeviceId[] paramArrayOfNearbyDeviceId, String[] paramArrayOfString)
  {
    this(1, null, null, paramString, paramArrayOfNearbyDeviceId, paramArrayOfString);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof NearbyDevice;
      String str1;
      if (!bool)
      {
        bool = false;
        str1 = null;
      }
      else
      {
        paramObject = (NearbyDevice)paramObject;
        str1 = this.zzbcf;
        String str2 = ((NearbyDevice)paramObject).zzbcf;
        bool = zzw.equal(str1, str2);
      }
    }
  }
  
  public String getUrl()
  {
    Object localObject = this.zzbch;
    int i = localObject.length;
    if (i == 0) {
      i = 0;
    }
    for (localObject = null;; localObject = this.zzbch[0]) {
      return (String)localObject;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    String str = this.zzbcf;
    arrayOfObject[0] = str;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("NearbyDevice{deviceHandle=");
    String str = this.zzbcf;
    localStringBuilder = localStringBuilder.append(str).append(", ids=");
    str = Arrays.toString(this.zzbcg);
    localStringBuilder = localStringBuilder.append(str).append(", urls=");
    str = Arrays.toString(this.zzbch);
    return str + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public NearbyDeviceId[] zzEA()
  {
    return this.zzbcg;
  }
  
  public String[] zzEB()
  {
    return this.zzbch;
  }
  
  public String zzEC()
  {
    return this.zzbcf;
  }
  
  public NearbyDeviceId zzEz()
  {
    Object localObject = this.zzbcg;
    int i = localObject.length;
    if (i == 0) {}
    for (localObject = NearbyDeviceId.zzbcl;; localObject = this.zzbcg[0]) {
      return (NearbyDeviceId)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\devices\NearbyDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */