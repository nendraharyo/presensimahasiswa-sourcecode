package com.google.android.gms.internal;

import android.text.TextUtils;

final class zzby$3
  extends zzby
{
  private String zzM(String paramString)
  {
    int i = 44;
    int j = TextUtils.isEmpty(paramString);
    if (j != 0) {}
    for (;;)
    {
      return paramString;
      j = 0;
      int m = paramString.length();
      int i1;
      int k;
      for (;;)
      {
        int n = paramString.length();
        if (j >= n) {
          break;
        }
        i1 = paramString.charAt(j);
        if (i1 != i) {
          break;
        }
        j += 1;
      }
      while (m > 0)
      {
        i1 = m + -1;
        i1 = paramString.charAt(i1);
        if (i1 != i) {
          break;
        }
        m += -1;
      }
      if (k == 0)
      {
        i1 = paramString.length();
        if (m == i1) {}
      }
      else
      {
        paramString = paramString.substring(k, m);
      }
    }
  }
  
  public String zzb(String paramString1, String paramString2)
  {
    Object localObject1 = zzM(paramString1);
    Object localObject2 = zzM(paramString2);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject1);
    if (bool) {}
    for (;;)
    {
      return (String)localObject2;
      bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool)
      {
        localObject2 = localObject1;
      }
      else
      {
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = ",";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject2 = (String)localObject2;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzby$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */