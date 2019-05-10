package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzv
{
  private final String separator;
  
  private zzv(String paramString)
  {
    this.separator = paramString;
  }
  
  public static zzv zzcL(String paramString)
  {
    zzv localzzv = new com/google/android/gms/common/internal/zzv;
    localzzv.<init>(paramString);
    return localzzv;
  }
  
  public final String zza(Iterable paramIterable)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    return zza(localStringBuilder, paramIterable).toString();
  }
  
  public final StringBuilder zza(StringBuilder paramStringBuilder, Iterable paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    boolean bool = localIterator.hasNext();
    if (bool)
    {
      Object localObject = localIterator.next();
      localObject = zzx(localObject);
      paramStringBuilder.append((CharSequence)localObject);
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = this.separator;
        paramStringBuilder.append((String)localObject);
        localObject = localIterator.next();
        localObject = zzx(localObject);
        paramStringBuilder.append((CharSequence)localObject);
      }
    }
    return paramStringBuilder;
  }
  
  CharSequence zzx(Object paramObject)
  {
    boolean bool = paramObject instanceof CharSequence;
    if (bool) {}
    for (paramObject = (CharSequence)paramObject;; paramObject = paramObject.toString()) {
      return (CharSequence)paramObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */