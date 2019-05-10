package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class b$a
  extends Binder
  implements b
{
  public b$a()
  {
    attachInterface(this, "android.support.v4.os.IResultReceiver");
  }
  
  public static b a(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (b)localObject;
      localObject = paramIBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
      if (localObject != null)
      {
        boolean bool = localObject instanceof b;
        if (bool)
        {
          localObject = (b)localObject;
          continue;
        }
      }
      localObject = new android/support/v4/os/b$a$a;
      ((b.a.a)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "android.support.v4.os.IResultReceiver";
        paramParcel2.writeString((String)localObject);
      }
    }
    Object localObject = "android.support.v4.os.IResultReceiver";
    paramParcel1.enforceInterface((String)localObject);
    int k = paramParcel1.readInt();
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1);; localObject = null)
    {
      a(k, (Bundle)localObject);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\b$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */