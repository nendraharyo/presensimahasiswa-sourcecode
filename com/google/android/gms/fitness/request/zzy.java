package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;

public class zzy
  implements Parcelable.Creator
{
  static void zza(SessionReadRequest paramSessionReadRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    Object localObject = paramSessionReadRequest.getSessionName();
    zzb.zza(paramParcel, 1, (String)localObject, false);
    int j = paramSessionReadRequest.getVersionCode();
    zzb.zzc(paramParcel, 1000, j);
    localObject = paramSessionReadRequest.getSessionId();
    zzb.zza(paramParcel, 2, (String)localObject, false);
    long l = paramSessionReadRequest.zzlO();
    zzb.zza(paramParcel, 3, l);
    l = paramSessionReadRequest.zzud();
    zzb.zza(paramParcel, 4, l);
    localObject = paramSessionReadRequest.getDataTypes();
    zzb.zzc(paramParcel, 5, (List)localObject, false);
    localObject = paramSessionReadRequest.getDataSources();
    zzb.zzc(paramParcel, 6, (List)localObject, false);
    boolean bool = paramSessionReadRequest.zzve();
    zzb.zza(paramParcel, 7, bool);
    bool = paramSessionReadRequest.zzuP();
    zzb.zza(paramParcel, 8, bool);
    localObject = paramSessionReadRequest.getExcludedPackages();
    zzb.zzb(paramParcel, 9, (List)localObject, false);
    localObject = paramSessionReadRequest.getCallbackBinder();
    zzb.zza(paramParcel, 10, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public SessionReadRequest zzdD(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    zza.zza localzza = null;
    Object localObject1 = null;
    String str = null;
    long l1 = 0L;
    long l2 = 0L;
    Object localObject2 = null;
    Object localObject3 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    ArrayList localArrayList = null;
    IBinder localIBinder = null;
    for (;;)
    {
      k = paramParcel.dataPosition();
      if (k >= i) {
        break;
      }
      k = zza.zzat(paramParcel);
      int m = zza.zzca(k);
      switch (m)
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        localObject1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str = zza.zzp(paramParcel, k);
        break;
      case 3: 
        l1 = zza.zzi(paramParcel, k);
        break;
      case 4: 
        l2 = zza.zzi(paramParcel, k);
        break;
      case 5: 
        localObject2 = DataType.CREATOR;
        localObject2 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject2);
        break;
      case 6: 
        localObject3 = DataSource.CREATOR;
        localObject3 = zza.zzc(paramParcel, k, (Parcelable.Creator)localObject3);
        break;
      case 7: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 8: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 9: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 10: 
        localIBinder = zza.zzq(paramParcel, k);
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localzza = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject4 = "Overread allowed size end=" + i;
      localzza.<init>((String)localObject4, paramParcel);
      throw localzza;
    }
    Object localObject4 = new com/google/android/gms/fitness/request/SessionReadRequest;
    ((SessionReadRequest)localObject4).<init>(j, (String)localObject1, str, l1, l2, (List)localObject2, (List)localObject3, bool1, bool2, localArrayList, localIBinder);
    return (SessionReadRequest)localObject4;
  }
  
  public SessionReadRequest[] zzfE(int paramInt)
  {
    return new SessionReadRequest[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */