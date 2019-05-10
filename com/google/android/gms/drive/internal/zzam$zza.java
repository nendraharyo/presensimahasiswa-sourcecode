package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public abstract class zzam$zza
  extends Binder
  implements zzam
{
  public static zzam zzba(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzam)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzam;
        if (bool)
        {
          localObject = (zzam)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/drive/internal/zzam$zza$zza;
      ((zzam.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    boolean bool = false;
    Object localObject2 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject2 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel2.writeString((String)localObject2);
      bool = i;
      continue;
      Object localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (GetMetadataRequest)GetMetadataRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((GetMetadataRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((QueryRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((UpdateMetadataRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CreateContentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CreateFileRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CreateFolderRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      localObject2 = zza((OpenContentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(i);
        ((DriveServiceResponse)localObject2).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        paramParcel2.writeInt(0);
      }
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CloseContentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (OpenFileIntentSenderRequest)OpenFileIntentSenderRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zza((OpenFileIntentSenderRequest)localObject2);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(i);
        ((IntentSender)localObject2).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        paramParcel2.writeInt(0);
      }
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CreateFileIntentSenderRequest)CreateFileIntentSenderRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject2 = zza((CreateFileIntentSenderRequest)localObject2);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(i);
        ((IntentSender)localObject2).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        paramParcel2.writeInt(0);
      }
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (AuthorizeAccessRequest)AuthorizeAccessRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((AuthorizeAccessRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((ListParentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzao.zza.zzbc(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      zzan localzzan = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((AddEventListenerRequest)localObject2, (zzao)localObject3, (String)localObject1, localzzan);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzao.zza.zzbc(paramParcel1.readStrongBinder());
      localObject1 = paramParcel1.readString();
      localzzan = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((RemoveEventListenerRequest)localObject2, (zzao)localObject3, (String)localObject1, localzzan);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (DisconnectRequest)DisconnectRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((DisconnectRequest)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (TrashResourceRequest)TrashResourceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((TrashResourceRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CloseContentsAndUpdateMetadataRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzb((QueryRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((DeleteResourceRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((LoadRealtimeRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((SetResourceParentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((GetDriveIdFromUniqueIdentifierRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CheckResourceIdsExistRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzb((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzc((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (SetPinnedDownloadPreferencesRequest)SetPinnedDownloadPreferencesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((SetPinnedDownloadPreferencesRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((RealtimeDocumentSyncRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzd((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (SetFileUploadPreferencesRequest)SetFileUploadPreferencesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((SetFileUploadPreferencesRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (CancelPendingActionsRequest)CancelPendingActionsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((CancelPendingActionsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (UntrashResourceRequest)UntrashResourceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((UntrashResourceRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zze((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (FetchThumbnailRequest)FetchThumbnailRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((FetchThumbnailRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzf((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (GetChangesRequest)GetChangesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((GetChangesRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (UnsubscribeResourceRequest)UnsubscribeResourceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((UnsubscribeResourceRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (GetPermissionsRequest)GetPermissionsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((GetPermissionsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (AddPermissionRequest)AddPermissionRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((AddPermissionRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (UpdatePermissionRequest)UpdatePermissionRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((UpdatePermissionRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (RemovePermissionRequest)RemovePermissionRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((RemovePermissionRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzao.zza.zzbc(paramParcel1.readStrongBinder());
      localObject1 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((QueryRequest)localObject2, (zzao)localObject3, (zzan)localObject1);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzao.zza.zzbc(paramParcel1.readStrongBinder());
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((zzao)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (ControlProgressRequest)ControlProgressRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((ControlProgressRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzg((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (ChangeResourceParentsRequest)ChangeResourceParentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zza((ChangeResourceParentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      bool = i;
      continue;
      localObject3 = "com.google.android.gms.drive.internal.IDriveService";
      paramParcel1.enforceInterface((String)localObject3);
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject2 = (StreamContentsRequest)StreamContentsRequest.CREATOR.createFromParcel(paramParcel1);
      }
      localObject3 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      localObject2 = zza((StreamContentsRequest)localObject2, (zzan)localObject3);
      paramParcel2.writeNoException();
      if (localObject2 != null)
      {
        paramParcel2.writeInt(i);
        ((DriveServiceResponse)localObject2).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        paramParcel2.writeInt(0);
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
      localObject2 = zzan.zza.zzbb(paramParcel1.readStrongBinder());
      zzh((zzan)localObject2);
      paramParcel2.writeNoException();
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzam$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */