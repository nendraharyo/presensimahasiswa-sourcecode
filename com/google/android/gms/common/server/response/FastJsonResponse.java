package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmo;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zznc;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class FastJsonResponse
{
  private void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, Object paramObject)
  {
    int i = paramField.zzrj();
    int j = 11;
    String str;
    if (i == j)
    {
      str = ((FastJsonResponse)paramField.zzrt().cast(paramObject)).toString();
      paramStringBuilder.append(str);
    }
    for (;;)
    {
      return;
      i = paramField.zzrj();
      j = 7;
      if (i == j)
      {
        paramStringBuilder.append("\"");
        paramObject = (String)paramObject;
        str = zznb.zzcU((String)paramObject);
        paramStringBuilder.append(str);
        str = "\"";
        paramStringBuilder.append(str);
      }
      else
      {
        paramStringBuilder.append(paramObject);
      }
    }
  }
  
  private void zza(StringBuilder paramStringBuilder, FastJsonResponse.Field paramField, ArrayList paramArrayList)
  {
    paramStringBuilder.append("[");
    int i = 0;
    int j = paramArrayList.size();
    while (i < j)
    {
      if (i > 0)
      {
        localObject = ",";
        paramStringBuilder.append((String)localObject);
      }
      Object localObject = paramArrayList.get(i);
      if (localObject != null) {
        zza(paramStringBuilder, paramField, localObject);
      }
      i += 1;
    }
    paramStringBuilder.append("]");
  }
  
  public String toString()
  {
    Map localMap = zzrl();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = 100;
    localStringBuilder.<init>(i);
    Object localObject1 = localMap.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = (FastJsonResponse.Field)localMap.get(localObject1);
      boolean bool3 = zza((FastJsonResponse.Field)localObject2);
      if (bool3)
      {
        Object localObject3 = zzb((FastJsonResponse.Field)localObject2);
        localObject3 = zza((FastJsonResponse.Field)localObject2, localObject3);
        int m = localStringBuilder.length();
        String str;
        if (m == 0)
        {
          str = "{";
          localStringBuilder.append(str);
        }
        for (;;)
        {
          localObject1 = localStringBuilder.append("\"").append((String)localObject1);
          str = "\":";
          ((StringBuilder)localObject1).append(str);
          if (localObject3 != null) {
            break label182;
          }
          localObject1 = "null";
          localStringBuilder.append((String)localObject1);
          break;
          str = ",";
          localStringBuilder.append(str);
        }
        label182:
        int j = ((FastJsonResponse.Field)localObject2).zzrk();
        switch (j)
        {
        default: 
          boolean bool2 = ((FastJsonResponse.Field)localObject2).zzrp();
          if (bool2)
          {
            localObject3 = (ArrayList)localObject3;
            zza(localStringBuilder, (FastJsonResponse.Field)localObject2, (ArrayList)localObject3);
          }
          break;
        case 8: 
          localObject2 = localStringBuilder.append("\"");
          localObject1 = localObject3;
          localObject1 = zzmo.zzj((byte[])localObject3);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = "\"";
          ((StringBuilder)localObject1).append((String)localObject2);
          break;
        case 9: 
          localObject1 = localStringBuilder.append("\"");
          localObject3 = (byte[])localObject3;
          localObject2 = zzmo.zzk((byte[])localObject3);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = "\"";
          ((StringBuilder)localObject1).append((String)localObject2);
          break;
        case 10: 
          localObject3 = (HashMap)localObject3;
          zznc.zza(localStringBuilder, (HashMap)localObject3);
          continue;
          zza(localStringBuilder, (FastJsonResponse.Field)localObject2, localObject3);
        }
      }
    }
    int k = localStringBuilder.length();
    if (k > 0)
    {
      localObject1 = "}";
      localStringBuilder.append((String)localObject1);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localObject1 = "{}";
      localStringBuilder.append((String)localObject1);
    }
  }
  
  protected Object zza(FastJsonResponse.Field paramField, Object paramObject)
  {
    FastJsonResponse.zza localzza = FastJsonResponse.Field.zzc(paramField);
    if (localzza != null) {
      paramObject = paramField.convertBack(paramObject);
    }
    return paramObject;
  }
  
  protected boolean zza(FastJsonResponse.Field paramField)
  {
    int i = paramField.zzrk();
    int j = 11;
    boolean bool;
    String str;
    if (i == j)
    {
      bool = paramField.zzrq();
      if (bool)
      {
        str = paramField.zzrr();
        bool = zzcQ(str);
      }
    }
    for (;;)
    {
      return bool;
      str = paramField.zzrr();
      bool = zzcP(str);
      continue;
      str = paramField.zzrr();
      bool = zzcO(str);
    }
  }
  
  protected Object zzb(FastJsonResponse.Field paramField)
  {
    int i = 1;
    Class[] arrayOfClass = null;
    String str1 = paramField.zzrr();
    Object localObject1 = paramField.zzrt();
    Object localObject3;
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = paramField.zzrr();
      localObject1 = zzcN((String)localObject1);
      if (localObject1 == null)
      {
        int j = i;
        String str2 = "Concrete field shouldn't be value object: %s";
        localObject3 = new Object[i];
        String str3 = paramField.zzrr();
        localObject3[0] = str3;
        zzx.zza(j, str2, (Object[])localObject3);
        bool = paramField.zzrq();
        if (!bool) {
          break label119;
        }
        localObject1 = zzrn();
        label91:
        if (localObject1 == null) {
          break label128;
        }
      }
    }
    label119:
    label128:
    Object localObject2;
    for (localObject1 = ((Map)localObject1).get(str1);; localObject2 = zzcN((String)localObject2))
    {
      for (;;)
      {
        return localObject1;
        bool = false;
        localObject1 = null;
        break;
        localObject1 = zzrm();
        break label91;
        try
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = "get";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          i = 0;
          localObject3 = null;
          i = str1.charAt(0);
          i = Character.toUpperCase(i);
          localObject1 = ((StringBuilder)localObject1).append(i);
          i = 1;
          localObject3 = str1.substring(i);
          localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
          localObject1 = ((StringBuilder)localObject1).toString();
          localObject3 = getClass();
          arrayOfClass = null;
          arrayOfClass = new Class[0];
          localObject1 = ((Class)localObject3).getMethod((String)localObject1, arrayOfClass);
          i = 0;
          localObject3 = null;
          localObject3 = new Object[0];
          localObject1 = ((Method)localObject1).invoke(this, (Object[])localObject3);
        }
        catch (Exception localException)
        {
          localObject3 = new java/lang/RuntimeException;
          ((RuntimeException)localObject3).<init>(localException);
          throw ((Throwable)localObject3);
        }
      }
      localObject2 = paramField.zzrr();
    }
  }
  
  protected abstract Object zzcN(String paramString);
  
  protected abstract boolean zzcO(String paramString);
  
  protected boolean zzcP(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Concrete types not supported");
    throw localUnsupportedOperationException;
  }
  
  protected boolean zzcQ(String paramString)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("Concrete type arrays not supported");
    throw localUnsupportedOperationException;
  }
  
  public abstract Map zzrl();
  
  public HashMap zzrm()
  {
    return null;
  }
  
  public HashMap zzrn()
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\FastJsonResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */