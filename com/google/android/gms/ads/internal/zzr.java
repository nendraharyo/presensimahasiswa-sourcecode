package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zze;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.internal.zzbq;
import com.google.android.gms.internal.zzbr;
import com.google.android.gms.internal.zzbs;
import com.google.android.gms.internal.zzbw;
import com.google.android.gms.internal.zzdq;
import com.google.android.gms.internal.zzdy;
import com.google.android.gms.internal.zzet;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjr;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;

public class zzr
{
  private static zzr zzqN;
  private static final Object zzqy;
  private final com.google.android.gms.ads.internal.request.zza zzqO;
  private final com.google.android.gms.ads.internal.overlay.zza zzqP;
  private final zze zzqQ;
  private final zzgr zzqR;
  private final zzir zzqS;
  private final zzjr zzqT;
  private final zzis zzqU;
  private final zzih zzqV;
  private final zzmq zzqW;
  private final zzbw zzqX;
  private final zzhk zzqY;
  private final zzbr zzqZ;
  private final zzbq zzra;
  private final zzbs zzrb;
  private final zzi zzrc;
  private final zzdy zzrd;
  private final zzix zzre;
  private final zzet zzrf;
  private final zzo zzrg;
  private final zzdq zzrh;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
    localObject = new com/google/android/gms/ads/internal/zzr;
    ((zzr)localObject).<init>();
    zza((zzr)localObject);
  }
  
  protected zzr()
  {
    Object localObject = new com/google/android/gms/ads/internal/request/zza;
    ((com.google.android.gms.ads.internal.request.zza)localObject).<init>();
    this.zzqO = ((com.google.android.gms.ads.internal.request.zza)localObject);
    localObject = new com/google/android/gms/ads/internal/overlay/zza;
    ((com.google.android.gms.ads.internal.overlay.zza)localObject).<init>();
    this.zzqP = ((com.google.android.gms.ads.internal.overlay.zza)localObject);
    localObject = new com/google/android/gms/ads/internal/overlay/zze;
    ((zze)localObject).<init>();
    this.zzqQ = ((zze)localObject);
    localObject = new com/google/android/gms/internal/zzgr;
    ((zzgr)localObject).<init>();
    this.zzqR = ((zzgr)localObject);
    localObject = new com/google/android/gms/internal/zzir;
    ((zzir)localObject).<init>();
    this.zzqS = ((zzir)localObject);
    localObject = new com/google/android/gms/internal/zzjr;
    ((zzjr)localObject).<init>();
    this.zzqT = ((zzjr)localObject);
    localObject = zzis.zzP(Build.VERSION.SDK_INT);
    this.zzqU = ((zzis)localObject);
    localObject = new com/google/android/gms/internal/zzih;
    zzir localzzir = this.zzqS;
    ((zzih)localObject).<init>(localzzir);
    this.zzqV = ((zzih)localObject);
    localObject = new com/google/android/gms/internal/zzmt;
    ((zzmt)localObject).<init>();
    this.zzqW = ((zzmq)localObject);
    localObject = new com/google/android/gms/internal/zzbw;
    ((zzbw)localObject).<init>();
    this.zzqX = ((zzbw)localObject);
    localObject = new com/google/android/gms/internal/zzhk;
    ((zzhk)localObject).<init>();
    this.zzqY = ((zzhk)localObject);
    localObject = new com/google/android/gms/internal/zzbr;
    ((zzbr)localObject).<init>();
    this.zzqZ = ((zzbr)localObject);
    localObject = new com/google/android/gms/internal/zzbq;
    ((zzbq)localObject).<init>();
    this.zzra = ((zzbq)localObject);
    localObject = new com/google/android/gms/internal/zzbs;
    ((zzbs)localObject).<init>();
    this.zzrb = ((zzbs)localObject);
    localObject = new com/google/android/gms/ads/internal/purchase/zzi;
    ((zzi)localObject).<init>();
    this.zzrc = ((zzi)localObject);
    localObject = new com/google/android/gms/internal/zzdy;
    ((zzdy)localObject).<init>();
    this.zzrd = ((zzdy)localObject);
    localObject = new com/google/android/gms/internal/zzix;
    ((zzix)localObject).<init>();
    this.zzre = ((zzix)localObject);
    localObject = new com/google/android/gms/internal/zzet;
    ((zzet)localObject).<init>();
    this.zzrf = ((zzet)localObject);
    localObject = new com/google/android/gms/ads/internal/zzo;
    ((zzo)localObject).<init>();
    this.zzrg = ((zzo)localObject);
    localObject = new com/google/android/gms/internal/zzdq;
    ((zzdq)localObject).<init>();
    this.zzrh = ((zzdq)localObject);
  }
  
  protected static void zza(zzr paramzzr)
  {
    synchronized (zzqy)
    {
      zzqN = paramzzr;
      return;
    }
  }
  
  public static zze zzbA()
  {
    return zzbx().zzqQ;
  }
  
  public static zzgr zzbB()
  {
    return zzbx().zzqR;
  }
  
  public static zzir zzbC()
  {
    return zzbx().zzqS;
  }
  
  public static zzjr zzbD()
  {
    return zzbx().zzqT;
  }
  
  public static zzis zzbE()
  {
    return zzbx().zzqU;
  }
  
  public static zzih zzbF()
  {
    return zzbx().zzqV;
  }
  
  public static zzmq zzbG()
  {
    return zzbx().zzqW;
  }
  
  public static zzbw zzbH()
  {
    return zzbx().zzqX;
  }
  
  public static zzhk zzbI()
  {
    return zzbx().zzqY;
  }
  
  public static zzbr zzbJ()
  {
    return zzbx().zzqZ;
  }
  
  public static zzbq zzbK()
  {
    return zzbx().zzra;
  }
  
  public static zzbs zzbL()
  {
    return zzbx().zzrb;
  }
  
  public static zzi zzbM()
  {
    return zzbx().zzrc;
  }
  
  public static zzdy zzbN()
  {
    return zzbx().zzrd;
  }
  
  public static zzix zzbO()
  {
    return zzbx().zzre;
  }
  
  public static zzet zzbP()
  {
    return zzbx().zzrf;
  }
  
  public static zzo zzbQ()
  {
    return zzbx().zzrg;
  }
  
  public static zzdq zzbR()
  {
    return zzbx().zzrh;
  }
  
  private static zzr zzbx()
  {
    synchronized (zzqy)
    {
      zzr localzzr = zzqN;
      return localzzr;
    }
  }
  
  public static com.google.android.gms.ads.internal.request.zza zzby()
  {
    return zzbx().zzqO;
  }
  
  public static com.google.android.gms.ads.internal.overlay.zza zzbz()
  {
    return zzbx().zzqP;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzr.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */