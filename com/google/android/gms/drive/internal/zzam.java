package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.IInterface;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

public abstract interface zzam
  extends IInterface
{
  public abstract IntentSender zza(CreateFileIntentSenderRequest paramCreateFileIntentSenderRequest);
  
  public abstract IntentSender zza(OpenFileIntentSenderRequest paramOpenFileIntentSenderRequest);
  
  public abstract DriveServiceResponse zza(OpenContentsRequest paramOpenContentsRequest, zzan paramzzan);
  
  public abstract DriveServiceResponse zza(StreamContentsRequest paramStreamContentsRequest, zzan paramzzan);
  
  public abstract void zza(RealtimeDocumentSyncRequest paramRealtimeDocumentSyncRequest, zzan paramzzan);
  
  public abstract void zza(AddEventListenerRequest paramAddEventListenerRequest, zzao paramzzao, String paramString, zzan paramzzan);
  
  public abstract void zza(AddPermissionRequest paramAddPermissionRequest, zzan paramzzan);
  
  public abstract void zza(AuthorizeAccessRequest paramAuthorizeAccessRequest, zzan paramzzan);
  
  public abstract void zza(CancelPendingActionsRequest paramCancelPendingActionsRequest, zzan paramzzan);
  
  public abstract void zza(ChangeResourceParentsRequest paramChangeResourceParentsRequest, zzan paramzzan);
  
  public abstract void zza(CheckResourceIdsExistRequest paramCheckResourceIdsExistRequest, zzan paramzzan);
  
  public abstract void zza(CloseContentsAndUpdateMetadataRequest paramCloseContentsAndUpdateMetadataRequest, zzan paramzzan);
  
  public abstract void zza(CloseContentsRequest paramCloseContentsRequest, zzan paramzzan);
  
  public abstract void zza(ControlProgressRequest paramControlProgressRequest, zzan paramzzan);
  
  public abstract void zza(CreateContentsRequest paramCreateContentsRequest, zzan paramzzan);
  
  public abstract void zza(CreateFileRequest paramCreateFileRequest, zzan paramzzan);
  
  public abstract void zza(CreateFolderRequest paramCreateFolderRequest, zzan paramzzan);
  
  public abstract void zza(DeleteResourceRequest paramDeleteResourceRequest, zzan paramzzan);
  
  public abstract void zza(DisconnectRequest paramDisconnectRequest);
  
  public abstract void zza(FetchThumbnailRequest paramFetchThumbnailRequest, zzan paramzzan);
  
  public abstract void zza(GetChangesRequest paramGetChangesRequest, zzan paramzzan);
  
  public abstract void zza(GetDriveIdFromUniqueIdentifierRequest paramGetDriveIdFromUniqueIdentifierRequest, zzan paramzzan);
  
  public abstract void zza(GetMetadataRequest paramGetMetadataRequest, zzan paramzzan);
  
  public abstract void zza(GetPermissionsRequest paramGetPermissionsRequest, zzan paramzzan);
  
  public abstract void zza(ListParentsRequest paramListParentsRequest, zzan paramzzan);
  
  public abstract void zza(LoadRealtimeRequest paramLoadRealtimeRequest, zzan paramzzan);
  
  public abstract void zza(QueryRequest paramQueryRequest, zzan paramzzan);
  
  public abstract void zza(QueryRequest paramQueryRequest, zzao paramzzao, zzan paramzzan);
  
  public abstract void zza(RemoveEventListenerRequest paramRemoveEventListenerRequest, zzao paramzzao, String paramString, zzan paramzzan);
  
  public abstract void zza(RemovePermissionRequest paramRemovePermissionRequest, zzan paramzzan);
  
  public abstract void zza(SetFileUploadPreferencesRequest paramSetFileUploadPreferencesRequest, zzan paramzzan);
  
  public abstract void zza(SetPinnedDownloadPreferencesRequest paramSetPinnedDownloadPreferencesRequest, zzan paramzzan);
  
  public abstract void zza(SetResourceParentsRequest paramSetResourceParentsRequest, zzan paramzzan);
  
  public abstract void zza(TrashResourceRequest paramTrashResourceRequest, zzan paramzzan);
  
  public abstract void zza(UnsubscribeResourceRequest paramUnsubscribeResourceRequest, zzan paramzzan);
  
  public abstract void zza(UntrashResourceRequest paramUntrashResourceRequest, zzan paramzzan);
  
  public abstract void zza(UpdateMetadataRequest paramUpdateMetadataRequest, zzan paramzzan);
  
  public abstract void zza(UpdatePermissionRequest paramUpdatePermissionRequest, zzan paramzzan);
  
  public abstract void zza(zzan paramzzan);
  
  public abstract void zza(zzao paramzzao, zzan paramzzan);
  
  public abstract void zzb(QueryRequest paramQueryRequest, zzan paramzzan);
  
  public abstract void zzb(zzan paramzzan);
  
  public abstract void zzc(zzan paramzzan);
  
  public abstract void zzd(zzan paramzzan);
  
  public abstract void zze(zzan paramzzan);
  
  public abstract void zzf(zzan paramzzan);
  
  public abstract void zzg(zzan paramzzan);
  
  public abstract void zzh(zzan paramzzan);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */