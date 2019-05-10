package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class zzba
  implements Parcelable.Creator
{
  static void zza(OnEventResponse paramOnEventResponse, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramOnEventResponse.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    j = paramOnEventResponse.zzanf;
    zzb.zzc(paramParcel, 2, j);
    Object localObject = paramOnEventResponse.zzasl;
    zzb.zza(paramParcel, 3, (Parcelable)localObject, paramInt, false);
    localObject = paramOnEventResponse.zzasm;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramOnEventResponse.zzasn;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramOnEventResponse.zzaso;
    zzb.zza(paramParcel, 7, (Parcelable)localObject, paramInt, false);
    localObject = paramOnEventResponse.zzasp;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    localObject = paramOnEventResponse.zzasq;
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public OnEventResponse zzbD(Parcel paramParcel)
  {
    int i = 0;
    Object localObject1 = null;
    int j = zza.zzau(paramParcel);
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    int k = 0;
    Object localObject7 = null;
    for (;;)
    {
      m = paramParcel.dataPosition();
      if (m >= j) {
        break;
      }
      m = zza.zzat(paramParcel);
      int n = zza.zzca(m);
      switch (n)
      {
      case 4: 
      case 8: 
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        i = zza.zzg(paramParcel, m);
        break;
      case 3: 
        localObject6 = ChangeEvent.CREATOR;
        localObject8 = (ChangeEvent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject6);
        localObject6 = localObject8;
        break;
      case 5: 
        localObject5 = CompletionEvent.CREATOR;
        localObject8 = (CompletionEvent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject5);
        localObject5 = localObject8;
        break;
      case 6: 
        localObject4 = QueryResultEventParcelable.CREATOR;
        localObject8 = (QueryResultEventParcelable)zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject8;
        break;
      case 7: 
        localObject3 = ChangesAvailableEvent.CREATOR;
        localObject8 = (ChangesAvailableEvent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject8;
        break;
      case 9: 
        localObject2 = TransferStateEvent.CREATOR;
        localObject8 = (TransferStateEvent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject8;
        break;
      case 10: 
        localObject1 = TransferProgressEvent.CREATOR;
        localObject8 = (TransferProgressEvent)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject8;
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject8 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      localObject7 = "Overread allowed size end=" + j;
      ((zza.zza)localObject8).<init>((String)localObject7, paramParcel);
      throw ((Throwable)localObject8);
    }
    Object localObject8 = new com/google/android/gms/drive/internal/OnEventResponse;
    ((OnEventResponse)localObject8).<init>(k, i, (ChangeEvent)localObject6, (CompletionEvent)localObject5, (QueryResultEventParcelable)localObject4, (ChangesAvailableEvent)localObject3, (TransferStateEvent)localObject2, (TransferProgressEvent)localObject1);
    return (OnEventResponse)localObject8;
  }
  
  public OnEventResponse[] zzdy(int paramInt)
  {
    return new OnEventResponse[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzba.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */