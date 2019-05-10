package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzr;
import java.util.LinkedHashMap;
import java.util.Map;

public class zzbu
{
  private Context mContext = null;
  private String zzsy = null;
  private boolean zzxi;
  private String zzxj;
  private Map zzxk;
  
  public zzbu(Context paramContext, String paramString)
  {
    this.mContext = paramContext;
    this.zzsy = paramString;
    boolean bool = ((Boolean)zzbt.zzwg.get()).booleanValue();
    this.zzxi = bool;
    Object localObject1 = (String)zzbt.zzwh.get();
    this.zzxj = ((String)localObject1);
    localObject1 = new java/util/LinkedHashMap;
    ((LinkedHashMap)localObject1).<init>();
    this.zzxk = ((Map)localObject1);
    this.zzxk.put("s", "gmob_sdk");
    this.zzxk.put("v", "3");
    localObject1 = this.zzxk;
    String str1 = Build.VERSION.RELEASE;
    ((Map)localObject1).put("os", str1);
    localObject1 = this.zzxk;
    str1 = Build.VERSION.SDK;
    ((Map)localObject1).put("sdk", str1);
    localObject1 = this.zzxk;
    str1 = zzr.zzbC().zzht();
    ((Map)localObject1).put("device", str1);
    Object localObject2 = this.zzxk;
    str1 = "app";
    localObject1 = paramContext.getApplicationContext();
    if (localObject1 != null) {}
    for (localObject1 = paramContext.getApplicationContext().getPackageName();; localObject1 = paramContext.getPackageName())
    {
      ((Map)localObject2).put(str1, localObject1);
      localObject1 = zzr.zzbI();
      localObject2 = this.mContext;
      localObject1 = ((zzhk)localObject1).zzE((Context)localObject2);
      localObject2 = this.zzxk;
      String str2 = Integer.toString(((zzhj)localObject1).zzKc);
      ((Map)localObject2).put("network_coarse", str2);
      localObject2 = this.zzxk;
      localObject1 = Integer.toString(((zzhj)localObject1).zzKd);
      ((Map)localObject2).put("network_fine", localObject1);
      return;
    }
  }
  
  Context getContext()
  {
    return this.mContext;
  }
  
  String zzcs()
  {
    return this.zzsy;
  }
  
  boolean zzdu()
  {
    return this.zzxi;
  }
  
  String zzdv()
  {
    return this.zzxj;
  }
  
  Map zzdw()
  {
    return this.zzxk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */