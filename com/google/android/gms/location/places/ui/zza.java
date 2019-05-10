package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.location.places.internal.zzl;

abstract class zza
{
  public static final int RESULT_ERROR = 2;
  
  public static Place getPlace(Context paramContext, Intent paramIntent)
  {
    zzx.zzb(paramIntent, "intent must not be null");
    zzx.zzb(paramContext, "context must not be null");
    zzl localzzl = PlaceImpl.CREATOR;
    return (Place)zzc.zza(paramIntent, "selected_place", localzzl);
  }
  
  public static Status getStatus(Context paramContext, Intent paramIntent)
  {
    zzx.zzb(paramIntent, "intent must not be null");
    zzx.zzb(paramContext, "context must not be null");
    Parcelable.Creator localCreator = Status.CREATOR;
    return (Status)zzc.zza(paramIntent, "status", localCreator);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\place\\ui\zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */