package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class zzl
  extends zzf.zza
{
  private final Context mContext;
  
  public zzl(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void zzni()
  {
    Object localObject1 = this.mContext;
    int i = Binder.getCallingUid();
    boolean bool = GooglePlayServicesUtil.zzf((Context)localObject1, i);
    if (!bool)
    {
      localObject1 = new java/lang/SecurityException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Calling UID ");
      int j = Binder.getCallingUid();
      localObject2 = j + " is not Google Play services.";
      ((SecurityException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  /* Error */
  private void zznj()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 12	com/google/android/gms/auth/api/signin/internal/zzl:mContext	Landroid/content/Context;
    //   4: invokestatic 53	com/google/android/gms/auth/api/signin/internal/zzq:zzaf	(Landroid/content/Context;)Lcom/google/android/gms/auth/api/signin/internal/zzq;
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual 57	com/google/android/gms/auth/api/signin/internal/zzq:zzno	()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;
    //   12: astore_2
    //   13: getstatic 63	com/google/android/gms/auth/api/signin/GoogleSignInOptions:DEFAULT_SIGN_IN	Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   16: astore_3
    //   17: aload_2
    //   18: ifnull +8 -> 26
    //   21: aload_1
    //   22: invokevirtual 67	com/google/android/gms/auth/api/signin/internal/zzq:zznp	()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    //   25: astore_3
    //   26: new 69	com/google/android/gms/common/api/GoogleApiClient$Builder
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 12	com/google/android/gms/auth/api/signin/internal/zzl:mContext	Landroid/content/Context;
    //   34: astore 4
    //   36: aload_1
    //   37: aload 4
    //   39: invokespecial 72	com/google/android/gms/common/api/GoogleApiClient$Builder:<init>	(Landroid/content/Context;)V
    //   42: getstatic 78	com/google/android/gms/auth/api/Auth:GOOGLE_SIGN_IN_API	Lcom/google/android/gms/common/api/Api;
    //   45: astore 4
    //   47: aload_1
    //   48: aload 4
    //   50: aload_3
    //   51: invokevirtual 82	com/google/android/gms/common/api/GoogleApiClient$Builder:addApi	(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;
    //   54: astore_3
    //   55: aload_3
    //   56: invokevirtual 86	com/google/android/gms/common/api/GoogleApiClient$Builder:build	()Lcom/google/android/gms/common/api/GoogleApiClient;
    //   59: astore_1
    //   60: aload_1
    //   61: invokevirtual 92	com/google/android/gms/common/api/GoogleApiClient:blockingConnect	()Lcom/google/android/gms/common/ConnectionResult;
    //   64: astore_3
    //   65: aload_3
    //   66: invokevirtual 98	com/google/android/gms/common/ConnectionResult:isSuccess	()Z
    //   69: istore 5
    //   71: iload 5
    //   73: ifeq +19 -> 92
    //   76: aload_2
    //   77: ifnull +20 -> 97
    //   80: getstatic 102	com/google/android/gms/auth/api/Auth:GoogleSignInApi	Lcom/google/android/gms/auth/api/signin/GoogleSignInApi;
    //   83: astore_3
    //   84: aload_3
    //   85: aload_1
    //   86: invokeinterface 108 2 0
    //   91: pop
    //   92: aload_1
    //   93: invokevirtual 111	com/google/android/gms/common/api/GoogleApiClient:disconnect	()V
    //   96: return
    //   97: aload_1
    //   98: invokevirtual 115	com/google/android/gms/common/api/GoogleApiClient:clearDefaultAccountAndReconnect	()Lcom/google/android/gms/common/api/PendingResult;
    //   101: pop
    //   102: goto -10 -> 92
    //   105: astore_3
    //   106: aload_1
    //   107: invokevirtual 111	com/google/android/gms/common/api/GoogleApiClient:disconnect	()V
    //   110: aload_3
    //   111: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	this	zzl
    //   7	100	1	localObject1	Object
    //   12	65	2	localGoogleSignInAccount	com.google.android.gms.auth.api.signin.GoogleSignInAccount
    //   16	69	3	localObject2	Object
    //   105	6	3	localObject3	Object
    //   34	15	4	localObject4	Object
    //   69	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   60	64	105	finally
    //   65	69	105	finally
    //   80	83	105	finally
    //   85	92	105	finally
    //   97	102	105	finally
  }
  
  public void zznf()
  {
    zzni();
    zznj();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\auth\api\signin\internal\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */