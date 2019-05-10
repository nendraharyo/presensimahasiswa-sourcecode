package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class zzig
{
  private boolean zzJu;
  private final LinkedList zzLf;
  private final String zzLg;
  private final String zzLh;
  private long zzLi;
  private long zzLj;
  private long zzLk;
  private long zzLl;
  private long zzLm;
  private long zzLn;
  private final Object zzpV;
  private final zzih zzqV;
  
  public zzig(zzih paramzzih, String paramString1, String paramString2)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzLi = l;
    this.zzLj = l;
    this.zzJu = false;
    this.zzLk = l;
    this.zzLl = 0L;
    this.zzLm = l;
    this.zzLn = l;
    this.zzqV = paramzzih;
    this.zzLg = paramString1;
    this.zzLh = paramString2;
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzLf = ((LinkedList)localObject);
  }
  
  public zzig(String paramString1, String paramString2)
  {
    this(localzzih, paramString1, paramString2);
  }
  
  public Bundle toBundle()
  {
    Bundle localBundle;
    Object localObject4;
    synchronized (this.zzpV)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      Object localObject2 = "seq_num";
      localObject4 = this.zzLg;
      localBundle.putString((String)localObject2, (String)localObject4);
      localObject2 = "slotid";
      localObject4 = this.zzLh;
      localBundle.putString((String)localObject2, (String)localObject4);
      localObject2 = "ismediation";
      boolean bool1 = this.zzJu;
      localBundle.putBoolean((String)localObject2, bool1);
      localObject2 = "treq";
      long l = this.zzLm;
      localBundle.putLong((String)localObject2, l);
      localObject2 = "tresponse";
      l = this.zzLn;
      localBundle.putLong((String)localObject2, l);
      localObject2 = "timp";
      l = this.zzLj;
      localBundle.putLong((String)localObject2, l);
      localObject2 = "tload";
      l = this.zzLk;
      localBundle.putLong((String)localObject2, l);
      localObject2 = "pcc";
      l = this.zzLl;
      localBundle.putLong((String)localObject2, l);
      localObject2 = "tfetch";
      l = this.zzLi;
      localBundle.putLong((String)localObject2, l);
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>();
      localObject2 = this.zzLf;
      Iterator localIterator = ((LinkedList)localObject2).iterator();
      boolean bool2 = localIterator.hasNext();
      if (bool2)
      {
        localObject2 = localIterator.next();
        localObject2 = (zzig.zza)localObject2;
        localObject2 = ((zzig.zza)localObject2).toBundle();
        ((ArrayList)localObject4).add(localObject2);
      }
    }
    String str = "tclick";
    localBundle.putParcelableArrayList(str, (ArrayList)localObject4);
    return localBundle;
  }
  
  public void zzA(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      long l1 = this.zzLn;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        this.zzJu = paramBoolean;
        zzih localzzih = this.zzqV;
        localzzih.zza(this);
      }
      return;
    }
  }
  
  public void zzgS()
  {
    long l1 = -1;
    synchronized (this.zzpV)
    {
      long l2 = this.zzLn;
      boolean bool = l2 < l1;
      if (bool)
      {
        l2 = this.zzLj;
        bool = l2 < l1;
        if (!bool)
        {
          l2 = SystemClock.elapsedRealtime();
          this.zzLj = l2;
          localObject2 = this.zzqV;
          ((zzih)localObject2).zza(this);
        }
      }
      Object localObject2 = this.zzqV;
      localObject2 = ((zzih)localObject2).zzha();
      ((zzii)localObject2).zzgS();
      return;
    }
  }
  
  public void zzgT()
  {
    synchronized (this.zzpV)
    {
      long l1 = this.zzLn;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        Object localObject2 = new com/google/android/gms/internal/zzig$zza;
        ((zzig.zza)localObject2).<init>();
        ((zzig.zza)localObject2).zzgX();
        LinkedList localLinkedList = this.zzLf;
        localLinkedList.add(localObject2);
        l1 = this.zzLl;
        l2 = 1L;
        l1 += l2;
        this.zzLl = l1;
        localObject2 = this.zzqV;
        localObject2 = ((zzih)localObject2).zzha();
        ((zzii)localObject2).zzgT();
        localObject2 = this.zzqV;
        ((zzih)localObject2).zza(this);
      }
      return;
    }
  }
  
  public void zzgU()
  {
    long l1 = -1;
    synchronized (this.zzpV)
    {
      long l2 = this.zzLn;
      boolean bool1 = l2 < l1;
      if (bool1)
      {
        Object localObject2 = this.zzLf;
        bool1 = ((LinkedList)localObject2).isEmpty();
        if (!bool1)
        {
          localObject2 = this.zzLf;
          localObject2 = ((LinkedList)localObject2).getLast();
          localObject2 = (zzig.zza)localObject2;
          l2 = ((zzig.zza)localObject2).zzgV();
          boolean bool2 = l2 < l1;
          if (!bool2)
          {
            ((zzig.zza)localObject2).zzgW();
            localObject2 = this.zzqV;
            ((zzih)localObject2).zza(this);
          }
        }
      }
      return;
    }
  }
  
  public void zzk(AdRequestParcel paramAdRequestParcel)
  {
    synchronized (this.zzpV)
    {
      long l = SystemClock.elapsedRealtime();
      this.zzLm = l;
      Object localObject2 = this.zzqV;
      localObject2 = ((zzih)localObject2).zzha();
      l = this.zzLm;
      ((zzii)localObject2).zzb(paramAdRequestParcel, l);
      return;
    }
  }
  
  public void zzl(long paramLong)
  {
    synchronized (this.zzpV)
    {
      this.zzLn = paramLong;
      long l1 = this.zzLn;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        zzih localzzih = this.zzqV;
        localzzih.zza(this);
      }
      return;
    }
  }
  
  public void zzm(long paramLong)
  {
    synchronized (this.zzpV)
    {
      long l1 = this.zzLn;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        this.zzLi = paramLong;
        zzih localzzih = this.zzqV;
        localzzih.zza(this);
      }
      return;
    }
  }
  
  public void zzz(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      long l1 = this.zzLn;
      long l2 = -1;
      boolean bool = l1 < l2;
      if (bool)
      {
        l1 = SystemClock.elapsedRealtime();
        this.zzLk = l1;
        if (!paramBoolean)
        {
          l1 = this.zzLk;
          this.zzLj = l1;
          zzih localzzih = this.zzqV;
          localzzih.zza(this);
        }
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */