package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;

public class zzgo
  implements Runnable
{
  private final Handler zzGj;
  private final long zzGk;
  private long zzGl;
  private zzjq.zza zzGm;
  protected boolean zzGn;
  protected boolean zzGo;
  private final int zzoG;
  private final int zzoH;
  protected final zzjp zzpD;
  
  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2)
  {
    this(paramzza, paramzzjp, paramInt1, paramInt2, 200L, 50);
  }
  
  public zzgo(zzjq.zza paramzza, zzjp paramzzjp, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.zzGk = paramLong1;
    this.zzGl = paramLong2;
    Handler localHandler = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    localHandler.<init>(localLooper);
    this.zzGj = localHandler;
    this.zzpD = paramzzjp;
    this.zzGm = paramzza;
    this.zzGn = false;
    this.zzGo = false;
    this.zzoH = paramInt2;
    this.zzoG = paramInt1;
  }
  
  public void run()
  {
    Object localObject1 = this.zzpD;
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool1 = zzgg();
      if (!bool1) {}
    }
    else
    {
      localObject1 = this.zzGm;
      localObject2 = this.zzpD;
      boolean bool2 = true;
      ((zzjq.zza)localObject1).zza((zzjp)localObject2, bool2);
    }
    for (;;)
    {
      return;
      localObject1 = new com/google/android/gms/internal/zzgo$zza;
      localObject2 = this.zzpD.getWebView();
      ((zzgo.zza)localObject1).<init>(this, (WebView)localObject2);
      localObject2 = new Void[0];
      ((zzgo.zza)localObject1).execute((Object[])localObject2);
    }
  }
  
  public void zza(AdResponseParcel paramAdResponseParcel)
  {
    zzjy localzzjy = new com/google/android/gms/internal/zzjy;
    zzjp localzzjp = this.zzpD;
    String str = paramAdResponseParcel.zzIa;
    localzzjy.<init>(this, localzzjp, str);
    zza(paramAdResponseParcel, localzzjy);
  }
  
  public void zza(AdResponseParcel paramAdResponseParcel, zzjy paramzzjy)
  {
    this.zzpD.setWebViewClient(paramzzjy);
    zzjp localzzjp = this.zzpD;
    Object localObject = paramAdResponseParcel.zzEF;
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool) {
      bool = false;
    }
    String str;
    for (localObject = null;; localObject = ((zzir)localObject).zzaC(str))
    {
      str = paramAdResponseParcel.body;
      localzzjp.loadDataWithBaseURL((String)localObject, str, "text/html", "UTF-8", null);
      return;
      localObject = zzr.zzbC();
      str = paramAdResponseParcel.zzEF;
    }
  }
  
  public void zzge()
  {
    Handler localHandler = this.zzGj;
    long l = this.zzGk;
    localHandler.postDelayed(this, l);
  }
  
  public void zzgf()
  {
    boolean bool = true;
    try
    {
      this.zzGn = bool;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean zzgg()
  {
    try
    {
      boolean bool = this.zzGn;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean zzgh()
  {
    return this.zzGo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */