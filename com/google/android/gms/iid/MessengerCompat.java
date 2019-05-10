package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MessengerCompat
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  Messenger zzaNd;
  zzb zzaNe;
  
  static
  {
    MessengerCompat.1 local1 = new com/google/android/gms/iid/MessengerCompat$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public MessengerCompat(Handler paramHandler)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/os/Messenger;
      ((Messenger)localObject).<init>(paramHandler);
      this.zzaNd = ((Messenger)localObject);
    }
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/iid/MessengerCompat$zza;
      ((MessengerCompat.zza)localObject).<init>(this, paramHandler);
      this.zzaNe = ((zzb)localObject);
    }
  }
  
  public MessengerCompat(IBinder paramIBinder)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/os/Messenger;
      ((Messenger)localObject).<init>(paramIBinder);
      this.zzaNd = ((Messenger)localObject);
    }
    for (;;)
    {
      return;
      localObject = zzb.zza.zzcd(paramIBinder);
      this.zzaNe = ((zzb)localObject);
    }
  }
  
  public static int zzc(Message paramMessage)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {}
    for (i = zzd(paramMessage);; i = paramMessage.arg2) {
      return i;
    }
  }
  
  private static int zzd(Message paramMessage)
  {
    return paramMessage.sendingUid;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    if (paramObject == null) {}
    for (;;)
    {
      return bool;
      try
      {
        IBinder localIBinder1 = getBinder();
        paramObject = (MessengerCompat)paramObject;
        IBinder localIBinder2 = ((MessengerCompat)paramObject).getBinder();
        bool = localIBinder1.equals(localIBinder2);
      }
      catch (ClassCastException localClassCastException) {}
    }
  }
  
  public IBinder getBinder()
  {
    Object localObject = this.zzaNd;
    if (localObject != null) {}
    for (localObject = this.zzaNd.getBinder();; localObject = this.zzaNe.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public int hashCode()
  {
    return getBinder().hashCode();
  }
  
  public void send(Message paramMessage)
  {
    Object localObject = this.zzaNd;
    if (localObject != null)
    {
      localObject = this.zzaNd;
      ((Messenger)localObject).send(paramMessage);
    }
    for (;;)
    {
      return;
      localObject = this.zzaNe;
      ((zzb)localObject).send(paramMessage);
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject = this.zzaNd;
    if (localObject != null)
    {
      localObject = this.zzaNd.getBinder();
      paramParcel.writeStrongBinder((IBinder)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.zzaNe.asBinder();
      paramParcel.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\iid\MessengerCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */