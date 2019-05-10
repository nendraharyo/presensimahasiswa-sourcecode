package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.TransferStateEvent;

public class OnEventResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final int zzanf;
  final ChangeEvent zzasl;
  final CompletionEvent zzasm;
  final QueryResultEventParcelable zzasn;
  final ChangesAvailableEvent zzaso;
  final TransferStateEvent zzasp;
  final TransferProgressEvent zzasq;
  
  static
  {
    zzba localzzba = new com/google/android/gms/drive/internal/zzba;
    localzzba.<init>();
    CREATOR = localzzba;
  }
  
  OnEventResponse(int paramInt1, int paramInt2, ChangeEvent paramChangeEvent, CompletionEvent paramCompletionEvent, QueryResultEventParcelable paramQueryResultEventParcelable, ChangesAvailableEvent paramChangesAvailableEvent, TransferStateEvent paramTransferStateEvent, TransferProgressEvent paramTransferProgressEvent)
  {
    this.mVersionCode = paramInt1;
    this.zzanf = paramInt2;
    this.zzasl = paramChangeEvent;
    this.zzasm = paramCompletionEvent;
    this.zzasn = paramQueryResultEventParcelable;
    this.zzaso = paramChangesAvailableEvent;
    this.zzasp = paramTransferStateEvent;
    this.zzasq = paramTransferProgressEvent;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzba.zza(this, paramParcel, paramInt);
  }
  
  public DriveEvent zzts()
  {
    int i = this.zzanf;
    Object localObject1;
    switch (i)
    {
    case 5: 
    case 6: 
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unexpected event type ");
      int j = this.zzanf;
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 1: 
      localObject1 = this.zzasl;
    }
    for (;;)
    {
      return (DriveEvent)localObject1;
      localObject1 = this.zzasm;
      continue;
      localObject1 = this.zzasn;
      continue;
      localObject1 = this.zzaso;
      continue;
      localObject1 = this.zzasp;
      continue;
      localObject1 = this.zzasq;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\OnEventResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */