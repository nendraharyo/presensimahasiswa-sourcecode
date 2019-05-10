package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzf.zza;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzrn;
import com.google.android.gms.internal.zzro;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public class zzh
  implements zzk
{
  private final Context mContext;
  private final Lock zzXG;
  private final zzc zzags;
  private final Api.zza zzagt;
  private final Map zzahA;
  private ArrayList zzahB;
  private final zzl zzahj;
  private ConnectionResult zzahm;
  private int zzahn;
  private int zzaho = 0;
  private int zzahp;
  private final Bundle zzahq;
  private final Set zzahr;
  private zzrn zzahs;
  private int zzaht;
  private boolean zzahu;
  private boolean zzahv;
  private zzp zzahw;
  private boolean zzahx;
  private boolean zzahy;
  private final zzf zzahz;
  
  public zzh(zzl paramzzl, zzf paramzzf, Map paramMap, zzc paramzzc, Api.zza paramzza, Lock paramLock, Context paramContext)
  {
    Object localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.zzahq = ((Bundle)localObject);
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzahr = ((Set)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.zzahB = ((ArrayList)localObject);
    this.zzahj = paramzzl;
    this.zzahz = paramzzf;
    this.zzahA = paramMap;
    this.zzags = paramzzc;
    this.zzagt = paramzza;
    this.zzXG = paramLock;
    this.mContext = paramContext;
  }
  
  private void zzZ(boolean paramBoolean)
  {
    zzrn localzzrn = this.zzahs;
    if (localzzrn != null)
    {
      localzzrn = this.zzahs;
      boolean bool = localzzrn.isConnected();
      if ((bool) && (paramBoolean))
      {
        localzzrn = this.zzahs;
        localzzrn.zzFG();
      }
      this.zzahs.disconnect();
      bool = false;
      localzzrn = null;
      this.zzahw = null;
    }
  }
  
  private void zza(SignInResponse paramSignInResponse)
  {
    Object localObject1 = null;
    boolean bool1 = zzbz(0);
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject1 = paramSignInResponse.zzqY();
      boolean bool2 = ((ConnectionResult)localObject1).isSuccess();
      if (bool2)
      {
        localObject1 = paramSignInResponse.zzFP();
        Object localObject2 = ((ResolveAccountResponse)localObject1).zzqY();
        boolean bool3 = ((ConnectionResult)localObject2).isSuccess();
        if (!bool3)
        {
          localObject1 = "GoogleApiClientConnecting";
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = "Sign-in succeeded with resolve account failure: " + localObject2;
          Exception localException = new java/lang/Exception;
          localException.<init>();
          Log.wtf((String)localObject1, (String)localObject3, localException);
          zzg((ConnectionResult)localObject2);
        }
        else
        {
          this.zzahv = true;
          localObject2 = ((ResolveAccountResponse)localObject1).zzqX();
          this.zzahw = ((zzp)localObject2);
          bool2 = ((ResolveAccountResponse)localObject1).zzqZ();
          this.zzahx = bool2;
          bool1 = ((ResolveAccountResponse)localObject1).zzra();
          this.zzahy = bool1;
          zzpv();
        }
      }
      else
      {
        bool2 = zzf((ConnectionResult)localObject1);
        if (bool2)
        {
          zzpy();
          zzpv();
        }
        else
        {
          zzg((ConnectionResult)localObject1);
        }
      }
    }
  }
  
  private boolean zza(int paramInt1, int paramInt2, ConnectionResult paramConnectionResult)
  {
    int i = 1;
    boolean bool1 = false;
    if (paramInt2 == i)
    {
      boolean bool2 = zze(paramConnectionResult);
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      ConnectionResult localConnectionResult = this.zzahm;
      if (localConnectionResult != null)
      {
        int k = this.zzahn;
        if (paramInt1 >= k) {}
      }
      else
      {
        int j = i;
      }
    }
  }
  
  private void zzb(ConnectionResult paramConnectionResult, Api paramApi, int paramInt)
  {
    int i = 2;
    if (paramInt != i)
    {
      localObject = paramApi.zzoP();
      i = ((Api.zza)localObject).getPriority();
      boolean bool = zza(i, paramInt, paramConnectionResult);
      if (bool)
      {
        this.zzahm = paramConnectionResult;
        this.zzahn = i;
      }
    }
    Object localObject = this.zzahj.zzaio;
    Api.zzc localzzc = paramApi.zzoR();
    ((Map)localObject).put(localzzc, paramConnectionResult);
  }
  
  private String zzbA(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      str = "UNKNOWN";
    }
    for (;;)
    {
      return str;
      str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
      continue;
      str = "STEP_GETTING_REMOTE_SERVICE";
    }
  }
  
  private boolean zzbz(int paramInt)
  {
    int i = this.zzaho;
    if (i != paramInt)
    {
      Object localObject1 = this.zzahj.zzagW.zzpH();
      Log.i("GoogleApiClientConnecting", (String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("GoogleApiClient connecting is in step ");
      int j = this.zzaho;
      Object localObject2 = zzbA(j);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" but received callback for step ");
      localObject2 = zzbA(paramInt);
      localObject1 = (String)localObject2;
      localObject2 = new java/lang/Exception;
      ((Exception)localObject2).<init>();
      Log.wtf("GoogleApiClientConnecting", (String)localObject1, (Throwable)localObject2);
      ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
      int k = 8;
      j = 0;
      localObject2 = null;
      localConnectionResult.<init>(k, null);
      zzg(localConnectionResult);
      i = 0;
      localConnectionResult = null;
    }
    for (;;)
    {
      return i;
      i = 1;
    }
  }
  
  private boolean zze(ConnectionResult paramConnectionResult)
  {
    boolean bool1 = true;
    boolean bool2 = paramConnectionResult.hasResolution();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      Object localObject = this.zzags;
      int i = paramConnectionResult.getErrorCode();
      localObject = ((zzc)localObject).zzbu(i);
      if (localObject == null) {
        bool1 = false;
      }
    }
  }
  
  private boolean zzf(ConnectionResult paramConnectionResult)
  {
    int i = 1;
    int j = this.zzaht;
    int k = 2;
    if (j != k)
    {
      j = this.zzaht;
      if (j != i) {
        break label37;
      }
      boolean bool = paramConnectionResult.hasResolution();
      if (bool) {
        break label37;
      }
    }
    for (;;)
    {
      return i;
      label37:
      i = 0;
    }
  }
  
  private void zzg(ConnectionResult paramConnectionResult)
  {
    zzpz();
    boolean bool = paramConnectionResult.hasResolution();
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      zzZ(bool);
      this.zzahj.zzh(paramConnectionResult);
      this.zzahj.zzais.zzd(paramConnectionResult);
      return;
    }
  }
  
  private Set zzpA()
  {
    Object localObject = this.zzahz;
    if (localObject == null) {}
    HashSet localHashSet;
    for (localObject = Collections.emptySet();; localObject = localHashSet)
    {
      return (Set)localObject;
      localHashSet = new java/util/HashSet;
      localObject = this.zzahz.zzqs();
      localHashSet.<init>((Collection)localObject);
      Map localMap1 = this.zzahz.zzqu();
      localObject = localMap1.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (Api)localIterator.next();
        Map localMap2 = this.zzahj.zzaio;
        Api.zzc localzzc = ((Api)localObject).zzoR();
        boolean bool2 = localMap2.containsKey(localzzc);
        if (!bool2)
        {
          localObject = ((zzf.zza)localMap1.get(localObject)).zzXf;
          localHashSet.addAll((Collection)localObject);
        }
      }
    }
  }
  
  private boolean zzpu()
  {
    boolean bool = false;
    int i = this.zzahp + -1;
    this.zzahp = i;
    i = this.zzahp;
    if (i > 0) {}
    for (;;)
    {
      return bool;
      i = this.zzahp;
      Object localObject;
      int j;
      if (i < 0)
      {
        String str = this.zzahj.zzagW.zzpH();
        Log.i("GoogleApiClientConnecting", str);
        str = "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.";
        Exception localException = new java/lang/Exception;
        localException.<init>();
        Log.wtf("GoogleApiClientConnecting", str, localException);
        localObject = new com/google/android/gms/common/ConnectionResult;
        j = 8;
        localException = null;
        ((ConnectionResult)localObject).<init>(j, null);
        zzg((ConnectionResult)localObject);
      }
      else
      {
        localObject = this.zzahm;
        if (localObject != null)
        {
          localObject = this.zzahj;
          j = this.zzahn;
          ((zzl)localObject).zzair = j;
          localObject = this.zzahm;
          zzg((ConnectionResult)localObject);
        }
        else
        {
          bool = true;
        }
      }
    }
  }
  
  private void zzpv()
  {
    int i = this.zzahp;
    if (i != 0) {}
    for (;;)
    {
      return;
      boolean bool = this.zzahu;
      if (bool)
      {
        bool = this.zzahv;
        if (!bool) {}
      }
      else
      {
        zzpw();
      }
    }
  }
  
  private void zzpw()
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.zzaho = 1;
    int i = this.zzahj.zzahT.size();
    this.zzahp = i;
    Object localObject2 = this.zzahj.zzahT.keySet();
    Object localObject3 = ((Set)localObject2).iterator();
    Object localObject4;
    for (;;)
    {
      bool1 = ((Iterator)localObject3).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (Api.zzc)((Iterator)localObject3).next();
      localObject4 = this.zzahj.zzaio;
      boolean bool2 = ((Map)localObject4).containsKey(localObject2);
      if (bool2)
      {
        bool1 = zzpu();
        if (bool1) {
          zzpx();
        }
      }
      else
      {
        localObject4 = this.zzahj.zzahT;
        localObject2 = ((Map)localObject4).get(localObject2);
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    boolean bool1 = ((ArrayList)localObject1).isEmpty();
    if (!bool1)
    {
      localObject2 = this.zzahB;
      localObject3 = zzm.zzpN();
      localObject4 = new com/google/android/gms/common/api/internal/zzh$zzc;
      ((zzh.zzc)localObject4).<init>(this, (ArrayList)localObject1);
      localObject1 = ((ExecutorService)localObject3).submit((Runnable)localObject4);
      ((ArrayList)localObject2).add(localObject1);
    }
  }
  
  private void zzpx()
  {
    this.zzahj.zzpL();
    Object localObject1 = zzm.zzpN();
    Object localObject2 = new com/google/android/gms/common/api/internal/zzh$1;
    ((zzh.1)localObject2).<init>(this);
    ((ExecutorService)localObject1).execute((Runnable)localObject2);
    localObject1 = this.zzahs;
    if (localObject1 != null)
    {
      bool1 = this.zzahx;
      if (bool1)
      {
        localObject1 = this.zzahs;
        localObject2 = this.zzahw;
        boolean bool2 = this.zzahy;
        ((zzrn)localObject1).zza((zzp)localObject2, bool2);
      }
      bool1 = false;
      localObject1 = null;
      zzZ(false);
    }
    localObject1 = this.zzahj.zzaio.keySet();
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Api.zzc)((Iterator)localObject2).next();
      Map localMap = this.zzahj.zzahT;
      localObject1 = (Api.zzb)localMap.get(localObject1);
      ((Api.zzb)localObject1).disconnect();
    }
    localObject1 = this.zzahq;
    boolean bool1 = ((Bundle)localObject1).isEmpty();
    if (bool1) {
      bool1 = false;
    }
    for (localObject1 = null;; localObject1 = this.zzahq)
    {
      this.zzahj.zzais.zzi((Bundle)localObject1);
      return;
    }
  }
  
  private void zzpy()
  {
    boolean bool1 = false;
    this.zzahu = false;
    Object localObject1 = this.zzahj.zzagW;
    Object localObject2 = Collections.emptySet();
    ((zzj)localObject1).zzahU = ((Set)localObject2);
    localObject1 = this.zzahr;
    localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Api.zzc)((Iterator)localObject2).next();
      Map localMap = this.zzahj.zzaio;
      boolean bool2 = localMap.containsKey(localObject1);
      if (!bool2)
      {
        localMap = this.zzahj.zzaio;
        ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
        int i = 17;
        localConnectionResult.<init>(i, null);
        localMap.put(localObject1, localConnectionResult);
      }
    }
  }
  
  private void zzpz()
  {
    Object localObject = this.zzahB;
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Future)localIterator.next();
      boolean bool2 = true;
      ((Future)localObject).cancel(bool2);
    }
    this.zzahB.clear();
  }
  
  public void begin()
  {
    int i = 1;
    zzro localzzro = null;
    this.zzahj.zzaio.clear();
    this.zzahu = false;
    this.zzahm = null;
    this.zzaho = 0;
    int j = 2;
    this.zzaht = j;
    this.zzahv = false;
    this.zzahx = false;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = this.zzahA.keySet();
    Object localObject2 = ((Set)localObject1).iterator();
    int m = 0;
    Object localObject3 = null;
    boolean bool = ((Iterator)localObject2).hasNext();
    int n;
    if (bool)
    {
      localObject1 = (Api)((Iterator)localObject2).next();
      localObject4 = this.zzahj.zzahT;
      localObject5 = ((Api)localObject1).zzoR();
      localObject4 = (Api.zzb)((Map)localObject4).get(localObject5);
      int i1 = ((Integer)this.zzahA.get(localObject1)).intValue();
      localObject5 = ((Api)localObject1).zzoP();
      int i2 = ((Api.zza)localObject5).getPriority();
      if (i2 == i) {
        i2 = i;
      }
      for (;;)
      {
        i2 |= m;
        m = ((Api.zzb)localObject4).zzmE();
        if (m != 0)
        {
          this.zzahu = i;
          n = this.zzaht;
          if (i1 < n) {
            this.zzaht = i1;
          }
          if (i1 != 0)
          {
            localObject3 = this.zzahr;
            Api.zzc localzzc = ((Api)localObject1).zzoR();
            ((Set)localObject3).add(localzzc);
          }
        }
        localObject3 = new com/google/android/gms/common/api/internal/zzh$zza;
        ((zzh.zza)localObject3).<init>(this, (Api)localObject1, i1);
        localHashMap.put(localObject4, localObject3);
        n = i2;
        break;
        int i3 = 0;
        localObject5 = null;
      }
    }
    if (n != 0) {
      this.zzahu = false;
    }
    bool = this.zzahu;
    if (bool)
    {
      localObject1 = this.zzahz;
      int i4 = this.zzahj.zzagW.getSessionId();
      localObject4 = Integer.valueOf(i4);
      ((zzf)localObject1).zza((Integer)localObject4);
      zzh.zze localzze = new com/google/android/gms/common/api/internal/zzh$zze;
      localzze.<init>(this, null);
      localObject1 = this.zzagt;
      localObject4 = this.mContext;
      localObject5 = this.zzahj.zzagW.getLooper();
      localObject3 = this.zzahz;
      localzzro = this.zzahz.zzqy();
      localObject2 = localzze;
      localObject1 = (zzrn)((Api.zza)localObject1).zza((Context)localObject4, (Looper)localObject5, (zzf)localObject3, localzzro, localzze, localzze);
      this.zzahs = ((zzrn)localObject1);
    }
    int k = this.zzahj.zzahT.size();
    this.zzahp = k;
    localObject1 = this.zzahB;
    Object localObject4 = zzm.zzpN();
    Object localObject5 = new com/google/android/gms/common/api/internal/zzh$zzb;
    ((zzh.zzb)localObject5).<init>(this, localHashMap);
    localObject4 = ((ExecutorService)localObject4).submit((Runnable)localObject5);
    ((ArrayList)localObject1).add(localObject4);
  }
  
  public void connect() {}
  
  public boolean disconnect()
  {
    boolean bool = true;
    zzpz();
    zzZ(bool);
    this.zzahj.zzh(null);
    return bool;
  }
  
  public void onConnected(Bundle paramBundle)
  {
    boolean bool = zzbz(1);
    if (!bool) {}
    for (;;)
    {
      return;
      if (paramBundle != null)
      {
        Bundle localBundle = this.zzahq;
        localBundle.putAll(paramBundle);
      }
      bool = zzpu();
      if (bool) {
        zzpx();
      }
    }
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    ConnectionResult localConnectionResult = new com/google/android/gms/common/ConnectionResult;
    localConnectionResult.<init>(8, null);
    zzg(localConnectionResult);
  }
  
  public zza.zza zza(zza.zza paramzza)
  {
    this.zzahj.zzagW.zzahN.add(paramzza);
    return paramzza;
  }
  
  public void zza(ConnectionResult paramConnectionResult, Api paramApi, int paramInt)
  {
    boolean bool = zzbz(1);
    if (!bool) {}
    for (;;)
    {
      return;
      zzb(paramConnectionResult, paramApi, paramInt);
      bool = zzpu();
      if (bool) {
        zzpx();
      }
    }
  }
  
  public zza.zza zzb(zza.zza paramzza)
  {
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("GoogleApiClient is not connected yet.");
    throw localIllegalStateException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */