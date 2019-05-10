package com.google.android.gms.internal;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.zzg;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

class zzec
{
  final int zzAC;
  final String zzpS;
  final AdRequestParcel zzqH;
  
  zzec(AdRequestParcel paramAdRequestParcel, String paramString, int paramInt)
  {
    this.zzqH = paramAdRequestParcel;
    this.zzpS = paramString;
    this.zzAC = paramInt;
  }
  
  zzec(zzea paramzzea)
  {
    this(localAdRequestParcel, str, i);
  }
  
  zzec(String paramString)
  {
    Object localObject1 = paramString.split("\000");
    int i = localObject1.length;
    int j = 3;
    if (i != j)
    {
      localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Incorrect field count for QueueSeed.");
      throw ((Throwable)localObject1);
    }
    Parcel localParcel = Parcel.obtain();
    j = 0;
    Object localObject3 = null;
    try
    {
      localObject3 = localObject1[0];
      int k = 0;
      String str1 = null;
      localObject3 = Base64.decode((String)localObject3, 0);
      str1 = new java/lang/String;
      String str2 = "UTF-8";
      str1.<init>((byte[])localObject3, str2);
      this.zzpS = str1;
      j = 1;
      localObject3 = localObject1[j];
      j = Integer.parseInt((String)localObject3);
      this.zzAC = j;
      j = 2;
      localObject1 = localObject1[j];
      j = 0;
      localObject3 = null;
      localObject1 = Base64.decode((String)localObject1, 0);
      j = 0;
      localObject3 = null;
      k = localObject1.length;
      localParcel.unmarshall((byte[])localObject1, 0, k);
      localObject1 = null;
      localParcel.setDataPosition(0);
      localObject1 = AdRequestParcel.CREATOR;
      localObject1 = ((zzg)localObject1).zzb(localParcel);
      this.zzqH = ((AdRequestParcel)localObject1);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      IOException localIOException = new java/io/IOException;
      localObject3 = "Malformed QueueSeed encoding.";
      localIOException.<init>((String)localObject3);
      throw localIOException;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  String zzem()
  {
    localParcel = Parcel.obtain();
    try
    {
      localObject1 = this.zzpS;
      String str2 = "UTF-8";
      localObject1 = ((String)localObject1).getBytes(str2);
      int i = 0;
      str2 = null;
      localObject1 = Base64.encodeToString((byte[])localObject1, 0);
      i = this.zzAC;
      str2 = Integer.toString(i);
      Object localObject3 = this.zzqH;
      Object localObject4 = null;
      ((AdRequestParcel)localObject3).writeToParcel(localParcel, 0);
      localObject3 = localParcel.marshall();
      localObject4 = null;
      localObject3 = Base64.encodeToString((byte[])localObject3, 0);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = "\000";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = "\000";
      localObject1 = ((StringBuilder)localObject1).append(str2);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Object localObject1;
        String str1 = "QueueSeed encode failed because UTF-8 is not available.";
        zzin.e(str1);
        localParcel.recycle();
        str1 = "";
      }
    }
    finally
    {
      localParcel.recycle();
    }
    return (String)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */