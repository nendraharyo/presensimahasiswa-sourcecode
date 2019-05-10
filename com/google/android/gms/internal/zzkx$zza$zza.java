package com.google.android.gms.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.consent.GetConsentIntentRequest;

class zzkx$zza$zza
  implements zzkx
{
  private IBinder zzoz;
  
  zzkx$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public Intent zza(GetConsentIntentRequest paramGetConsentIntentRequest)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.auth.api.consent.internal.IConsentService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramGetConsentIntentRequest != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramGetConsentIntentRequest.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localObject1 = this.zzoz;
          int j = 1;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          i = localParcel2.readInt();
          if (i == 0) {
            break;
          }
          localObject1 = Intent.CREATOR;
          localObject1 = ((Parcelable.Creator)localObject1).createFromParcel(localParcel2);
          localObject1 = (Intent)localObject1;
          return (Intent)localObject1;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkx$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */