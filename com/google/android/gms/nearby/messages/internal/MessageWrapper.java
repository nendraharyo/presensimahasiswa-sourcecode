package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.nearby.messages.Message;

public class MessageWrapper
  implements SafeParcelable
{
  public static final zzl CREATOR;
  final int mVersionCode;
  public final Message zzbcu;
  
  static
  {
    zzl localzzl = new com/google/android/gms/nearby/messages/internal/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  MessageWrapper(int paramInt, Message paramMessage)
  {
    this.mVersionCode = paramInt;
    Message localMessage = (Message)zzx.zzz(paramMessage);
    this.zzbcu = localMessage;
  }
  
  public static final MessageWrapper zzb(Message paramMessage)
  {
    MessageWrapper localMessageWrapper = new com/google/android/gms/nearby/messages/internal/MessageWrapper;
    localMessageWrapper.<init>(1, paramMessage);
    return localMessageWrapper;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = paramObject instanceof MessageWrapper;
      Message localMessage1;
      if (!bool)
      {
        bool = false;
        localMessage1 = null;
      }
      else
      {
        paramObject = (MessageWrapper)paramObject;
        localMessage1 = this.zzbcu;
        Message localMessage2 = ((MessageWrapper)paramObject).zzbcu;
        bool = zzw.equal(localMessage1, localMessage2);
      }
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Message localMessage = this.zzbcu;
    arrayOfObject[0] = localMessage;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\MessageWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */