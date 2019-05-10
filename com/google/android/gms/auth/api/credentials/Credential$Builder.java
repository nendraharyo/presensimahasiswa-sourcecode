package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import java.util.List;

public class Credential$Builder
{
  private String mName;
  private Uri zzVV;
  private List zzVW;
  private String zzVX;
  private String zzVY;
  private String zzVZ;
  private String zzWa;
  private final String zzyv;
  
  public Credential$Builder(Credential paramCredential)
  {
    Object localObject = Credential.zza(paramCredential);
    this.zzyv = ((String)localObject);
    localObject = Credential.zzb(paramCredential);
    this.mName = ((String)localObject);
    localObject = Credential.zzc(paramCredential);
    this.zzVV = ((Uri)localObject);
    localObject = Credential.zzd(paramCredential);
    this.zzVW = ((List)localObject);
    localObject = Credential.zze(paramCredential);
    this.zzVX = ((String)localObject);
    localObject = Credential.zzf(paramCredential);
    this.zzVY = ((String)localObject);
    localObject = Credential.zzg(paramCredential);
    this.zzVZ = ((String)localObject);
    localObject = Credential.zzh(paramCredential);
    this.zzWa = ((String)localObject);
  }
  
  public Credential$Builder(String paramString)
  {
    this.zzyv = paramString;
  }
  
  public Credential build()
  {
    Credential localCredential = new com/google/android/gms/auth/api/credentials/Credential;
    String str1 = this.zzyv;
    String str2 = this.mName;
    Uri localUri = this.zzVV;
    List localList = this.zzVW;
    String str3 = this.zzVX;
    String str4 = this.zzVY;
    String str5 = this.zzVZ;
    String str6 = this.zzWa;
    localCredential.<init>(3, str1, str2, localUri, localList, str3, str4, str5, str6);
    return localCredential;
  }
  
  public Builder setAccountType(String paramString)
  {
    this.zzVY = paramString;
    return this;
  }
  
  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }
  
  public Builder setPassword(String paramString)
  {
    this.zzVX = paramString;
    return this;
  }
  
  public Builder setProfilePictureUri(Uri paramUri)
  {
    this.zzVV = paramUri;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\credentials\Credential$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */