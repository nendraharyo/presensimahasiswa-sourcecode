package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzdy
{
  private final Map zzAx;
  private final LinkedList zzAy;
  private zzdv zzAz;
  
  public zzdy()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzAx = ((Map)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzAy = ((LinkedList)localObject);
  }
  
  /* Error */
  private String[] zzY(String paramString)
  {
    // Byte code:
    //   0: ldc 26
    //   2: astore_2
    //   3: aload_1
    //   4: aload_2
    //   5: invokevirtual 32	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   8: astore_2
    //   9: iconst_0
    //   10: istore_3
    //   11: aload_2
    //   12: arraylength
    //   13: istore 4
    //   15: iload_3
    //   16: iload 4
    //   18: if_icmpge +55 -> 73
    //   21: new 28	java/lang/String
    //   24: astore 5
    //   26: aload_2
    //   27: iload_3
    //   28: aaload
    //   29: astore 6
    //   31: aconst_null
    //   32: astore 7
    //   34: aload 6
    //   36: iconst_0
    //   37: invokestatic 38	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   40: astore 6
    //   42: ldc 40
    //   44: astore 7
    //   46: aload 5
    //   48: aload 6
    //   50: aload 7
    //   52: invokespecial 43	java/lang/String:<init>	([BLjava/lang/String;)V
    //   55: aload_2
    //   56: iload_3
    //   57: aload 5
    //   59: aastore
    //   60: iload_3
    //   61: iconst_1
    //   62: iadd
    //   63: istore_3
    //   64: goto -53 -> 11
    //   67: astore_2
    //   68: iconst_0
    //   69: anewarray 28	java/lang/String
    //   72: astore_2
    //   73: aload_2
    //   74: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	zzdy
    //   0	75	1	paramString	String
    //   2	54	2	localObject1	Object
    //   67	1	2	localUnsupportedEncodingException	UnsupportedEncodingException
    //   72	2	2	arrayOfString	String[]
    //   10	54	3	i	int
    //   13	6	4	j	int
    //   24	34	5	str1	String
    //   29	20	6	localObject2	Object
    //   32	19	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   4	8	67	java/io/UnsupportedEncodingException
    //   11	13	67	java/io/UnsupportedEncodingException
    //   21	24	67	java/io/UnsupportedEncodingException
    //   27	29	67	java/io/UnsupportedEncodingException
    //   36	40	67	java/io/UnsupportedEncodingException
    //   50	55	67	java/io/UnsupportedEncodingException
    //   57	60	67	java/io/UnsupportedEncodingException
  }
  
  private static void zza(String paramString, zzdz paramzzdz)
  {
    boolean bool = zzin.zzQ(2);
    if (bool)
    {
      bool = true;
      Object localObject = new Object[bool];
      localObject[0] = paramzzdz;
      localObject = String.format(paramString, (Object[])localObject);
      zzin.v((String)localObject);
    }
  }
  
  private String zzef()
  {
    StringBuilder localStringBuilder;
    String str1;
    try
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject = this.zzAy;
      Iterator localIterator = ((LinkedList)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = localIterator.next();
        localObject = (zzdz)localObject;
        localObject = ((zzdz)localObject).toString();
        String str2 = "UTF-8";
        localObject = ((String)localObject).getBytes(str2);
        str2 = null;
        localObject = Base64.encodeToString((byte[])localObject, 0);
        localStringBuilder.append((String)localObject);
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject = "\000";
          localStringBuilder.append((String)localObject);
        }
      }
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str1 = "";
    }
    for (;;)
    {
      str1 = localStringBuilder.toString();
    }
  }
  
  void flush()
  {
    for (;;)
    {
      Object localObject1 = this.zzAy;
      int i = ((LinkedList)localObject1).size();
      if (i <= 0) {
        break;
      }
      localObject1 = (zzdz)this.zzAy.remove();
      Object localObject2 = (zzea)this.zzAx.get(localObject1);
      Object localObject3 = "Flushing interstitial queue for %s.";
      zza((String)localObject3, (zzdz)localObject1);
      for (;;)
      {
        int j = ((zzea)localObject2).size();
        if (j <= 0) {
          break;
        }
        localObject3 = ((zzea)localObject2).zzej().zzAD;
        ((zzk)localObject3).zzbp();
      }
      localObject2 = this.zzAx;
      ((Map)localObject2).remove(localObject1);
    }
  }
  
  void restore()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject2 = this.zzAz;
    if (localObject2 == null) {}
    for (;;)
    {
      return;
      localObject2 = this.zzAz.zzed();
      Object localObject4 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
      Object localObject5 = ((Context)localObject2).getSharedPreferences((String)localObject4, 0);
      flush();
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject2 = ((SharedPreferences)localObject5).getAll().entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      label70:
      boolean bool2 = localIterator.hasNext();
      if (bool2) {
        localObject2 = (Map.Entry)localIterator.next();
      }
      try
      {
        localObject4 = ((Map.Entry)localObject2).getKey();
        localObject4 = (String)localObject4;
        Object localObject6 = "PoolKeys";
        boolean bool3 = ((String)localObject4).equals(localObject6);
        if (bool3) {
          break label70;
        }
        localObject2 = ((Map.Entry)localObject2).getValue();
        localObject2 = (String)localObject2;
        localObject4 = new com/google/android/gms/internal/zzec;
        ((zzec)localObject4).<init>((String)localObject2);
        localObject2 = new com/google/android/gms/internal/zzdz;
        localObject6 = ((zzec)localObject4).zzqH;
        Object localObject7 = ((zzec)localObject4).zzpS;
        int k = ((zzec)localObject4).zzAC;
        ((zzdz)localObject2).<init>((AdRequestParcel)localObject6, (String)localObject7, k);
        localObject6 = this.zzAx;
        boolean bool4 = ((Map)localObject6).containsKey(localObject2);
        if (bool4) {
          break label70;
        }
        localObject6 = new com/google/android/gms/internal/zzea;
        localObject7 = ((zzec)localObject4).zzqH;
        String str = ((zzec)localObject4).zzpS;
        j = ((zzec)localObject4).zzAC;
        ((zzea)localObject6).<init>((AdRequestParcel)localObject7, str, j);
        localObject4 = this.zzAx;
        ((Map)localObject4).put(localObject2, localObject6);
        localObject4 = ((zzdz)localObject2).toString();
        localHashMap.put(localObject4, localObject2);
        localObject4 = "Restored interstitial queue for %s.";
        zza((String)localObject4, (zzdz)localObject2);
      }
      catch (IOException localIOException)
      {
        localObject4 = "Malformed preferences value for InterstitialAdPool.";
        zzin.zzd((String)localObject4, localIOException);
        break label70;
        Object localObject3 = ((SharedPreferences)localObject5).getString("PoolKeys", "");
        localObject5 = zzY((String)localObject3);
        int m = localObject5.length;
        int j = 0;
        localObject4 = null;
        while (j < m)
        {
          localObject3 = localObject5[j];
          localObject3 = (zzdz)localHashMap.get(localObject3);
          localObject1 = this.zzAx;
          bool1 = ((Map)localObject1).containsKey(localObject3);
          if (bool1)
          {
            localObject1 = this.zzAy;
            ((LinkedList)localObject1).add(localObject3);
          }
          int i = j + 1;
          j = i;
        }
      }
      catch (ClassCastException localClassCastException)
      {
        for (;;) {}
      }
    }
  }
  
  void save()
  {
    Object localObject1 = this.zzAz;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzAz.zzed();
      Object localObject2 = "com.google.android.gms.ads.internal.interstitial.InterstitialAdPool";
      SharedPreferences.Editor localEditor = ((Context)localObject1).getSharedPreferences((String)localObject2, 0).edit();
      localEditor.clear();
      localObject1 = this.zzAx.entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)localIterator.next();
        localObject2 = (zzdz)((Map.Entry)localObject1).getKey();
        boolean bool2 = ((zzdz)localObject2).zzeh();
        if (bool2)
        {
          localObject1 = (zzea)((Map.Entry)localObject1).getValue();
          Object localObject3 = new com/google/android/gms/internal/zzec;
          ((zzec)localObject3).<init>((zzea)localObject1);
          localObject1 = ((zzec)localObject3).zzem();
          localObject3 = ((zzdz)localObject2).toString();
          localEditor.putString((String)localObject3, (String)localObject1);
          localObject1 = "Saved interstitial queue for %s.";
          zza((String)localObject1, (zzdz)localObject2);
        }
      }
      localObject1 = "PoolKeys";
      localObject2 = zzef();
      localEditor.putString((String)localObject1, (String)localObject2);
      localEditor.commit();
    }
  }
  
  zzea.zza zza(AdRequestParcel paramAdRequestParcel, String paramString)
  {
    Object localObject1 = this.zzAz.zzed();
    Object localObject2 = new com/google/android/gms/internal/zzhj$zza;
    ((zzhj.zza)localObject2).<init>((Context)localObject1);
    int i = ((zzhj.zza)localObject2).zzgI().zzKc;
    zzdz localzzdz = new com/google/android/gms/internal/zzdz;
    localzzdz.<init>(paramAdRequestParcel, paramString, i);
    localObject1 = (zzea)this.zzAx.get(localzzdz);
    if (localObject1 == null)
    {
      zza("Interstitial pool created at %s.", localzzdz);
      localObject1 = new com/google/android/gms/internal/zzea;
      ((zzea)localObject1).<init>(paramAdRequestParcel, paramString, i);
      localObject2 = this.zzAx;
      ((Map)localObject2).put(localzzdz, localObject1);
    }
    for (Object localObject3 = localObject1;; localObject3 = localObject1)
    {
      this.zzAy.remove(localzzdz);
      localObject1 = this.zzAy;
      ((LinkedList)localObject1).add(localzzdz);
      localzzdz.zzeg();
      int j;
      for (;;)
      {
        i = this.zzAy.size();
        localObject1 = (Integer)zzbt.zzwG.get();
        j = ((Integer)localObject1).intValue();
        if (i <= j) {
          break;
        }
        localObject1 = (zzdz)this.zzAy.remove();
        localObject2 = (zzea)this.zzAx.get(localObject1);
        Object localObject4 = "Evicting interstitial queue for %s.";
        zza((String)localObject4, (zzdz)localObject1);
        for (;;)
        {
          int k = ((zzea)localObject2).size();
          if (k <= 0) {
            break;
          }
          localObject4 = ((zzea)localObject2).zzej().zzAD;
          ((zzk)localObject4).zzbp();
        }
        localObject2 = this.zzAx;
        ((Map)localObject2).remove(localObject1);
      }
      boolean bool;
      for (;;)
      {
        j = ((zzea)localObject3).size();
        if (j <= 0) {
          break label364;
        }
        localObject2 = ((zzea)localObject3).zzej();
        bool = ((zzea.zza)localObject2).zzAG;
        if (!bool) {
          break;
        }
        long l1 = zzr.zzbG().currentTimeMillis();
        long l2 = ((zzea.zza)localObject2).zzAF;
        l1 -= l2;
        localObject1 = (Integer)zzbt.zzwI.get();
        long l3 = ((Integer)localObject1).intValue();
        l2 = 1000L * l3;
        bool = l1 < l2;
        if (!bool) {
          break;
        }
        localObject1 = "Expired interstitial at %s.";
        zza((String)localObject1, localzzdz);
      }
      zza("Pooled interstitial returned at %s.", localzzdz);
      for (localObject1 = localObject2;; localObject1 = null)
      {
        return (zzea.zza)localObject1;
        label364:
        bool = false;
      }
    }
  }
  
  void zza(zzdv paramzzdv)
  {
    zzdv localzzdv = this.zzAz;
    if (localzzdv == null)
    {
      this.zzAz = paramzzdv;
      restore();
    }
  }
  
  void zzee()
  {
    Object localObject1 = this.zzAz;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.zzAx.entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = (Map.Entry)localIterator.next();
        zzdz localzzdz = (zzdz)((Map.Entry)localObject1).getKey();
        localObject1 = (zzea)((Map.Entry)localObject1).getValue();
        for (;;)
        {
          int i = ((zzea)localObject1).size();
          Object localObject2 = (Integer)zzbt.zzwH.get();
          int j = ((Integer)localObject2).intValue();
          if (i >= j) {
            break;
          }
          zza("Pooling one interstitial for %s.", localzzdz);
          localObject2 = this.zzAz;
          ((zzea)localObject1).zzb((zzdv)localObject2);
        }
      }
      save();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */