package com.google.android.gms.maps;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zzf;
import java.util.ArrayList;
import java.util.List;

class StreetViewPanoramaView$zzb
  extends zza
{
  private final Context mContext;
  private final List zzaSC;
  private final StreetViewPanoramaOptions zzaSO;
  protected zzf zzaSh;
  private final ViewGroup zzaSo;
  
  StreetViewPanoramaView$zzb(ViewGroup paramViewGroup, Context paramContext, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaSC = localArrayList;
    this.zzaSo = paramViewGroup;
    this.mContext = paramContext;
    this.zzaSO = paramStreetViewPanoramaOptions;
  }
  
  public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback paramOnStreetViewPanoramaReadyCallback)
  {
    Object localObject = zztU();
    if (localObject != null)
    {
      localObject = (StreetViewPanoramaView.zza)zztU();
      ((StreetViewPanoramaView.zza)localObject).getStreetViewPanoramaAsync(paramOnStreetViewPanoramaReadyCallback);
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
    //   1: getfield 47	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSh	Lcom/google/android/gms/dynamic/zzf;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +153 -> 159
    //   9: aload_0
    //   10: invokevirtual 33	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zztU	()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnonnull +144 -> 159
    //   18: aload_0
    //   19: getfield 27	com/google/android/gms/maps/StreetViewPanoramaView$zzb:mContext	Landroid/content/Context;
    //   22: astore_1
    //   23: aload_1
    //   24: invokestatic 56	com/google/android/gms/maps/internal/zzad:zzaO	(Landroid/content/Context;)Lcom/google/android/gms/maps/internal/zzc;
    //   27: astore_1
    //   28: aload_0
    //   29: getfield 27	com/google/android/gms/maps/StreetViewPanoramaView$zzb:mContext	Landroid/content/Context;
    //   32: astore_2
    //   33: aload_2
    //   34: invokestatic 62	com/google/android/gms/dynamic/zze:zzC	(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/zzd;
    //   37: astore_2
    //   38: aload_0
    //   39: getfield 29	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSO	Lcom/google/android/gms/maps/StreetViewPanoramaOptions;
    //   42: astore_3
    //   43: aload_1
    //   44: aload_2
    //   45: aload_3
    //   46: invokeinterface 68 3 0
    //   51: astore_1
    //   52: aload_0
    //   53: getfield 47	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSh	Lcom/google/android/gms/dynamic/zzf;
    //   56: astore_2
    //   57: new 35	com/google/android/gms/maps/StreetViewPanoramaView$zza
    //   60: astore_3
    //   61: aload_0
    //   62: getfield 25	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSo	Landroid/view/ViewGroup;
    //   65: astore 4
    //   67: aload_3
    //   68: aload 4
    //   70: aload_1
    //   71: invokespecial 71	com/google/android/gms/maps/StreetViewPanoramaView$zza:<init>	(Landroid/view/ViewGroup;Lcom/google/android/gms/maps/internal/IStreetViewPanoramaViewDelegate;)V
    //   74: aload_2
    //   75: aload_3
    //   76: invokeinterface 76 2 0
    //   81: aload_0
    //   82: getfield 23	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSC	Ljava/util/List;
    //   85: astore_1
    //   86: aload_1
    //   87: invokeinterface 80 1 0
    //   92: astore_3
    //   93: aload_3
    //   94: invokeinterface 86 1 0
    //   99: istore 5
    //   101: iload 5
    //   103: ifeq +45 -> 148
    //   106: aload_3
    //   107: invokeinterface 90 1 0
    //   112: astore_1
    //   113: aload_1
    //   114: checkcast 92	com/google/android/gms/maps/OnStreetViewPanoramaReadyCallback
    //   117: astore_1
    //   118: aload_0
    //   119: invokevirtual 33	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zztU	()Lcom/google/android/gms/dynamic/LifecycleDelegate;
    //   122: astore_2
    //   123: aload_2
    //   124: checkcast 35	com/google/android/gms/maps/StreetViewPanoramaView$zza
    //   127: astore_2
    //   128: aload_2
    //   129: aload_1
    //   130: invokevirtual 39	com/google/android/gms/maps/StreetViewPanoramaView$zza:getStreetViewPanoramaAsync	(Lcom/google/android/gms/maps/OnStreetViewPanoramaReadyCallback;)V
    //   133: goto -40 -> 93
    //   136: astore_1
    //   137: new 94	com/google/android/gms/maps/model/RuntimeRemoteException
    //   140: astore_2
    //   141: aload_2
    //   142: aload_1
    //   143: invokespecial 97	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   146: aload_2
    //   147: athrow
    //   148: aload_0
    //   149: getfield 23	com/google/android/gms/maps/StreetViewPanoramaView$zzb:zzaSC	Ljava/util/List;
    //   152: astore_1
    //   153: aload_1
    //   154: invokeinterface 100 1 0
    //   159: return
    //   160: astore_1
    //   161: goto -2 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	this	zzb
    //   4	126	1	localObject1	Object
    //   136	7	1	localRemoteException	android.os.RemoteException
    //   152	2	1	localList	List
    //   160	1	1	localGooglePlayServicesNotAvailableException	com.google.android.gms.common.GooglePlayServicesNotAvailableException
    //   32	115	2	localObject2	Object
    //   42	65	3	localObject3	Object
    //   65	4	4	localViewGroup	ViewGroup
    //   99	3	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   18	22	136	android/os/RemoteException
    //   23	27	136	android/os/RemoteException
    //   28	32	136	android/os/RemoteException
    //   33	37	136	android/os/RemoteException
    //   38	42	136	android/os/RemoteException
    //   45	51	136	android/os/RemoteException
    //   52	56	136	android/os/RemoteException
    //   57	60	136	android/os/RemoteException
    //   61	65	136	android/os/RemoteException
    //   70	74	136	android/os/RemoteException
    //   75	81	136	android/os/RemoteException
    //   81	85	136	android/os/RemoteException
    //   86	92	136	android/os/RemoteException
    //   93	99	136	android/os/RemoteException
    //   106	112	136	android/os/RemoteException
    //   113	117	136	android/os/RemoteException
    //   118	122	136	android/os/RemoteException
    //   123	127	136	android/os/RemoteException
    //   129	133	136	android/os/RemoteException
    //   148	152	136	android/os/RemoteException
    //   153	159	136	android/os/RemoteException
    //   18	22	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   23	27	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   28	32	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   33	37	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   38	42	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   45	51	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   52	56	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   57	60	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   61	65	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   70	74	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   75	81	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   81	85	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   86	92	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   93	99	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   106	112	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   113	117	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   118	122	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   123	127	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   129	133	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   148	152	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   153	159	160	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\StreetViewPanoramaView$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */