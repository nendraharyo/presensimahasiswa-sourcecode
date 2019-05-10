package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public class zzx
  extends TransformedResult
  implements ResultCallback
{
  private final Object zzagI;
  private final WeakReference zzagK;
  private ResultTransform zzaiN = null;
  private zzx zzaiO = null;
  private ResultCallbacks zzaiP = null;
  private PendingResult zzaiQ = null;
  private Status zzaiR;
  private final zzx.zza zzaiS;
  
  public zzx(WeakReference paramWeakReference)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzagI = localObject;
    this.zzaiR = null;
    com.google.android.gms.common.internal.zzx.zzb(paramWeakReference, "GoogleApiClient reference must not be null");
    this.zzagK = paramWeakReference;
    localObject = (GoogleApiClient)this.zzagK.get();
    zzx.zza localzza = new com/google/android/gms/common/api/internal/zzx$zza;
    if (localObject != null) {}
    for (localObject = ((GoogleApiClient)localObject).getLooper();; localObject = Looper.getMainLooper())
    {
      localzza.<init>(this, (Looper)localObject);
      this.zzaiS = localzza;
      return;
    }
  }
  
  private void zzc(Result paramResult)
  {
    boolean bool = paramResult instanceof Releasable;
    Object localObject1;
    if (bool) {
      localObject1 = paramResult;
    }
    try
    {
      localObject1 = (Releasable)paramResult;
      Object localObject2 = localObject1;
      ((Releasable)localObject1).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str1 = "TransformedResultImpl";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "Unable to release ";
        localObject3 = str2 + paramResult;
        Log.w(str1, (String)localObject3, localRuntimeException);
      }
    }
  }
  
  private void zzpT()
  {
    Object localObject = this.zzaiN;
    if (localObject == null)
    {
      localObject = this.zzaiP;
      if (localObject != null) {}
    }
    for (;;)
    {
      return;
      localObject = (GoogleApiClient)this.zzagK.get();
      ResultTransform localResultTransform = this.zzaiN;
      if ((localResultTransform != null) && (localObject != null)) {
        ((GoogleApiClient)localObject).zza(this);
      }
      localObject = this.zzaiR;
      if (localObject != null)
      {
        localObject = this.zzaiR;
        zzz((Status)localObject);
      }
      else
      {
        localObject = this.zzaiQ;
        if (localObject != null)
        {
          localObject = this.zzaiQ;
          ((PendingResult)localObject).setResultCallback(this);
        }
      }
    }
  }
  
  private boolean zzpV()
  {
    GoogleApiClient localGoogleApiClient = (GoogleApiClient)this.zzagK.get();
    ResultCallbacks localResultCallbacks = this.zzaiP;
    boolean bool;
    if ((localResultCallbacks != null) && (localGoogleApiClient != null)) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localGoogleApiClient = null;
    }
  }
  
  private void zzy(Status paramStatus)
  {
    synchronized (this.zzagI)
    {
      this.zzaiR = paramStatus;
      Status localStatus = this.zzaiR;
      zzz(localStatus);
      return;
    }
  }
  
  private void zzz(Status paramStatus)
  {
    synchronized (this.zzagI)
    {
      Object localObject2 = this.zzaiN;
      if (localObject2 != null)
      {
        localObject2 = this.zzaiN;
        localObject2 = ((ResultTransform)localObject2).onFailure(paramStatus);
        Object localObject4 = "onFailure must not return null";
        com.google.android.gms.common.internal.zzx.zzb(localObject2, localObject4);
        localObject4 = this.zzaiO;
        ((zzx)localObject4).zzy((Status)localObject2);
      }
      boolean bool;
      do
      {
        return;
        bool = zzpV();
      } while (!bool);
      localObject2 = this.zzaiP;
      ((ResultCallbacks)localObject2).onFailure(paramStatus);
    }
  }
  
  public void andFinally(ResultCallbacks paramResultCallbacks)
  {
    boolean bool1 = true;
    String str1 = null;
    synchronized (this.zzagI)
    {
      Object localObject2 = this.zzaiP;
      boolean bool2;
      if (localObject2 == null) {
        bool2 = bool1;
      }
      for (;;)
      {
        String str2 = "Cannot call andFinally() twice.";
        com.google.android.gms.common.internal.zzx.zza(bool2, str2);
        localObject2 = this.zzaiN;
        if (localObject2 != null) {
          break;
        }
        str1 = "Cannot call then() and andFinally() on the same TransformedResult.";
        com.google.android.gms.common.internal.zzx.zza(bool1, str1);
        this.zzaiP = paramResultCallbacks;
        zzpT();
        return;
        bool2 = false;
        localObject2 = null;
      }
      bool1 = false;
      Object localObject3 = null;
    }
  }
  
  public void onResult(Result paramResult)
  {
    for (;;)
    {
      synchronized (this.zzagI)
      {
        Object localObject2 = paramResult.getStatus();
        boolean bool = ((Status)localObject2).isSuccess();
        if (bool)
        {
          localObject2 = this.zzaiN;
          if (localObject2 != null)
          {
            localObject2 = zzs.zzpN();
            zzx.1 local1 = new com/google/android/gms/common/api/internal/zzx$1;
            local1.<init>(this, paramResult);
            ((ExecutorService)localObject2).submit(local1);
            return;
          }
          bool = zzpV();
          if (!bool) {
            continue;
          }
          localObject2 = this.zzaiP;
          ((ResultCallbacks)localObject2).onSuccess(paramResult);
        }
      }
      Status localStatus = paramResult.getStatus();
      zzy(localStatus);
      zzc(paramResult);
    }
  }
  
  public TransformedResult then(ResultTransform paramResultTransform)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    synchronized (this.zzagI)
    {
      Object localObject3 = this.zzaiN;
      boolean bool2;
      if (localObject3 == null) {
        bool2 = bool1;
      }
      for (;;)
      {
        String str = "Cannot call then() twice.";
        com.google.android.gms.common.internal.zzx.zza(bool2, str);
        localObject3 = this.zzaiP;
        if (localObject3 != null) {
          break;
        }
        localObject1 = "Cannot call then() and andFinally() on the same TransformedResult.";
        com.google.android.gms.common.internal.zzx.zza(bool1, localObject1);
        this.zzaiN = paramResultTransform;
        localzzx = new com/google/android/gms/common/api/internal/zzx;
        localObject1 = this.zzagK;
        localzzx.<init>((WeakReference)localObject1);
        this.zzaiO = localzzx;
        zzpT();
        return localzzx;
        bool2 = false;
        localObject3 = null;
      }
      bool1 = false;
      zzx localzzx = null;
    }
  }
  
  public void zza(PendingResult paramPendingResult)
  {
    synchronized (this.zzagI)
    {
      this.zzaiQ = paramPendingResult;
      zzpT();
      return;
    }
  }
  
  void zzpU()
  {
    Object localObject1 = this.zzagI;
    Object localObject2 = null;
    try
    {
      this.zzaiP = null;
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */