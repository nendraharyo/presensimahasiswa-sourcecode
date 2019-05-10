package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class zzaw
{
  private final boolean zzsA;
  private final String zzsv;
  private final JSONObject zzsw;
  private final String zzsx;
  private final String zzsy;
  private final boolean zzsz;
  
  public zzaw(String paramString1, VersionInfoParcel paramVersionInfoParcel, String paramString2, JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    String str = paramVersionInfoParcel.afmaVersion;
    this.zzsy = str;
    this.zzsw = paramJSONObject;
    this.zzsx = paramString1;
    this.zzsv = paramString2;
    this.zzsz = paramBoolean1;
    this.zzsA = paramBoolean2;
  }
  
  public String zzcr()
  {
    return this.zzsv;
  }
  
  public String zzcs()
  {
    return this.zzsy;
  }
  
  public JSONObject zzct()
  {
    return this.zzsw;
  }
  
  public String zzcu()
  {
    return this.zzsx;
  }
  
  public boolean zzcv()
  {
    return this.zzsz;
  }
  
  public boolean zzcw()
  {
    return this.zzsA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzaw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */