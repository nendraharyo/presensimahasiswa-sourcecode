package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.zzm;
import com.google.android.gms.drive.realtime.internal.zzm.zza;

public abstract class zzan$zza
  extends Binder
  implements zzan
{
  public zzan$zza()
  {
    attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
  }
  
  public static zzan zzbb(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzan)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzan;
        if (bool)
        {
          localObject = (zzan)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/internal/zzan$zza$zza;
      ((zzan.zza.zza)localObject).<init>(paramIBinder);
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
    int k = 1;
    switch (paramInt1)
    {
    default: 
      k = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return k;
      localObject1 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel2.writeString((String)localObject1);
      continue;
      Object localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      int m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDownloadProgressResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnListEntriesResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDriveIdResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnMetadataResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnContentsResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);
      }
      onError((Status)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      onSuccess();
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnListParentsResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnSyncMoreResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zzm.zza.zzbo(paramParcel1.readStrongBinder());
      zza((OnLoadRealtimeResponse)localObject1, (zzm)localObject2);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnResourceIdSetResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnPinnedDownloadPreferencesResponse)OnPinnedDownloadPreferencesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnPinnedDownloadPreferencesResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnDeviceUsagePreferenceResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject1 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject1);
      i = paramParcel1.readInt();
      if (i != 0) {
        i = k;
      }
      for (;;)
      {
        zzaf(i);
        paramParcel2.writeNoException();
        break;
        int j = 0;
        localObject1 = null;
      }
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnFetchThumbnailResponse)OnFetchThumbnailResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnFetchThumbnailResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (ChangeSequenceNumber)ChangeSequenceNumber.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ChangeSequenceNumber)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnChangesResponse)OnChangesResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnChangesResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (GetPermissionsResponse)GetPermissionsResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((GetPermissionsResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (StringListResponse)StringListResponse.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StringListResponse)localObject1);
      paramParcel2.writeNoException();
      continue;
      localObject2 = "com.google.android.gms.drive.internal.IDriveServiceCallbacks";
      paramParcel1.enforceInterface((String)localObject2);
      m = paramParcel1.readInt();
      if (m != 0) {
        localObject1 = (OnStartStreamSession)OnStartStreamSession.CREATOR.createFromParcel(paramParcel1);
      }
      zza((OnStartStreamSession)localObject1);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzan$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */