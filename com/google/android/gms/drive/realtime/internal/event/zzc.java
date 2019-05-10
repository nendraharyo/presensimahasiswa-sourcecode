package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzc
  implements Parcelable.Creator
{
  static void zza(ParcelableEvent paramParcelableEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramParcelableEvent.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramParcelableEvent.zzLq;
    zzb.zza(paramParcel, 2, (String)localObject, false);
    localObject = paramParcelableEvent.zzrG;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramParcelableEvent.zzauR;
    zzb.zzb(paramParcel, 4, (List)localObject, false);
    boolean bool = paramParcelableEvent.zzauS;
    zzb.zza(paramParcel, 5, bool);
    localObject = paramParcelableEvent.zzauL;
    zzb.zza(paramParcel, 6, (String)localObject, false);
    localObject = paramParcelableEvent.zzauV;
    zzb.zza(paramParcel, 7, (String)localObject, false);
    localObject = paramParcelableEvent.zzauW;
    zzb.zza(paramParcel, 8, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzauX;
    zzb.zza(paramParcel, 9, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzauY;
    zzb.zza(paramParcel, 10, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzauZ;
    zzb.zza(paramParcel, 11, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzava;
    zzb.zza(paramParcel, 12, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzavb;
    zzb.zza(paramParcel, 13, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzavc;
    zzb.zza(paramParcel, 14, (Parcelable)localObject, paramInt, false);
    localObject = paramParcelableEvent.zzavd;
    zzb.zza(paramParcel, 15, (Parcelable)localObject, paramInt, false);
    bool = paramParcelableEvent.zzauU;
    zzb.zza(paramParcel, 17, bool);
    bool = paramParcelableEvent.zzauT;
    zzb.zza(paramParcel, 16, bool);
    localObject = paramParcelableEvent.zzave;
    zzb.zza(paramParcel, 18, (Parcelable)localObject, paramInt, false);
    zzb.zzI(paramParcel, i);
  }
  
  public ParcelableEvent zzcE(Parcel paramParcel)
  {
    int i = zza.zzau(paramParcel);
    int j = 0;
    Object localObject1 = null;
    String str1 = null;
    String str2 = null;
    ArrayList localArrayList = null;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    String str3 = null;
    String str4 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject9 = null;
    Object localObject10 = null;
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
        j = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 3: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 4: 
        localArrayList = zza.zzD(paramParcel, k);
        break;
      case 5: 
        bool1 = zza.zzc(paramParcel, k);
        break;
      case 6: 
        str3 = zza.zzp(paramParcel, k);
        break;
      case 7: 
        str4 = zza.zzp(paramParcel, k);
        break;
      case 8: 
        localObject2 = TextInsertedDetails.CREATOR;
        localObject11 = (TextInsertedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject2);
        localObject2 = localObject11;
        break;
      case 9: 
        localObject3 = TextDeletedDetails.CREATOR;
        localObject11 = (TextDeletedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject3);
        localObject3 = localObject11;
        break;
      case 10: 
        localObject4 = ValuesAddedDetails.CREATOR;
        localObject11 = (ValuesAddedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject4);
        localObject4 = localObject11;
        break;
      case 11: 
        localObject5 = ValuesRemovedDetails.CREATOR;
        localObject11 = (ValuesRemovedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject5);
        localObject5 = localObject11;
        break;
      case 12: 
        localObject6 = ValuesSetDetails.CREATOR;
        localObject11 = (ValuesSetDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject6);
        localObject6 = localObject11;
        break;
      case 13: 
        localObject7 = ValueChangedDetails.CREATOR;
        localObject11 = (ValueChangedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject7);
        localObject7 = localObject11;
        break;
      case 14: 
        localObject8 = ReferenceShiftedDetails.CREATOR;
        localObject11 = (ReferenceShiftedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject8);
        localObject8 = localObject11;
        break;
      case 15: 
        localObject9 = ObjectChangedDetails.CREATOR;
        localObject11 = (ObjectChangedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject9);
        localObject9 = localObject11;
        break;
      case 17: 
        bool3 = zza.zzc(paramParcel, k);
        break;
      case 16: 
        bool2 = zza.zzc(paramParcel, k);
        break;
      case 18: 
        localObject10 = FieldChangedDetails.CREATOR;
        localObject11 = (FieldChangedDetails)zza.zza(paramParcel, k, (Parcelable.Creator)localObject10);
        localObject10 = localObject11;
      }
    }
    int k = paramParcel.dataPosition();
    if (k != i)
    {
      localObject11 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = "Overread allowed size end=" + i;
      ((zza.zza)localObject11).<init>((String)localObject1, paramParcel);
      throw ((Throwable)localObject11);
    }
    Object localObject11 = new com/google/android/gms/drive/realtime/internal/event/ParcelableEvent;
    ((ParcelableEvent)localObject11).<init>(j, str1, str2, localArrayList, bool1, bool2, bool3, str3, str4, (TextInsertedDetails)localObject2, (TextDeletedDetails)localObject3, (ValuesAddedDetails)localObject4, (ValuesRemovedDetails)localObject5, (ValuesSetDetails)localObject6, (ValueChangedDetails)localObject7, (ReferenceShiftedDetails)localObject8, (ObjectChangedDetails)localObject9, (FieldChangedDetails)localObject10);
    return (ParcelableEvent)localObject11;
  }
  
  public ParcelableEvent[] zzeA(int paramInt)
  {
    return new ParcelableEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */