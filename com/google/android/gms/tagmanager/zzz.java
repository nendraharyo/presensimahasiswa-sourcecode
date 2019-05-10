package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class zzz
  implements zzar
{
  private static final Object zzbhz;
  private static zzz zzbiM;
  private String zzbiN;
  private String zzbiO;
  private zzas zzbiP;
  private zzcd zzbic;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzbhz = localObject;
  }
  
  private zzz(Context paramContext)
  {
    this(localzzat, localzzcs);
  }
  
  zzz(zzas paramzzas, zzcd paramzzcd)
  {
    this.zzbiP = paramzzas;
    this.zzbic = paramzzcd;
  }
  
  public static zzar zzaX(Context paramContext)
  {
    synchronized (zzbhz)
    {
      zzz localzzz = zzbiM;
      if (localzzz == null)
      {
        localzzz = new com/google/android/gms/tagmanager/zzz;
        localzzz.<init>(paramContext);
        zzbiM = localzzz;
      }
      localzzz = zzbiM;
      return localzzz;
    }
  }
  
  public boolean zzgc(String paramString)
  {
    boolean bool1 = false;
    zzas localzzas = null;
    Object localObject = this.zzbic;
    boolean bool2 = ((zzcd)localObject).zzlw();
    if (!bool2)
    {
      localObject = "Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.";
      zzbg.zzaK((String)localObject);
    }
    for (;;)
    {
      return bool1;
      localObject = this.zzbiN;
      if (localObject != null)
      {
        localObject = this.zzbiO;
        if (localObject == null) {}
      }
      try
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = this.zzbiN;
        localObject = ((StringBuilder)localObject).append(str);
        str = "?";
        localObject = ((StringBuilder)localObject).append(str);
        str = this.zzbiO;
        localObject = ((StringBuilder)localObject).append(str);
        str = "=";
        localObject = ((StringBuilder)localObject).append(str);
        str = "UTF-8";
        str = URLEncoder.encode(paramString, str);
        localObject = ((StringBuilder)localObject).append(str);
        paramString = ((StringBuilder)localObject).toString();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        str = "Sending wrapped url hit: ";
        localObject = ((StringBuilder)localObject).append(str);
        localObject = ((StringBuilder)localObject).append(paramString);
        localObject = ((StringBuilder)localObject).toString();
        zzbg.v((String)localObject);
        localzzas = this.zzbiP;
        localzzas.zzgg(paramString);
        bool1 = true;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        String str = "Error wrapping URL for testing.";
        zzbg.zzd(str, localUnsupportedEncodingException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */