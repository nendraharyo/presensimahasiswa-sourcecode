package com.google.android.gms.maps;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzf;
import java.util.ArrayList;
import java.util.List;

class SupportStreetViewPanoramaFragment$zzb
  extends zza
{
  private Activity mActivity;
  private final List zzaSC;
  protected zzf zzaSh;
  private final Fragment zzalg;
  
  SupportStreetViewPanoramaFragment$zzb(Fragment paramFragment)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaSC = localArrayList;
    this.zzalg = paramFragment;
  }
  
  private void setActivity(Activity paramActivity)
  {
    this.mActivity = paramActivity;
    zzzW();
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (SupportStreetViewPanoramaFragment.zza)zztU();
      ((SupportStreetViewPanoramaFragment.zza)localObject).getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
    }
    for (;;)
    {
      return;
      localObject = this.zzaSC;
      ((List)localObject).add(paramOnStreetViewPanoramaReadyCallback);
    }
  }
  
  protected void zza(zzf paramzzf)
  {
    this.zzaSh = paramzzf;
    zzzW();
  }
  
  /* Error */
  public void zzzW()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:mActivity	Landroid/app/Activity;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +166 -> 172
    //   9: aload_0
    //   10: getfield 50	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zzaSh	Lcom/google/android/gms/dynamic/zzf;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull +157 -> 172
    //   18: aload_0
    //   19: invokevirtual 36	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zztU	()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //   22: astore_1
    //   23: aload_1
    //   24: ifnonnull +148 -> 172
    //   27: aload_0
    //   28: getfield 25	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:mActivity	Landroid/app/Activity;
    //   31: astore_1
    //   32: aload_1
    //   33: invokestatic 56	com/google/android/gms/maps/MapsInitializer:initialize	(Landroid/content/Context;)I
    //   36: pop
    //   37: aload_0
    //   38: getfield 25	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:mActivity	Landroid/app/Activity;
    //   41: astore_1
    //   42: aload_1
    //   43: invokestatic 62	com/google/android/gms/maps/internal/zzad:zzaO	(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
    //   46: astore_1
    //   47: aload_0
    //   48: getfield 25	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:mActivity	Landroid/app/Activity;
    //   51: astore_2
    //   52: aload_2
    //   53: invokestatic 68	com/google/android/gms/dynamic/zze:zzC	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
    //   56: astore_2
    //   57: aload_1
    //   58: aload_2
    //   59: invokeinterface 74 2 0
    //   64: astore_1
    //   65: aload_0
    //   66: getfield 50	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zzaSh	Lcom/google/android/gms/dynamic/zzf;
    //   69: astore_2
    //   70: new 38	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza
    //   73: astore_3
    //   74: aload_0
    //   75: getfield 23	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zzalg	Landroid/support/v4/app/Fragment;
    //   78: astore 4
    //   80: aload_3
    //   81: aload 4
    //   83: aload_1
    //   84: invokespecial 77	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza:<init>	(Landroid/support/v4/app/Fragment;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaFragmentDelegate;)V
    //   87: aload_2
    //   88: aload_3
    //   89: invokeinterface 83 2 0
    //   94: aload_0
    //   95: getfield 21	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zzaSC	Ljava/util/List;
    //   98: astore_1
    //   99: aload_1
    //   100: invokeinterface 87 1 0
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 93 1 0
    //   112: istore 5
    //   114: iload 5
    //   116: ifeq +45 -> 161
    //   119: aload_3
    //   120: invokeinterface 97 1 0
    //   125: astore_1
    //   126: aload_1
    //   127: checkcast 99	com/google/android/gms/maps/OnStreetViewPanoramaReadyCallback
    //   130: astore_1
    //   131: aload_0
    //   132: invokevirtual 36	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zztU	()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //   135: astore_2
    //   136: aload_2
    //   137: checkcast 38	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza
    //   140: astore_2
    //   141: aload_2
    //   142: aload_1
    //   143: invokevirtual 42	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zza:getStreetViewPanoramaAsync	(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
    //   146: goto -40 -> 106
    //   149: astore_1
    //   150: new 101	com/google/android/gms/maps/model/RuntimeRemoteException
    //   153: astore_2
    //   154: aload_2
    //   155: aload_1
    //   156: invokespecial 104	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   159: aload_2
    //   160: athrow
    //   161: aload_0
    //   162: getfield 21	com/google/android/gms/maps/SupportStreetViewPanoramaFragment$zzb:zzaSC	Ljava/util/List;
    //   165: astore_1
    //   166: aload_1
    //   167: invokeinterface 107 1 0
    //   172: return
    //   173: astore_1
    //   174: goto -2 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	zzb
    //   4	139	1	localObject1	Object
    //   149	7	1	localRemoteException	android.os.RemoteException
    //   165	2	1	localList	List
    //   173	1	1	localGooglePlayServicesNotAvailableException	com.google.android.gms.common.GooglePlayServicesNotAvailableException
    //   51	109	2	localObject2	Object
    //   73	47	3	localObject3	Object
    //   78	4	4	localFragment	Fragment
    //   112	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   27	31	149	android/os/RemoteException
    //   32	37	149	android/os/RemoteException
    //   37	41	149	android/os/RemoteException
    //   42	46	149	android/os/RemoteException
    //   47	51	149	android/os/RemoteException
    //   52	56	149	android/os/RemoteException
    //   58	64	149	android/os/RemoteException
    //   65	69	149	android/os/RemoteException
    //   70	73	149	android/os/RemoteException
    //   74	78	149	android/os/RemoteException
    //   83	87	149	android/os/RemoteException
    //   88	94	149	android/os/RemoteException
    //   94	98	149	android/os/RemoteException
    //   99	105	149	android/os/RemoteException
    //   106	112	149	android/os/RemoteException
    //   119	125	149	android/os/RemoteException
    //   126	130	149	android/os/RemoteException
    //   131	135	149	android/os/RemoteException
    //   136	140	149	android/os/RemoteException
    //   142	146	149	android/os/RemoteException
    //   161	165	149	android/os/RemoteException
    //   166	172	149	android/os/RemoteException
    //   27	31	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   32	37	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   37	41	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   42	46	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   47	51	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   52	56	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   58	64	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   65	69	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   70	73	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   74	78	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   83	87	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   88	94	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   94	98	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   99	105	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   106	112	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   119	125	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   126	130	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   131	135	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   136	140	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   142	146	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   161	165	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   166	172	173	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\SupportStreetViewPanoramaFragment$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */