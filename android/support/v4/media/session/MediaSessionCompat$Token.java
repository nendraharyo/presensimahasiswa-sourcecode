package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class MediaSessionCompat$Token
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private final Object a;
  private final b b;
  
  static
  {
    MediaSessionCompat.Token.1 local1 = new android/support/v4/media/session/MediaSessionCompat$Token$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  MediaSessionCompat$Token(Object paramObject)
  {
    this(paramObject, null);
  }
  
  MediaSessionCompat$Token(Object paramObject, b paramb)
  {
    this.a = paramObject;
    this.b = paramb;
  }
  
  public Object a()
  {
    return this.a;
  }
  
  public b b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    Object localObject1 = null;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof Token;
      Object localObject2;
      if (!bool2)
      {
        bool1 = false;
        localObject2 = null;
      }
      else
      {
        paramObject = (Token)paramObject;
        Object localObject3 = this.a;
        if (localObject3 == null)
        {
          localObject3 = ((Token)paramObject).a;
          if (localObject3 != null)
          {
            bool1 = false;
            localObject2 = null;
          }
        }
        else
        {
          localObject2 = ((Token)paramObject).a;
          if (localObject2 == null)
          {
            bool1 = false;
            localObject2 = null;
          }
          else
          {
            localObject2 = this.a;
            localObject1 = ((Token)paramObject).a;
            bool1 = localObject2.equals(localObject1);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      localObject = this.a;
      i = localObject.hashCode();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = (Parcelable)this.a;
      paramParcel.writeParcelable((Parcelable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = (IBinder)this.a;
      paramParcel.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\session\MediaSessionCompat$Token.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */