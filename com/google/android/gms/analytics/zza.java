package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.measurement.zzc;
import com.google.android.gms.measurement.zze;
import com.google.android.gms.measurement.zzg;
import com.google.android.gms.measurement.zzi;
import java.util.List;
import java.util.ListIterator;

public class zza
  extends com.google.android.gms.measurement.zzf
{
  private final com.google.android.gms.analytics.internal.zzf zzOK;
  private boolean zzOL;
  
  public zza(com.google.android.gms.analytics.internal.zzf paramzzf)
  {
    super(localzzg, localzzmq);
    this.zzOK = paramzzf;
  }
  
  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    this.zzOL = paramBoolean;
  }
  
  protected void zza(zzc paramzzc)
  {
    zzke localzzke = (zzke)paramzzc.zzf(zzke.class);
    Object localObject = localzzke.getClientId();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (bool)
    {
      localObject = this.zzOK.zzjC().zzkk();
      localzzke.setClientId((String)localObject);
    }
    bool = this.zzOL;
    if (bool)
    {
      localObject = localzzke.zziT();
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (bool)
      {
        localObject = this.zzOK.zzjB();
        String str = ((com.google.android.gms.analytics.internal.zza)localObject).zziY();
        localzzke.zzaY(str);
        bool = ((com.google.android.gms.analytics.internal.zza)localObject).zziU();
        localzzke.zzH(bool);
      }
    }
  }
  
  public void zzaS(String paramString)
  {
    zzx.zzcM(paramString);
    zzaT(paramString);
    List localList = zzAG();
    zzb localzzb = new com/google/android/gms/analytics/zzb;
    com.google.android.gms.analytics.internal.zzf localzzf = this.zzOK;
    localzzb.<init>(localzzf, paramString);
    localList.add(localzzb);
  }
  
  public void zzaT(String paramString)
  {
    Uri localUri = zzb.zzaU(paramString);
    Object localObject = zzAG();
    ListIterator localListIterator = ((List)localObject).listIterator();
    for (;;)
    {
      boolean bool = localListIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = ((zzi)localListIterator.next()).zziA();
      bool = localUri.equals(localObject);
      if (bool) {
        localListIterator.remove();
      }
    }
  }
  
  com.google.android.gms.analytics.internal.zzf zzix()
  {
    return this.zzOK;
  }
  
  public zzc zziy()
  {
    zzc localzzc = zzAF().zzAu();
    Object localObject = this.zzOK.zzjt().zzjS();
    localzzc.zzb((zze)localObject);
    localObject = this.zzOK.zzju().zzkZ();
    localzzc.zzb((zze)localObject);
    zzd(localzzc);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */