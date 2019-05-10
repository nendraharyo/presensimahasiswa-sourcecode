package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;

public final class AdMobAdapter
  extends AbstractAdViewAdapter
{
  protected Bundle zza(Bundle paramBundle1, Bundle paramBundle2)
  {
    int i = 1;
    if (paramBundle1 != null) {}
    for (;;)
    {
      paramBundle1.putInt("gw", i);
      String str1 = paramBundle2.getString("mad_hac");
      paramBundle1.putString("mad_hac", str1);
      String str2 = paramBundle2.getString("adJson");
      boolean bool = TextUtils.isEmpty(str2);
      if (!bool)
      {
        str2 = "_ad";
        str1 = paramBundle2.getString("adJson");
        paramBundle1.putString(str2, str1);
      }
      paramBundle1.putBoolean("_noRefresh", i);
      return paramBundle1;
      paramBundle1 = new android/os/Bundle;
      paramBundle1.<init>();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\admob\AdMobAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */