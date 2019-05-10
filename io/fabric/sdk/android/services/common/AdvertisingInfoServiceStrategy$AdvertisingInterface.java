package io.fabric.sdk.android.services.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;

final class AdvertisingInfoServiceStrategy$AdvertisingInterface
  implements IInterface
{
  public static final String ADVERTISING_ID_SERVICE_INTERFACE_TOKEN = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
  private static final int AD_TRANSACTION_CODE_ID = 1;
  private static final int AD_TRANSACTION_CODE_LIMIT_AD_TRACKING = 2;
  private static final int FLAGS_NONE;
  private final IBinder binder;
  
  public AdvertisingInfoServiceStrategy$AdvertisingInterface(IBinder paramIBinder)
  {
    this.binder = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.binder;
  }
  
  public String getId()
  {
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    String str1 = null;
    Object localObject2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    try
    {
      localParcel1.writeInterfaceToken((String)localObject2);
      localObject2 = this.binder;
      int i = 1;
      str2 = null;
      ((IBinder)localObject2).transact(i, localParcel1, localParcel2, 0);
      localParcel2.readException();
      str1 = localParcel2.readString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Logger localLogger = Fabric.getLogger();
        String str3 = "Fabric";
        String str2 = "Could not get parcel from Google Play Service to capture AdvertisingId";
        localLogger.d(str3, str2);
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
    return str1;
  }
  
  public boolean isLimitAdTrackingEnabled()
  {
    bool = true;
    localParcel1 = Parcel.obtain();
    localParcel2 = Parcel.obtain();
    localObject1 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        int i = 1;
        localParcel1.writeInt(i);
        localObject1 = this.binder;
        int j = 2;
        ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
        localParcel2.readException();
        i = localParcel2.readInt();
        if (i == 0) {
          continue;
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        Logger localLogger = Fabric.getLogger();
        localObject1 = "Fabric";
        String str = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking";
        localLogger.d((String)localObject1, str);
        localParcel2.recycle();
        localParcel1.recycle();
        bool = false;
        localLogger = null;
        continue;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      return bool;
      bool = false;
      localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoServiceStrategy$AdvertisingInterface.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */