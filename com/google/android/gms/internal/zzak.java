package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.google.ads.afma.nano.NanoAfmaSignals.AFMASignals;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

public abstract class zzak
  implements zzaj
{
  protected static GoogleApiClient zznG;
  protected long zznA;
  protected long zznB;
  protected long zznC;
  private boolean zznD;
  protected DisplayMetrics zznE;
  protected zzap zznF;
  protected MotionEvent zznx;
  protected LinkedList zzny;
  protected long zznz;
  
  protected zzak(Context paramContext, zzap paramzzap)
  {
    Object localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzny = ((LinkedList)localObject);
    this.zznz = l;
    this.zznA = l;
    this.zznB = l;
    this.zznC = l;
    localObject = null;
    this.zznD = false;
    this.zznF = paramzzap;
    try
    {
      localObject = paramContext.getResources();
      localObject = ((Resources)localObject).getDisplayMetrics();
      this.zznE = ((DisplayMetrics)localObject);
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      for (;;)
      {
        DisplayMetrics localDisplayMetrics = new android/util/DisplayMetrics;
        localDisplayMetrics.<init>();
        this.zznE = localDisplayMetrics;
        localDisplayMetrics = this.zznE;
        float f = 1.0F;
        localDisplayMetrics.density = f;
      }
    }
  }
  
  private String zza(Context paramContext, String paramString, boolean paramBoolean)
  {
    i = 7;
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        localObject = zzd(paramContext);
        int j = 1;
        this.zznD = j;
        if (localObject != null)
        {
          j = ((NanoAfmaSignals.AFMASignals)localObject).getSerializedSize();
          if (j != 0) {
            continue;
          }
        }
        k = 5;
        localObject = Integer.toString(k);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        Object localObject;
        String str1 = Integer.toString(i);
        continue;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        String str2 = Integer.toString(i);
        continue;
      }
      catch (IOException localIOException)
      {
        int k = 3;
        String str3 = Integer.toString(k);
        continue;
      }
      return (String)localObject;
      localObject = zzc(paramContext);
      continue;
      localObject = zza((NanoAfmaSignals.AFMASignals)localObject, paramString);
    }
  }
  
  protected String zza(NanoAfmaSignals.AFMASignals paramAFMASignals, String paramString)
  {
    byte[] arrayOfByte = zzsu.toByteArray(paramAFMASignals);
    return zza(arrayOfByte, paramString);
  }
  
  String zza(byte[] paramArrayOfByte, String paramString)
  {
    int i = 256;
    int j = 240;
    int k = 239;
    int m = paramArrayOfByte.length;
    Object localObject2;
    if (m > k)
    {
      localObject1 = new com/google/ads/afma/nano/NanoAfmaSignals$AFMASignals;
      ((NanoAfmaSignals.AFMASignals)localObject1).<init>();
      long l = 1L;
      localObject2 = Long.valueOf(l);
      ((NanoAfmaSignals.AFMASignals)localObject1).psnSignal = ((Long)localObject2);
      paramArrayOfByte = zzsu.toByteArray((zzsu)localObject1);
    }
    m = paramArrayOfByte.length;
    if (m < k)
    {
      m = paramArrayOfByte.length;
      m = 239 - m;
      localObject1 = new byte[m];
      localObject2 = new java/security/SecureRandom;
      ((SecureRandom)localObject2).<init>();
      ((SecureRandom)localObject2).nextBytes((byte[])localObject1);
      localObject2 = ByteBuffer.allocate(j);
      byte b1 = (byte)paramArrayOfByte.length;
      localObject2 = ((ByteBuffer)localObject2).put(b1).put(paramArrayOfByte);
    }
    byte b2;
    for (Object localObject1 = ((ByteBuffer)localObject2).put((byte[])localObject1).array();; localObject1 = ((ByteBuffer)localObject1).put(b2).put(paramArrayOfByte).array())
    {
      localObject2 = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject2).update((byte[])localObject1);
      localObject2 = ((MessageDigest)localObject2).digest();
      localObject1 = ByteBuffer.allocate(i).put((byte[])localObject2).put((byte[])localObject1).array();
      localObject2 = new byte[i];
      zzai localzzai = new com/google/android/gms/internal/zzai;
      localzzai.<init>();
      localzzai.zzb((byte[])localObject1, (byte[])localObject2);
      if (paramString != null)
      {
        m = paramString.length();
        if (m > 0) {
          zza(paramString, (byte[])localObject2);
        }
      }
      return this.zznF.zza((byte[])localObject2, true);
      localObject1 = ByteBuffer.allocate(j);
      b2 = (byte)paramArrayOfByte.length;
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    MotionEvent localMotionEvent = this.zznx;
    if (localMotionEvent != null)
    {
      localMotionEvent = this.zznx;
      localMotionEvent.recycle();
    }
    long l = paramInt3;
    float f1 = paramInt1;
    float f2 = this.zznE.density;
    f1 *= f2;
    f2 = paramInt2;
    float f3 = this.zznE.density;
    f2 *= f3;
    localMotionEvent = MotionEvent.obtain(0L, l, 1, f1, f2, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    this.zznx = localMotionEvent;
  }
  
  public void zza(MotionEvent paramMotionEvent)
  {
    long l1 = 1L;
    boolean bool = this.zznD;
    long l2;
    Object localObject1;
    Object localObject2;
    if (bool)
    {
      l2 = 0L;
      this.zznC = l2;
      this.zznB = l2;
      this.zznA = l2;
      this.zznz = l2;
      localObject1 = this.zzny;
      localObject2 = ((LinkedList)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (MotionEvent)((Iterator)localObject2).next();
        ((MotionEvent)localObject1).recycle();
      }
      this.zzny.clear();
      this.zznx = null;
      bool = false;
      localObject1 = null;
      this.zznD = false;
    }
    int i = paramMotionEvent.getAction();
    switch (i)
    {
    }
    for (;;)
    {
      return;
      localObject1 = MotionEvent.obtain(paramMotionEvent);
      this.zznx = ((MotionEvent)localObject1);
      localObject1 = this.zzny;
      localObject2 = this.zznx;
      ((LinkedList)localObject1).add(localObject2);
      localObject1 = this.zzny;
      i = ((LinkedList)localObject1).size();
      int j = 6;
      if (i > j)
      {
        localObject1 = (MotionEvent)this.zzny.remove();
        ((MotionEvent)localObject1).recycle();
      }
      l2 = this.zznB + l1;
      this.zznB = l2;
      continue;
      l2 = this.zznz + l1;
      this.zznz = l2;
      continue;
      l2 = this.zznC + l1;
      this.zznC = l2;
      continue;
      l2 = this.zznA;
      int k = paramMotionEvent.getHistorySize() + 1;
      l1 = k;
      l2 += l1;
      this.zznA = l2;
    }
  }
  
  void zza(String paramString, byte[] paramArrayOfByte)
  {
    int i = 32;
    int j = paramString.length();
    if (j > i)
    {
      j = 0;
      arrayOfByte = null;
      paramString = paramString.substring(0, i);
    }
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    zzsl localzzsl = new com/google/android/gms/internal/zzsl;
    localzzsl.<init>(arrayOfByte);
    localzzsl.zzC(paramArrayOfByte);
  }
  
  public String zzb(Context paramContext)
  {
    return zza(paramContext, null, false);
  }
  
  public String zzb(Context paramContext, String paramString)
  {
    return zza(paramContext, paramString, true);
  }
  
  protected abstract NanoAfmaSignals.AFMASignals zzc(Context paramContext);
  
  protected abstract NanoAfmaSignals.AFMASignals zzd(Context paramContext);
  
  protected String zzk(String paramString)
  {
    if (paramString != null)
    {
      Object localObject = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$";
      boolean bool1 = paramString.matches((String)localObject);
      if (bool1)
      {
        localObject = UUID.fromString(paramString);
        int i = 16;
        byte[] arrayOfByte = new byte[i];
        ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
        long l = ((UUID)localObject).getMostSignificantBits();
        localByteBuffer.putLong(l);
        l = ((UUID)localObject).getLeastSignificantBits();
        localByteBuffer.putLong(l);
        localObject = this.zznF;
        boolean bool2 = true;
        paramString = ((zzap)localObject).zza(arrayOfByte, bool2);
      }
    }
    return paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */