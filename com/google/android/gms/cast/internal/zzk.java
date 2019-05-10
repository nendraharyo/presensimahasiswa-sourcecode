package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.Api.zzc;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public final class zzk
{
  public static final Api.zzc zzUI;
  public static final Charset zzaec;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = null;
    String str = "UTF-8";
    try
    {
      localObject = Charset.forName(str);
    }
    catch (UnsupportedCharsetException localUnsupportedCharsetException)
    {
      for (;;) {}
    }
    catch (IllegalCharsetNameException localIllegalCharsetNameException)
    {
      for (;;) {}
    }
    zzaec = (Charset)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */