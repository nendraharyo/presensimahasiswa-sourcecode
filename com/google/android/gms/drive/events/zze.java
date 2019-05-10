package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.List;

public class zze
  implements Parcelable.Creator
{
  static void zza(CompletionEvent paramCompletionEvent, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    int j = paramCompletionEvent.mVersionCode;
    zzb.zzc(paramParcel, 1, j);
    Object localObject = paramCompletionEvent.zzaoz;
    zzb.zza(paramParcel, 2, (Parcelable)localObject, paramInt, false);
    localObject = paramCompletionEvent.zzVa;
    zzb.zza(paramParcel, 3, (String)localObject, false);
    localObject = paramCompletionEvent.zzapD;
    zzb.zza(paramParcel, 4, (Parcelable)localObject, paramInt, false);
    localObject = paramCompletionEvent.zzapE;
    zzb.zza(paramParcel, 5, (Parcelable)localObject, paramInt, false);
    localObject = paramCompletionEvent.zzapF;
    zzb.zza(paramParcel, 6, (Parcelable)localObject, paramInt, false);
    localObject = paramCompletionEvent.zzapG;
    zzb.zzb(paramParcel, 7, (List)localObject, false);
    j = paramCompletionEvent.zzBc;
    zzb.zzc(paramParcel, 8, j);
    localObject = paramCompletionEvent.zzapH;
    zzb.zza(paramParcel, 9, (IBinder)localObject, false);
    zzb.zzI(paramParcel, i);
  }
  
  public CompletionEvent zzaS(Parcel paramParcel)
  {
    int i = 0;
    IBinder localIBinder = null;
    int j = zza.zzau(paramParcel);
    ArrayList localArrayList = null;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    String str = null;
    Object localObject4 = null;
    int k = 0;
    Object localObject5 = null;
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
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        k = zza.zzg(paramParcel, m);
        break;
      case 2: 
        localObject4 = DriveId.CREATOR;
        localObject6 = (DriveId)zza.zza(paramParcel, m, (Parcelable.Creator)localObject4);
        localObject4 = localObject6;
        break;
      case 3: 
        str = zza.zzp(paramParcel, m);
        break;
      case 4: 
        localObject3 = ParcelFileDescriptor.CREATOR;
        localObject6 = (ParcelFileDescriptor)zza.zza(paramParcel, m, (Parcelable.Creator)localObject3);
        localObject3 = localObject6;
        break;
      case 5: 
        localObject2 = ParcelFileDescriptor.CREATOR;
        localObject6 = (ParcelFileDescriptor)zza.zza(paramParcel, m, (Parcelable.Creator)localObject2);
        localObject2 = localObject6;
        break;
      case 6: 
        localObject1 = MetadataBundle.CREATOR;
        localObject6 = (MetadataBundle)zza.zza(paramParcel, m, (Parcelable.Creator)localObject1);
        localObject1 = localObject6;
        break;
      case 7: 
        localArrayList = zza.zzD(paramParcel, m);
        break;
      case 8: 
        i = zza.zzg(paramParcel, m);
        break;
      case 9: 
        localIBinder = zza.zzq(paramParcel, m);
      }
    }
    int m = paramParcel.dataPosition();
    if (m != j)
    {
      localObject6 = new com/google/android/gms/common/internal/safeparcel/zza$zza;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject5 = "Overread allowed size end=" + j;
      ((zza.zza)localObject6).<init>((String)localObject5, paramParcel);
      throw ((Throwable)localObject6);
    }
    Object localObject6 = new com/google/android/gms/drive/events/CompletionEvent;
    ((CompletionEvent)localObject6).<init>(k, (DriveId)localObject4, str, (ParcelFileDescriptor)localObject3, (ParcelFileDescriptor)localObject2, (MetadataBundle)localObject1, localArrayList, i, localIBinder);
    return (CompletionEvent)localObject6;
  }
  
  public CompletionEvent[] zzcH(int paramInt)
  {
    return new CompletionEvent[paramInt];
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */