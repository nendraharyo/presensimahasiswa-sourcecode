package com.google.android.gms.ads.internal.formats;

import android.support.v4.h.m;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzcp.zza;
import com.google.android.gms.internal.zzin;
import java.util.Arrays;
import java.util.List;

public class zzf
  extends zzcp.zza
  implements zzh.zza
{
  private final Object zzpV;
  private final zza zzye;
  private zzh zzyf;
  private final String zzyi;
  private final m zzyj;
  private final m zzyk;
  
  public zzf(String paramString, m paramm1, m paramm2, zza paramzza)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzyi = paramString;
    this.zzyj = paramm1;
    this.zzyk = paramm2;
    this.zzye = paramzza;
  }
  
  public List getAvailableAssetNames()
  {
    int i = 0;
    Object localObject = this.zzyj;
    int j = ((m)localObject).size();
    int k = this.zzyk.size();
    j += k;
    String[] arrayOfString = new String[j];
    k = 0;
    int m = 0;
    for (;;)
    {
      localObject = this.zzyj;
      j = ((m)localObject).size();
      if (k >= j) {
        break;
      }
      localObject = (String)this.zzyj.keyAt(k);
      arrayOfString[m] = localObject;
      j = k + 1;
      m += 1;
      k = j;
    }
    for (;;)
    {
      localObject = this.zzyk;
      j = ((m)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (String)this.zzyk.keyAt(i);
      arrayOfString[m] = localObject;
      i += 1;
      m += 1;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public String getCustomTemplateId()
  {
    return this.zzyi;
  }
  
  public void performClick(String paramString)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzyf;
      if (localObject2 == null)
      {
        localObject2 = "Attempt to call performClick before ad initialized.";
        zzin.e((String)localObject2);
        return;
      }
      localObject2 = this.zzyf;
      ((zzh)localObject2).zza(paramString, null, null, null);
    }
  }
  
  public void recordImpression()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzyf;
      if (localObject2 == null)
      {
        localObject2 = "Attempt to perform recordImpression before ad initialized.";
        zzin.e((String)localObject2);
        return;
      }
      localObject2 = this.zzyf;
      ((zzh)localObject2).recordImpression();
    }
  }
  
  public String zzO(String paramString)
  {
    return (String)this.zzyk.get(paramString);
  }
  
  public zzch zzP(String paramString)
  {
    return (zzch)this.zzyj.get(paramString);
  }
  
  public void zzb(zzh paramzzh)
  {
    synchronized (this.zzpV)
    {
      this.zzyf = paramzzh;
      return;
    }
  }
  
  public String zzdM()
  {
    return "3";
  }
  
  public zza zzdN()
  {
    return this.zzye;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */