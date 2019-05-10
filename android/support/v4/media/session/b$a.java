package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

public abstract class b$a
  extends Binder
  implements b
{
  public static b a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (b)localObject;
      localObject = paramIBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      if (localObject != null)
      {
        boolean bool = localObject instanceof b;
        if (bool)
        {
          localObject = (b)localObject;
          continue;
        }
      }
      localObject = new android/support/v4/media/session/b$a$a;
      ((b.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    Object localObject1 = null;
    String str1 = null;
    int j = 1;
    switch (paramInt1)
    {
    default: 
      j = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 27: 
    case 28: 
    case 29: 
    case 30: 
    case 31: 
    case 32: 
    case 45: 
    case 37: 
    case 38: 
    case 47: 
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 33: 
    case 34: 
    case 35: 
    case 36: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    case 25: 
    case 51: 
    case 46: 
    case 39: 
    case 40: 
    case 48: 
      for (;;)
      {
        return j;
        localObject2 = "android.support.v4.media.session.IMediaSession";
        paramParcel2.writeString((String)localObject2);
        continue;
        localObject2 = "android.support.v4.media.session.IMediaSession";
        paramParcel1.enforceInterface((String)localObject2);
        String str2 = paramParcel1.readString();
        int k = paramParcel1.readInt();
        if (k != 0)
        {
          localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);
          localObject1 = localObject2;
          label496:
          k = paramParcel1.readInt();
          if (k == 0) {
            break label547;
          }
        }
        for (localObject2 = (MediaSessionCompat.ResultReceiverWrapper)MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
        {
          a(str2, (Bundle)localObject1, (MediaSessionCompat.ResultReceiverWrapper)localObject2);
          paramParcel2.writeNoException();
          break;
          i = 0;
          localObject1 = null;
          break label496;
          label547:
          k = 0;
        }
        localObject2 = "android.support.v4.media.session.IMediaSession";
        paramParcel1.enforceInterface((String)localObject2);
        k = paramParcel1.readInt();
        label591:
        int m;
        if (k != 0)
        {
          localObject2 = (KeyEvent)KeyEvent.CREATOR.createFromParcel(paramParcel1);
          m = a((KeyEvent)localObject2);
          paramParcel2.writeNoException();
          if (m == 0) {
            break label630;
          }
          m = j;
        }
        for (;;)
        {
          paramParcel2.writeInt(m);
          break;
          bool1 = false;
          localObject2 = null;
          break label591;
          label630:
          bool1 = false;
          localObject2 = null;
        }
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject2 = a.a.a(paramParcel1.readStrongBinder());
        a((a)localObject2);
        paramParcel2.writeNoException();
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject2 = a.a.a(paramParcel1.readStrongBinder());
        b((a)localObject2);
        paramParcel2.writeNoException();
        continue;
        localObject2 = "android.support.v4.media.session.IMediaSession";
        paramParcel1.enforceInterface((String)localObject2);
        boolean bool1 = a();
        paramParcel2.writeNoException();
        if (bool1) {
          i = j;
        }
        paramParcel2.writeInt(i);
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject2 = b();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject2 = c();
        paramParcel2.writeNoException();
        paramParcel2.writeString((String)localObject2);
        continue;
        paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
        localObject2 = d();
        paramParcel2.writeNoException();
        if (localObject2 != null)
        {
          paramParcel2.writeInt(j);
          ((PendingIntent)localObject2).writeToParcel(paramParcel2, j);
        }
        else
        {
          paramParcel2.writeInt(0);
          continue;
          localObject2 = "android.support.v4.media.session.IMediaSession";
          paramParcel1.enforceInterface((String)localObject2);
          long l = e();
          paramParcel2.writeNoException();
          paramParcel2.writeLong(l);
          continue;
          paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
          localObject2 = f();
          paramParcel2.writeNoException();
          if (localObject2 != null)
          {
            paramParcel2.writeInt(j);
            ((ParcelableVolumeInfo)localObject2).writeToParcel(paramParcel2, j);
          }
          else
          {
            paramParcel2.writeInt(0);
            continue;
            localObject2 = "android.support.v4.media.session.IMediaSession";
            paramParcel1.enforceInterface((String)localObject2);
            int n = paramParcel1.readInt();
            i = paramParcel1.readInt();
            str1 = paramParcel1.readString();
            a(n, i, str1);
            paramParcel2.writeNoException();
            continue;
            localObject2 = "android.support.v4.media.session.IMediaSession";
            paramParcel1.enforceInterface((String)localObject2);
            n = paramParcel1.readInt();
            i = paramParcel1.readInt();
            str1 = paramParcel1.readString();
            b(n, i, str1);
            paramParcel2.writeNoException();
            continue;
            paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
            localObject2 = g();
            paramParcel2.writeNoException();
            if (localObject2 != null)
            {
              paramParcel2.writeInt(j);
              ((MediaMetadataCompat)localObject2).writeToParcel(paramParcel2, j);
            }
            else
            {
              paramParcel2.writeInt(0);
              continue;
              paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
              localObject2 = h();
              paramParcel2.writeNoException();
              if (localObject2 != null)
              {
                paramParcel2.writeInt(j);
                ((PlaybackStateCompat)localObject2).writeToParcel(paramParcel2, j);
              }
              else
              {
                paramParcel2.writeInt(0);
                continue;
                paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                localObject2 = i();
                paramParcel2.writeNoException();
                paramParcel2.writeTypedList((List)localObject2);
                continue;
                paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                localObject2 = j();
                paramParcel2.writeNoException();
                if (localObject2 != null)
                {
                  paramParcel2.writeInt(j);
                  TextUtils.writeToParcel((CharSequence)localObject2, paramParcel2, j);
                }
                else
                {
                  paramParcel2.writeInt(0);
                  continue;
                  paramParcel1.enforceInterface("android.support.v4.media.session.IMediaSession");
                  localObject2 = k();
                  paramParcel2.writeNoException();
                  if (localObject2 != null)
                  {
                    paramParcel2.writeInt(j);
                    ((Bundle)localObject2).writeToParcel(paramParcel2, j);
                  }
                  else
                  {
                    paramParcel2.writeInt(0);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    n = l();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(n);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    boolean bool2 = m();
                    paramParcel2.writeNoException();
                    if (bool2) {
                      i = j;
                    }
                    paramParcel2.writeInt(i);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    int i1 = n();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(i1);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    boolean bool3 = o();
                    paramParcel2.writeNoException();
                    if (bool3) {
                      i = j;
                    }
                    paramParcel2.writeInt(i);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = p();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(i2);
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      a((MediaDescriptionCompat)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      i = paramParcel1.readInt();
                      a((MediaDescriptionCompat)localObject2, i);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      b((MediaDescriptionCompat)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    a(i2);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    q();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    localObject1 = paramParcel1.readString();
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      a((String)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    localObject1 = paramParcel1.readString();
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      b((String)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0)
                    {
                      localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                      localObject1 = localObject2;
                      label1764:
                      i2 = paramParcel1.readInt();
                      if (i2 == 0) {
                        break label1813;
                      }
                    }
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      a((Uri)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i = 0;
                      localObject1 = null;
                      break label1764;
                      label1813:
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    r();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    localObject1 = paramParcel1.readString();
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      c((String)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    localObject1 = paramParcel1.readString();
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      d((String)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0)
                    {
                      localObject2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
                      localObject1 = localObject2;
                      label2012:
                      i2 = paramParcel1.readInt();
                      if (i2 == 0) {
                        break label2061;
                      }
                    }
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      b((Uri)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i = 0;
                      localObject1 = null;
                      break label2012;
                      label2061:
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    l = paramParcel1.readLong();
                    a(l);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    s();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    t();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    u();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    v();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    w();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    x();
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    l = paramParcel1.readLong();
                    b(l);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {}
                    for (localObject2 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      a((RatingCompat)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0)
                    {
                      localObject2 = (RatingCompat)RatingCompat.CREATOR.createFromParcel(paramParcel1);
                      localObject1 = localObject2;
                      label2350:
                      i2 = paramParcel1.readInt();
                      if (i2 == 0) {
                        break label2399;
                      }
                    }
                    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
                    {
                      a((RatingCompat)localObject1, (Bundle)localObject2);
                      paramParcel2.writeNoException();
                      break;
                      i = 0;
                      localObject1 = null;
                      break label2350;
                      label2399:
                      i2 = 0;
                    }
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {
                      i = j;
                    }
                    a(i);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    b(i2);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    if (i2 != 0) {
                      i = j;
                    }
                    b(i);
                    paramParcel2.writeNoException();
                    continue;
                    localObject2 = "android.support.v4.media.session.IMediaSession";
                    paramParcel1.enforceInterface((String)localObject2);
                    i2 = paramParcel1.readInt();
                    c(i2);
                    paramParcel2.writeNoException();
                  }
                }
              }
            }
          }
        }
      }
    }
    Object localObject2 = "android.support.v4.media.session.IMediaSession";
    paramParcel1.enforceInterface((String)localObject2);
    localObject1 = paramParcel1.readString();
    int i2 = paramParcel1.readInt();
    if (i2 != 0) {}
    for (localObject2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
    {
      e((String)localObject1, (Bundle)localObject2);
      paramParcel2.writeNoException();
      break;
      i2 = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */