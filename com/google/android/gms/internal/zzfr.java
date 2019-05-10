package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;
import org.json.JSONObject;

public class zzfr
  extends zzfs
  implements zzdf
{
  private final Context mContext;
  DisplayMetrics zzDA;
  private float zzDB;
  int zzDC;
  int zzDD;
  private int zzDE;
  int zzDF;
  int zzDG;
  int zzDH;
  int zzDI;
  private final zzbl zzDz;
  private final zzjp zzpD;
  private final WindowManager zzsb;
  
  public zzfr(zzjp paramzzjp, Context paramContext, zzbl paramzzbl)
  {
    super(paramzzjp);
    this.zzDC = i;
    this.zzDD = i;
    this.zzDF = i;
    this.zzDG = i;
    this.zzDH = i;
    this.zzDI = i;
    this.zzpD = paramzzjp;
    this.mContext = paramContext;
    this.zzDz = paramzzbl;
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    this.zzsb = localWindowManager;
  }
  
  private void zzeQ()
  {
    Object localObject = new android/util/DisplayMetrics;
    ((DisplayMetrics)localObject).<init>();
    this.zzDA = ((DisplayMetrics)localObject);
    localObject = this.zzsb.getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = this.zzDA;
    ((Display)localObject).getMetrics(localDisplayMetrics);
    float f = this.zzDA.density;
    this.zzDB = f;
    int i = ((Display)localObject).getRotation();
    this.zzDE = i;
  }
  
  private void zzeV()
  {
    int[] arrayOfInt = new int[2];
    this.zzpD.getLocationOnScreen(arrayOfInt);
    zza localzza = zzn.zzcS();
    Object localObject = this.mContext;
    int i = arrayOfInt[0];
    int j = localzza.zzc((Context)localObject, i);
    localObject = zzn.zzcS();
    Context localContext = this.mContext;
    int k = arrayOfInt[1];
    k = ((zza)localObject).zzc(localContext, k);
    zzf(j, k);
  }
  
  private zzfq zzeY()
  {
    zzfq.zza localzza = new com/google/android/gms/internal/zzfq$zza;
    localzza.<init>();
    boolean bool = this.zzDz.zzdj();
    localzza = localzza.zzr(bool);
    bool = this.zzDz.zzdk();
    localzza = localzza.zzq(bool);
    bool = this.zzDz.zzdo();
    localzza = localzza.zzs(bool);
    bool = this.zzDz.zzdl();
    localzza = localzza.zzt(bool);
    bool = this.zzDz.zzdm();
    return localzza.zzu(bool).zzeP();
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zzeT();
  }
  
  void zzeR()
  {
    Object localObject1 = zzn.zzcS();
    Object localObject2 = this.zzDA;
    int i = this.zzDA.widthPixels;
    int j = ((zza)localObject1).zzb((DisplayMetrics)localObject2, i);
    this.zzDC = j;
    localObject1 = zzn.zzcS();
    localObject2 = this.zzDA;
    DisplayMetrics localDisplayMetrics = this.zzDA;
    i = localDisplayMetrics.heightPixels;
    j = ((zza)localObject1).zzb((DisplayMetrics)localObject2, i);
    this.zzDD = j;
    localObject1 = this.zzpD.zzhP();
    if (localObject1 != null)
    {
      localObject2 = ((Activity)localObject1).getWindow();
      if (localObject2 != null) {}
    }
    else
    {
      j = this.zzDC;
      this.zzDF = j;
      j = this.zzDD;
    }
    for (this.zzDG = j;; this.zzDG = j)
    {
      return;
      localObject1 = zzr.zzbC().zze((Activity)localObject1);
      localObject2 = zzn.zzcS();
      localDisplayMetrics = this.zzDA;
      int k = localObject1[0];
      int m = ((zza)localObject2).zzb(localDisplayMetrics, k);
      this.zzDF = m;
      localObject2 = zzn.zzcS();
      localDisplayMetrics = this.zzDA;
      k = 1;
      j = localObject1[k];
      j = ((zza)localObject2).zzb(localDisplayMetrics, j);
    }
  }
  
  void zzeS()
  {
    Context localContext = null;
    Object localObject = this.zzpD.zzaN();
    boolean bool = ((AdSizeParcel)localObject).zzui;
    int i;
    if (bool)
    {
      i = this.zzDC;
      this.zzDH = i;
      i = this.zzDD;
    }
    for (this.zzDI = i;; this.zzDI = i)
    {
      return;
      this.zzpD.measure(0, 0);
      localObject = zzn.zzcS();
      localContext = this.mContext;
      int j = this.zzpD.getMeasuredWidth();
      i = ((zza)localObject).zzc(localContext, j);
      this.zzDH = i;
      localObject = zzn.zzcS();
      localContext = this.mContext;
      zzjp localzzjp = this.zzpD;
      j = localzzjp.getMeasuredHeight();
      i = ((zza)localObject).zzc(localContext, j);
    }
  }
  
  public void zzeT()
  {
    zzeQ();
    zzeR();
    zzeS();
    zzeW();
    zzeX();
    zzeV();
    zzeU();
  }
  
  void zzeU()
  {
    boolean bool = zzin.zzQ(2);
    if (bool)
    {
      str = "Dispatching Ready Event.";
      zzin.zzaJ(str);
    }
    String str = this.zzpD.zzhX().afmaVersion;
    zzan(str);
  }
  
  void zzeW()
  {
    int i = this.zzDC;
    int j = this.zzDD;
    int k = this.zzDF;
    int m = this.zzDG;
    float f = this.zzDB;
    int n = this.zzDE;
    zza(i, j, k, m, f, n);
  }
  
  void zzeX()
  {
    Object localObject = zzeY();
    zzjp localzzjp = this.zzpD;
    localObject = ((zzfq)localObject).toJson();
    localzzjp.zzb("onDeviceFeaturesReceived", (JSONObject)localObject);
  }
  
  public void zzf(int paramInt1, int paramInt2)
  {
    int i = 0;
    Object localObject = this.mContext;
    boolean bool = localObject instanceof Activity;
    int j;
    if (bool)
    {
      zzir localzzir = zzr.zzbC();
      localObject = (Activity)this.mContext;
      localObject = localzzir.zzh((Activity)localObject);
      j = localObject[0];
    }
    for (;;)
    {
      j = paramInt2 - j;
      i = this.zzDH;
      int k = this.zzDI;
      zzc(paramInt1, j, i, k);
      this.zzpD.zzhU().zze(paramInt1, paramInt2);
      return;
      j = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */