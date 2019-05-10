package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class GoogleSignInOptions$1
  implements Comparator
{
  public int zza(Scope paramScope1, Scope paramScope2)
  {
    String str1 = paramScope1.zzpb();
    String str2 = paramScope2.zzpb();
    return str1.compareTo(str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\GoogleSignInOptions$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */