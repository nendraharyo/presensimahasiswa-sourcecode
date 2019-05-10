package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.IdpTokenType;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zzlg
  implements zzlf
{
  protected final Activity mActivity;
  private String zzWP;
  private String zzXT;
  protected final Set zzXf;
  private zzlf.zza zzYe;
  
  protected zzlg(Activity paramActivity, List paramList1, List paramList2)
  {
    Object localObject = (Activity)zzx.zzz(paramActivity);
    this.mActivity = ((Activity)localObject);
    HashSet localHashSet = new java/util/HashSet;
    localObject = (Collection)zzx.zzz(paramList1);
    localHashSet.<init>((Collection)localObject);
    localObject = (Collection)zzx.zzz(paramList2);
    localHashSet.addAll((Collection)localObject);
    localObject = Collections.unmodifiableSet(localHashSet);
    this.zzXf = ((Set)localObject);
  }
  
  protected Intent zza(IdpTokenType paramIdpTokenType, String paramString1, String paramString2)
  {
    zzx.zzz(paramIdpTokenType);
    zzx.zzcM(paramString1);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("com.google.android.gms.auth.VERIFY_ASSERTION");
    localIntent.putExtra("idpTokenType", paramIdpTokenType);
    localIntent.putExtra("idpToken", paramString1);
    localIntent.putExtra("pendingToken", paramString2);
    Object localObject = zzmU();
    if (localObject != null)
    {
      String str = "idProvider";
      localObject = ((zzd)localObject).zzmT();
      localIntent.putExtra(str, (String)localObject);
    }
    return localIntent;
  }
  
  protected void zzb(zzlf.zza paramzza)
  {
    zzlf.zza localzza = (zzlf.zza)zzx.zzz(paramzza);
    this.zzYe = localzza;
  }
  
  protected void zzb(String paramString1, String paramString2, zzlf.zza paramzza)
  {
    zzbW(paramString1);
    zzbX(paramString2);
    zzb(paramzza);
  }
  
  protected void zzbW(String paramString)
  {
    this.zzWP = paramString;
  }
  
  protected void zzbX(String paramString)
  {
    this.zzXT = paramString;
  }
  
  protected Set zzns()
  {
    return this.zzXf;
  }
  
  protected zzlf.zza zznt()
  {
    return this.zzYe;
  }
  
  protected String zznu()
  {
    return this.zzXT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */