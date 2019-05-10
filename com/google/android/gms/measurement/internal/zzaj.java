package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzqb.zza;
import com.google.android.gms.internal.zzqb.zzb;
import com.google.android.gms.internal.zzqb.zzc;
import com.google.android.gms.internal.zzqb.zzd;
import com.google.android.gms.internal.zzqb.zze;
import com.google.android.gms.internal.zzqb.zzf;
import com.google.android.gms.internal.zzqb.zzg;
import com.google.android.gms.internal.zzsn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.BitSet;
import java.util.zip.GZIPOutputStream;

public class zzaj
  extends zzy
{
  zzaj(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  public static boolean zzI(Bundle paramBundle)
  {
    String str = "_c";
    long l1 = paramBundle.getLong(str);
    long l2 = 1L;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  public static boolean zzQ(String paramString1, String paramString2)
  {
    boolean bool;
    if ((paramString1 == null) && (paramString2 == null)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramString1 == null) {
        bool = false;
      } else {
        bool = paramString1.equals(paramString2);
      }
    }
  }
  
  private Object zza(int paramInt, Object paramObject, boolean paramBoolean)
  {
    int i = 0;
    float f = 0.0F;
    if (paramObject == null) {
      paramObject = null;
    }
    for (;;)
    {
      return paramObject;
      boolean bool2 = paramObject instanceof Long;
      if (!bool2)
      {
        bool2 = paramObject instanceof Float;
        if (!bool2)
        {
          bool2 = paramObject instanceof Integer;
          long l;
          if (bool2)
          {
            i = ((Integer)paramObject).intValue();
            l = i;
            paramObject = Long.valueOf(l);
          }
          else
          {
            bool2 = paramObject instanceof Byte;
            if (bool2)
            {
              i = ((Byte)paramObject).byteValue();
              l = i;
              paramObject = Long.valueOf(l);
            }
            else
            {
              bool2 = paramObject instanceof Short;
              if (bool2)
              {
                i = ((Short)paramObject).shortValue();
                l = i;
                paramObject = Long.valueOf(l);
              }
              else
              {
                bool2 = paramObject instanceof Boolean;
                boolean bool1;
                double d;
                if (bool2)
                {
                  paramObject = (Boolean)paramObject;
                  bool1 = ((Boolean)paramObject).booleanValue();
                  if (bool1) {
                    l = 1L;
                  }
                  for (d = Double.MIN_VALUE;; d = 0.0D)
                  {
                    paramObject = Long.valueOf(l);
                    break;
                    l = 0L;
                  }
                }
                bool2 = paramObject instanceof Double;
                if (bool2)
                {
                  d = ((Double)paramObject).doubleValue();
                  f = (float)d;
                  paramObject = Float.valueOf(f);
                }
                else
                {
                  bool2 = paramObject instanceof String;
                  if (!bool2)
                  {
                    bool2 = paramObject instanceof Character;
                    if (!bool2)
                    {
                      bool2 = paramObject instanceof CharSequence;
                      if (!bool2) {
                        break label300;
                      }
                    }
                  }
                  paramObject = String.valueOf(paramObject);
                  int j = ((String)paramObject).length();
                  if (j > paramInt) {
                    if (paramBoolean)
                    {
                      bool1 = false;
                      f = 0.0F;
                      paramObject = ((String)paramObject).substring(0, paramInt);
                    }
                    else
                    {
                      paramObject = null;
                      continue;
                      label300:
                      paramObject = null;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private void zza(String paramString1, String paramString2, int paramInt, Object paramObject)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramObject == null)
    {
      localObject1 = zzAo().zzCH();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramString1);
      localObject3 = " value can't be null. Ignoring ";
      localObject2 = (String)localObject3 + paramString1;
      ((zzp.zza)localObject1).zzj((String)localObject2, paramString2);
    }
    for (;;)
    {
      return;
      boolean bool = paramObject instanceof Long;
      if (!bool)
      {
        bool = paramObject instanceof Float;
        if (!bool)
        {
          bool = paramObject instanceof Integer;
          if (!bool)
          {
            bool = paramObject instanceof Byte;
            if (!bool)
            {
              bool = paramObject instanceof Short;
              if (!bool)
              {
                bool = paramObject instanceof Boolean;
                if (!bool)
                {
                  bool = paramObject instanceof Double;
                  if (!bool)
                  {
                    bool = paramObject instanceof String;
                    if (!bool)
                    {
                      bool = paramObject instanceof Character;
                      if (!bool)
                      {
                        bool = paramObject instanceof CharSequence;
                        if (!bool) {
                          continue;
                        }
                      }
                    }
                    localObject1 = String.valueOf(paramObject);
                    int j = ((String)localObject1).length();
                    if (j > paramInt)
                    {
                      localObject2 = zzAo().zzCH();
                      localObject3 = new java/lang/StringBuilder;
                      ((StringBuilder)localObject3).<init>();
                      localObject3 = ((StringBuilder)localObject3).append("Ignoring ").append(paramString1);
                      String str = ". Value is too long. name, value length";
                      localObject3 = str;
                      int i = ((String)localObject1).length();
                      localObject1 = Integer.valueOf(i);
                      ((zzp.zza)localObject2).zze((String)localObject3, paramString2, localObject1);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt)
  {
    int i = 0;
    while (i < paramInt)
    {
      String str = "  ";
      paramStringBuilder.append(str);
      i += 1;
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, zzqb.zze paramzze)
  {
    if (paramzze == null) {}
    for (;;)
    {
      return;
      zza(paramStringBuilder, paramInt);
      paramStringBuilder.append("bundle {\n");
      Object localObject1 = paramzze.zzbal;
      zza(paramStringBuilder, paramInt, "protocol_version", localObject1);
      localObject1 = paramzze.zzbat;
      zza(paramStringBuilder, paramInt, "platform", localObject1);
      localObject1 = paramzze.zzbax;
      zza(paramStringBuilder, paramInt, "gmp_version", localObject1);
      localObject1 = paramzze.zzbay;
      zza(paramStringBuilder, paramInt, "uploading_gmp_version", localObject1);
      localObject1 = paramzze.zzaVt;
      zza(paramStringBuilder, paramInt, "gmp_app_id", localObject1);
      localObject1 = paramzze.appId;
      zza(paramStringBuilder, paramInt, "app_id", localObject1);
      localObject1 = paramzze.zzaMV;
      zza(paramStringBuilder, paramInt, "app_version", localObject1);
      localObject1 = paramzze.zzbaC;
      zza(paramStringBuilder, paramInt, "dev_cert_hash", localObject1);
      localObject1 = paramzze.zzaVu;
      zza(paramStringBuilder, paramInt, "app_store", localObject1);
      localObject1 = paramzze.zzbao;
      zza(paramStringBuilder, paramInt, "upload_timestamp_millis", localObject1);
      localObject1 = paramzze.zzbap;
      zza(paramStringBuilder, paramInt, "start_timestamp_millis", localObject1);
      localObject1 = paramzze.zzbaq;
      zza(paramStringBuilder, paramInt, "end_timestamp_millis", localObject1);
      localObject1 = paramzze.zzbar;
      zza(paramStringBuilder, paramInt, "previous_bundle_start_timestamp_millis", localObject1);
      localObject1 = paramzze.zzbas;
      zza(paramStringBuilder, paramInt, "previous_bundle_end_timestamp_millis", localObject1);
      localObject1 = paramzze.zzbaB;
      zza(paramStringBuilder, paramInt, "app_instance_id", localObject1);
      localObject1 = paramzze.zzbaz;
      zza(paramStringBuilder, paramInt, "resettable_device_id", localObject1);
      localObject1 = paramzze.zzbaA;
      zza(paramStringBuilder, paramInt, "limited_ad_tracking", localObject1);
      localObject1 = paramzze.osVersion;
      zza(paramStringBuilder, paramInt, "os_version", localObject1);
      localObject1 = paramzze.zzbau;
      zza(paramStringBuilder, paramInt, "device_model", localObject1);
      localObject1 = paramzze.zzbav;
      zza(paramStringBuilder, paramInt, "user_default_language", localObject1);
      localObject1 = paramzze.zzbaw;
      zza(paramStringBuilder, paramInt, "time_zone_offset_minutes", localObject1);
      localObject1 = paramzze.zzbaD;
      zza(paramStringBuilder, paramInt, "bundle_sequential_index", localObject1);
      localObject1 = paramzze.zzbaE;
      zza(paramStringBuilder, paramInt, "service_upload", localObject1);
      localObject1 = paramzze.zzaVx;
      zza(paramStringBuilder, paramInt, "health_monitor", localObject1);
      Object localObject2 = paramzze.zzban;
      zza(paramStringBuilder, paramInt, (zzqb.zzg[])localObject2);
      localObject2 = paramzze.zzbaF;
      zza(paramStringBuilder, paramInt, (zzqb.zza[])localObject2);
      localObject2 = paramzze.zzbam;
      zza(paramStringBuilder, paramInt, (zzqb.zzb[])localObject2);
      zza(paramStringBuilder, paramInt);
      localObject2 = "}\n";
      paramStringBuilder.append((String)localObject2);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, zzqb.zzf paramzzf)
  {
    char c = '\n';
    int i = 0;
    String str1 = null;
    if (paramzzf == null) {}
    for (;;)
    {
      return;
      int j = paramInt + 1;
      zza(paramStringBuilder, j);
      paramStringBuilder.append(paramString);
      paramStringBuilder.append(" {\n");
      Object localObject = paramzzf.zzbaH;
      int k;
      int n;
      if (localObject != null)
      {
        k = j + 1;
        zza(paramStringBuilder, k);
        paramStringBuilder.append("results: ");
        long[] arrayOfLong1 = paramzzf.zzbaH;
        int m = arrayOfLong1.length;
        k = 0;
        localObject = null;
        n = 0;
        String str2 = null;
        while (k < m)
        {
          long l1 = arrayOfLong1[k];
          Long localLong1 = Long.valueOf(l1);
          int i1 = n + 1;
          if (n != 0)
          {
            str2 = ", ";
            paramStringBuilder.append(str2);
          }
          paramStringBuilder.append(localLong1);
          k += 1;
          n = i1;
        }
        paramStringBuilder.append(c);
      }
      localObject = paramzzf.zzbaG;
      if (localObject != null)
      {
        k = j + 1;
        zza(paramStringBuilder, k);
        paramStringBuilder.append("status: ");
        long[] arrayOfLong2 = paramzzf.zzbaG;
        int i2 = arrayOfLong2.length;
        k = 0;
        localObject = null;
        while (i < i2)
        {
          long l2 = arrayOfLong2[i];
          Long localLong2 = Long.valueOf(l2);
          n = k + 1;
          if (k != 0)
          {
            localObject = ", ";
            paramStringBuilder.append((String)localObject);
          }
          paramStringBuilder.append(localLong2);
          i += 1;
          k = n;
        }
        paramStringBuilder.append(c);
      }
      zza(paramStringBuilder, j);
      str1 = "}\n";
      paramStringBuilder.append(str1);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if (paramObject == null) {}
    for (;;)
    {
      return;
      int i = paramInt + 1;
      zza(paramStringBuilder, i);
      paramStringBuilder.append(paramString);
      String str = ": ";
      paramStringBuilder.append(str);
      paramStringBuilder.append(paramObject);
      i = 10;
      paramStringBuilder.append(i);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, zzqb.zza[] paramArrayOfzza)
  {
    if (paramArrayOfzza == null) {
      return;
    }
    int i = paramInt + 1;
    int j = paramArrayOfzza.length;
    int k = 0;
    label16:
    Object localObject1;
    if (k < j)
    {
      localObject1 = paramArrayOfzza[k];
      if (localObject1 != null) {
        break label43;
      }
    }
    for (;;)
    {
      k += 1;
      break label16;
      break;
      label43:
      zza(paramStringBuilder, i);
      paramStringBuilder.append("audience_membership {\n");
      Object localObject2 = ((zzqb.zza)localObject1).zzaZr;
      zza(paramStringBuilder, i, "audience_id", localObject2);
      localObject2 = ((zzqb.zza)localObject1).zzbac;
      zza(paramStringBuilder, i, "new_audience", localObject2);
      localObject2 = ((zzqb.zza)localObject1).zzbaa;
      zza(paramStringBuilder, i, "current_data", (zzqb.zzf)localObject2);
      String str = "previous_data";
      localObject1 = ((zzqb.zza)localObject1).zzbab;
      zza(paramStringBuilder, i, str, (zzqb.zzf)localObject1);
      zza(paramStringBuilder, i);
      localObject1 = "}\n";
      paramStringBuilder.append((String)localObject1);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, zzqb.zzb[] paramArrayOfzzb)
  {
    if (paramArrayOfzzb == null) {
      return;
    }
    int i = paramInt + 1;
    int j = paramArrayOfzzb.length;
    int k = 0;
    label16:
    Object localObject1;
    if (k < j)
    {
      localObject1 = paramArrayOfzzb[k];
      if (localObject1 != null) {
        break label43;
      }
    }
    for (;;)
    {
      k += 1;
      break label16;
      break;
      label43:
      zza(paramStringBuilder, i);
      paramStringBuilder.append("event {\n");
      Object localObject2 = ((zzqb.zzb)localObject1).name;
      zza(paramStringBuilder, i, "name", localObject2);
      localObject2 = ((zzqb.zzb)localObject1).zzbaf;
      zza(paramStringBuilder, i, "timestamp_millis", localObject2);
      localObject2 = ((zzqb.zzb)localObject1).zzbag;
      zza(paramStringBuilder, i, "previous_timestamp_millis", localObject2);
      String str = "count";
      localObject2 = ((zzqb.zzb)localObject1).count;
      zza(paramStringBuilder, i, str, localObject2);
      localObject1 = ((zzqb.zzb)localObject1).zzbae;
      zza(paramStringBuilder, i, (zzqb.zzc[])localObject1);
      zza(paramStringBuilder, i);
      localObject1 = "}\n";
      paramStringBuilder.append((String)localObject1);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, zzqb.zzc[] paramArrayOfzzc)
  {
    if (paramArrayOfzzc == null) {
      return;
    }
    int i = paramInt + 1;
    int j = paramArrayOfzzc.length;
    int k = 0;
    label16:
    Object localObject1;
    if (k < j)
    {
      localObject1 = paramArrayOfzzc[k];
      if (localObject1 != null) {
        break label43;
      }
    }
    for (;;)
    {
      k += 1;
      break label16;
      break;
      label43:
      zza(paramStringBuilder, i);
      paramStringBuilder.append("event {\n");
      Object localObject2 = ((zzqb.zzc)localObject1).name;
      zza(paramStringBuilder, i, "name", localObject2);
      localObject2 = ((zzqb.zzc)localObject1).zzamJ;
      zza(paramStringBuilder, i, "string_value", localObject2);
      localObject2 = ((zzqb.zzc)localObject1).zzbai;
      zza(paramStringBuilder, i, "int_value", localObject2);
      String str = "float_value";
      localObject1 = ((zzqb.zzc)localObject1).zzaZo;
      zza(paramStringBuilder, i, str, localObject1);
      zza(paramStringBuilder, i);
      localObject1 = "}\n";
      paramStringBuilder.append((String)localObject1);
    }
  }
  
  private static void zza(StringBuilder paramStringBuilder, int paramInt, zzqb.zzg[] paramArrayOfzzg)
  {
    if (paramArrayOfzzg == null) {
      return;
    }
    int i = paramInt + 1;
    int j = paramArrayOfzzg.length;
    int k = 0;
    label16:
    Object localObject1;
    if (k < j)
    {
      localObject1 = paramArrayOfzzg[k];
      if (localObject1 != null) {
        break label43;
      }
    }
    for (;;)
    {
      k += 1;
      break label16;
      break;
      label43:
      zza(paramStringBuilder, i);
      paramStringBuilder.append("user_property {\n");
      Object localObject2 = ((zzqb.zzg)localObject1).zzbaJ;
      zza(paramStringBuilder, i, "set_timestamp_millis", localObject2);
      localObject2 = ((zzqb.zzg)localObject1).name;
      zza(paramStringBuilder, i, "name", localObject2);
      localObject2 = ((zzqb.zzg)localObject1).zzamJ;
      zza(paramStringBuilder, i, "string_value", localObject2);
      localObject2 = ((zzqb.zzg)localObject1).zzbai;
      zza(paramStringBuilder, i, "int_value", localObject2);
      String str = "float_value";
      localObject1 = ((zzqb.zzg)localObject1).zzaZo;
      zza(paramStringBuilder, i, str, localObject1);
      zza(paramStringBuilder, i);
      localObject1 = "}\n";
      paramStringBuilder.append((String)localObject1);
    }
  }
  
  public static boolean zza(Context paramContext, Class paramClass)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      int i = 4;
      localObject1 = ((PackageManager)localObject1).getServiceInfo(localComponentName, i);
      if (localObject1 == null) {
        break label48;
      }
      bool = ((ServiceInfo)localObject1).enabled;
      if (!bool) {
        break label48;
      }
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        label48:
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
  
  public static boolean zza(Context paramContext, Class paramClass, boolean paramBoolean)
  {
    try
    {
      Object localObject1 = paramContext.getPackageManager();
      ComponentName localComponentName = new android/content/ComponentName;
      localComponentName.<init>(paramContext, paramClass);
      int i = 2;
      localObject1 = ((PackageManager)localObject1).getReceiverInfo(localComponentName, i);
      if (localObject1 == null) {
        break label66;
      }
      boolean bool1 = ((ActivityInfo)localObject1).enabled;
      if (!bool1) {
        break label66;
      }
      if (paramBoolean)
      {
        bool2 = ((ActivityInfo)localObject1).exported;
        if (!bool2) {
          break label66;
        }
      }
      bool2 = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        label66:
        boolean bool2 = false;
        Object localObject2 = null;
      }
    }
    return bool2;
  }
  
  public static boolean zza(long[] paramArrayOfLong, int paramInt)
  {
    boolean bool1 = false;
    int i = paramArrayOfLong.length * 64;
    if (paramInt >= i) {}
    for (;;)
    {
      return bool1;
      i = paramInt / 64;
      long l1 = paramArrayOfLong[i];
      i = paramInt % 64;
      long l2 = 1L << i;
      l1 &= l2;
      l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2) {
        bool1 = true;
      }
    }
  }
  
  public static long[] zza(BitSet paramBitSet)
  {
    int i = paramBitSet.length() + 63;
    int j = i / 64;
    long[] arrayOfLong = new long[j];
    int k = 0;
    if (k < j)
    {
      long l1 = 0L;
      arrayOfLong[k] = l1;
      i = 0;
      for (;;)
      {
        int m = 64;
        if (i < m)
        {
          m = k * 64 + i;
          int n = paramBitSet.length();
          if (m < n) {}
        }
        else
        {
          i = k + 1;
          k = i;
          break;
        }
        m = k * 64 + i;
        boolean bool = paramBitSet.get(m);
        if (bool)
        {
          l1 = arrayOfLong[k];
          long l2 = 1L << i;
          l1 |= l2;
          arrayOfLong[k] = l1;
        }
        i += 1;
      }
    }
    return arrayOfLong;
  }
  
  public static String zzb(zzqb.zzd paramzzd)
  {
    if (paramzzd == null) {}
    StringBuilder localStringBuilder;
    for (Object localObject = "";; localObject = localStringBuilder.toString())
    {
      return (String)localObject;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("\nbatch {\n");
      localObject = paramzzd.zzbaj;
      if (localObject != null)
      {
        zzqb.zze[] arrayOfzze = paramzzd.zzbaj;
        int i = arrayOfzze.length;
        int j = 0;
        localObject = null;
        if (j < i)
        {
          zzqb.zze localzze = arrayOfzze[j];
          if (localzze == null) {}
          for (;;)
          {
            j += 1;
            break;
            int k = 1;
            zza(localStringBuilder, k, localzze);
          }
        }
      }
      localStringBuilder.append("}\n");
    }
  }
  
  static MessageDigest zzbv(String paramString)
  {
    int i = 0;
    MessageDigest localMessageDigest = null;
    int j = 0;
    i = 2;
    if (j < i) {}
    for (;;)
    {
      try
      {
        localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        i = j + 1;
        j = i;
      }
      break;
      i = 0;
      Object localObject = null;
    }
  }
  
  static boolean zzfq(String paramString)
  {
    boolean bool = false;
    zzx.zzcM(paramString);
    int i = paramString.charAt(0);
    int j = 95;
    if (i != j) {
      bool = true;
    }
    return bool;
  }
  
  private int zzfu(String paramString)
  {
    Object localObject = "_ldl";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool) {
      localObject = zzCp();
    }
    for (int i = ((zzd)localObject).zzBG();; i = ((zzd)localObject).zzBF())
    {
      return i;
      localObject = zzCp();
    }
  }
  
  public static boolean zzfv(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    String str;
    if (!bool)
    {
      str = "_";
      bool = paramString.startsWith(str);
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
  
  static long zzq(byte[] paramArrayOfByte)
  {
    int i = 0;
    zzx.zzz(paramArrayOfByte);
    int j = paramArrayOfByte.length;
    if (j > 0) {}
    long l1;
    int k;
    for (j = 1;; k = 0)
    {
      zzx.zzab(j);
      l1 = 0L;
      k = paramArrayOfByte.length + -1;
      while (k >= 0)
      {
        int m = paramArrayOfByte.length + -8;
        if (k < m) {
          break;
        }
        m = paramArrayOfByte[k];
        long l2 = m;
        long l3 = 255L;
        l2 = (l2 & l3) << i;
        l1 += l2;
        i += 8;
        k += -1;
      }
    }
    return l1;
  }
  
  public void zza(Bundle paramBundle, String paramString, Object paramObject)
  {
    boolean bool = paramObject instanceof Long;
    if (bool)
    {
      paramObject = (Long)paramObject;
      long l = ((Long)paramObject).longValue();
      paramBundle.putLong(paramString, l);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Float;
      if (bool)
      {
        paramObject = (Float)paramObject;
        float f = ((Float)paramObject).floatValue();
        paramBundle.putFloat(paramString, f);
      }
      else
      {
        bool = paramObject instanceof String;
        Object localObject;
        if (bool)
        {
          localObject = String.valueOf(paramObject);
          paramBundle.putString(paramString, (String)localObject);
        }
        else if (paramString != null)
        {
          localObject = zzAo().zzCH();
          String str1 = "Not putting event parameter. Invalid value type. name, type";
          String str2 = paramObject.getClass().getSimpleName();
          ((zzp.zza)localObject).zze(str1, paramString, str2);
        }
      }
    }
  }
  
  public void zza(zzqb.zzc paramzzc, Object paramObject)
  {
    zzp.zza localzza = null;
    zzx.zzz(paramObject);
    paramzzc.zzamJ = null;
    paramzzc.zzbai = null;
    paramzzc.zzaZo = null;
    boolean bool = paramObject instanceof String;
    if (bool)
    {
      paramObject = (String)paramObject;
      paramzzc.zzamJ = ((String)paramObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        paramzzc.zzbai = ((Long)paramObject);
      }
      else
      {
        bool = paramObject instanceof Float;
        if (bool)
        {
          paramObject = (Float)paramObject;
          paramzzc.zzaZo = ((Float)paramObject);
        }
        else
        {
          localzza = zzAo().zzCE();
          String str = "Ignoring invalid (type) event param value";
          localzza.zzj(str, paramObject);
        }
      }
    }
  }
  
  public void zza(zzqb.zzg paramzzg, Object paramObject)
  {
    zzp.zza localzza = null;
    zzx.zzz(paramObject);
    paramzzg.zzamJ = null;
    paramzzg.zzbai = null;
    paramzzg.zzaZo = null;
    boolean bool = paramObject instanceof String;
    if (bool)
    {
      paramObject = (String)paramObject;
      paramzzg.zzamJ = ((String)paramObject);
    }
    for (;;)
    {
      return;
      bool = paramObject instanceof Long;
      if (bool)
      {
        paramObject = (Long)paramObject;
        paramzzg.zzbai = ((Long)paramObject);
      }
      else
      {
        bool = paramObject instanceof Float;
        if (bool)
        {
          paramObject = (Float)paramObject;
          paramzzg.zzaZo = ((Float)paramObject);
        }
        else
        {
          localzza = zzAo().zzCE();
          String str = "Ignoring invalid (type) user attribute value";
          localzza.zzj(str, paramObject);
        }
      }
    }
  }
  
  public byte[] zza(zzqb.zzd paramzzd)
  {
    try
    {
      i = paramzzd.getSerializedSize();
      arrayOfByte = new byte[i];
      localObject2 = zzsn.zzE(arrayOfByte);
      paramzzd.writeTo((zzsn)localObject2);
      ((zzsn)localObject2).zzJo();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        byte[] arrayOfByte;
        Object localObject2 = zzAo().zzCE();
        String str = "Data loss. Failed to serialize batch";
        ((zzp.zza)localObject2).zzj(str, localIOException);
        int i = 0;
        Object localObject1 = null;
      }
    }
    return arrayOfByte;
  }
  
  public boolean zzbk(String paramString)
  {
    zzjk();
    Object localObject = getContext();
    int i = ((Context)localObject).checkCallingOrSelfPermission(paramString);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      localObject = zzAo().zzCJ();
      String str = "Permission not granted";
      ((zzp.zza)localObject).zzj(str, paramString);
      int j = 0;
      localObject = null;
    }
  }
  
  void zzc(String paramString1, int paramInt, String paramString2)
  {
    int i = 95;
    Object localObject;
    if (paramString2 == null)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString1 + " name is required and can't be null";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int j = paramString2.length();
    if (j == 0)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString1 + " name is required and can't be empty";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    IllegalArgumentException localIllegalArgumentException = null;
    j = paramString2.charAt(0);
    boolean bool1 = Character.isLetter(j);
    if ((!bool1) && (j != i))
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString1 + " name must start with a letter or _";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    int k = 1;
    for (;;)
    {
      int m = paramString2.length();
      if (k >= m) {
        break;
      }
      m = paramString2.charAt(k);
      if (m != i)
      {
        boolean bool2 = Character.isLetterOrDigit(m);
        if (!bool2)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = paramString1 + " name must consist of letters, digits or _ (underscores)";
          localIllegalArgumentException.<init>((String)localObject);
          throw localIllegalArgumentException;
        }
      }
      k += 1;
    }
    k = paramString2.length();
    if (k > paramInt)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = paramString1 + " name is too long. The maximum supported length is " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
  }
  
  public boolean zzc(long paramLong1, long paramLong2)
  {
    long l = 0L;
    boolean bool1 = true;
    boolean bool2 = paramLong1 < l;
    if (bool2)
    {
      bool2 = paramLong2 < l;
      if (bool2) {
        break label31;
      }
    }
    for (;;)
    {
      return bool1;
      label31:
      zzmq localzzmq = zzjl();
      l = Math.abs(localzzmq.currentTimeMillis() - paramLong1);
      bool2 = l < paramLong2;
      if (!bool2) {
        bool1 = false;
      }
    }
  }
  
  public void zzfr(String paramString)
  {
    int i = zzCp().zzBB();
    zzc("event", i, paramString);
  }
  
  public void zzfs(String paramString)
  {
    int i = zzCp().zzBC();
    zzc("user attribute", i, paramString);
  }
  
  public void zzft(String paramString)
  {
    int i = zzCp().zzBC();
    zzc("event param", i, paramString);
  }
  
  public byte[] zzg(byte[] paramArrayOfByte)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      GZIPOutputStream localGZIPOutputStream = new java/util/zip/GZIPOutputStream;
      localGZIPOutputStream.<init>(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramArrayOfByte);
      localGZIPOutputStream.close();
      localByteArrayOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      zzAo().zzCE().zzj("Failed to gzip content", localIOException);
      throw localIOException;
    }
  }
  
  public Object zzk(String paramString, Object paramObject)
  {
    boolean bool = zzfv(paramString);
    zzd localzzd;
    if (bool) {
      localzzd = zzCp();
    }
    for (int i = localzzd.zzBE();; i = localzzd.zzBD())
    {
      return zza(i, paramObject, false);
      localzzd = zzCp();
    }
  }
  
  public void zzl(String paramString, Object paramObject)
  {
    String str = "_ldl";
    boolean bool = str.equals(paramString);
    int i;
    if (bool)
    {
      str = "user attribute referrer";
      i = zzfu(paramString);
      zza(str, paramString, i, paramObject);
    }
    for (;;)
    {
      return;
      str = "user attribute";
      i = zzfu(paramString);
      zza(str, paramString, i, paramObject);
    }
  }
  
  public Object zzm(String paramString, Object paramObject)
  {
    Object localObject = "_ldl";
    boolean bool1 = ((String)localObject).equals(paramString);
    int i;
    boolean bool2;
    if (bool1)
    {
      i = zzfu(paramString);
      bool2 = true;
    }
    for (localObject = zza(i, paramObject, bool2);; localObject = zza(i, paramObject, false))
    {
      return localObject;
      i = zzfu(paramString);
      bool2 = false;
    }
  }
  
  /* Error */
  public byte[] zzp(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 743	java/io/ByteArrayInputStream
    //   3: astore_2
    //   4: aload_2
    //   5: aload_1
    //   6: invokespecial 745	java/io/ByteArrayInputStream:<init>	([B)V
    //   9: new 747	java/util/zip/GZIPInputStream
    //   12: astore_3
    //   13: aload_3
    //   14: aload_2
    //   15: invokespecial 750	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: new 696	java/io/ByteArrayOutputStream
    //   21: astore 4
    //   23: aload 4
    //   25: invokespecial 697	java/io/ByteArrayOutputStream:<init>	()V
    //   28: sipush 1024
    //   31: istore 5
    //   33: iload 5
    //   35: newarray <illegal type>
    //   37: astore 6
    //   39: aload_3
    //   40: aload 6
    //   42: invokevirtual 755	java/util/zip/GZIPInputStream:read	([B)I
    //   45: istore 7
    //   47: iload 7
    //   49: ifgt +17 -> 66
    //   52: aload_3
    //   53: invokevirtual 756	java/util/zip/GZIPInputStream:close	()V
    //   56: aload_2
    //   57: invokevirtual 757	java/io/ByteArrayInputStream:close	()V
    //   60: aload 4
    //   62: invokevirtual 714	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   65: areturn
    //   66: aload 4
    //   68: aload 6
    //   70: iconst_0
    //   71: iload 7
    //   73: invokevirtual 760	java/io/ByteArrayOutputStream:write	([BII)V
    //   76: goto -37 -> 39
    //   79: astore_2
    //   80: aload_0
    //   81: invokevirtual 84	com/google/android/gms/measurement/internal/zzaj:zzAo	()Lcom/google/android/gms/measurement/internal/zzp;
    //   84: invokevirtual 601	com/google/android/gms/measurement/internal/zzp:zzCE	()Lcom/google/android/gms/measurement/internal/zzp$zza;
    //   87: ldc_w 762
    //   90: aload_2
    //   91: invokevirtual 111	com/google/android/gms/measurement/internal/zzp$zza:zzj	(Ljava/lang/String;Ljava/lang/Object;)V
    //   94: aload_2
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	zzaj
    //   0	96	1	paramArrayOfByte	byte[]
    //   3	54	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   79	16	2	localIOException	IOException
    //   12	41	3	localGZIPInputStream	java.util.zip.GZIPInputStream
    //   21	46	4	localByteArrayOutputStream	ByteArrayOutputStream
    //   31	3	5	i	int
    //   37	32	6	arrayOfByte	byte[]
    //   45	27	7	j	int
    // Exception table:
    //   from	to	target	type
    //   0	3	79	java/io/IOException
    //   5	9	79	java/io/IOException
    //   9	12	79	java/io/IOException
    //   14	18	79	java/io/IOException
    //   18	21	79	java/io/IOException
    //   23	28	79	java/io/IOException
    //   33	37	79	java/io/IOException
    //   40	45	79	java/io/IOException
    //   52	56	79	java/io/IOException
    //   56	60	79	java/io/IOException
    //   60	65	79	java/io/IOException
    //   71	76	79	java/io/IOException
  }
  
  public long zzr(byte[] paramArrayOfByte)
  {
    zzx.zzz(paramArrayOfByte);
    Object localObject = zzbv("MD5");
    if (localObject == null)
    {
      localObject = zzAo().zzCE();
      String str = "Failed to get MD5";
      ((zzp.zza)localObject).zzfg(str);
    }
    for (long l = 0L;; l = zzq((byte[])localObject))
    {
      return l;
      localObject = ((MessageDigest)localObject).digest(paramArrayOfByte);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzaj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */