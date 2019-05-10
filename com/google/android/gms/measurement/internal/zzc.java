package com.google.android.gms.measurement.internal;

import android.support.v4.h.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzpz.zza;
import com.google.android.gms.internal.zzpz.zzb;
import com.google.android.gms.internal.zzpz.zzc;
import com.google.android.gms.internal.zzpz.zzd;
import com.google.android.gms.internal.zzpz.zze;
import com.google.android.gms.internal.zzpz.zzf;
import com.google.android.gms.internal.zzqb.zza;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zzc;
import com.google.android.gms.internal.zzqb.zzf;
import com.google.android.gms.internal.zzqb.zzg;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

class zzc
  extends zzz
{
  zzc(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private Boolean zza(zzpz.zzb paramzzb, zzqb.zzb paramzzb1, long paramLong)
  {
    Object localObject1 = paramzzb.zzaZz;
    Object localObject2;
    int i;
    float f;
    if (localObject1 != null)
    {
      localObject1 = new com/google/android/gms/measurement/internal/zzs;
      localObject2 = paramzzb.zzaZz;
      ((zzs)localObject1).<init>((zzpz.zzd)localObject2);
      localObject1 = ((zzs)localObject1).zzac(paramLong);
      if (localObject1 == null)
      {
        i = 0;
        f = 0.0F;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return (Boolean)localObject1;
      i = ((Boolean)localObject1).booleanValue();
      if (i == 0)
      {
        i = 0;
        f = 0.0F;
        localObject1 = Boolean.valueOf(false);
      }
      else
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>();
        Object localObject3 = paramzzb.zzaZx;
        int m = localObject3.length;
        i = 0;
        f = 0.0F;
        localObject1 = null;
        Object localObject4;
        for (;;)
        {
          if (i >= m) {
            break label210;
          }
          String str = localObject3[i];
          localObject4 = str.zzaZE;
          boolean bool2 = TextUtils.isEmpty((CharSequence)localObject4);
          if (bool2)
          {
            localObject1 = zzAo().zzCF();
            localObject2 = "null or empty param name in filter. event";
            localObject3 = paramzzb1.name;
            ((zzp.zza)localObject1).zzj((String)localObject2, localObject3);
            i = 0;
            f = 0.0F;
            localObject1 = null;
            break;
          }
          str = str.zzaZE;
          ((Set)localObject2).add(str);
          i += 1;
        }
        label210:
        localObject3 = new android/support/v4/h/a;
        ((a)localObject3).<init>();
        Object localObject5 = paramzzb1.zzbae;
        int n = localObject5.length;
        int j = 0;
        f = 0.0F;
        localObject1 = null;
        Object localObject6;
        if (j < n)
        {
          localObject4 = localObject5[j];
          localObject6 = ((zzqb.zzc)localObject4).name;
          boolean bool3 = ((Set)localObject2).contains(localObject6);
          if (bool3)
          {
            localObject6 = ((zzqb.zzc)localObject4).zzbai;
            if (localObject6 == null) {
              break label324;
            }
            localObject6 = ((zzqb.zzc)localObject4).name;
            localObject4 = ((zzqb.zzc)localObject4).zzbai;
            ((Map)localObject3).put(localObject6, localObject4);
          }
          for (;;)
          {
            j += 1;
            break;
            label324:
            localObject6 = ((zzqb.zzc)localObject4).zzaZo;
            if (localObject6 != null)
            {
              localObject6 = ((zzqb.zzc)localObject4).name;
              localObject4 = ((zzqb.zzc)localObject4).zzaZo;
              ((Map)localObject3).put(localObject6, localObject4);
            }
            else
            {
              localObject6 = ((zzqb.zzc)localObject4).zzamJ;
              if (localObject6 == null) {
                break label406;
              }
              localObject6 = ((zzqb.zzc)localObject4).name;
              localObject4 = ((zzqb.zzc)localObject4).zzamJ;
              ((Map)localObject3).put(localObject6, localObject4);
            }
          }
          label406:
          localObject1 = zzAo().zzCF();
          localObject2 = "Unknown value for param. event, param";
          localObject3 = paramzzb1.name;
          localObject5 = ((zzqb.zzc)localObject4).name;
          ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject5);
          j = 0;
          f = 0.0F;
          localObject1 = null;
        }
        else
        {
          localObject5 = paramzzb.zzaZx;
          n = localObject5.length;
          j = 0;
          f = 0.0F;
          localObject1 = null;
          int i1 = 0;
          localObject2 = null;
          for (;;)
          {
            if (i1 >= n) {
              break label1111;
            }
            localObject4 = localObject5[i1];
            localObject6 = ((zzpz.zzc)localObject4).zzaZE;
            boolean bool1 = TextUtils.isEmpty((CharSequence)localObject6);
            if (bool1)
            {
              localObject1 = zzAo().zzCF();
              localObject2 = "Event has empty param name. event";
              localObject3 = paramzzb1.name;
              ((zzp.zza)localObject1).zzj((String)localObject2, localObject3);
              bool1 = false;
              f = 0.0F;
              localObject1 = null;
              break;
            }
            localObject1 = ((Map)localObject3).get(localObject6);
            boolean bool4 = localObject1 instanceof Long;
            Object localObject7;
            if (bool4)
            {
              localObject7 = ((zzpz.zzc)localObject4).zzaZC;
              if (localObject7 == null)
              {
                localObject1 = zzAo().zzCF();
                localObject2 = "No number filter for long param. event, param";
                localObject3 = paramzzb1.name;
                ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject6);
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              localObject6 = new com/google/android/gms/measurement/internal/zzs;
              localObject4 = ((zzpz.zzc)localObject4).zzaZC;
              ((zzs)localObject6).<init>((zzpz.zzd)localObject4);
              long l = ((Long)localObject1).longValue();
              localObject1 = ((zzs)localObject6).zzac(l);
              if (localObject1 == null)
              {
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (bool1) {
                break label1098;
              }
              bool1 = false;
              f = 0.0F;
              localObject1 = Boolean.valueOf(false);
              break;
            }
            bool4 = localObject1 instanceof Float;
            if (bool4)
            {
              localObject7 = ((zzpz.zzc)localObject4).zzaZC;
              if (localObject7 == null)
              {
                localObject1 = zzAo().zzCF();
                localObject2 = "No number filter for float param. event, param";
                localObject3 = paramzzb1.name;
                ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject6);
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              localObject6 = new com/google/android/gms/measurement/internal/zzs;
              localObject4 = ((zzpz.zzc)localObject4).zzaZC;
              ((zzs)localObject6).<init>((zzpz.zzd)localObject4);
              f = ((Float)localObject1).floatValue();
              localObject1 = ((zzs)localObject6).zzi(f);
              if (localObject1 == null)
              {
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (bool1) {
                break label1098;
              }
              bool1 = false;
              f = 0.0F;
              localObject1 = Boolean.valueOf(false);
              break;
            }
            bool4 = localObject1 instanceof String;
            if (bool4)
            {
              localObject7 = ((zzpz.zzc)localObject4).zzaZB;
              if (localObject7 == null)
              {
                localObject1 = zzAo().zzCF();
                localObject2 = "No string filter for String param. event, param";
                localObject3 = paramzzb1.name;
                ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject6);
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              localObject6 = new com/google/android/gms/measurement/internal/zzae;
              localObject4 = ((zzpz.zzc)localObject4).zzaZB;
              ((zzae)localObject6).<init>((zzpz.zzf)localObject4);
              localObject1 = (String)localObject1;
              localObject1 = ((zzae)localObject6).zzfp((String)localObject1);
              if (localObject1 == null)
              {
                bool1 = false;
                f = 0.0F;
                localObject1 = null;
                break;
              }
              bool1 = ((Boolean)localObject1).booleanValue();
              if (bool1) {
                break label1098;
              }
              bool1 = false;
              f = 0.0F;
              localObject1 = Boolean.valueOf(false);
              break;
            }
            if (localObject1 == null)
            {
              localObject1 = zzAo().zzCK();
              localObject2 = "Missing param for filter. event, param";
              localObject3 = paramzzb1.name;
              ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject6);
              bool1 = false;
              f = 0.0F;
              localObject1 = Boolean.valueOf(false);
              break;
            }
            localObject1 = zzAo().zzCF();
            localObject2 = "Unknown param type. event, param";
            localObject3 = paramzzb1.name;
            ((zzp.zza)localObject1).zze((String)localObject2, localObject3, localObject6);
            bool1 = false;
            f = 0.0F;
            localObject1 = null;
            break;
            label1098:
            k = i1 + 1;
            i1 = k;
          }
          label1111:
          int k = 1;
          f = Float.MIN_VALUE;
          localObject1 = Boolean.valueOf(k);
        }
      }
    }
  }
  
  private Boolean zza(zzpz.zze paramzze, zzqb.zzg paramzzg)
  {
    Object localObject1 = null;
    Object localObject2 = paramzze.zzaZM;
    Object localObject5;
    Object localObject6;
    if (localObject2 == null)
    {
      localObject2 = zzAo().zzCF();
      localObject5 = "Missing property filter. property";
      localObject6 = paramzzg.name;
      ((zzp.zza)localObject2).zzj((String)localObject5, localObject6);
    }
    for (;;)
    {
      return (Boolean)localObject1;
      localObject5 = paramzzg.zzbai;
      if (localObject5 != null)
      {
        localObject5 = ((zzpz.zzc)localObject2).zzaZC;
        if (localObject5 == null)
        {
          localObject2 = zzAo().zzCF();
          localObject5 = "No number filter for long property. property";
          localObject6 = paramzzg.name;
          ((zzp.zza)localObject2).zzj((String)localObject5, localObject6);
        }
        else
        {
          localObject1 = new com/google/android/gms/measurement/internal/zzs;
          localObject2 = ((zzpz.zzc)localObject2).zzaZC;
          ((zzs)localObject1).<init>((zzpz.zzd)localObject2);
          localObject2 = paramzzg.zzbai;
          long l1 = ((Long)localObject2).longValue();
          localObject1 = ((zzs)localObject1).zzac(l1);
        }
      }
      else
      {
        localObject5 = paramzzg.zzaZo;
        float f;
        if (localObject5 != null)
        {
          localObject5 = ((zzpz.zzc)localObject2).zzaZC;
          if (localObject5 == null)
          {
            localObject2 = zzAo().zzCF();
            localObject5 = "No number filter for float property. property";
            localObject6 = paramzzg.name;
            ((zzp.zza)localObject2).zzj((String)localObject5, localObject6);
          }
          else
          {
            localObject1 = new com/google/android/gms/measurement/internal/zzs;
            localObject2 = ((zzpz.zzc)localObject2).zzaZC;
            ((zzs)localObject1).<init>((zzpz.zzd)localObject2);
            localObject2 = paramzzg.zzaZo;
            f = ((Float)localObject2).floatValue();
            localObject1 = ((zzs)localObject1).zzi(f);
          }
        }
        else
        {
          localObject5 = paramzzg.zzamJ;
          Object localObject4;
          if (localObject5 != null)
          {
            localObject5 = ((zzpz.zzc)localObject2).zzaZB;
            if (localObject5 == null)
            {
              localObject5 = ((zzpz.zzc)localObject2).zzaZC;
              if (localObject5 == null)
              {
                localObject2 = zzAo().zzCF();
                localObject5 = "No string or number filter defined. property";
                localObject6 = paramzzg.name;
                ((zzp.zza)localObject2).zzj((String)localObject5, localObject6);
              }
              else
              {
                localObject5 = new com/google/android/gms/measurement/internal/zzs;
                localObject6 = ((zzpz.zzc)localObject2).zzaZC;
                ((zzs)localObject5).<init>((zzpz.zzd)localObject6);
                localObject2 = ((zzpz.zzc)localObject2).zzaZC.zzaZG;
                boolean bool1 = ((Boolean)localObject2).booleanValue();
                Object localObject3;
                String str;
                if (!bool1)
                {
                  localObject2 = paramzzg.zzamJ;
                  bool1 = zzeQ((String)localObject2);
                  if (bool1)
                  {
                    try
                    {
                      localObject2 = paramzzg.zzamJ;
                      long l2 = Long.parseLong((String)localObject2);
                      localObject1 = ((zzs)localObject5).zzac(l2);
                    }
                    catch (NumberFormatException localNumberFormatException1)
                    {
                      localObject3 = zzAo().zzCF();
                      localObject5 = "User property value exceeded Long value range. property, value";
                      localObject6 = paramzzg.name;
                      str = paramzzg.zzamJ;
                      ((zzp.zza)localObject3).zze((String)localObject5, localObject6, str);
                    }
                  }
                  else
                  {
                    localObject3 = zzAo().zzCF();
                    localObject5 = "Invalid user property value for Long number filter. property, value";
                    localObject6 = paramzzg.name;
                    str = paramzzg.zzamJ;
                    ((zzp.zza)localObject3).zze((String)localObject5, localObject6, str);
                  }
                }
                else
                {
                  localObject3 = paramzzg.zzamJ;
                  bool1 = zzeR((String)localObject3);
                  if (bool1)
                  {
                    try
                    {
                      localObject3 = paramzzg.zzamJ;
                      f = Float.parseFloat((String)localObject3);
                      boolean bool2 = Float.isInfinite(f);
                      if (!bool2)
                      {
                        localObject1 = ((zzs)localObject5).zzi(f);
                        continue;
                      }
                      localObject3 = zzAo();
                      localObject3 = ((zzp)localObject3).zzCF();
                      localObject5 = "User property value exceeded Float value range. property, value";
                      localObject6 = paramzzg.name;
                      str = paramzzg.zzamJ;
                      ((zzp.zza)localObject3).zze((String)localObject5, localObject6, str);
                    }
                    catch (NumberFormatException localNumberFormatException2)
                    {
                      localObject4 = zzAo().zzCF();
                      localObject5 = "User property value exceeded Float value range. property, value";
                      localObject6 = paramzzg.name;
                      str = paramzzg.zzamJ;
                      ((zzp.zza)localObject4).zze((String)localObject5, localObject6, str);
                    }
                  }
                  else
                  {
                    localObject4 = zzAo().zzCF();
                    localObject5 = "Invalid user property value for Float number filter. property, value";
                    localObject6 = paramzzg.name;
                    str = paramzzg.zzamJ;
                    ((zzp.zza)localObject4).zze((String)localObject5, localObject6, str);
                  }
                }
              }
            }
            else
            {
              localObject1 = new com/google/android/gms/measurement/internal/zzae;
              localObject4 = ((zzpz.zzc)localObject4).zzaZB;
              ((zzae)localObject1).<init>((zzpz.zzf)localObject4);
              localObject4 = paramzzg.zzamJ;
              localObject1 = ((zzae)localObject1).zzfp((String)localObject4);
            }
          }
          else
          {
            localObject4 = zzAo().zzCF();
            localObject5 = "User property has no value, property";
            localObject6 = paramzzg.name;
            ((zzp.zza)localObject4).zzj((String)localObject5, localObject6);
          }
        }
      }
    }
  }
  
  void zza(String paramString, zzpz.zza[] paramArrayOfzza)
  {
    zzCj().zzb(paramString, paramArrayOfzza);
  }
  
  zzqb.zza[] zza(String paramString, zzqb.zzb[] paramArrayOfzzb, zzqb.zzg[] paramArrayOfzzg)
  {
    zzx.zzcM(paramString);
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    a locala1 = new android/support/v4/h/a;
    locala1.<init>();
    a locala2 = new android/support/v4/h/a;
    locala2.<init>();
    a locala3 = new android/support/v4/h/a;
    locala3.<init>();
    Object localObject1;
    Object localObject2;
    int i;
    int j;
    boolean bool2;
    Object localObject3;
    int i1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    long l2;
    if (paramArrayOfzzb != null)
    {
      localObject1 = new android/support/v4/h/a;
      ((a)localObject1).<init>();
      localObject2 = paramArrayOfzzb;
      i = paramArrayOfzzb.length;
      j = i;
      bool2 = false;
      localObject3 = null;
      i1 = 0;
      i = j;
      if (i1 < j)
      {
        localObject4 = paramArrayOfzzb[i1];
        localObject3 = zzCj();
        localObject2 = localObject4;
        localObject5 = ((zzqb.zzb)localObject4).name;
        localObject2 = paramString;
        localObject3 = ((zze)localObject3).zzI(paramString, (String)localObject5);
        if (localObject3 == null)
        {
          localObject3 = zzAo().zzCF();
          localObject2 = localObject4;
          localObject6 = ((zzqb.zzb)localObject4).name;
          ((zzp.zza)localObject3).zzj("Event aggregate wasn't created during raw event logging. event", localObject6);
          localObject5 = new com/google/android/gms/measurement/internal/zzi;
          localObject7 = ((zzqb.zzb)localObject4).name;
          long l1 = 1L;
          l2 = 1L;
          localObject3 = ((zzqb.zzb)localObject4).zzbaf;
          long l3 = ((Long)localObject3).longValue();
          localObject6 = paramString;
          ((zzi)localObject5).<init>(paramString, (String)localObject7, l1, l2, l3);
          label209:
          zzCj().zza((zzi)localObject5);
          l2 = ((zzi)localObject5).zzaVP;
          localObject2 = localObject4;
          localObject3 = ((zzqb.zzb)localObject4).name;
          localObject2 = localObject1;
          localObject3 = (Map)((Map)localObject1).get(localObject3);
          if (localObject3 != null) {
            break label2807;
          }
          localObject3 = zzCj();
          localObject2 = localObject4;
          localObject5 = ((zzqb.zzb)localObject4).name;
          localObject2 = paramString;
          localObject3 = ((zze)localObject3).zzL(paramString, (String)localObject5);
          if (localObject3 == null)
          {
            localObject3 = new android/support/v4/h/a;
            ((a)localObject3).<init>();
          }
          localObject2 = localObject4;
          localObject5 = ((zzqb.zzb)localObject4).name;
          localObject2 = localObject1;
          ((Map)localObject1).put(localObject5, localObject3);
        }
      }
    }
    label997:
    label1295:
    label2137:
    label2460:
    label2793:
    label2807:
    for (Object localObject7 = localObject3;; localObject7 = localObject3)
    {
      localObject3 = zzAo().zzCK();
      localObject5 = "Found audiences. event, audience count";
      localObject2 = localObject4;
      localObject6 = ((zzqb.zzb)localObject4).name;
      int i2 = ((Map)localObject7).size();
      Object localObject8 = Integer.valueOf(i2);
      ((zzp.zza)localObject3).zze((String)localObject5, localObject6, localObject8);
      localObject3 = ((Map)localObject7).keySet();
      Iterator localIterator = ((Set)localObject3).iterator();
      int i3;
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break label1295;
        }
        i3 = ((Integer)localIterator.next()).intValue();
        localObject3 = Integer.valueOf(i3);
        bool2 = localHashSet.contains(localObject3);
        if (!bool2) {
          break;
        }
        localObject3 = zzAo().zzCK();
        localObject5 = "Skipping failed audience ID";
        localObject6 = Integer.valueOf(i3);
        ((zzp.zza)localObject3).zzj((String)localObject5, localObject6);
      }
      localObject5 = ((zzi)localObject3).zzCB();
      break label209;
      localObject3 = Integer.valueOf(i3);
      localObject2 = locala1;
      localObject3 = (zzqb.zza)locala1.get(localObject3);
      int i4;
      if (localObject3 == null)
      {
        localObject3 = new com/google/android/gms/internal/zzqb$zza;
        ((zzqb.zza)localObject3).<init>();
        localObject5 = Integer.valueOf(i3);
        locala1.put(localObject5, localObject3);
        i4 = 0;
        localObject5 = Boolean.valueOf(false);
        ((zzqb.zza)localObject3).zzbac = ((Boolean)localObject5);
      }
      for (localObject8 = localObject3;; localObject8 = localObject3)
      {
        localObject3 = Integer.valueOf(i3);
        localObject3 = (List)((Map)localObject7).get(localObject3);
        localObject5 = Integer.valueOf(i3);
        localObject2 = locala2;
        localObject5 = (BitSet)locala2.get(localObject5);
        localObject6 = Integer.valueOf(i3);
        localObject2 = locala3;
        localObject6 = (BitSet)locala3.get(localObject6);
        if (localObject5 == null)
        {
          localObject5 = new java/util/BitSet;
          ((BitSet)localObject5).<init>();
          localObject6 = Integer.valueOf(i3);
          localObject2 = locala2;
          locala2.put(localObject6, localObject5);
          localObject6 = new java/util/BitSet;
          ((BitSet)localObject6).<init>();
          localObject9 = Integer.valueOf(i3);
          localObject2 = locala3;
          locala3.put(localObject9, localObject6);
        }
        Object localObject9 = ((zzqb.zza)localObject8).zzbab;
        boolean bool5;
        if (localObject9 == null)
        {
          localObject9 = ((zzqb.zza)localObject8).zzbac;
          bool5 = ((Boolean)localObject9).booleanValue();
          if (!bool5)
          {
            localObject9 = zzCj();
            localObject2 = paramString;
            localObject9 = ((zze)localObject9).zzC(paramString, i3);
            if (localObject9 != null) {
              break label997;
            }
            bool5 = true;
            localObject9 = Boolean.valueOf(bool5);
            ((zzqb.zza)localObject8).zzbac = ((Boolean)localObject9);
          }
        }
        localObject8 = ((List)localObject3).iterator();
        Object localObject10;
        Object localObject12;
        for (;;)
        {
          bool2 = ((Iterator)localObject8).hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = (zzpz.zzb)((Iterator)localObject8).next();
          localObject9 = zzAo();
          int i6 = 2;
          i = i6;
          bool5 = ((zzp)localObject9).zzQ(i6);
          Integer localInteger;
          Object localObject11;
          if (bool5)
          {
            localObject9 = zzAo().zzCK();
            localObject10 = Integer.valueOf(i3);
            localInteger = ((zzpz.zzb)localObject3).zzaZv;
            localObject11 = ((zzpz.zzb)localObject3).zzaZw;
            localObject2 = "Evaluating filter. audience, filter, event";
            ((zzp.zza)localObject9).zzd((String)localObject2, localObject10, localInteger, localObject11);
            localObject9 = zzAo().zzCK();
            localObject12 = "Filter definition";
            localObject2 = localObject12;
            ((zzp.zza)localObject9).zzj((String)localObject12, localObject3);
          }
          localObject9 = ((zzpz.zzb)localObject3).zzaZv;
          int i5 = ((Integer)localObject9).intValue();
          i6 = 256;
          i = i6;
          if (i5 > i6)
          {
            localObject9 = zzAo().zzCF();
            localObject12 = "Invalid event filter ID > 256. id";
            localObject3 = ((zzpz.zzb)localObject3).zzaZv;
            localObject2 = localObject12;
            ((zzp.zza)localObject9).zzj((String)localObject12, localObject3);
            continue;
            ((zzqb.zza)localObject8).zzbab = ((zzqb.zzf)localObject9);
            i2 = 0;
            localObject8 = null;
            for (;;)
            {
              localObject2 = ((zzqb.zzf)localObject9).zzbaH;
              localObject12 = localObject2;
              i = localObject2.length;
              i6 = i;
              i6 = i * 64;
              i = i6;
              if (i2 >= i6) {
                break;
              }
              localObject2 = ((zzqb.zzf)localObject9).zzbaH;
              localObject12 = localObject2;
              boolean bool7 = zzaj.zza((long[])localObject2, i2);
              if (bool7)
              {
                localObject12 = zzAo().zzCK();
                localObject10 = "Event filter already evaluated true. audience ID, filter ID";
                localInteger = Integer.valueOf(i3);
                localObject11 = Integer.valueOf(i2);
                ((zzp.zza)localObject12).zze((String)localObject10, localInteger, localObject11);
                ((BitSet)localObject5).set(i2);
                ((BitSet)localObject6).set(i2);
              }
              i2 += 1;
            }
          }
          else
          {
            localObject9 = ((zzpz.zzb)localObject3).zzaZv;
            i5 = ((Integer)localObject9).intValue();
            boolean bool6 = ((BitSet)localObject6).get(i5);
            if (!bool6)
            {
              localObject2 = this;
              localObject9 = zza((zzpz.zzb)localObject3, (zzqb.zzb)localObject4, l2);
              localObject12 = zzAo().zzCK();
              localObject10 = "Event filter result";
              localObject2 = localObject12;
              ((zzp.zza)localObject12).zzj((String)localObject10, localObject9);
              if (localObject9 == null)
              {
                localObject3 = Integer.valueOf(i3);
                localHashSet.add(localObject3);
              }
              else
              {
                localObject2 = ((zzpz.zzb)localObject3).zzaZv;
                localObject12 = localObject2;
                int i7 = ((Integer)localObject2).intValue();
                i = i7;
                ((BitSet)localObject6).set(i7);
                bool6 = ((Boolean)localObject9).booleanValue();
                if (bool6)
                {
                  localObject3 = ((zzpz.zzb)localObject3).zzaZv;
                  m = ((Integer)localObject3).intValue();
                  ((BitSet)localObject5).set(m);
                }
              }
            }
          }
        }
        int m = i1 + 1;
        i1 = m;
        break;
        int i9;
        zzqb.zzg localzzg;
        if (paramArrayOfzzg != null)
        {
          a locala4 = new android/support/v4/h/a;
          locala4.<init>();
          localObject2 = paramArrayOfzzg;
          int i8 = paramArrayOfzzg.length;
          m = 0;
          localObject3 = null;
          i9 = 0;
          localIterator = null;
          if (i9 < i8)
          {
            localzzg = paramArrayOfzzg[i9];
            localObject3 = localzzg.name;
            localObject3 = (Map)locala4.get(localObject3);
            if (localObject3 != null) {
              break label2793;
            }
            localObject3 = zzCj();
            localObject5 = localzzg.name;
            localObject2 = paramString;
            localObject3 = ((zze)localObject3).zzM(paramString, (String)localObject5);
            if (localObject3 == null)
            {
              localObject3 = new android/support/v4/h/a;
              ((a)localObject3).<init>();
            }
            localObject5 = localzzg.name;
            locala4.put(localObject5, localObject3);
          }
        }
        for (localObject7 = localObject3;; localObject7 = localObject3)
        {
          localObject3 = zzAo().zzCK();
          localObject5 = "Found audiences. property, audience count";
          localObject6 = localzzg.name;
          i2 = ((Map)localObject7).size();
          localObject8 = Integer.valueOf(i2);
          ((zzp.zza)localObject3).zze((String)localObject5, localObject6, localObject8);
          localObject3 = ((Map)localObject7).keySet();
          localObject9 = ((Set)localObject3).iterator();
          boolean bool3;
          for (;;)
          {
            bool3 = ((Iterator)localObject9).hasNext();
            if (!bool3) {
              break label2460;
            }
            i1 = ((Integer)((Iterator)localObject9).next()).intValue();
            localObject3 = Integer.valueOf(i1);
            bool3 = localHashSet.contains(localObject3);
            if (!bool3) {
              break;
            }
            localObject3 = zzAo().zzCK();
            localObject5 = "Skipping failed audience ID";
            localObject6 = Integer.valueOf(i1);
            ((zzp.zza)localObject3).zzj((String)localObject5, localObject6);
          }
          localObject3 = Integer.valueOf(i1);
          localObject2 = locala1;
          localObject3 = (zzqb.zza)locala1.get(localObject3);
          if (localObject3 == null)
          {
            localObject3 = new com/google/android/gms/internal/zzqb$zza;
            ((zzqb.zza)localObject3).<init>();
            localObject5 = Integer.valueOf(i1);
            locala1.put(localObject5, localObject3);
            i4 = 0;
            localObject5 = Boolean.valueOf(false);
            ((zzqb.zza)localObject3).zzbac = ((Boolean)localObject5);
          }
          for (localObject8 = localObject3;; localObject8 = localObject3)
          {
            localObject3 = Integer.valueOf(i1);
            localObject3 = (List)((Map)localObject7).get(localObject3);
            localObject5 = Integer.valueOf(i1);
            localObject2 = locala2;
            localObject5 = (BitSet)locala2.get(localObject5);
            localObject6 = Integer.valueOf(i1);
            localObject2 = locala3;
            localObject6 = (BitSet)locala3.get(localObject6);
            if (localObject5 == null)
            {
              localObject5 = new java/util/BitSet;
              ((BitSet)localObject5).<init>();
              localObject6 = Integer.valueOf(i1);
              localObject2 = locala2;
              locala2.put(localObject6, localObject5);
              localObject6 = new java/util/BitSet;
              ((BitSet)localObject6).<init>();
              localObject1 = Integer.valueOf(i1);
              localObject2 = locala3;
              locala3.put(localObject1, localObject6);
            }
            localObject2 = ((zzqb.zza)localObject8).zzbab;
            localObject1 = localObject2;
            boolean bool8;
            if (localObject2 == null)
            {
              localObject2 = ((zzqb.zza)localObject8).zzbac;
              localObject1 = localObject2;
              bool8 = ((Boolean)localObject2).booleanValue();
              if (!bool8)
              {
                localObject1 = zzCj();
                localObject2 = localObject1;
                localObject1 = ((zze)localObject1).zzC(paramString, i1);
                if (localObject1 != null) {
                  break label2137;
                }
                bool8 = true;
                localObject1 = Boolean.valueOf(bool8);
                localObject2 = localObject1;
                ((zzqb.zza)localObject8).zzbac = ((Boolean)localObject1);
              }
            }
            localObject8 = ((List)localObject3).iterator();
            for (;;)
            {
              bool3 = ((Iterator)localObject8).hasNext();
              if (!bool3) {
                break;
              }
              localObject3 = (zzpz.zze)((Iterator)localObject8).next();
              localObject1 = zzAo();
              j = 2;
              bool8 = ((zzp)localObject1).zzQ(j);
              Object localObject13;
              if (bool8)
              {
                localObject1 = zzAo().zzCK();
                localObject4 = Integer.valueOf(i1);
                localObject12 = ((zzpz.zze)localObject3).zzaZv;
                localObject2 = ((zzpz.zze)localObject3).zzaZL;
                localObject10 = localObject2;
                ((zzp.zza)localObject1).zzd("Evaluating filter. audience, filter, property", localObject4, localObject12, localObject2);
                localObject1 = zzAo().zzCK();
                localObject13 = "Filter definition";
                localObject2 = localObject1;
                ((zzp.zza)localObject1).zzj((String)localObject13, localObject3);
              }
              localObject2 = ((zzpz.zze)localObject3).zzaZv;
              localObject1 = localObject2;
              if (localObject2 != null)
              {
                localObject2 = ((zzpz.zze)localObject3).zzaZv;
                localObject1 = localObject2;
                i10 = ((Integer)localObject2).intValue();
                j = 256;
                i = i10;
                if (i10 <= j) {}
              }
              else
              {
                localObject5 = zzAo().zzCF();
                localObject6 = "Invalid property filter ID. id";
                localObject3 = String.valueOf(((zzpz.zze)localObject3).zzaZv);
                ((zzp.zza)localObject5).zzj((String)localObject6, localObject3);
                localObject3 = Integer.valueOf(i1);
                localHashSet.add(localObject3);
                break;
                localObject2 = localObject1;
                ((zzqb.zza)localObject8).zzbab = ((zzqb.zzf)localObject1);
                i2 = 0;
                localObject8 = null;
                for (;;)
                {
                  localObject2 = localObject1;
                  localObject2 = ((zzqb.zzf)localObject1).zzbaH;
                  localObject13 = localObject2;
                  i = localObject2.length;
                  j = i;
                  j = i * 64;
                  i = j;
                  if (i2 >= j) {
                    break;
                  }
                  localObject2 = localObject1;
                  localObject2 = ((zzqb.zzf)localObject1).zzbaH;
                  localObject13 = localObject2;
                  boolean bool1 = zzaj.zza((long[])localObject2, i2);
                  if (bool1)
                  {
                    ((BitSet)localObject5).set(i2);
                    ((BitSet)localObject6).set(i2);
                  }
                  i2 += 1;
                }
              }
              localObject2 = ((zzpz.zze)localObject3).zzaZv;
              localObject1 = localObject2;
              int i10 = ((Integer)localObject2).intValue();
              i = i10;
              boolean bool9 = ((BitSet)localObject6).get(i10);
              if (bool9)
              {
                localObject1 = zzAo().zzCK();
                localObject13 = "Property filter already evaluated true. audience ID, filter ID";
                localObject4 = Integer.valueOf(i1);
                localObject3 = ((zzpz.zze)localObject3).zzaZv;
                localObject2 = localObject1;
                ((zzp.zza)localObject1).zze((String)localObject13, localObject4, localObject3);
              }
              else
              {
                localObject2 = this;
                localObject1 = zza((zzpz.zze)localObject3, localzzg);
                localObject13 = zzAo().zzCK();
                localObject4 = "Property filter result";
                localObject2 = localObject13;
                ((zzp.zza)localObject13).zzj((String)localObject4, localObject1);
                if (localObject1 == null)
                {
                  localObject3 = Integer.valueOf(i1);
                  localHashSet.add(localObject3);
                }
                else
                {
                  localObject2 = ((zzpz.zze)localObject3).zzaZv;
                  localObject13 = localObject2;
                  int k = ((Integer)localObject2).intValue();
                  i = k;
                  ((BitSet)localObject6).set(k);
                  bool9 = ((Boolean)localObject1).booleanValue();
                  if (bool9)
                  {
                    localObject3 = ((zzpz.zze)localObject3).zzaZv;
                    n = ((Integer)localObject3).intValue();
                    ((BitSet)localObject5).set(n);
                  }
                }
              }
            }
            int n = i9 + 1;
            i9 = n;
            break;
            localObject8 = new zzqb.zza[locala2.size()];
            n = 0;
            localObject3 = null;
            localIterator = locala2.keySet().iterator();
            i4 = 0;
            localObject5 = null;
            boolean bool4;
            int i11;
            do
            {
              bool4 = localIterator.hasNext();
              if (!bool4) {
                break;
              }
              i11 = ((Integer)localIterator.next()).intValue();
              localObject3 = Integer.valueOf(i11);
              bool4 = localHashSet.contains(localObject3);
            } while (bool4);
            localObject3 = Integer.valueOf(i11);
            localObject2 = locala1;
            localObject3 = (zzqb.zza)locala1.get(localObject3);
            if (localObject3 == null)
            {
              localObject3 = new com/google/android/gms/internal/zzqb$zza;
              ((zzqb.zza)localObject3).<init>();
            }
            for (localObject7 = localObject3;; localObject7 = localObject3)
            {
              int i12 = i4 + 1;
              localObject8[i4] = localObject7;
              localObject3 = Integer.valueOf(i11);
              ((zzqb.zza)localObject7).zzaZr = ((Integer)localObject3);
              localObject3 = new com/google/android/gms/internal/zzqb$zzf;
              ((zzqb.zzf)localObject3).<init>();
              ((zzqb.zza)localObject7).zzbaa = ((zzqb.zzf)localObject3);
              localObject5 = ((zzqb.zza)localObject7).zzbaa;
              localObject3 = Integer.valueOf(i11);
              localObject2 = locala2;
              localObject3 = zzaj.zza((BitSet)locala2.get(localObject3));
              ((zzqb.zzf)localObject5).zzbaH = ((long[])localObject3);
              localObject5 = ((zzqb.zza)localObject7).zzbaa;
              localObject3 = Integer.valueOf(i11);
              localObject2 = locala3;
              localObject3 = zzaj.zza((BitSet)locala3.get(localObject3));
              ((zzqb.zzf)localObject5).zzbaG = ((long[])localObject3);
              localObject3 = zzCj();
              localObject5 = ((zzqb.zza)localObject7).zzbaa;
              localObject2 = paramString;
              ((zze)localObject3).zza(paramString, i11, (zzqb.zzf)localObject5);
              i4 = i12;
              break;
              return (zzqb.zza[])Arrays.copyOf((Object[])localObject8, i4);
            }
          }
        }
      }
    }
  }
  
  boolean zzeQ(String paramString)
  {
    return Pattern.matches("[+-]?[0-9]+", paramString);
  }
  
  boolean zzeR(String paramString)
  {
    return Pattern.matches("[+-]?(([0-9]+\\.?)|([0-9]*\\.[0-9]+))", paramString);
  }
  
  protected void zziJ() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */