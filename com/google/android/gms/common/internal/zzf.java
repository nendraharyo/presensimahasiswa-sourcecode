package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.internal.zzro;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzf
{
  private final Account zzTI;
  private final String zzUW;
  private final Set zzagh;
  private final int zzagj;
  private final View zzagk;
  private final String zzagl;
  private final Set zzalb;
  private final Map zzalc;
  private final zzro zzald;
  private Integer zzale;
  
  public zzf(Account paramAccount, Set paramSet, Map paramMap, int paramInt, View paramView, String paramString1, String paramString2, zzro paramzzro)
  {
    this.zzTI = paramAccount;
    if (paramSet == null) {}
    HashSet localHashSet;
    for (Object localObject = Collections.EMPTY_SET;; localObject = Collections.unmodifiableSet(paramSet))
    {
      this.zzagh = ((Set)localObject);
      if (paramMap == null) {
        paramMap = Collections.EMPTY_MAP;
      }
      this.zzalc = paramMap;
      this.zzagk = paramView;
      this.zzagj = paramInt;
      this.zzUW = paramString1;
      this.zzagl = paramString2;
      this.zzald = paramzzro;
      localHashSet = new java/util/HashSet;
      localObject = this.zzagh;
      localHashSet.<init>((Collection)localObject);
      localObject = this.zzalc.values();
      Iterator localIterator = ((Collection)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = ((zzf.zza)localIterator.next()).zzXf;
        localHashSet.addAll((Collection)localObject);
      }
    }
    localObject = Collections.unmodifiableSet(localHashSet);
    this.zzalb = ((Set)localObject);
  }
  
  public static zzf zzat(Context paramContext)
  {
    GoogleApiClient.Builder localBuilder = new com/google/android/gms/common/api/GoogleApiClient$Builder;
    localBuilder.<init>(paramContext);
    return localBuilder.zzoY();
  }
  
  public Account getAccount()
  {
    return this.zzTI;
  }
  
  public String getAccountName()
  {
    Object localObject = this.zzTI;
    if (localObject != null) {}
    for (localObject = this.zzTI.name;; localObject = null) {
      return (String)localObject;
    }
  }
  
  public void zza(Integer paramInteger)
  {
    this.zzale = paramInteger;
  }
  
  public Set zzb(Api paramApi)
  {
    Object localObject1 = (zzf.zza)this.zzalc.get(paramApi);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((zzf.zza)localObject1).zzXf;
      boolean bool = ((Set)localObject2).isEmpty();
      if (!bool) {
        break label43;
      }
    }
    for (localObject1 = this.zzagh;; localObject1 = localObject2)
    {
      return (Set)localObject1;
      label43:
      localObject2 = new java/util/HashSet;
      Set localSet = this.zzagh;
      ((HashSet)localObject2).<init>(localSet);
      localObject1 = ((zzf.zza)localObject1).zzXf;
      ((Set)localObject2).addAll((Collection)localObject1);
    }
  }
  
  public Account zzqq()
  {
    Account localAccount = this.zzTI;
    if (localAccount != null) {
      localAccount = this.zzTI;
    }
    for (;;)
    {
      return localAccount;
      localAccount = new android/accounts/Account;
      String str1 = "<<default account>>";
      String str2 = "com.google";
      localAccount.<init>(str1, str2);
    }
  }
  
  public int zzqr()
  {
    return this.zzagj;
  }
  
  public Set zzqs()
  {
    return this.zzagh;
  }
  
  public Set zzqt()
  {
    return this.zzalb;
  }
  
  public Map zzqu()
  {
    return this.zzalc;
  }
  
  public String zzqv()
  {
    return this.zzUW;
  }
  
  public String zzqw()
  {
    return this.zzagl;
  }
  
  public View zzqx()
  {
    return this.zzagk;
  }
  
  public zzro zzqy()
  {
    return this.zzald;
  }
  
  public Integer zzqz()
  {
    return this.zzale;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */