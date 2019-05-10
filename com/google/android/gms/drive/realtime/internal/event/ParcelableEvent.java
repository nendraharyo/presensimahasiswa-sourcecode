package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class ParcelableEvent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final String zzLq;
  final String zzauL;
  final List zzauR;
  final boolean zzauS;
  final boolean zzauT;
  final boolean zzauU;
  final String zzauV;
  final TextInsertedDetails zzauW;
  final TextDeletedDetails zzauX;
  final ValuesAddedDetails zzauY;
  final ValuesRemovedDetails zzauZ;
  final ValuesSetDetails zzava;
  final ValueChangedDetails zzavb;
  final ReferenceShiftedDetails zzavc;
  final ObjectChangedDetails zzavd;
  final FieldChangedDetails zzave;
  final String zzrG;
  
  static
  {
    zzc localzzc = new com/google/android/gms/drive/realtime/internal/event/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  ParcelableEvent(int paramInt, String paramString1, String paramString2, List paramList, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3, String paramString4, TextInsertedDetails paramTextInsertedDetails, TextDeletedDetails paramTextDeletedDetails, ValuesAddedDetails paramValuesAddedDetails, ValuesRemovedDetails paramValuesRemovedDetails, ValuesSetDetails paramValuesSetDetails, ValueChangedDetails paramValueChangedDetails, ReferenceShiftedDetails paramReferenceShiftedDetails, ObjectChangedDetails paramObjectChangedDetails, FieldChangedDetails paramFieldChangedDetails)
  {
    this.mVersionCode = paramInt;
    this.zzLq = paramString1;
    this.zzrG = paramString2;
    this.zzauR = paramList;
    this.zzauS = paramBoolean1;
    this.zzauT = paramBoolean2;
    this.zzauU = paramBoolean3;
    this.zzauL = paramString3;
    this.zzauV = paramString4;
    this.zzauW = paramTextInsertedDetails;
    this.zzauX = paramTextDeletedDetails;
    this.zzauY = paramValuesAddedDetails;
    this.zzauZ = paramValuesRemovedDetails;
    this.zzava = paramValuesSetDetails;
    this.zzavb = paramValueChangedDetails;
    this.zzavc = paramReferenceShiftedDetails;
    this.zzavd = paramObjectChangedDetails;
    this.zzave = paramFieldChangedDetails;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\realtime\internal\event\ParcelableEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */