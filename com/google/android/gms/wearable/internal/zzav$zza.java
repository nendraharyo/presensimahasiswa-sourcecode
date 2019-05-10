package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zze;

public abstract class zzav$zza
  extends Binder
  implements zzav
{
  public zzav$zza()
  {
    attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
  }
  
  public static zzav zzes(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzav)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzav;
        if (bool)
        {
          localObject = (zzav)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/wearable/internal/zzav$zza$zza;
      ((zzav.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetConfigResponse)GetConfigResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConfigResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetConfigsResponse)GetConfigsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConfigsResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetCloudSyncOptInOutDoneResponse)GetCloudSyncOptInOutDoneResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncOptInOutDoneResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetCloudSyncSettingResponse)GetCloudSyncSettingResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncSettingResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetCloudSyncOptInStatusResponse)GetCloudSyncOptInStatusResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCloudSyncOptInStatusResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (PutDataResponse)PutDataResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((PutDataResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetDataItemResponse)GetDataItemResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetDataItemResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = DataHolder.CREATOR.zzak(paramParcel1);
      }
      zzah((DataHolder)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (DeleteDataItemsResponse)DeleteDataItemsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DeleteDataItemsResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (SendMessageResponse)SendMessageResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((SendMessageResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetFdForAssetResponse)GetFdForAssetResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetFdForAssetResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetLocalNodeResponse)GetLocalNodeResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetLocalNodeResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetConnectedNodesResponse)GetConnectedNodesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetConnectedNodesResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (OpenChannelResponse)OpenChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OpenChannelResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((CloseChannelResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (CloseChannelResponse)CloseChannelResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zzb((CloseChannelResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetChannelInputStreamResponse)GetChannelInputStreamResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetChannelInputStreamResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetChannelOutputStreamResponse)GetChannelOutputStreamResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetChannelOutputStreamResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ChannelReceiveFileResponse)ChannelReceiveFileResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChannelReceiveFileResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ChannelSendFileResponse)ChannelSendFileResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChannelSendFileResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      zza((Status)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (StorageInfoResponse)StorageInfoResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StorageInfoResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetCapabilityResponse)GetCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetCapabilityResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (GetAllCapabilitiesResponse)GetAllCapabilitiesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetAllCapabilitiesResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (AddLocalCapabilityResponse)AddLocalCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((AddLocalCapabilityResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.wearable.internal.IWearableCallbacks";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (RemoveLocalCapabilityResponse)RemoveLocalCapabilityResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((RemoveLocalCapabilityResponse)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzav$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */