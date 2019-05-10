package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.m;
import android.support.v4.app.p;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzw
  extends Fragment
  implements DialogInterface.OnCancelListener
{
  private boolean mStarted;
  private int zzaiA = -1;
  private ConnectionResult zzaiB;
  private final Handler zzaiC;
  protected zzn zzaiD;
  private final SparseArray zzaiE;
  private boolean zzaiz;
  
  public zzw()
  {
    Object localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.zzaiC = ((Handler)localObject);
    localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.zzaiE = ((SparseArray)localObject);
  }
  
  public static zzw zza(i parami)
  {
    zzx.zzcD("Must be called from main thread of process");
    Object localObject1 = parami.getSupportFragmentManager();
    Object localObject2 = "GmsSupportLifecycleFrag";
    try
    {
      localObject1 = ((m)localObject1).a((String)localObject2);
      localObject1 = (zzw)localObject1;
      if (localObject1 != null)
      {
        boolean bool = ((zzw)localObject1).isRemoving();
        if (!bool) {}
      }
      else
      {
        localObject1 = null;
      }
      return (zzw)localObject1;
    }
    catch (ClassCastException localClassCastException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Fragment with tag GmsSupportLifecycleFrag is not a SupportLifecycleFragment", localClassCastException);
      throw ((Throwable)localObject2);
    }
  }
  
  private void zza(int paramInt, ConnectionResult paramConnectionResult)
  {
    String str = "Unresolved error while connecting client. Stopping auto-manage.";
    Log.w("GmsSupportLifecycleFrag", str);
    Object localObject = (zzw.zza)this.zzaiE.get(paramInt);
    if (localObject != null)
    {
      zzbD(paramInt);
      localObject = ((zzw.zza)localObject).zzaiH;
      if (localObject != null) {
        ((GoogleApiClient.OnConnectionFailedListener)localObject).onConnectionFailed(paramConnectionResult);
      }
    }
    zzpP();
  }
  
  public static zzw zzb(i parami)
  {
    zzw localzzw = zza(parami);
    m localm = parami.getSupportFragmentManager();
    if (localzzw == null)
    {
      localzzw = zzpO();
      if (localzzw == null)
      {
        localObject = "Unable to find connection error message resources (Did you include play-services-base and the proper proguard rules?); error dialogs may be unavailable.";
        Log.w("GmsSupportLifecycleFrag", (String)localObject);
        localzzw = new com/google/android/gms/common/api/internal/zzw;
        localzzw.<init>();
      }
      Object localObject = localm.a();
      String str = "GmsSupportLifecycleFrag";
      localObject = ((p)localObject).a(localzzw, str);
      ((p)localObject).d();
      localm.b();
    }
    return localzzw;
  }
  
  private static String zzi(ConnectionResult paramConnectionResult)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = paramConnectionResult.getErrorMessage();
    localStringBuilder = localStringBuilder.append(str).append(" (");
    int i = paramConnectionResult.getErrorCode();
    localStringBuilder = localStringBuilder.append(i).append(": ");
    str = zze.getErrorString(paramConnectionResult.getErrorCode());
    return str + ')';
  }
  
  /* Error */
  private static zzw zzpO()
  {
    // Byte code:
    //   0: iconst_3
    //   1: istore_0
    //   2: ldc -73
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 189	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +78 -> 89
    //   14: aload_1
    //   15: invokevirtual 193	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   18: astore_1
    //   19: aload_1
    //   20: checkcast 2	com/google/android/gms/common/api/internal/zzw
    //   23: astore_1
    //   24: aload_1
    //   25: areturn
    //   26: astore_1
    //   27: ldc 61
    //   29: astore_2
    //   30: aload_2
    //   31: iload_0
    //   32: invokestatic 197	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   35: istore_3
    //   36: iload_3
    //   37: ifeq +18 -> 55
    //   40: ldc 61
    //   42: astore_2
    //   43: ldc -57
    //   45: astore 4
    //   47: aload_2
    //   48: aload 4
    //   50: aload_1
    //   51: invokestatic 202	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   54: pop
    //   55: aconst_null
    //   56: astore_1
    //   57: goto -47 -> 10
    //   60: astore_1
    //   61: ldc 61
    //   63: astore_2
    //   64: aload_2
    //   65: iload_0
    //   66: invokestatic 197	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   69: istore_3
    //   70: iload_3
    //   71: ifeq +18 -> 89
    //   74: ldc 61
    //   76: astore_2
    //   77: ldc -52
    //   79: astore 4
    //   81: aload_2
    //   82: aload 4
    //   84: aload_1
    //   85: invokestatic 202	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   88: pop
    //   89: aconst_null
    //   90: astore_1
    //   91: goto -67 -> 24
    //   94: astore_1
    //   95: goto -34 -> 61
    //   98: astore_1
    //   99: goto -38 -> 61
    //   102: astore_1
    //   103: goto -42 -> 61
    //   106: astore_1
    //   107: goto -80 -> 27
    //   110: astore_1
    //   111: goto -84 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	65	0	i	int
    //   4	21	1	localObject1	Object
    //   26	25	1	localClassNotFoundException	ClassNotFoundException
    //   56	1	1	localObject2	Object
    //   60	25	1	localInstantiationException	InstantiationException
    //   90	1	1	localObject3	Object
    //   94	1	1	localRuntimeException	RuntimeException
    //   98	1	1	localIllegalAccessException	IllegalAccessException
    //   102	1	1	localExceptionInInitializerError	ExceptionInInitializerError
    //   106	1	1	localLinkageError	LinkageError
    //   110	1	1	localSecurityException	SecurityException
    //   29	53	2	str1	String
    //   35	36	3	bool	boolean
    //   45	38	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   5	9	26	java/lang/ClassNotFoundException
    //   14	18	60	java/lang/InstantiationException
    //   19	23	60	java/lang/InstantiationException
    //   14	18	94	java/lang/RuntimeException
    //   19	23	94	java/lang/RuntimeException
    //   14	18	98	java/lang/IllegalAccessException
    //   19	23	98	java/lang/IllegalAccessException
    //   14	18	102	java/lang/ExceptionInInitializerError
    //   19	23	102	java/lang/ExceptionInInitializerError
    //   5	9	106	java/lang/LinkageError
    //   5	9	110	java/lang/SecurityException
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.zzaiE;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = (zzw.zza)this.zzaiE.valueAt(j);
      ((zzw.zza)localObject).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      i = j + 1;
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    ConnectionResult localConnectionResult1 = null;
    ConnectionResult localConnectionResult2;
    switch (paramInt1)
    {
    default: 
      i = 0;
      localConnectionResult2 = null;
      label34:
      if (i != 0) {
        zzpP();
      }
      break;
    }
    for (;;)
    {
      return;
      zzc localzzc = zzpQ();
      i locali = getActivity();
      int j = localzzc.isGooglePlayServicesAvailable(locali);
      if (j != 0) {
        break;
      }
      break label34;
      j = -1;
      if (paramInt2 == j) {
        break label34;
      }
      if (paramInt2 != 0) {
        break;
      }
      localConnectionResult2 = new com/google/android/gms/common/ConnectionResult;
      j = 13;
      locali = null;
      localConnectionResult2.<init>(j, null);
      this.zzaiB = localConnectionResult2;
      break;
      i = this.zzaiA;
      localConnectionResult1 = this.zzaiB;
      zza(i, localConnectionResult1);
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    int i = this.zzaiA;
    ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
    localConnectionResult.<init>(13, null);
    zza(i, localConnectionResult);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      ConnectionResult localConnectionResult = null;
      boolean bool = paramBundle.getBoolean("resolving_error", false);
      this.zzaiz = bool;
      Object localObject = "failed_client_id";
      int j = -1;
      int i = paramBundle.getInt((String)localObject, j);
      this.zzaiA = i;
      i = this.zzaiA;
      if (i >= 0)
      {
        localConnectionResult = new com/google/android/gms/common/ConnectionResult;
        int k = paramBundle.getInt("failed_status");
        localObject = (PendingIntent)paramBundle.getParcelable("failed_resolution");
        localConnectionResult.<init>(k, (PendingIntent)localObject);
        this.zzaiB = localConnectionResult;
      }
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    String str = "resolving_error";
    boolean bool = this.zzaiz;
    paramBundle.putBoolean(str, bool);
    int j = this.zzaiA;
    if (j >= 0)
    {
      int i = this.zzaiA;
      paramBundle.putInt("failed_client_id", i);
      i = this.zzaiB.getErrorCode();
      paramBundle.putInt("failed_status", i);
      str = "failed_resolution";
      PendingIntent localPendingIntent = this.zzaiB.getResolution();
      paramBundle.putParcelable(str, localPendingIntent);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.mStarted = true;
    boolean bool = this.zzaiz;
    if (!bool)
    {
      bool = false;
      Object localObject = null;
      int i;
      for (int j = 0;; j = i)
      {
        localObject = this.zzaiE;
        i = ((SparseArray)localObject).size();
        if (j >= i) {
          break;
        }
        localObject = ((zzw.zza)this.zzaiE.valueAt(j)).zzaiG;
        ((GoogleApiClient)localObject).connect();
        i = j + 1;
      }
    }
  }
  
  public void onStop()
  {
    int i = 0;
    Object localObject = null;
    super.onStop();
    this.mStarted = false;
    for (int j = 0;; j = i)
    {
      localObject = this.zzaiE;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = ((zzw.zza)this.zzaiE.valueAt(j)).zzaiG;
      ((GoogleApiClient)localObject).disconnect();
      i = j + 1;
    }
  }
  
  public void zza(int paramInt, GoogleApiClient paramGoogleApiClient, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramGoogleApiClient, "GoogleApiClient instance cannot be null");
    Object localObject1 = this.zzaiE;
    int i = ((SparseArray)localObject1).indexOfKey(paramInt);
    if (i < 0) {
      i = 1;
    }
    for (;;)
    {
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Already managing a GoogleApiClient with id ";
      localObject2 = str + paramInt;
      zzx.zza(i, localObject2);
      localObject1 = new com/google/android/gms/common/api/internal/zzw$zza;
      ((zzw.zza)localObject1).<init>(this, paramInt, paramGoogleApiClient, paramOnConnectionFailedListener);
      localObject2 = this.zzaiE;
      ((SparseArray)localObject2).put(paramInt, localObject1);
      boolean bool = this.mStarted;
      if (bool)
      {
        bool = this.zzaiz;
        if (!bool) {
          paramGoogleApiClient.connect();
        }
      }
      return;
      bool = false;
      localObject1 = null;
    }
  }
  
  protected void zzb(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Failed to connect due to user resolvable error ");
    String str = zzi(paramConnectionResult);
    localObject = str;
    Log.w("GmsSupportLifecycleFrag", (String)localObject);
    zza(paramInt, paramConnectionResult);
  }
  
  public void zzbD(int paramInt)
  {
    zzw.zza localzza = (zzw.zza)this.zzaiE.get(paramInt);
    SparseArray localSparseArray = this.zzaiE;
    localSparseArray.remove(paramInt);
    if (localzza != null) {
      localzza.zzpR();
    }
  }
  
  protected void zzc(int paramInt, ConnectionResult paramConnectionResult)
  {
    Log.w("GmsSupportLifecycleFrag", "Unable to connect, GooglePlayServices is updating.");
    zza(paramInt, paramConnectionResult);
  }
  
  protected void zzpP()
  {
    int i = 0;
    Object localObject = null;
    this.zzaiz = false;
    int j = -1;
    this.zzaiA = j;
    this.zzaiB = null;
    zzn localzzn = this.zzaiD;
    if (localzzn != null)
    {
      localzzn = this.zzaiD;
      localzzn.unregister();
      this.zzaiD = null;
    }
    j = 0;
    localzzn = null;
    for (;;)
    {
      localObject = this.zzaiE;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = ((zzw.zza)this.zzaiE.valueAt(j)).zzaiG;
      ((GoogleApiClient)localObject).connect();
      i = j + 1;
      j = i;
    }
  }
  
  protected zzc zzpQ()
  {
    return zzc.zzoK();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */