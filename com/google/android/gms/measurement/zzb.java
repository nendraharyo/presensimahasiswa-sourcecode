package com.google.android.gms.measurement;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.LogPrinter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class zzb
  implements zzi
{
  private static final Uri zzaUf;
  private final LogPrinter zzaUg;
  
  static
  {
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    localBuilder.scheme("uri");
    localBuilder.authority("local");
    zzaUf = localBuilder.build();
  }
  
  public zzb()
  {
    LogPrinter localLogPrinter = new android/util/LogPrinter;
    localLogPrinter.<init>(4, "GA/LogCatTransport");
    this.zzaUg = localLogPrinter;
  }
  
  public void zzb(zzc paramzzc)
  {
    Object localObject1 = new java/util/ArrayList;
    Object localObject2 = paramzzc.zzAv();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    localObject2 = new com/google/android/gms/measurement/zzb$1;
    ((zzb.1)localObject2).<init>(this);
    Collections.sort((List)localObject1, (Comparator)localObject2);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Iterator localIterator = ((List)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = ((zze)localIterator.next()).toString();
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        int i = ((StringBuilder)localObject2).length();
        if (i != 0)
        {
          String str = ", ";
          ((StringBuilder)localObject2).append(str);
        }
        ((StringBuilder)localObject2).append((String)localObject1);
      }
    }
    localObject1 = this.zzaUg;
    localObject2 = ((StringBuilder)localObject2).toString();
    ((LogPrinter)localObject1).println((String)localObject2);
  }
  
  public Uri zziA()
  {
    return zzaUf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */