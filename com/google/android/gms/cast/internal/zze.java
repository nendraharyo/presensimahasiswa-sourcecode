package com.google.android.gms.cast.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.Listener;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zze
  extends zzj
{
  private static final zzl zzaaf;
  private static final Object zzadP;
  private static final Object zzadQ;
  private final Cast.Listener zzZP;
  private double zzabs;
  private boolean zzabt;
  private final long zzadA;
  private zze.zzb zzadB;
  private String zzadC;
  private boolean zzadD;
  private boolean zzadE;
  private boolean zzadF;
  private int zzadG;
  private int zzadH;
  private final AtomicLong zzadI;
  private String zzadJ;
  private String zzadK;
  private Bundle zzadL;
  private final Map zzadM;
  private zza.zzb zzadN;
  private zza.zzb zzadO;
  private ApplicationMetadata zzadx;
  private final CastDevice zzady;
  private final Map zzadz;
  
  static
  {
    Object localObject = new com/google/android/gms/cast/internal/zzl;
    ((zzl)localObject).<init>("CastClientImpl");
    zzaaf = (zzl)localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    zzadP = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    zzadQ = localObject;
  }
  
  public zze(Context paramContext, Looper paramLooper, com.google.android.gms.common.internal.zzf paramzzf, CastDevice paramCastDevice, long paramLong, Cast.Listener paramListener, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 10, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzady = paramCastDevice;
    this.zzZP = paramListener;
    this.zzadA = paramLong;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzadz = ((Map)localObject);
    localObject = new java/util/concurrent/atomic/AtomicLong;
    ((AtomicLong)localObject).<init>(0L);
    this.zzadI = ((AtomicLong)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzadM = ((Map)localObject);
    zzoh();
  }
  
  private void zza(ApplicationStatus paramApplicationStatus)
  {
    boolean bool1 = true;
    Object localObject1 = paramApplicationStatus.zzoe();
    Object localObject2 = this.zzadC;
    boolean bool2 = zzf.zza(localObject1, localObject2);
    boolean bool3;
    if (!bool2)
    {
      this.zzadC = ((String)localObject1);
      bool3 = bool1;
    }
    for (;;)
    {
      localObject2 = zzaaf;
      String str = "hasChanged=%b, mFirstApplicationStatusUpdate=%b";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(bool3);
      arrayOfObject[0] = localBoolean;
      boolean bool4 = this.zzadD;
      localBoolean = Boolean.valueOf(bool4);
      arrayOfObject[bool1] = localBoolean;
      ((zzl)localObject2).zzb(str, arrayOfObject);
      Cast.Listener localListener = this.zzZP;
      if (localListener != null) {
        if (!bool3)
        {
          bool3 = this.zzadD;
          if (!bool3) {}
        }
        else
        {
          localObject1 = this.zzZP;
          ((Cast.Listener)localObject1).onApplicationStatusChanged();
        }
      }
      this.zzadD = false;
      return;
      bool3 = false;
      localObject1 = null;
    }
  }
  
  private void zza(DeviceStatus paramDeviceStatus)
  {
    int i = 2;
    int j = 1;
    Object localObject1 = paramDeviceStatus.getApplicationMetadata();
    Object localObject2 = this.zzadx;
    boolean bool1 = zzf.zza(localObject1, localObject2);
    if (!bool1)
    {
      this.zzadx = ((ApplicationMetadata)localObject1);
      localObject1 = this.zzZP;
      localObject2 = this.zzadx;
      ((Cast.Listener)localObject1).onApplicationMetadataChanged((ApplicationMetadata)localObject2);
    }
    double d1 = paramDeviceStatus.zzok();
    double d2 = 0.0D / 0.0D;
    boolean bool2 = d1 < d2;
    if (bool2)
    {
      d2 = this.zzabs;
      d2 = Math.abs(d1 - d2);
      double d3 = 1.0E-7D;
      bool2 = d2 < d3;
      if (bool2)
      {
        this.zzabs = d1;
        bool2 = j;
      }
    }
    for (;;)
    {
      bool1 = paramDeviceStatus.zzot();
      boolean bool5 = this.zzabt;
      if (bool1 != bool5)
      {
        this.zzabt = bool1;
        bool2 = j;
      }
      localObject2 = zzaaf;
      String str = "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b";
      Object[] arrayOfObject = new Object[i];
      Boolean localBoolean = Boolean.valueOf(bool2);
      arrayOfObject[0] = localBoolean;
      boolean bool6 = this.zzadE;
      localBoolean = Boolean.valueOf(bool6);
      arrayOfObject[j] = localBoolean;
      ((zzl)localObject2).zzb(str, arrayOfObject);
      localObject2 = this.zzZP;
      if (localObject2 != null) {
        if (!bool2)
        {
          bool2 = this.zzadE;
          if (!bool2) {}
        }
        else
        {
          localObject1 = this.zzZP;
          ((Cast.Listener)localObject1).onVolumeChanged();
        }
      }
      int m = paramDeviceStatus.zzol();
      int k = this.zzadG;
      if (m != k)
      {
        this.zzadG = m;
        m = j;
      }
      for (;;)
      {
        localObject2 = zzaaf;
        str = "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b";
        arrayOfObject = new Object[i];
        localBoolean = Boolean.valueOf(m);
        arrayOfObject[0] = localBoolean;
        bool6 = this.zzadE;
        localBoolean = Boolean.valueOf(bool6);
        arrayOfObject[j] = localBoolean;
        ((zzl)localObject2).zzb(str, arrayOfObject);
        localObject2 = this.zzZP;
        if (localObject2 != null) {
          if (m == 0)
          {
            boolean bool3 = this.zzadE;
            if (!bool3) {}
          }
          else
          {
            localObject1 = this.zzZP;
            k = this.zzadG;
            ((Cast.Listener)localObject1).onActiveInputStateChanged(k);
          }
        }
        int n = paramDeviceStatus.zzom();
        k = this.zzadH;
        if (n != k)
        {
          this.zzadH = n;
          n = j;
        }
        for (;;)
        {
          localObject2 = zzaaf;
          str = "hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b";
          arrayOfObject = new Object[i];
          localBoolean = Boolean.valueOf(n);
          arrayOfObject[0] = localBoolean;
          bool6 = this.zzadE;
          localBoolean = Boolean.valueOf(bool6);
          arrayOfObject[j] = localBoolean;
          ((zzl)localObject2).zzb(str, arrayOfObject);
          Cast.Listener localListener = this.zzZP;
          if (localListener != null) {
            if (n == 0)
            {
              bool4 = this.zzadE;
              if (!bool4) {}
            }
            else
            {
              localObject1 = this.zzZP;
              j = this.zzadH;
              ((Cast.Listener)localObject1).onStandbyStateChanged(j);
            }
          }
          this.zzadE = false;
          return;
          bool4 = false;
          localObject1 = null;
        }
        bool4 = false;
        localObject1 = null;
      }
      boolean bool4 = false;
      localObject1 = null;
    }
  }
  
  private void zza(zza.zzb paramzzb)
  {
    synchronized (zzadP)
    {
      zza.zzb localzzb = this.zzadN;
      if (localzzb != null)
      {
        localzzb = this.zzadN;
        zze.zza localzza = new com/google/android/gms/cast/internal/zze$zza;
        Status localStatus = new com/google/android/gms/common/api/Status;
        int i = 2002;
        localStatus.<init>(i);
        localzza.<init>(localStatus);
        localzzb.zzs(localzza);
      }
      this.zzadN = paramzzb;
      return;
    }
  }
  
  private void zzc(zza.zzb paramzzb)
  {
    synchronized (zzadQ)
    {
      Object localObject2 = this.zzadO;
      if (localObject2 != null)
      {
        localObject2 = new com/google/android/gms/common/api/Status;
        int i = 2001;
        ((Status)localObject2).<init>(i);
        paramzzb.zzs(localObject2);
        return;
      }
      this.zzadO = paramzzb;
    }
  }
  
  private void zzoh()
  {
    int i = -1;
    this.zzadF = false;
    this.zzadG = i;
    this.zzadH = i;
    this.zzadx = null;
    this.zzadC = null;
    this.zzabs = 0.0D;
    this.zzabt = false;
  }
  
  private void zzon()
  {
    Object localObject1 = zzaaf;
    Object[] arrayOfObject = new Object[0];
    ((zzl)localObject1).zzb("removing all MessageReceivedCallbacks", arrayOfObject);
    synchronized (this.zzadz)
    {
      localObject1 = this.zzadz;
      ((Map)localObject1).clear();
      return;
    }
  }
  
  private void zzoo()
  {
    boolean bool = this.zzadF;
    if (bool)
    {
      localObject = this.zzadB;
      if (localObject != null)
      {
        localObject = this.zzadB;
        bool = ((zze.zzb)localObject).isDisposed();
        if (!bool) {
          return;
        }
      }
    }
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("Not connected to a device");
    throw ((Throwable)localObject);
  }
  
  /* Error */
  public void disconnect()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: getstatic 53	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   5: astore_2
    //   6: iconst_2
    //   7: istore_3
    //   8: iload_3
    //   9: anewarray 55	java/lang/Object
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 231	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   18: astore 5
    //   20: aload 4
    //   22: iconst_0
    //   23: aload 5
    //   25: aastore
    //   26: aload_0
    //   27: invokevirtual 246	com/google/android/gms/cast/internal/zze:isConnected	()Z
    //   30: istore 6
    //   32: iload 6
    //   34: invokestatic 119	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   37: astore 5
    //   39: aload 4
    //   41: iload_1
    //   42: aload 5
    //   44: aastore
    //   45: aload_2
    //   46: ldc -13
    //   48: aload 4
    //   50: invokevirtual 125	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   53: aload_0
    //   54: getfield 231	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   57: astore_2
    //   58: aconst_null
    //   59: astore 7
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 231	com/google/android/gms/cast/internal/zze:zzadB	Lcom/google/android/gms/cast/internal/zze$zzb;
    //   66: aload_2
    //   67: ifnull +12 -> 79
    //   70: aload_2
    //   71: invokevirtual 250	com/google/android/gms/cast/internal/zze$zzb:zzos	()Lcom/google/android/gms/cast/internal/zze;
    //   74: astore_2
    //   75: aload_2
    //   76: ifnonnull +26 -> 102
    //   79: getstatic 53	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   82: astore_2
    //   83: ldc -4
    //   85: astore 7
    //   87: iconst_0
    //   88: anewarray 55	java/lang/Object
    //   91: astore 4
    //   93: aload_2
    //   94: aload 7
    //   96: aload 4
    //   98: invokevirtual 125	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: return
    //   102: aload_0
    //   103: invokespecial 255	com/google/android/gms/cast/internal/zze:zzon	()V
    //   106: aload_0
    //   107: invokevirtual 259	com/google/android/gms/cast/internal/zze:zzqJ	()Landroid/os/IInterface;
    //   110: astore_2
    //   111: aload_2
    //   112: checkcast 261	com/google/android/gms/cast/internal/zzi
    //   115: astore_2
    //   116: aload_2
    //   117: invokeinterface 264 1 0
    //   122: aload_0
    //   123: invokespecial 265	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   126: goto -25 -> 101
    //   129: astore_2
    //   130: getstatic 53	com/google/android/gms/cast/internal/zze:zzaaf	Lcom/google/android/gms/cast/internal/zzl;
    //   133: astore 7
    //   135: ldc_w 267
    //   138: astore 4
    //   140: iconst_1
    //   141: istore 6
    //   143: iload 6
    //   145: anewarray 55	java/lang/Object
    //   148: astore 5
    //   150: aload_2
    //   151: invokevirtual 272	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   154: astore 8
    //   156: aload 5
    //   158: iconst_0
    //   159: aload 8
    //   161: aastore
    //   162: aload 7
    //   164: aload_2
    //   165: aload 4
    //   167: aload 5
    //   169: invokevirtual 275	com/google/android/gms/cast/internal/zzl:zzb	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: aload_0
    //   173: invokespecial 265	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   176: goto -75 -> 101
    //   179: astore_2
    //   180: aload_0
    //   181: invokespecial 265	com/google/android/gms/common/internal/zzj:disconnect	()V
    //   184: aload_2
    //   185: athrow
    //   186: astore_2
    //   187: goto -57 -> 130
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	zze
    //   1	41	1	i	int
    //   5	112	2	localObject1	Object
    //   129	36	2	localRemoteException	android.os.RemoteException
    //   179	6	2	localObject2	Object
    //   186	1	2	localIllegalStateException	IllegalStateException
    //   7	2	3	j	int
    //   12	154	4	localObject3	Object
    //   18	150	5	localObject4	Object
    //   30	114	6	bool	boolean
    //   59	104	7	localObject5	Object
    //   154	6	8	str	String
    // Exception table:
    //   from	to	target	type
    //   106	110	129	android/os/RemoteException
    //   111	115	129	android/os/RemoteException
    //   116	122	129	android/os/RemoteException
    //   106	110	179	finally
    //   111	115	179	finally
    //   116	122	179	finally
    //   130	133	179	finally
    //   143	148	179	finally
    //   150	154	179	finally
    //   159	162	179	finally
    //   167	172	179	finally
    //   106	110	186	java/lang/IllegalStateException
    //   111	115	186	java/lang/IllegalStateException
    //   116	122	186	java/lang/IllegalStateException
  }
  
  public ApplicationMetadata getApplicationMetadata()
  {
    zzoo();
    return this.zzadx;
  }
  
  public String getApplicationStatus()
  {
    zzoo();
    return this.zzadC;
  }
  
  public boolean isMute()
  {
    zzoo();
    return this.zzabt;
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    super.onConnectionFailed(paramConnectionResult);
    zzon();
  }
  
  public void zzX(boolean paramBoolean)
  {
    zzi localzzi = (zzi)zzqJ();
    double d = this.zzabs;
    boolean bool = this.zzabt;
    localzzi.zza(paramBoolean, d, bool);
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    int i = 1001;
    boolean bool = true;
    Object localObject = zzaaf;
    String str = "in onPostInitHandler; statusCode=%d";
    Object[] arrayOfObject = new Object[bool];
    Integer localInteger = Integer.valueOf(paramInt1);
    arrayOfObject[0] = localInteger;
    ((zzl)localObject).zzb(str, arrayOfObject);
    if ((paramInt1 == 0) || (paramInt1 == i))
    {
      this.zzadF = bool;
      this.zzadD = bool;
      this.zzadE = bool;
    }
    for (;;)
    {
      if (paramInt1 == i)
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        this.zzadL = ((Bundle)localObject);
        localObject = this.zzadL;
        str = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
        ((Bundle)localObject).putBoolean(str, bool);
        paramInt1 = 0;
      }
      super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
      return;
      this.zzadF = false;
    }
  }
  
  public void zza(String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback)
  {
    zzf.zzch(paramString);
    zzcg(paramString);
    if (paramMessageReceivedCallback != null) {}
    synchronized (this.zzadz)
    {
      Object localObject1 = this.zzadz;
      ((Map)localObject1).put(paramString, paramMessageReceivedCallback);
      localObject1 = (zzi)zzqJ();
      ((zzi)localObject1).zzcl(paramString);
      return;
    }
  }
  
  public void zza(String paramString, LaunchOptions paramLaunchOptions, zza.zzb paramzzb)
  {
    zza(paramzzb);
    ((zzi)zzqJ()).zza(paramString, paramLaunchOptions);
  }
  
  public void zza(String paramString, zza.zzb paramzzb)
  {
    zzc(paramzzb);
    ((zzi)zzqJ()).zzck(paramString);
  }
  
  public void zza(String paramString1, String paramString2, JoinOptions paramJoinOptions, zza.zzb paramzzb)
  {
    zza(paramzzb);
    if (paramJoinOptions == null)
    {
      paramJoinOptions = new com/google/android/gms/cast/JoinOptions;
      paramJoinOptions.<init>();
    }
    ((zzi)zzqJ()).zza(paramString1, paramString2, paramJoinOptions);
  }
  
  public void zza(String paramString1, String paramString2, zza.zzb paramzzb)
  {
    boolean bool = TextUtils.isEmpty(paramString2);
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("The message payload cannot be null or empty");
      throw ((Throwable)localObject1);
    }
    int i = paramString2.length();
    int j = 65536;
    if (i > j)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Message exceeds maximum size");
      throw ((Throwable)localObject1);
    }
    zzf.zzch(paramString1);
    zzoo();
    Object localObject1 = this.zzadI;
    long l = ((AtomicLong)localObject1).incrementAndGet();
    try
    {
      localObject1 = this.zzadM;
      localObject3 = Long.valueOf(l);
      ((Map)localObject1).put(localObject3, paramzzb);
      localObject1 = zzqJ();
      localObject1 = (zzi)localObject1;
      ((zzi)localObject1).zzb(paramString1, paramString2, l);
      return;
    }
    finally
    {
      Object localObject3 = this.zzadM;
      Long localLong = Long.valueOf(l);
      ((Map)localObject3).remove(localLong);
    }
  }
  
  public void zza(String paramString, boolean paramBoolean, zza.zzb paramzzb)
  {
    LaunchOptions localLaunchOptions = new com/google/android/gms/cast/LaunchOptions;
    localLaunchOptions.<init>();
    localLaunchOptions.setRelaunchIfRunning(paramBoolean);
    zza(paramString, localLaunchOptions, paramzzb);
  }
  
  protected zzi zzaE(IBinder paramIBinder)
  {
    return zzi.zza.zzaF(paramIBinder);
  }
  
  public void zzb(zza.zzb paramzzb)
  {
    zzc(paramzzb);
    ((zzi)zzqJ()).zzou();
  }
  
  public void zzcg(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject1;
    if (bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("Channel namespace cannot be null or empty");
      throw ((Throwable)localObject1);
    }
    synchronized (this.zzadz)
    {
      localObject1 = this.zzadz;
      localObject1 = ((Map)localObject1).remove(paramString);
      localObject1 = (Cast.MessageReceivedCallback)localObject1;
      if (localObject1 == null) {}
    }
  }
  
  public void zzf(double paramDouble)
  {
    boolean bool1 = Double.isInfinite(paramDouble);
    if (!bool1)
    {
      bool1 = Double.isNaN(paramDouble);
      if (!bool1) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Volume cannot be " + paramDouble;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    Object localObject = (zzi)zzqJ();
    double d = this.zzabs;
    boolean bool2 = this.zzabt;
    ((zzi)localObject).zza(paramDouble, d, bool2);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.cast.internal.ICastDeviceController";
  }
  
  protected Bundle zzml()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = zzaaf;
    int i = 2;
    Object localObject2 = new Object[i];
    String str = this.zzadJ;
    localObject2[0] = str;
    int j = 1;
    str = this.zzadK;
    localObject2[j] = str;
    ((zzl)localObject1).zzb("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", (Object[])localObject2);
    this.zzady.putInBundle(localBundle);
    long l = this.zzadA;
    localBundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", l);
    localObject1 = new com/google/android/gms/cast/internal/zze$zzb;
    ((zze.zzb)localObject1).<init>(this);
    this.zzadB = ((zze.zzb)localObject1);
    Object localObject3 = new com/google/android/gms/common/internal/BinderWrapper;
    localObject2 = this.zzadB.asBinder();
    ((BinderWrapper)localObject3).<init>((IBinder)localObject2);
    localBundle.putParcelable("listener", (Parcelable)localObject3);
    localObject1 = this.zzadJ;
    if (localObject1 != null)
    {
      localObject3 = this.zzadJ;
      localBundle.putString("last_application_id", (String)localObject3);
      localObject1 = this.zzadK;
      if (localObject1 != null)
      {
        localObject1 = "last_session_id";
        localObject3 = this.zzadK;
        localBundle.putString((String)localObject1, (String)localObject3);
      }
    }
    return localBundle;
  }
  
  public Bundle zzoi()
  {
    Bundle localBundle = this.zzadL;
    if (localBundle != null)
    {
      localBundle = this.zzadL;
      this.zzadL = null;
    }
    for (;;)
    {
      return localBundle;
      localBundle = super.zzoi();
    }
  }
  
  public void zzoj()
  {
    ((zzi)zzqJ()).zzoj();
  }
  
  public double zzok()
  {
    zzoo();
    return this.zzabs;
  }
  
  public int zzol()
  {
    zzoo();
    return this.zzadG;
  }
  
  public int zzom()
  {
    zzoo();
    return this.zzadH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */