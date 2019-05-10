package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbx;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zziv;
import com.google.android.gms.internal.zziv.zza;
import com.google.android.gms.internal.zziv.zzb;
import com.google.android.gms.internal.zzmq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzt
{
  private final Context mContext;
  private final String zzEY;
  private final VersionInfoParcel zzEZ;
  private final zzbz zzFa;
  private final zzcb zzFb;
  private final zziv zzFc;
  private final long[] zzFd;
  private final String[] zzFe;
  private zzbz zzFf;
  private zzbz zzFg;
  private zzbz zzFh;
  private zzbz zzFi;
  private boolean zzFj;
  private zzi zzFk;
  private boolean zzFl;
  private boolean zzFm;
  private long zzFn;
  
  public zzt(Context paramContext, VersionInfoParcel paramVersionInfoParcel, String paramString, zzcb paramzzcb, zzbz paramzzbz)
  {
    Object localObject1 = new com/google/android/gms/internal/zziv$zzb;
    ((zziv.zzb)localObject1).<init>();
    localObject1 = ((zziv.zzb)localObject1).zza("min_1", Double.MIN_VALUE, 1.0D).zza("1_5", 1.0D, 5.0D).zza("5_10", 5.0D, 10.0D).zza("10_20", 10.0D, 20.0D).zza("20_30", 20.0D, 30.0D);
    Object localObject2 = "30_max";
    double d1 = 30.0D;
    l1 = 9218868437227405311L;
    d2 = Double.MAX_VALUE;
    localObject1 = ((zziv.zzb)localObject1).zza((String)localObject2, d1, d2).zzhA();
    this.zzFc = ((zziv)localObject1);
    long l2 = -1;
    this.zzFn = l2;
    this.mContext = paramContext;
    this.zzEZ = paramVersionInfoParcel;
    this.zzEY = paramString;
    this.zzFb = paramzzcb;
    this.zzFa = paramzzbz;
    localObject1 = (String)zzbt.zzvV.get();
    if (localObject1 == null)
    {
      localObject1 = new String[0];
      this.zzFe = ((String[])localObject1);
      i = 0;
      localObject1 = new long[0];
      this.zzFd = ((long[])localObject1);
      return;
    }
    localObject2 = ",";
    String[] arrayOfString = TextUtils.split((String)localObject1, (String)localObject2);
    localObject1 = new String[arrayOfString.length];
    this.zzFe = ((String[])localObject1);
    localObject1 = new long[arrayOfString.length];
    this.zzFd = ((long[])localObject1);
    i = 0;
    localObject1 = null;
    for (;;)
    {
      int j = arrayOfString.length;
      if (i >= j) {
        break;
      }
      try
      {
        localObject2 = this.zzFd;
        str = arrayOfString[i];
        l1 = Long.parseLong(str);
        localObject2[i] = l1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        for (;;)
        {
          String str = "Unable to parse frame hash target time number.";
          zzin.zzd(str, localNumberFormatException);
          long[] arrayOfLong = this.zzFd;
          l1 = -1;
          d2 = 0.0D / 0.0D;
          arrayOfLong[i] = l1;
        }
      }
      i += 1;
    }
  }
  
  private void zzc(zzi paramzzi)
  {
    long l1 = ((Long)zzbt.zzvW.get()).longValue();
    long l2 = paramzzi.getCurrentPosition();
    int i = 0;
    Object localObject = this.zzFe;
    int j = localObject.length;
    if (i < j)
    {
      localObject = this.zzFe[i];
      if (localObject != null) {}
      boolean bool;
      do
      {
        i += 1;
        break;
        localObject = this.zzFd;
        long l3 = localObject[i];
        l3 = Math.abs(l2 - l3);
        bool = l1 < l3;
      } while (!bool);
      localObject = this.zzFe;
      String str = zza(paramzzi);
      localObject[i] = str;
    }
  }
  
  private void zzfN()
  {
    int i = 1;
    zziv localzziv = null;
    Object localObject1 = this.zzFh;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzFi;
      if (localObject1 == null)
      {
        localObject1 = this.zzFb;
        zzbz localzzbz = this.zzFh;
        localObject2 = new String[i];
        localObject2[0] = "vff";
        zzbx.zza((zzcb)localObject1, localzzbz, (String[])localObject2);
        localObject1 = this.zzFb;
        localzzbz = this.zzFa;
        localObject2 = new String[i];
        String str = "vtt";
        localObject2[0] = str;
        zzbx.zza((zzcb)localObject1, localzzbz, (String[])localObject2);
        localObject1 = zzbx.zzb(this.zzFb);
        this.zzFi = ((zzbz)localObject1);
      }
    }
    localObject1 = zzr.zzbG();
    long l1 = ((zzmq)localObject1).nanoTime();
    boolean bool = this.zzFj;
    if (bool)
    {
      bool = this.zzFm;
      if (bool)
      {
        long l2 = this.zzFn;
        long l3 = -1;
        double d1 = 0.0D / 0.0D;
        bool = l2 < l3;
        if (bool)
        {
          localObject2 = TimeUnit.SECONDS;
          l2 = ((TimeUnit)localObject2).toNanos(1L);
          double d2 = l2;
          l3 = this.zzFn;
          l3 = l1 - l3;
          d1 = l3;
          d2 /= d1;
          localzziv = this.zzFc;
          localzziv.zza(d2);
        }
      }
    }
    bool = this.zzFj;
    this.zzFm = bool;
    this.zzFn = l1;
  }
  
  public void onStop()
  {
    boolean bool = true;
    Object localObject1 = (Boolean)zzbt.zzvU.get();
    int i = ((Boolean)localObject1).booleanValue();
    if (i != 0)
    {
      i = this.zzFl;
      if (i == 0)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("type", "native-player-metrics");
        Object localObject2 = this.zzEY;
        localBundle.putString("request", (String)localObject2);
        localObject2 = this.zzFk.zzeZ();
        localBundle.putString("player", (String)localObject2);
        localObject1 = this.zzFc.getBuckets();
        localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
          i = ((Iterator)localObject2).hasNext();
          if (i == 0) {
            break;
          }
          localObject1 = (zziv.zza)((Iterator)localObject2).next();
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("fps_c_");
          localObject4 = ((zziv.zza)localObject1).name;
          localObject3 = (String)localObject4;
          int k = ((zziv.zza)localObject1).count;
          localObject4 = Integer.toString(k);
          localBundle.putString((String)localObject3, (String)localObject4);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append("fps_p_");
          localObject4 = ((zziv.zza)localObject1).name;
          localObject3 = (String)localObject4;
          double d = ((zziv.zza)localObject1).zzMu;
          localObject1 = Double.toString(d);
          localBundle.putString((String)localObject3, (String)localObject1);
        }
        i = 0;
        localObject1 = null;
        localObject2 = this.zzFd;
        int m = localObject2.length;
        if (i < m)
        {
          localObject2 = this.zzFe[i];
          if (localObject2 == null) {}
          for (;;)
          {
            int j;
            i += 1;
            break;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = ((StringBuilder)localObject3).append("fh_");
            long l = this.zzFd[j];
            localObject4 = Long.valueOf(l);
            localObject3 = localObject4;
            localBundle.putString((String)localObject3, (String)localObject2);
          }
        }
        localObject1 = zzr.zzbC();
        localObject2 = this.mContext;
        Object localObject3 = this.zzEZ.afmaVersion;
        Object localObject4 = "gmob-apps";
        ((zzir)localObject1).zza((Context)localObject2, (String)localObject3, (String)localObject4, localBundle, bool);
        this.zzFl = bool;
      }
    }
  }
  
  String zza(TextureView paramTextureView)
  {
    int i = 8;
    Bitmap localBitmap = paramTextureView.getBitmap(8, i);
    long l1 = 0L;
    long l2 = 63;
    int j = 0;
    int k = 0;
    for (;;)
    {
      j = 8;
      if (k >= j) {
        break;
      }
      j = 0;
      long l3 = l1;
      l1 = l2;
      int m = 0;
      j = 8;
      if (m < j)
      {
        j = localBitmap.getPixel(m, k);
        i = Color.blue(j);
        int n = Color.red(j);
        i += n;
        j = Color.green(j) + i;
        i = 128;
        if (j > i) {}
        for (long l4 = 1L;; l4 = 0L)
        {
          n = (int)l1;
          l4 <<= n;
          l3 |= l4;
          j = m + 1;
          l2 = l1 - 1L;
          l1 = l2;
          m = j;
          break;
        }
      }
      j = k + 1;
      k = j;
      l2 = l1;
      l1 = l3;
    }
    Object[] arrayOfObject = new Object[1];
    Long localLong = Long.valueOf(l1);
    arrayOfObject[0] = localLong;
    return String.format("%016X", arrayOfObject);
  }
  
  public void zza(zzi paramzzi)
  {
    Object localObject = this.zzFb;
    zzbz localzzbz = this.zzFa;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "vpc";
    zzbx.zza((zzcb)localObject, localzzbz, arrayOfString);
    localObject = zzbx.zzb(this.zzFb);
    this.zzFf = ((zzbz)localObject);
    this.zzFk = paramzzi;
  }
  
  public void zzb(zzi paramzzi)
  {
    zzfN();
    zzc(paramzzi);
  }
  
  public void zzfO()
  {
    boolean bool = true;
    this.zzFj = bool;
    Object localObject = this.zzFg;
    if (localObject != null)
    {
      localObject = this.zzFh;
      if (localObject == null)
      {
        localObject = this.zzFb;
        zzbz localzzbz = this.zzFg;
        String[] arrayOfString = new String[bool];
        String str = "vfp";
        arrayOfString[0] = str;
        zzbx.zza((zzcb)localObject, localzzbz, arrayOfString);
        localObject = zzbx.zzb(this.zzFb);
        this.zzFh = ((zzbz)localObject);
      }
    }
  }
  
  public void zzfP()
  {
    this.zzFj = false;
  }
  
  public void zzfz()
  {
    Object localObject = this.zzFf;
    if (localObject != null)
    {
      localObject = this.zzFg;
      if (localObject == null) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      localObject = this.zzFb;
      zzbz localzzbz = this.zzFf;
      int i = 1;
      String[] arrayOfString = new String[i];
      String str = "vfr";
      arrayOfString[0] = str;
      zzbx.zza((zzcb)localObject, localzzbz, arrayOfString);
      localObject = zzbx.zzb(this.zzFb);
      this.zzFg = ((zzbz)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */