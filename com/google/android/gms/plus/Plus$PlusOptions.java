package com.google.android.gms.plus;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import java.util.HashSet;
import java.util.Set;

public final class Plus$PlusOptions
  implements Api.ApiOptions.Optional
{
  final String zzbdY;
  final Set zzbdZ;
  
  private Plus$PlusOptions()
  {
    this.zzbdY = null;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbdZ = localHashSet;
  }
  
  private Plus$PlusOptions(Plus.PlusOptions.Builder paramBuilder)
  {
    Object localObject = paramBuilder.zzbdY;
    this.zzbdY = ((String)localObject);
    localObject = paramBuilder.zzbdZ;
    this.zzbdZ = ((Set)localObject);
  }
  
  public static Plus.PlusOptions.Builder builder()
  {
    Plus.PlusOptions.Builder localBuilder = new com/google/android/gms/plus/Plus$PlusOptions$Builder;
    localBuilder.<init>();
    return localBuilder;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\Plus$PlusOptions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */