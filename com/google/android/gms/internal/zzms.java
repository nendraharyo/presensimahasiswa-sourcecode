package com.google.android.gms.internal;

import android.database.CharArrayBuffer;
import android.text.TextUtils;

public final class zzms
{
  public static void zzb(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {
      paramCharArrayBuffer.sizeCopied = 0;
    }
    for (;;)
    {
      int i = paramString.length();
      paramCharArrayBuffer.sizeCopied = i;
      return;
      char[] arrayOfChar1 = paramCharArrayBuffer.data;
      if (arrayOfChar1 != null)
      {
        arrayOfChar1 = paramCharArrayBuffer.data;
        i = arrayOfChar1.length;
        int j = paramString.length();
        if (i >= j) {}
      }
      else
      {
        arrayOfChar1 = paramString.toCharArray();
        paramCharArrayBuffer.data = arrayOfChar1;
        continue;
      }
      i = paramString.length();
      char[] arrayOfChar2 = paramCharArrayBuffer.data;
      paramString.getChars(0, i, arrayOfChar2, 0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */