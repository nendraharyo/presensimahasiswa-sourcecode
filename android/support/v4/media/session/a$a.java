package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.util.List;

public abstract class a$a
  extends Binder
  implements a
{
  public a$a()
  {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }
  
  public static a a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (a)localObject;
      localObject = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof a;
        if (bool)
        {
          localObject = (a)localObject;
          continue;
        }
      }
      localObject = new android/support/v4/media/session/a$a$a;
      ((a.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    String str = null;
    int j = 0;
    Object localObject = null;
    int m = 1;
    switch (paramInt1)
    {
    default: 
      m = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return m;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      str = paramParcel1.readString();
      int n = paramParcel1.readInt();
      if (n != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a(str, (Bundle)localObject);
      continue;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      a();
      continue;
      str = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (PlaybackStateCompat)PlaybackStateCompat.CREATOR.createFromParcel(paramParcel1);
      }
      a((PlaybackStateCompat)localObject);
      continue;
      str = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (MediaMetadataCompat)MediaMetadataCompat.CREATOR.createFromParcel(paramParcel1);
      }
      a((MediaMetadataCompat)localObject);
      continue;
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
      localObject = MediaSessionCompat.QueueItem.CREATOR;
      localObject = paramParcel1.createTypedArrayList((Parcelable.Creator)localObject);
      a((List)localObject);
      continue;
      str = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel1);
      }
      a((CharSequence)localObject);
      continue;
      str = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
      }
      a((Bundle)localObject);
      continue;
      str = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ParcelableVolumeInfo)ParcelableVolumeInfo.CREATOR.createFromParcel(paramParcel1);
      }
      a((ParcelableVolumeInfo)localObject);
      continue;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      a(j);
      continue;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      if (j != 0) {
        j = m;
      }
      for (;;)
      {
        a(j);
        break;
        k = 0;
        localObject = null;
      }
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      int k = paramParcel1.readInt();
      if (k != 0) {
        i = m;
      }
      b(i);
      continue;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      k = paramParcel1.readInt();
      b(k);
      continue;
      localObject = "android.support.v4.media.session.IMediaControllerCallback";
      paramParcel1.enforceInterface((String)localObject);
      b();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */