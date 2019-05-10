package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.i;
import android.support.v4.h.a;
import android.view.View;
import com.google.android.gms.common.api.internal.zzj;
import com.google.android.gms.common.api.internal.zzw;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzf.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrl;
import com.google.android.gms.internal.zzro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class GoogleApiClient$Builder
{
  private final Context mContext;
  private Account zzTI;
  private String zzUW;
  private final Set zzagh;
  private final Set zzagi;
  private int zzagj;
  private View zzagk;
  private String zzagl;
  private final Map zzagm;
  private final Map zzagn;
  private i zzago;
  private int zzagp;
  private GoogleApiClient.OnConnectionFailedListener zzagq;
  private Looper zzagr;
  private com.google.android.gms.common.zzc zzags;
  private Api.zza zzagt;
  private final ArrayList zzagu;
  private final ArrayList zzagv;
  
  public GoogleApiClient$Builder(Context paramContext)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzagh = ((Set)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzagi = ((Set)localObject);
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.zzagm = ((Map)localObject);
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.zzagn = ((Map)localObject);
    this.zzagp = -1;
    localObject = com.google.android.gms.common.zzc.zzoK();
    this.zzags = ((com.google.android.gms.common.zzc)localObject);
    localObject = zzrl.zzUJ;
    this.zzagt = ((Api.zza)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzagu = ((ArrayList)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzagv = ((ArrayList)localObject);
    this.mContext = paramContext;
    localObject = paramContext.getMainLooper();
    this.zzagr = ((Looper)localObject);
    localObject = paramContext.getPackageName();
    this.zzUW = ((String)localObject);
    localObject = paramContext.getClass().getName();
    this.zzagl = ((String)localObject);
  }
  
  public GoogleApiClient$Builder(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this(paramContext);
    zzx.zzb(paramConnectionCallbacks, "Must provide a connected listener");
    this.zzagu.add(paramConnectionCallbacks);
    zzx.zzb(paramOnConnectionFailedListener, "Must provide a connection failed listener");
    this.zzagv.add(paramOnConnectionFailedListener);
  }
  
  private static Api.zzb zza(Api.zza paramzza, Object paramObject, Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramzza.zza(paramContext, paramLooper, paramzzf, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }
  
  private static zzad zza(Api.zze paramzze, Object paramObject, Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzad localzzad = new com/google/android/gms/common/internal/zzad;
    int i = paramzze.zzoU();
    Api.zzd localzzd = paramzze.zzq(paramObject);
    localzzad.<init>(paramContext, paramLooper, i, paramConnectionCallbacks, paramOnConnectionFailedListener, paramzzf, localzzd);
    return localzzad;
  }
  
  private void zza(Api paramApi, Api.ApiOptions paramApiOptions, int paramInt, Scope... paramVarArgs)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    if (paramInt == i) {}
    HashSet localHashSet;
    for (;;)
    {
      localHashSet = new java/util/HashSet;
      localObject2 = paramApi.zzoP().zzo(paramApiOptions);
      localHashSet.<init>((Collection)localObject2);
      int k = paramVarArgs.length;
      while (j < k)
      {
        Scope localScope = paramVarArgs[j];
        localHashSet.add(localScope);
        j += 1;
      }
      i = 2;
      if (paramInt != i) {
        break;
      }
      i = 0;
      localIllegalArgumentException = null;
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = "Invalid resolution mode: '" + paramInt + "', use a constant from GoogleApiClient.ResolutionMode";
    localIllegalArgumentException.<init>((String)localObject1);
    throw localIllegalArgumentException;
    localObject1 = this.zzagm;
    Object localObject2 = new com/google/android/gms/common/internal/zzf$zza;
    ((zzf.zza)localObject2).<init>(localHashSet, i);
    ((Map)localObject1).put(paramApi, localObject2);
  }
  
  private void zza(zzw paramzzw, GoogleApiClient paramGoogleApiClient)
  {
    int i = this.zzagp;
    GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = this.zzagq;
    paramzzw.zza(i, paramGoogleApiClient, localOnConnectionFailedListener);
  }
  
  private void zze(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject1 = zzw.zza(this.zzago);
    if (localObject1 == null)
    {
      localObject1 = new android/os/Handler;
      Object localObject2 = this.mContext.getMainLooper();
      ((Handler)localObject1).<init>((Looper)localObject2);
      localObject2 = new com/google/android/gms/common/api/GoogleApiClient$Builder$1;
      ((GoogleApiClient.Builder.1)localObject2).<init>(this, paramGoogleApiClient);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
    for (;;)
    {
      return;
      zza((zzw)localObject1, paramGoogleApiClient);
    }
  }
  
  private GoogleApiClient zzoZ()
  {
    zzf localzzf = zzoY();
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    Map localMap = localzzf.zzqu();
    a locala1 = new android/support/v4/h/a;
    locala1.<init>();
    a locala2 = new android/support/v4/h/a;
    locala2.<init>();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject3 = this.zzagn.keySet();
    Iterator localIterator = ((Set)localObject3).iterator();
    int k = 0;
    Object localObject4 = null;
    i = localIterator.hasNext();
    Object localObject5;
    Object localObject6;
    label166:
    Object localObject7;
    int m;
    int n;
    if (i != 0)
    {
      localObject2 = localIterator.next();
      localObject5 = localObject2;
      localObject5 = (Api)localObject2;
      localObject3 = this.zzagn.get(localObject5);
      i = 0;
      localObject2 = null;
      localObject6 = localMap.get(localObject5);
      if (localObject6 != null)
      {
        localObject2 = (zzf.zza)localMap.get(localObject5);
        i = ((zzf.zza)localObject2).zzalf;
        if (i != 0) {
          i = 1;
        }
      }
      else
      {
        localObject6 = Integer.valueOf(i);
        locala1.put(localObject5, localObject6);
        localObject7 = new com/google/android/gms/common/api/internal/zzc;
        ((com.google.android.gms.common.api.internal.zzc)localObject7).<init>((Api)localObject5, i);
        localArrayList.add(localObject7);
        boolean bool1 = ((Api)localObject5).zzoS();
        if (!bool1) {
          break label390;
        }
        localObject2 = ((Api)localObject5).zzoQ();
        m = ((Api.zze)localObject2).getPriority();
        n = 1;
        if (m != n) {
          break label765;
        }
      }
    }
    label283:
    label390:
    label462:
    label750:
    label758:
    label765:
    for (Object localObject8 = localObject5;; localObject8 = localObject4)
    {
      localObject4 = this.mContext;
      localObject6 = this.zzagr;
      Object localObject9 = localObject7;
      localObject3 = zza((Api.zze)localObject2, localObject3, (Context)localObject4, (Looper)localObject6, localzzf, (GoogleApiClient.ConnectionCallbacks)localObject7, (GoogleApiClient.OnConnectionFailedListener)localObject7);
      localObject2 = localObject8;
      localObject4 = ((Api)localObject5).zzoR();
      locala2.put(localObject4, localObject3);
      boolean bool3 = ((Api.zzb)localObject3).zznb();
      int j;
      if (bool3)
      {
        if (localObject1 == null) {
          break label462;
        }
        localObject2 = new java/lang/IllegalStateException;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = ((Api)localObject5).getName();
        localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append(" cannot be used with ");
        localObject4 = ((Api)localObject1).getName();
        localObject3 = (String)localObject4;
        ((IllegalStateException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
        j = 2;
        break label166;
        localObject2 = ((Api)localObject5).zzoP();
        m = ((Api.zza)localObject2).getPriority();
        n = 1;
        if (m != n) {
          break label758;
        }
      }
      for (localObject8 = localObject5;; localObject8 = localObject4)
      {
        localObject4 = this.mContext;
        localObject6 = this.zzagr;
        localObject9 = localObject7;
        localObject3 = zza((Api.zza)localObject2, localObject3, (Context)localObject4, (Looper)localObject6, localzzf, (GoogleApiClient.ConnectionCallbacks)localObject7, (GoogleApiClient.OnConnectionFailedListener)localObject7);
        localObject2 = localObject8;
        break label283;
        localObject5 = localObject1;
        localObject4 = localObject2;
        localObject1 = localObject5;
        break;
        if (localObject1 != null)
        {
          if (localObject4 != null)
          {
            localObject2 = new java/lang/IllegalStateException;
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject6 = ((Api)localObject1).getName();
            localObject3 = ((StringBuilder)localObject3).append((String)localObject6).append(" cannot be used with ");
            localObject4 = ((Api)localObject4).getName();
            localObject3 = (String)localObject4;
            ((IllegalStateException)localObject2).<init>((String)localObject3);
            throw ((Throwable)localObject2);
          }
          localObject2 = this.zzTI;
          if (localObject2 != null) {
            break label750;
          }
          j = 1;
        }
        for (;;)
        {
          localObject4 = new Object[1];
          localObject7 = ((Api)localObject1).getName();
          localObject4[0] = localObject7;
          zzx.zza(j, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", (Object[])localObject4);
          localObject2 = this.zzagh;
          localObject3 = this.zzagi;
          boolean bool2 = ((Set)localObject2).equals(localObject3);
          localObject3 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.";
          k = 1;
          localObject4 = new Object[k];
          m = 0;
          localObject6 = null;
          localObject7 = ((Api)localObject1).getName();
          localObject4[0] = localObject7;
          zzx.zza(bool2, (String)localObject3, (Object[])localObject4);
          int i1 = zzj.zza(locala2.values(), true);
          localObject2 = new com/google/android/gms/common/api/internal/zzj;
          localObject3 = this.mContext;
          localObject4 = new java/util/concurrent/locks/ReentrantLock;
          ((ReentrantLock)localObject4).<init>();
          localObject6 = this.zzagr;
          localObject7 = this.zzags;
          localObject9 = this.zzagt;
          localObject5 = this.zzagu;
          localObject1 = this.zzagv;
          int i2 = this.zzagp;
          ((zzj)localObject2).<init>((Context)localObject3, (Lock)localObject4, (Looper)localObject6, localzzf, (com.google.android.gms.common.zzc)localObject7, (Api.zza)localObject9, locala1, (List)localObject5, (List)localObject1, locala2, i2, i1, localArrayList);
          return (GoogleApiClient)localObject2;
          bool2 = false;
          localObject2 = null;
        }
      }
    }
  }
  
  public Builder addApi(Api paramApi)
  {
    zzx.zzb(paramApi, "Api must not be null");
    this.zzagn.put(paramApi, null);
    List localList = paramApi.zzoP().zzo(null);
    this.zzagi.addAll(localList);
    this.zzagh.addAll(localList);
    return this;
  }
  
  public Builder addApi(Api paramApi, Api.ApiOptions.HasOptions paramHasOptions)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzx.zzb(paramHasOptions, "Null options are not permitted for this Api");
    this.zzagn.put(paramApi, paramHasOptions);
    List localList = paramApi.zzoP().zzo(paramHasOptions);
    this.zzagi.addAll(localList);
    this.zzagh.addAll(localList);
    return this;
  }
  
  public Builder addApiIfAvailable(Api paramApi, Api.ApiOptions.HasOptions paramHasOptions, Scope... paramVarArgs)
  {
    zzx.zzb(paramApi, "Api must not be null");
    zzx.zzb(paramHasOptions, "Null options are not permitted for this Api");
    this.zzagn.put(paramApi, paramHasOptions);
    zza(paramApi, paramHasOptions, 1, paramVarArgs);
    return this;
  }
  
  public Builder addApiIfAvailable(Api paramApi, Scope... paramVarArgs)
  {
    zzx.zzb(paramApi, "Api must not be null");
    this.zzagn.put(paramApi, null);
    zza(paramApi, null, 1, paramVarArgs);
    return this;
  }
  
  public Builder addConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    zzx.zzb(paramConnectionCallbacks, "Listener must not be null");
    this.zzagu.add(paramConnectionCallbacks);
    return this;
  }
  
  public Builder addOnConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    zzx.zzb(paramOnConnectionFailedListener, "Listener must not be null");
    this.zzagv.add(paramOnConnectionFailedListener);
    return this;
  }
  
  public Builder addScope(Scope paramScope)
  {
    zzx.zzb(paramScope, "Scope must not be null");
    this.zzagh.add(paramScope);
    return this;
  }
  
  public GoogleApiClient build()
  {
    Object localObject1 = this.zzagn;
    boolean bool = ((Map)localObject1).isEmpty();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "must call addApi() to add at least one API");
      localObject1 = zzoZ();
      synchronized (GoogleApiClient.zzoX())
      {
        Set localSet2 = GoogleApiClient.zzoX();
        localSet2.add(localObject1);
        int i = this.zzagp;
        if (i >= 0) {
          zze((GoogleApiClient)localObject1);
        }
        return (GoogleApiClient)localObject1;
        bool = false;
        localObject1 = null;
      }
    }
  }
  
  public Builder enableAutoManage(i parami, int paramInt, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "clientId must be non-negative");
      this.zzagp = paramInt;
      i locali = (i)zzx.zzb(parami, "Null activity is not permitted.");
      this.zzago = locali;
      this.zzagq = paramOnConnectionFailedListener;
      return this;
      bool = false;
      locali = null;
    }
  }
  
  public Builder enableAutoManage(i parami, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return enableAutoManage(parami, 0, paramOnConnectionFailedListener);
  }
  
  public Builder setAccountName(String paramString)
  {
    Account localAccount;
    if (paramString == null) {
      localAccount = null;
    }
    for (;;)
    {
      this.zzTI = localAccount;
      return this;
      localAccount = new android/accounts/Account;
      String str = "com.google";
      localAccount.<init>(paramString, str);
    }
  }
  
  public Builder setGravityForPopups(int paramInt)
  {
    this.zzagj = paramInt;
    return this;
  }
  
  public Builder setHandler(Handler paramHandler)
  {
    zzx.zzb(paramHandler, "Handler must not be null");
    Looper localLooper = paramHandler.getLooper();
    this.zzagr = localLooper;
    return this;
  }
  
  public Builder setViewForPopups(View paramView)
  {
    zzx.zzb(paramView, "View must not be null");
    this.zzagk = paramView;
    return this;
  }
  
  public Builder useDefaultAccount()
  {
    return setAccountName("<<default account>>");
  }
  
  public zzf zzoY()
  {
    Object localObject1 = zzro.zzbgV;
    Object localObject2 = this.zzagn;
    Object localObject3 = zzrl.API;
    boolean bool = ((Map)localObject2).containsKey(localObject3);
    if (bool)
    {
      localObject2 = this.zzagn;
      localObject3 = zzrl.API;
      localObject2 = (zzro)((Map)localObject2).get(localObject3);
      localObject1 = localObject2;
    }
    localObject2 = new com/google/android/gms/common/internal/zzf;
    localObject3 = this.zzTI;
    Set localSet = this.zzagh;
    Map localMap = this.zzagm;
    int i = this.zzagj;
    View localView = this.zzagk;
    String str1 = this.zzUW;
    String str2 = this.zzagl;
    ((zzf)localObject2).<init>((Account)localObject3, localSet, localMap, i, localView, str1, str2, (zzro)localObject1);
    return (zzf)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\GoogleApiClient$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */