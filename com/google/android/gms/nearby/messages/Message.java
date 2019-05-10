package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

public class Message
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int MAX_CONTENT_SIZE_BYTES = 102400;
  public static final int MAX_TYPE_LENGTH = 32;
  private static final NearbyDevice[] zzbbz;
  private final byte[] content;
  private final String type;
  final int versionCode;
  private final String zzamD;
  private final NearbyDevice[] zzbbA;
  
  static
  {
    Object localObject = new com/google/android/gms/nearby/messages/zza;
    ((zza)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new NearbyDevice[1];
    NearbyDevice localNearbyDevice = NearbyDevice.zzbcd;
    localObject[0] = localNearbyDevice;
    zzbbz = (NearbyDevice[])localObject;
  }
  
  Message(int paramInt, byte[] paramArrayOfByte, String paramString1, String paramString2, NearbyDevice[] paramArrayOfNearbyDevice)
  {
    this.versionCode = paramInt;
    String str1 = (String)zzx.zzz(paramString2);
    this.type = str1;
    if (paramString1 == null) {
      paramString1 = "";
    }
    this.zzamD = paramString1;
    str1 = this.zzamD;
    String str2 = this.type;
    boolean bool = zzR(str1, str2);
    int n;
    if (bool) {
      if (paramArrayOfByte == null)
      {
        bool = m;
        str2 = "Content must be null for a device presence message.";
        zzx.zzb(bool, str2);
        this.content = paramArrayOfByte;
        if (paramArrayOfNearbyDevice != null)
        {
          n = paramArrayOfNearbyDevice.length;
          if (n != 0) {}
        }
        else
        {
          paramArrayOfNearbyDevice = zzbbz;
        }
        this.zzbbA = paramArrayOfNearbyDevice;
        n = paramString2.length();
        if (n > j) {
          break label287;
        }
        n = m;
      }
    }
    for (;;)
    {
      Object[] arrayOfObject = new Object[k];
      Integer localInteger2 = Integer.valueOf(paramString2.length());
      arrayOfObject[0] = localInteger2;
      localInteger1 = Integer.valueOf(j);
      arrayOfObject[m] = localInteger1;
      zzx.zzb(n, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", arrayOfObject);
      return;
      int i1 = 0;
      str1 = null;
      break;
      zzx.zzz(paramArrayOfByte);
      i1 = paramArrayOfByte.length;
      if (i1 <= i) {
        i1 = m;
      }
      for (;;)
      {
        str2 = "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)";
        arrayOfObject = new Object[k];
        int i3 = paramArrayOfByte.length;
        localInteger2 = Integer.valueOf(i3);
        arrayOfObject[0] = localInteger2;
        localInteger2 = Integer.valueOf(i);
        arrayOfObject[m] = localInteger2;
        zzx.zzb(i1, str2, arrayOfObject);
        break;
        i2 = 0;
        str1 = null;
      }
      label287:
      int i2 = 0;
      str1 = null;
    }
  }
  
  public Message(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, "", "");
  }
  
  public Message(byte[] paramArrayOfByte, String paramString)
  {
    this(paramArrayOfByte, "", paramString);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    this(paramArrayOfByte, paramString1, paramString2, arrayOfNearbyDevice);
  }
  
  public Message(byte[] paramArrayOfByte, String paramString1, String paramString2, NearbyDevice[] paramArrayOfNearbyDevice)
  {
    this(2, paramArrayOfByte, paramString1, paramString2, paramArrayOfNearbyDevice);
  }
  
  public static boolean zzR(String paramString1, String paramString2)
  {
    String str = "__reserved_namespace";
    boolean bool = paramString1.equals(str);
    if (bool)
    {
      str = "__device_presence";
      bool = paramString2.equals(str);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
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
      boolean bool2 = paramObject instanceof Message;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (Message)paramObject;
        Object localObject1 = this.zzamD;
        Object localObject2 = ((Message)paramObject).zzamD;
        bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
        if (bool2)
        {
          localObject1 = this.type;
          localObject2 = ((Message)paramObject).type;
          bool2 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject2);
          if (bool2)
          {
            localObject1 = this.content;
            localObject2 = ((Message)paramObject).content;
            bool2 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
            if (bool2) {
              continue;
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public byte[] getContent()
  {
    return this.content;
  }
  
  public String getNamespace()
  {
    return this.zzamD;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzamD;
    arrayOfObject[0] = localObject;
    localObject = this.type;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(Arrays.hashCode(this.content));
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("Message{namespace='");
    Object localObject2 = this.zzamD;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("'").append(", type='");
    localObject2 = this.type;
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("'").append(", content=[");
    localObject1 = this.content;
    int i;
    if (localObject1 == null)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      localObject1 = ((StringBuilder)localObject2).append(i).append(" bytes]").append(", devices=");
      localObject2 = Arrays.toString(zzEn());
      return (String)localObject2 + "}";
      localObject1 = this.content;
      i = localObject1.length;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public NearbyDevice[] zzEn()
  {
    return this.zzbbA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\Message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */