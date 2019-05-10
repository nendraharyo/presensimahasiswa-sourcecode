package com.google.android.gms.location.places.internal;

import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzsk;
import com.google.android.gms.internal.zzst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzt
  extends com.google.android.gms.common.data.zzc
{
  private final String TAG = "SafeDataBufferRef";
  
  public zzt(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  protected String zzG(String paramString1, String paramString2)
  {
    boolean bool = zzcz(paramString1);
    if (bool)
    {
      bool = zzcB(paramString1);
      if (!bool) {
        paramString2 = getString(paramString1);
      }
    }
    return paramString2;
  }
  
  protected SafeParcelable zza(String paramString, Parcelable.Creator paramCreator)
  {
    SafeParcelable localSafeParcelable = null;
    byte[] arrayOfByte = zzc(paramString, null);
    if (arrayOfByte == null) {}
    for (;;)
    {
      return localSafeParcelable;
      localSafeParcelable = com.google.android.gms.common.internal.safeparcel.zzc.zza(arrayOfByte, paramCreator);
    }
  }
  
  protected List zza(String paramString, Parcelable.Creator paramCreator, List paramList)
  {
    Object localObject1 = zzc(paramString, null);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramList;
      Object localObject2;
      Object localObject3;
      boolean bool;
      try
      {
        localObject2 = zzsk.zzB((byte[])localObject1);
        localObject1 = ((zzsk)localObject2).zzbtV;
        if (localObject1 == null) {
          continue;
        }
        localObject1 = new java/util/ArrayList;
        localObject3 = ((zzsk)localObject2).zzbtV;
        i = localObject3.length;
        ((ArrayList)localObject1).<init>(i);
        localObject3 = ((zzsk)localObject2).zzbtV;
        int j = localObject3.length;
        int k = 0;
        localObject2 = null;
        while (k < j)
        {
          Object localObject4 = localObject3[k];
          localObject4 = com.google.android.gms.common.internal.safeparcel.zzc.zza((byte[])localObject4, paramCreator);
          ((List)localObject1).add(localObject4);
          k += 1;
        }
        paramList = (List)localObject1;
      }
      catch (zzst localzzst)
      {
        localObject2 = "SafeDataBufferRef";
        int i = 6;
        bool = Log.isLoggable((String)localObject2, i);
      }
      if (bool)
      {
        localObject2 = "SafeDataBufferRef";
        localObject3 = "Cannot parse byte[]";
        Log.e((String)localObject2, (String)localObject3, localzzst);
      }
    }
  }
  
  protected List zza(String paramString, List paramList)
  {
    Object localObject1 = zzc(paramString, null);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramList;
      Object localObject2;
      Object localObject3;
      boolean bool;
      try
      {
        localObject2 = zzsk.zzB((byte[])localObject1);
        localObject1 = ((zzsk)localObject2).zzbtU;
        if (localObject1 == null) {
          continue;
        }
        localObject1 = new java/util/ArrayList;
        localObject3 = ((zzsk)localObject2).zzbtU;
        int i = localObject3.length;
        ((ArrayList)localObject1).<init>(i);
        i = 0;
        localObject3 = null;
        for (;;)
        {
          Object localObject4 = ((zzsk)localObject2).zzbtU;
          int j = localObject4.length;
          if (i >= j) {
            break;
          }
          localObject4 = ((zzsk)localObject2).zzbtU;
          j = localObject4[i];
          localObject4 = Integer.valueOf(j);
          ((List)localObject1).add(localObject4);
          i += 1;
        }
        paramList = (List)localObject1;
      }
      catch (zzst localzzst)
      {
        localObject3 = "SafeDataBufferRef";
        int k = 6;
        bool = Log.isLoggable((String)localObject3, k);
      }
      if (bool)
      {
        localObject3 = "SafeDataBufferRef";
        localObject2 = "Cannot parse byte[]";
        Log.e((String)localObject3, (String)localObject2, localzzst);
      }
    }
  }
  
  protected float zzb(String paramString, float paramFloat)
  {
    boolean bool = zzcz(paramString);
    if (bool)
    {
      bool = zzcB(paramString);
      if (!bool) {
        paramFloat = getFloat(paramString);
      }
    }
    return paramFloat;
  }
  
  protected List zzb(String paramString, List paramList)
  {
    Object localObject1 = zzc(paramString, null);
    if (localObject1 == null) {}
    for (;;)
    {
      return paramList;
      Object localObject2;
      boolean bool;
      try
      {
        localObject1 = zzsk.zzB((byte[])localObject1);
        localObject2 = ((zzsk)localObject1).zzbtT;
        if (localObject2 == null) {
          continue;
        }
        localObject1 = ((zzsk)localObject1).zzbtT;
        paramList = Arrays.asList((Object[])localObject1);
      }
      catch (zzst localzzst)
      {
        localObject2 = "SafeDataBufferRef";
        int i = 6;
        bool = Log.isLoggable((String)localObject2, i);
      }
      if (bool)
      {
        localObject2 = "SafeDataBufferRef";
        String str = "Cannot parse byte[]";
        Log.e((String)localObject2, str, localzzst);
      }
    }
  }
  
  protected byte[] zzc(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = zzcz(paramString);
    if (bool)
    {
      bool = zzcB(paramString);
      if (!bool) {
        paramArrayOfByte = getByteArray(paramString);
      }
    }
    return paramArrayOfByte;
  }
  
  protected boolean zzl(String paramString, boolean paramBoolean)
  {
    boolean bool = zzcz(paramString);
    if (bool)
    {
      bool = zzcB(paramString);
      if (!bool) {
        paramBoolean = getBoolean(paramString);
      }
    }
    return paramBoolean;
  }
  
  protected int zzz(String paramString, int paramInt)
  {
    boolean bool = zzcz(paramString);
    if (bool)
    {
      bool = zzcB(paramString);
      if (!bool) {
        paramInt = getInteger(paramString);
      }
    }
    return paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\internal\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */