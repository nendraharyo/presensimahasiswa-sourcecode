package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzak
{
  private final Set zzbiU;
  private final String zzbiV;
  
  public zzak(String paramString, String... paramVarArgs)
  {
    this.zzbiV = paramString;
    HashSet localHashSet = new java/util/HashSet;
    int i = paramVarArgs.length;
    localHashSet.<init>(i);
    this.zzbiU = localHashSet;
    i = paramVarArgs.length;
    int j = 0;
    localHashSet = null;
    while (j < i)
    {
      String str = paramVarArgs[j];
      Set localSet = this.zzbiU;
      localSet.add(str);
      j += 1;
    }
  }
  
  public abstract boolean zzFW();
  
  public String zzGB()
  {
    return this.zzbiV;
  }
  
  public Set zzGC()
  {
    return this.zzbiU;
  }
  
  public abstract zzag.zza zzP(Map paramMap);
  
  boolean zze(Set paramSet)
  {
    Set localSet = this.zzbiU;
    return paramSet.containsAll(localSet);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzak.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */