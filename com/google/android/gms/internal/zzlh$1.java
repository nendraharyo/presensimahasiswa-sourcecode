package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.IdpTokenType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class zzlh$1
  implements InvocationHandler
{
  zzlh$1(zzlh paramzzlh, Class paramClass) {}
  
  public Object invoke(Object paramObject, Method paramMethod, Object[] paramArrayOfObject)
  {
    String str = null;
    Object localObject1 = Class.forName("com.facebook.SessionState");
    Object localObject2 = paramMethod.getParameterTypes();
    Object localObject3 = paramMethod.getName();
    Object localObject4 = "call";
    boolean bool1 = ((String)localObject3).equals(localObject4);
    if (bool1)
    {
      int i = localObject2.length;
      int j = 3;
      if (i == j)
      {
        localObject3 = localObject2[0];
        localObject4 = this.zzYk;
        if (localObject3 == localObject4)
        {
          i = 1;
          localObject3 = localObject2[i];
          if (localObject3 == localObject1)
          {
            int k = 2;
            localObject1 = localObject2[k];
            localObject2 = Exception.class;
            if (localObject1 == localObject2) {
              break label127;
            }
          }
        }
      }
    }
    localObject1 = new java/lang/ExceptionInInitializerError;
    ((ExceptionInInitializerError)localObject1).<init>("Method not supported!");
    throw ((Throwable)localObject1);
    label127:
    localObject1 = this.zzYk;
    localObject3 = new Class[0];
    localObject1 = ((Class)localObject1).getDeclaredMethod("isOpened", (Class[])localObject3);
    localObject2 = paramArrayOfObject[0];
    localObject3 = new Object[0];
    localObject1 = (Boolean)((Method)localObject1).invoke(localObject2, (Object[])localObject3);
    boolean bool2 = ((Boolean)localObject1).booleanValue();
    if (bool2)
    {
      localObject1 = this.zzYk;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod("getAccessToken", (Class[])localObject3);
      localObject2 = paramArrayOfObject[0];
      localObject3 = new Object[0];
      localObject1 = (String)((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      localObject2 = zzlh.zzb(this.zzYl);
      localObject3 = this.zzYl;
      localObject4 = IdpTokenType.zzXA;
      str = zzlh.zza(this.zzYl);
      localObject1 = zzlh.zza((zzlh)localObject3, (IdpTokenType)localObject4, (String)localObject1, str);
      ((zzlf.zza)localObject2).zzk((Intent)localObject1);
    }
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlh$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */