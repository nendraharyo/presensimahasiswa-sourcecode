package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import com.google.android.gms.internal.zzrs;
import com.google.android.gms.internal.zzrs.zza;
import com.google.android.gms.internal.zzrs.zzc;
import com.google.android.gms.internal.zzrs.zze;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class zzcp
{
  private static final zzbw zzbkq;
  private final DataLayer zzbhN;
  private volatile String zzbkA;
  private int zzbkB;
  private final zzrs.zzc zzbkr;
  private final zzah zzbks;
  private final Map zzbkt;
  private final Map zzbku;
  private final Map zzbkv;
  private final zzl zzbkw;
  private final zzl zzbkx;
  private final Set zzbky;
  private final Map zzbkz;
  
  static
  {
    zzbw localzzbw = new com/google/android/gms/tagmanager/zzbw;
    zzag.zza localzza = zzdf.zzHF();
    localzzbw.<init>(localzza, true);
    zzbkq = localzzbw;
  }
  
  public zzcp(Context paramContext, zzrs.zzc paramzzc, DataLayer paramDataLayer, zzt.zza paramzza1, zzt.zza paramzza2, zzah paramzzah)
  {
    if (paramzzc == null)
    {
      localObject1 = new java/lang/NullPointerException;
      ((NullPointerException)localObject1).<init>("resource cannot be null");
      throw ((Throwable)localObject1);
    }
    this.zzbkr = paramzzc;
    Object localObject1 = new java/util/HashSet;
    Object localObject2 = paramzzc.zzHL();
    ((HashSet)localObject1).<init>((Collection)localObject2);
    this.zzbky = ((Set)localObject1);
    this.zzbhN = paramDataLayer;
    this.zzbks = paramzzah;
    localObject1 = new com/google/android/gms/tagmanager/zzcp$1;
    ((zzcp.1)localObject1).<init>(this);
    localObject2 = new com/google/android/gms/tagmanager/zzm;
    ((zzm)localObject2).<init>();
    localObject1 = ((zzm)localObject2).zza(i, (zzm.zza)localObject1);
    this.zzbkw = ((zzl)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcp$2;
    ((zzcp.2)localObject1).<init>(this);
    localObject2 = new com/google/android/gms/tagmanager/zzm;
    ((zzm)localObject2).<init>();
    localObject1 = ((zzm)localObject2).zza(i, (zzm.zza)localObject1);
    this.zzbkx = ((zzl)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzbkt = ((Map)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzj;
    ((zzj)localObject1).<init>(paramContext);
    zzb((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzt;
    ((zzt)localObject1).<init>(paramzza2);
    zzb((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzx;
    ((zzx)localObject1).<init>(paramDataLayer);
    zzb((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzdg;
    ((zzdg)localObject1).<init>(paramContext, paramDataLayer);
    zzb((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzdb;
    ((zzdb)localObject1).<init>(paramContext, paramDataLayer);
    zzb((zzak)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzbku = ((Map)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzr;
    ((zzr)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzae;
    ((zzae)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzaf;
    ((zzaf)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzam;
    ((zzam)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzan;
    ((zzan)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbc;
    ((zzbc)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbd;
    ((zzbd)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcf;
    ((zzcf)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcy;
    ((zzcy)localObject1).<init>();
    zzc((zzak)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzbkv = ((Map)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzb;
    ((zzb)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzc;
    ((zzc)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zze;
    ((zze)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzf;
    ((zzf)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzg;
    ((zzg)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzh;
    ((zzh)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzi;
    ((zzi)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzn;
    ((zzn)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzq;
    localObject2 = this.zzbkr.getVersion();
    ((zzq)localObject1).<init>((String)localObject2);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzt;
    ((zzt)localObject1).<init>(paramzza1);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzv;
    ((zzv)localObject1).<init>(paramDataLayer);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzaa;
    ((zzaa)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzab;
    ((zzab)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzad;
    ((zzad)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzai;
    ((zzai)localObject1).<init>(this);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzao;
    ((zzao)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzap;
    ((zzap)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzaw;
    ((zzaw)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzay;
    ((zzay)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbb;
    ((zzbb)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbi;
    ((zzbi)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbk;
    ((zzbk)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbx;
    ((zzbx)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzbz;
    ((zzbz)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcc;
    ((zzcc)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzce;
    ((zzce)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcg;
    ((zzcg)localObject1).<init>(paramContext);
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcq;
    ((zzcq)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzcr;
    ((zzcr)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzda;
    ((zzda)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new com/google/android/gms/tagmanager/zzdh;
    ((zzdh)localObject1).<init>();
    zza((zzak)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzbkz = ((Map)localObject1);
    localObject1 = this.zzbky;
    Object localObject3 = ((Set)localObject1).iterator();
    boolean bool2 = ((Iterator)localObject3).hasNext();
    Object localObject4;
    if (bool2)
    {
      localObject1 = (zzrs.zze)((Iterator)localObject3).next();
      boolean bool3 = paramzzah.zzGA();
      if (bool3)
      {
        localObject2 = ((zzrs.zze)localObject1).zzHT();
        localObject4 = ((zzrs.zze)localObject1).zzHU();
        zza((List)localObject2, (List)localObject4, "add macro");
        localObject2 = ((zzrs.zze)localObject1).zzHY();
        localObject4 = ((zzrs.zze)localObject1).zzHV();
        zza((List)localObject2, (List)localObject4, "remove macro");
        localObject2 = ((zzrs.zze)localObject1).zzHR();
        localObject4 = ((zzrs.zze)localObject1).zzHW();
        zza((List)localObject2, (List)localObject4, "add tag");
        localObject2 = ((zzrs.zze)localObject1).zzHS();
        localObject4 = ((zzrs.zze)localObject1).zzHX();
        localObject5 = "remove tag";
        zza((List)localObject2, (List)localObject4, (String)localObject5);
      }
      int k = 0;
      localObject5 = null;
      int j;
      Object localObject6;
      String str;
      for (;;)
      {
        localObject2 = ((zzrs.zze)localObject1).zzHT();
        j = ((List)localObject2).size();
        if (k >= j) {
          break;
        }
        localObject2 = (zzrs.zza)((zzrs.zze)localObject1).zzHT().get(k);
        localObject4 = "Unknown";
        boolean bool5 = paramzzah.zzGA();
        if (bool5)
        {
          localObject6 = ((zzrs.zze)localObject1).zzHU();
          int m = ((List)localObject6).size();
          if (k < m) {
            localObject4 = (String)((zzrs.zze)localObject1).zzHU().get(k);
          }
        }
        localObject6 = this.zzbkz;
        str = zza((zzrs.zza)localObject2);
        localObject6 = zzi((Map)localObject6, str);
        ((zzcp.zzc)localObject6).zza((zzrs.zze)localObject1);
        ((zzcp.zzc)localObject6).zza((zzrs.zze)localObject1, (zzrs.zza)localObject2);
        ((zzcp.zzc)localObject6).zza((zzrs.zze)localObject1, (String)localObject4);
        j = k + 1;
        k = j;
      }
      k = 0;
      localObject5 = null;
      for (;;)
      {
        localObject2 = ((zzrs.zze)localObject1).zzHY();
        j = ((List)localObject2).size();
        if (k >= j) {
          break;
        }
        localObject2 = (zzrs.zza)((zzrs.zze)localObject1).zzHY().get(k);
        localObject4 = "Unknown";
        boolean bool6 = paramzzah.zzGA();
        if (bool6)
        {
          localObject6 = ((zzrs.zze)localObject1).zzHV();
          int n = ((List)localObject6).size();
          if (k < n) {
            localObject4 = (String)((zzrs.zze)localObject1).zzHV().get(k);
          }
        }
        localObject6 = this.zzbkz;
        str = zza((zzrs.zza)localObject2);
        localObject6 = zzi((Map)localObject6, str);
        ((zzcp.zzc)localObject6).zza((zzrs.zze)localObject1);
        ((zzcp.zzc)localObject6).zzb((zzrs.zze)localObject1, (zzrs.zza)localObject2);
        ((zzcp.zzc)localObject6).zzb((zzrs.zze)localObject1, (String)localObject4);
        j = k + 1;
        k = j;
      }
    }
    localObject1 = this.zzbkr.zzHM().entrySet();
    Object localObject5 = ((Set)localObject1).iterator();
    bool2 = ((Iterator)localObject5).hasNext();
    if (bool2)
    {
      localObject1 = (Map.Entry)((Iterator)localObject5).next();
      localObject2 = (List)((Map.Entry)localObject1).getValue();
      localIterator = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool4 = localIterator.hasNext();
        if (!bool4) {
          break;
        }
        localObject2 = (zzrs.zza)localIterator.next();
        localObject4 = ((zzrs.zza)localObject2).zzHI();
        localObject3 = com.google.android.gms.internal.zzae.zzgt.toString();
        localObject4 = zzdf.zzk((zzag.zza)((Map)localObject4).get(localObject3));
        boolean bool1 = ((Boolean)localObject4).booleanValue();
        if (!bool1)
        {
          localObject3 = this.zzbkz;
          localObject4 = (String)((Map.Entry)localObject1).getKey();
          localObject4 = zzi((Map)localObject3, (String)localObject4);
          ((zzcp.zzc)localObject4).zzb((zzrs.zza)localObject2);
        }
      }
    }
  }
  
  private String zzHf()
  {
    int i = this.zzbkB;
    int j = 1;
    if (i <= j) {}
    StringBuilder localStringBuilder;
    for (String str = "";; str = localStringBuilder.toString())
    {
      return str;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = Integer.toString(this.zzbkB);
      localStringBuilder.append(str);
      i = 2;
      for (;;)
      {
        int k = this.zzbkB;
        if (i >= k) {
          break;
        }
        k = 32;
        localStringBuilder.append(k);
        i += 1;
      }
      localStringBuilder.append(": ");
    }
  }
  
  private zzbw zza(zzag.zza paramzza, Set paramSet, zzdi paramzzdi)
  {
    boolean bool1 = paramzza.zzjH;
    Object localObject1;
    if (!bool1)
    {
      localObject1 = new com/google/android/gms/tagmanager/zzbw;
      boolean bool3 = true;
      ((zzbw)localObject1).<init>(paramzza, bool3);
    }
    for (;;)
    {
      return (zzbw)localObject1;
      int i = paramzza.type;
      Object localObject2;
      int k;
      zzag.zza localzza;
      Object localObject3;
      switch (i)
      {
      case 5: 
      case 6: 
      default: 
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = "Unknown type: ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        k = paramzza.type;
        zzbg.e(k);
        localObject1 = zzbkq;
        break;
      case 2: 
        localzza = zzrs.zzo(paramzza);
        i = paramzza.zzjy.length;
        localObject1 = new zzag.zza[i];
        localzza.zzjy = ((zzag.zza[])localObject1);
        k = 0;
        localObject2 = null;
        for (;;)
        {
          localObject1 = paramzza.zzjy;
          i = localObject1.length;
          if (k >= i) {
            break label265;
          }
          localObject1 = paramzza.zzjy[k];
          localObject3 = paramzzdi.zzkh(k);
          localObject1 = zza((zzag.zza)localObject1, paramSet, (zzdi)localObject3);
          localObject3 = zzbkq;
          if (localObject1 == localObject3)
          {
            localObject1 = zzbkq;
            break;
          }
          localObject3 = localzza.zzjy;
          localObject1 = (zzag.zza)((zzbw)localObject1).getObject();
          localObject3[k] = localObject1;
          i = k + 1;
          k = i;
        }
        localObject1 = new com/google/android/gms/tagmanager/zzbw;
        ((zzbw)localObject1).<init>(localzza, false);
        break;
      case 3: 
        localzza = zzrs.zzo(paramzza);
        localObject1 = paramzza.zzjz;
        i = localObject1.length;
        localObject2 = paramzza.zzjA;
        k = localObject2.length;
        if (i != k)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Invalid serving value: ");
          localObject2 = paramzza.toString();
          zzbg.e((String)localObject2);
          localObject1 = zzbkq;
        }
        else
        {
          localObject1 = new zzag.zza[paramzza.zzjz.length];
          localzza.zzjz = ((zzag.zza[])localObject1);
          i = paramzza.zzjz.length;
          localObject1 = new zzag.zza[i];
          localzza.zzjA = ((zzag.zza[])localObject1);
          k = 0;
          localObject2 = null;
          for (;;)
          {
            localObject1 = paramzza.zzjz;
            i = localObject1.length;
            if (k >= i) {
              break label578;
            }
            localObject1 = paramzza.zzjz[k];
            localObject3 = paramzzdi.zzki(k);
            localObject1 = zza((zzag.zza)localObject1, paramSet, (zzdi)localObject3);
            localObject3 = paramzza.zzjA[k];
            Object localObject4 = paramzzdi.zzkj(k);
            localObject3 = zza((zzag.zza)localObject3, paramSet, (zzdi)localObject4);
            localObject4 = zzbkq;
            if (localObject1 != localObject4)
            {
              localObject4 = zzbkq;
              if (localObject3 != localObject4) {}
            }
            else
            {
              localObject1 = zzbkq;
              break;
            }
            localObject4 = localzza.zzjz;
            localObject1 = (zzag.zza)((zzbw)localObject1).getObject();
            localObject4[k] = localObject1;
            localObject4 = localzza.zzjA;
            localObject1 = (zzag.zza)((zzbw)localObject3).getObject();
            localObject4[k] = localObject1;
            i = k + 1;
            k = i;
          }
          localObject1 = new com/google/android/gms/tagmanager/zzbw;
          ((zzbw)localObject1).<init>(localzza, false);
        }
        break;
      case 4: 
        localObject1 = paramzza.zzjB;
        boolean bool2 = paramSet.contains(localObject1);
        if (bool2)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("Macro cycle detected.  Current macro reference: ");
          localObject2 = paramzza.zzjB;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(".").append("  Previous macro references: ");
          localObject2 = paramSet.toString();
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = ".";
          zzbg.e((String)localObject2);
          localObject1 = zzbkq;
        }
        else
        {
          localObject1 = paramzza.zzjB;
          paramSet.add(localObject1);
          localObject1 = paramzza.zzjB;
          localObject2 = paramzzdi.zzGO();
          localObject1 = zza((String)localObject1, paramSet, (zzbj)localObject2);
          localObject2 = paramzza.zzjG;
          localObject1 = zzdj.zza((zzbw)localObject1, (int[])localObject2);
          localObject2 = paramzza.zzjB;
          paramSet.remove(localObject2);
        }
        break;
      case 7: 
        label265:
        label578:
        localzza = zzrs.zzo(paramzza);
        int j = paramzza.zzjF.length;
        localObject1 = new zzag.zza[j];
        localzza.zzjF = ((zzag.zza[])localObject1);
        k = 0;
        localObject2 = null;
        for (;;)
        {
          localObject1 = paramzza.zzjF;
          j = localObject1.length;
          if (k >= j) {
            break label914;
          }
          localObject1 = paramzza.zzjF[k];
          localObject3 = paramzzdi.zzkk(k);
          localObject1 = zza((zzag.zza)localObject1, paramSet, (zzdi)localObject3);
          localObject3 = zzbkq;
          if (localObject1 == localObject3)
          {
            localObject1 = zzbkq;
            break;
          }
          localObject3 = localzza.zzjF;
          localObject1 = (zzag.zza)((zzbw)localObject1).getObject();
          localObject3[k] = localObject1;
          j = k + 1;
          k = j;
        }
        label914:
        localObject1 = new com/google/android/gms/tagmanager/zzbw;
        ((zzbw)localObject1).<init>(localzza, false);
      }
    }
  }
  
  private zzbw zza(String paramString, Set paramSet, zzbj paramzzbj)
  {
    int i = 1;
    int j = this.zzbkB + 1;
    this.zzbkB = j;
    Object localObject1 = (zzcp.zzb)this.zzbkx.get(paramString);
    int m;
    if (localObject1 != null)
    {
      localObject2 = this.zzbks;
      boolean bool3 = ((zzah)localObject2).zzGA();
      if (!bool3)
      {
        localObject2 = ((zzcp.zzb)localObject1).zzHh();
        zza((zzag.zza)localObject2, paramSet);
        m = this.zzbkB + -1;
        this.zzbkB = m;
      }
    }
    Object localObject3;
    for (localObject1 = ((zzcp.zzb)localObject1).zzHg();; localObject1 = zzbkq)
    {
      return (zzbw)localObject1;
      localObject1 = this.zzbkz.get(paramString);
      localObject3 = localObject1;
      localObject3 = (zzcp.zzc)localObject1;
      if (localObject3 != null) {
        break;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = zzHf();
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "Invalid macro: ";
      zzbg.e((String)localObject2 + paramString);
      j = this.zzbkB + -1;
      this.zzbkB = j;
    }
    Object localObject4 = ((zzcp.zzc)localObject3).zzHi();
    Object localObject5 = ((zzcp.zzc)localObject3).zzHj();
    Map localMap1 = ((zzcp.zzc)localObject3).zzHk();
    Map localMap2 = ((zzcp.zzc)localObject3).zzHm();
    Map localMap3 = ((zzcp.zzc)localObject3).zzHl();
    zzco localzzco = paramzzbj.zzGq();
    localObject1 = this;
    Object localObject2 = paramString;
    localObject2 = zza(paramString, (Set)localObject4, (Map)localObject5, localMap1, localMap2, localMap3, paramSet, localzzco);
    localObject1 = (Set)((zzbw)localObject2).getObject();
    boolean bool1 = ((Set)localObject1).isEmpty();
    if (bool1) {
      localObject1 = ((zzcp.zzc)localObject3).zzHn();
    }
    for (localObject4 = localObject1;; localObject4 = localObject1)
    {
      if (localObject4 != null) {
        break label430;
      }
      int k = this.zzbkB + -1;
      this.zzbkB = k;
      localObject1 = zzbkq;
      break;
      localObject1 = (Set)((zzbw)localObject2).getObject();
      k = ((Set)localObject1).size();
      if (k > i)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = zzHf();
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = "Multiple macros active for macroName ";
        localObject1 = (String)localObject4 + paramString;
        zzbg.zzaK((String)localObject1);
      }
      localObject1 = (zzrs.zza)((Set)((zzbw)localObject2).getObject()).iterator().next();
    }
    label430:
    localObject1 = this.zzbkv;
    localObject5 = paramzzbj.zzGG();
    localObject5 = zza((Map)localObject1, (zzrs.zza)localObject4, paramSet, (zzch)localObject5);
    boolean bool2 = ((zzbw)localObject2).zzGP();
    if (bool2)
    {
      bool2 = ((zzbw)localObject5).zzGP();
      if (bool2)
      {
        bool2 = i;
        label485:
        localObject2 = zzbkq;
        if (localObject5 != localObject2) {
          break label584;
        }
      }
    }
    for (localObject1 = zzbkq;; localObject1 = localObject2)
    {
      localObject2 = ((zzrs.zza)localObject4).zzHh();
      boolean bool4 = ((zzbw)localObject1).zzGP();
      if (bool4)
      {
        localObject4 = this.zzbkx;
        localObject5 = new com/google/android/gms/tagmanager/zzcp$zzb;
        ((zzcp.zzb)localObject5).<init>((zzbw)localObject1, (zzag.zza)localObject2);
        ((zzl)localObject4).zzh(paramString, localObject5);
      }
      zza((zzag.zza)localObject2, paramSet);
      m = this.zzbkB + -1;
      this.zzbkB = m;
      break;
      bool2 = false;
      localObject1 = null;
      break label485;
      label584:
      localObject2 = new com/google/android/gms/tagmanager/zzbw;
      localObject5 = ((zzbw)localObject5).getObject();
      ((zzbw)localObject2).<init>(localObject5, bool2);
    }
  }
  
  private zzbw zza(Map paramMap, zzrs.zza paramzza, Set paramSet, zzch paramzzch)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = paramzza.zzHI();
    Object localObject2 = com.google.android.gms.internal.zzae.zzfG.toString();
    localObject1 = (zzag.zza)((Map)localObject1).get(localObject2);
    if (localObject1 == null)
    {
      localObject1 = "No function id in properties";
      zzbg.e((String)localObject1);
      localObject2 = zzbkq;
    }
    HashMap localHashMap;
    boolean bool3;
    boolean bool4;
    for (;;)
    {
      return (zzbw)localObject2;
      String str = ((zzag.zza)localObject1).zzjC;
      localObject1 = (zzak)paramMap.get(str);
      if (localObject1 == null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = str + " has no backing implementation.";
        zzbg.e((String)localObject1);
        localObject2 = zzbkq;
      }
      else
      {
        localObject2 = (zzbw)this.zzbkw.get(paramzza);
        Object localObject3;
        boolean bool2;
        if (localObject2 != null)
        {
          localObject3 = this.zzbks;
          bool2 = ((zzah)localObject3).zzGA();
          if (!bool2) {}
        }
        else
        {
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          localObject2 = paramzza.zzHI().entrySet();
          Iterator localIterator = ((Set)localObject2).iterator();
          bool3 = bool1;
          float f2 = f1;
          bool4 = localIterator.hasNext();
          if (bool4)
          {
            localObject2 = (Map.Entry)localIterator.next();
            localObject3 = (String)((Map.Entry)localObject2).getKey();
            Object localObject4 = paramzzch.zzgj((String)localObject3);
            localObject3 = (zzag.zza)((Map.Entry)localObject2).getValue();
            Object localObject5 = (zzag.zza)((Map.Entry)localObject2).getValue();
            localObject5 = ((zzcj)localObject4).zze((zzag.zza)localObject5);
            localObject4 = zza((zzag.zza)localObject3, paramSet, (zzdi)localObject5);
            localObject3 = zzbkq;
            if (localObject4 == localObject3)
            {
              localObject2 = zzbkq;
            }
            else
            {
              bool2 = ((zzbw)localObject4).zzGP();
              if (bool2)
              {
                localObject3 = (String)((Map.Entry)localObject2).getKey();
                localObject5 = (zzag.zza)((zzbw)localObject4).getObject();
                paramzza.zza((String)localObject3, (zzag.zza)localObject5);
                bool2 = bool3;
              }
              for (float f3 = f2;; f3 = 0.0F)
              {
                localObject2 = ((Map.Entry)localObject2).getKey();
                localObject5 = ((zzbw)localObject4).getObject();
                localHashMap.put(localObject2, localObject5);
                bool3 = bool2;
                f2 = f3;
                break;
                bool2 = false;
                localObject3 = null;
              }
            }
          }
          else
          {
            localObject2 = localHashMap.keySet();
            bool4 = ((zzak)localObject1).zze((Set)localObject2);
            if (bool4) {
              break;
            }
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject2 = ((StringBuilder)localObject2).append("Incorrect keys for function ").append(str);
            localObject3 = " required ";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
            localObject1 = ((zzak)localObject1).zzGC();
            localObject1 = ((StringBuilder)localObject2).append(localObject1).append(" had ");
            localObject2 = localHashMap.keySet();
            localObject1 = localObject2;
            zzbg.e((String)localObject1);
            localObject2 = zzbkq;
          }
        }
      }
    }
    if (bool3)
    {
      bool4 = ((zzak)localObject1).zzFW();
      if (!bool4) {}
    }
    for (;;)
    {
      localObject2 = new com/google/android/gms/tagmanager/zzbw;
      localObject1 = ((zzak)localObject1).zzP(localHashMap);
      ((zzbw)localObject2).<init>(localObject1, bool1);
      if (bool1)
      {
        localObject1 = this.zzbkw;
        ((zzl)localObject1).zzh(paramzza, localObject2);
      }
      localObject1 = (zzag.zza)((zzbw)localObject2).getObject();
      paramzzch.zzd((zzag.zza)localObject1);
      break;
      bool1 = false;
      f1 = 0.0F;
    }
  }
  
  private zzbw zza(Set paramSet1, Set paramSet2, zzcp.zza paramzza, zzco paramzzco)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    HashSet localHashSet1 = new java/util/HashSet;
    localHashSet1.<init>();
    HashSet localHashSet2 = new java/util/HashSet;
    localHashSet2.<init>();
    Iterator localIterator = paramSet1.iterator();
    boolean bool2 = bool1;
    boolean bool3 = localIterator.hasNext();
    if (bool3)
    {
      localObject = (zzrs.zze)localIterator.next();
      zzck localzzck = paramzzco.zzGN();
      zzbw localzzbw = zza((zzrs.zze)localObject, paramSet2, localzzck);
      Boolean localBoolean = (Boolean)localzzbw.getObject();
      boolean bool4 = localBoolean.booleanValue();
      if (bool4) {
        paramzza.zza((zzrs.zze)localObject, localHashSet1, localHashSet2, localzzck);
      }
      if (bool2)
      {
        bool3 = localzzbw.zzGP();
        if (bool3) {
          bool3 = bool1;
        }
      }
      for (;;)
      {
        bool2 = bool3;
        break;
        bool3 = false;
        localObject = null;
      }
    }
    localHashSet1.removeAll(localHashSet2);
    paramzzco.zzf(localHashSet1);
    Object localObject = new com/google/android/gms/tagmanager/zzbw;
    ((zzbw)localObject).<init>(localHashSet1, bool2);
    return (zzbw)localObject;
  }
  
  private static String zza(zzrs.zza paramzza)
  {
    Map localMap = paramzza.zzHI();
    String str = com.google.android.gms.internal.zzae.zzfR.toString();
    return zzdf.zzg((zzag.zza)localMap.get(str));
  }
  
  private void zza(zzag.zza paramzza, Set paramSet)
  {
    if (paramzza == null) {}
    for (;;)
    {
      return;
      Object localObject1 = new com/google/android/gms/tagmanager/zzbu;
      ((zzbu)localObject1).<init>();
      localObject1 = zza(paramzza, paramSet, (zzdi)localObject1);
      Object localObject2 = zzbkq;
      if (localObject1 != localObject2)
      {
        localObject1 = zzdf.zzl((zzag.zza)((zzbw)localObject1).getObject());
        boolean bool1 = localObject1 instanceof Map;
        if (bool1)
        {
          localObject1 = (Map)localObject1;
          localObject2 = this.zzbhN;
          ((DataLayer)localObject2).push((Map)localObject1);
        }
        else
        {
          bool1 = localObject1 instanceof List;
          if (bool1)
          {
            localObject1 = (List)localObject1;
            localObject2 = ((List)localObject1).iterator();
            for (;;)
            {
              boolean bool2 = ((Iterator)localObject2).hasNext();
              if (!bool2) {
                break;
              }
              localObject1 = ((Iterator)localObject2).next();
              boolean bool3 = localObject1 instanceof Map;
              if (bool3)
              {
                localObject1 = (Map)localObject1;
                DataLayer localDataLayer = this.zzbhN;
                localDataLayer.push((Map)localObject1);
              }
              else
              {
                localObject1 = "pushAfterEvaluate: value not a Map";
                zzbg.zzaK((String)localObject1);
              }
            }
          }
          localObject1 = "pushAfterEvaluate: value not a Map or List";
          zzbg.zzaK((String)localObject1);
        }
      }
    }
  }
  
  private static void zza(List paramList1, List paramList2, String paramString)
  {
    int i = paramList1.size();
    int j = paramList2.size();
    if (i != j)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Invalid resource: imbalance of rule names of functions for ").append(paramString);
      String str = " operation. Using default rule name instead";
      localObject = str;
      zzbg.zzaJ((String)localObject);
    }
  }
  
  private static void zza(Map paramMap, zzak paramzzak)
  {
    Object localObject1 = paramzzak.zzGB();
    boolean bool = paramMap.containsKey(localObject1);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Duplicate function type name: ");
      String str = paramzzak.zzGB();
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = paramzzak.zzGB();
    paramMap.put(localObject1, paramzzak);
  }
  
  private static zzcp.zzc zzi(Map paramMap, String paramString)
  {
    zzcp.zzc localzzc = (zzcp.zzc)paramMap.get(paramString);
    if (localzzc == null)
    {
      localzzc = new com/google/android/gms/tagmanager/zzcp$zzc;
      localzzc.<init>();
      paramMap.put(paramString, localzzc);
    }
    return localzzc;
  }
  
  public void zzF(List paramList)
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        Iterator localIterator = paramList.iterator();
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        Object localObject1 = localIterator.next();
        localObject1 = (zzaf.zzi)localObject1;
        localObject2 = ((zzaf.zzi)localObject1).name;
        String str;
        if (localObject2 != null)
        {
          localObject2 = ((zzaf.zzi)localObject1).name;
          str = "gaExperiment:";
          boolean bool2 = ((String)localObject2).startsWith(str);
          if (bool2) {}
        }
        else
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          str = "Ignored supplemental: ";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject1 = ((StringBuilder)localObject2).append(localObject1);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzbg.v((String)localObject1);
          continue;
        }
        localObject2 = this.zzbhN;
      }
      finally {}
      zzaj.zza((DataLayer)localObject2, localzzi);
    }
  }
  
  String zzHe()
  {
    try
    {
      String str = this.zzbkA;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  zzbw zza(zzrs.zza paramzza, Set paramSet, zzch paramzzch)
  {
    Object localObject1 = this.zzbku;
    zzbw localzzbw = zza((Map)localObject1, paramzza, paramSet, paramzzch);
    localObject1 = zzdf.zzk((zzag.zza)localzzbw.getObject());
    Object localObject2 = zzdf.zzR(localObject1);
    paramzzch.zzd((zzag.zza)localObject2);
    localObject2 = new com/google/android/gms/tagmanager/zzbw;
    boolean bool = localzzbw.zzGP();
    ((zzbw)localObject2).<init>(localObject1, bool);
    return (zzbw)localObject2;
  }
  
  zzbw zza(zzrs.zze paramzze, Set paramSet, zzck paramzzck)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    Object localObject1 = paramzze.zzHQ();
    Iterator localIterator = ((List)localObject1).iterator();
    boolean bool2 = bool1;
    boolean bool3 = localIterator.hasNext();
    Object localObject2;
    Boolean localBoolean1;
    if (bool3)
    {
      localObject1 = (zzrs.zza)localIterator.next();
      localObject2 = paramzzck.zzGH();
      localObject2 = zza((zzrs.zza)localObject1, paramSet, (zzch)localObject2);
      localObject1 = (Boolean)((zzbw)localObject2).getObject();
      bool3 = ((Boolean)localObject1).booleanValue();
      if (bool3)
      {
        localObject1 = zzdf.zzR(Boolean.valueOf(false));
        paramzzck.zzf((zzag.zza)localObject1);
        localObject1 = new com/google/android/gms/tagmanager/zzbw;
        localBoolean1 = Boolean.valueOf(false);
        bool1 = ((zzbw)localObject2).zzGP();
        ((zzbw)localObject1).<init>(localBoolean1, bool1);
      }
    }
    for (;;)
    {
      return (zzbw)localObject1;
      if (bool2)
      {
        bool3 = ((zzbw)localObject2).zzGP();
        if (bool3) {
          bool3 = bool1;
        }
      }
      for (;;)
      {
        bool2 = bool3;
        break;
        bool3 = false;
        localObject1 = null;
      }
      localObject1 = paramzze.zzHP();
      localIterator = ((List)localObject1).iterator();
      for (;;)
      {
        bool3 = localIterator.hasNext();
        if (!bool3) {
          break label339;
        }
        localObject1 = (zzrs.zza)localIterator.next();
        localObject2 = paramzzck.zzGI();
        localObject2 = zza((zzrs.zza)localObject1, paramSet, (zzch)localObject2);
        localObject1 = (Boolean)((zzbw)localObject2).getObject();
        bool3 = ((Boolean)localObject1).booleanValue();
        if (!bool3)
        {
          localObject1 = zzdf.zzR(Boolean.valueOf(false));
          paramzzck.zzf((zzag.zza)localObject1);
          localObject1 = new com/google/android/gms/tagmanager/zzbw;
          localBoolean1 = Boolean.valueOf(false);
          bool1 = ((zzbw)localObject2).zzGP();
          ((zzbw)localObject1).<init>(localBoolean1, bool1);
          break;
        }
        if (bool2)
        {
          bool3 = ((zzbw)localObject2).zzGP();
          if (bool3)
          {
            bool2 = bool1;
            continue;
          }
        }
        bool2 = false;
        localBoolean1 = null;
      }
      label339:
      localObject1 = zzdf.zzR(Boolean.valueOf(bool1));
      paramzzck.zzf((zzag.zza)localObject1);
      localObject1 = new com/google/android/gms/tagmanager/zzbw;
      Boolean localBoolean2 = Boolean.valueOf(bool1);
      ((zzbw)localObject1).<init>(localBoolean2, bool2);
    }
  }
  
  zzbw zza(String paramString, Set paramSet1, Map paramMap1, Map paramMap2, Map paramMap3, Map paramMap4, Set paramSet2, zzco paramzzco)
  {
    zzcp.3 local3 = new com/google/android/gms/tagmanager/zzcp$3;
    local3.<init>(this, paramMap1, paramMap2, paramMap3, paramMap4);
    return zza(paramSet1, paramSet2, local3, paramzzco);
  }
  
  zzbw zza(Set paramSet, zzco paramzzco)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    zzcp.4 local4 = new com/google/android/gms/tagmanager/zzcp$4;
    local4.<init>(this);
    return zza(paramSet, localHashSet, local4, paramzzco);
  }
  
  void zza(zzak paramzzak)
  {
    zza(this.zzbkv, paramzzak);
  }
  
  void zzb(zzak paramzzak)
  {
    zza(this.zzbkt, paramzzak);
  }
  
  void zzc(zzak paramzzak)
  {
    zza(this.zzbku, paramzzak);
  }
  
  public void zzfR(String paramString)
  {
    try
    {
      zzgo(paramString);
      Object localObject1 = this.zzbks;
      zzag localzzag = ((zzah)localObject1).zzge(paramString);
      zzu localzzu = localzzag.zzGy();
      localObject1 = this.zzbky;
      Object localObject4 = localzzu.zzGq();
      localObject1 = zza((Set)localObject1, (zzco)localObject4);
      localObject1 = ((zzbw)localObject1).getObject();
      localObject1 = (Set)localObject1;
      localObject4 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject4).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((Iterator)localObject4).next();
        localObject1 = (zzrs.zza)localObject1;
        Map localMap = this.zzbkt;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        zzch localzzch = localzzu.zzGp();
        zza(localMap, (zzrs.zza)localObject1, localHashSet, localzzch);
      }
      localzzag.zzGz();
    }
    finally {}
    boolean bool = false;
    Object localObject3 = null;
    zzgo(null);
  }
  
  public zzbw zzgn(String paramString)
  {
    this.zzbkB = 0;
    zzag localzzag = this.zzbks.zzgd(paramString);
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    zzbj localzzbj = localzzag.zzGx();
    localObject = zza(paramString, (Set)localObject, localzzbj);
    localzzag.zzGz();
    return (zzbw)localObject;
  }
  
  void zzgo(String paramString)
  {
    try
    {
      this.zzbkA = paramString;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */