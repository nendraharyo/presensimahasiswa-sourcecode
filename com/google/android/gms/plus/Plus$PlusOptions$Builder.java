package com.google.android.gms.plus;

import com.google.android.gms.common.internal.zzx;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions$Builder
{
  String zzbdY;
  final Set zzbdZ;
  
  public Plus$PlusOptions$Builder()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbdZ = localHashSet;
  }
  
  public Builder addActivityTypes(String... paramVarArgs)
  {
    zzx.zzb(paramVarArgs, "activityTypes may not be null.");
    int i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Set localSet = this.zzbdZ;
      String str = paramVarArgs[i];
      localSet.add(str);
      i += 1;
    }
    return this;
  }
  
  public Plus.PlusOptions build()
  {
    Plus.PlusOptions localPlusOptions = new com/google/android/gms/plus/Plus$PlusOptions;
    localPlusOptions.<init>(this, null);
    return localPlusOptions;
  }
  
  public Builder setServerClientId(String paramString)
  {
    this.zzbdY = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\Plus$PlusOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */