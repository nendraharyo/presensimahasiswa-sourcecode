package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.internal.zzi;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.Query.Builder;
import com.google.android.gms.drive.query.SearchableField;
import com.google.android.gms.drive.query.SortOrder;
import com.google.android.gms.drive.zzh;
import com.google.android.gms.drive.zzh.zza;
import com.google.android.gms.internal.zznm;

public class zzy
  extends zzab
  implements DriveFolder
{
  public zzy(DriveId paramDriveId)
  {
    super(paramDriveId);
  }
  
  private int zza(DriveContents paramDriveContents, zzi paramzzi)
  {
    int i;
    Contents localContents;
    if (paramDriveContents == null) {
      if (paramzzi != null)
      {
        i = paramzzi.zztI();
        if (i != 0)
        {
          i = 0;
          localContents = null;
        }
      }
    }
    for (;;)
    {
      return i;
      int j = 1;
      continue;
      localContents = paramDriveContents.zzsx();
      j = localContents.getRequestId();
      paramDriveContents.zzsy();
    }
  }
  
  private PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, int paramInt, zzh paramzzh)
  {
    Object localObject = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    if (localObject != null)
    {
      boolean bool = ((zzi)localObject).zztI();
      if (!bool) {}
    }
    for (int i = 1;; i = 0)
    {
      localObject = new com/google/android/gms/drive/internal/zzy$1;
      ((zzy.1)localObject).<init>(this, paramGoogleApiClient, paramMetadataChangeSet, paramInt, i, paramzzh);
      return paramGoogleApiClient.zzb((zza.zza)localObject);
    }
  }
  
  private MetadataChangeSet zza(MetadataChangeSet paramMetadataChangeSet, String paramString)
  {
    MetadataField localMetadataField = zznm.zzatE;
    return paramMetadataChangeSet.zza(localMetadataField, paramString);
  }
  
  private Query zza(Query paramQuery)
  {
    Query.Builder localBuilder = new com/google/android/gms/drive/query/Query$Builder;
    localBuilder.<init>();
    Object localObject = SearchableField.PARENTS;
    DriveId localDriveId = getDriveId();
    localObject = Filters.in((SearchableCollectionMetadataField)localObject, localDriveId);
    localBuilder = localBuilder.addFilter((Filter)localObject);
    if (paramQuery != null)
    {
      localObject = paramQuery.getFilter();
      if (localObject != null)
      {
        localObject = paramQuery.getFilter();
        localBuilder.addFilter((Filter)localObject);
      }
      localObject = paramQuery.getPageToken();
      localBuilder.setPageToken((String)localObject);
      localObject = paramQuery.getSortOrder();
      localBuilder.setSortOrder((SortOrder)localObject);
    }
    return localBuilder.build();
  }
  
  private void zzb(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, zzh paramzzh)
  {
    if (paramMetadataChangeSet == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("MetadataChangeSet must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    boolean bool;
    if (localObject != null)
    {
      bool = ((zzi)localObject).isFolder();
      if (bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("May not create folders using this method. Use DriveFolder.createFolder() instead of mime type application/vnd.google-apps.folder");
        throw ((Throwable)localObject);
      }
    }
    paramzzh.zzg(paramGoogleApiClient);
    if (paramDriveContents == null) {}
    do
    {
      return;
      bool = paramDriveContents instanceof zzv;
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Only DriveContents obtained from the Drive API are accepted.");
        throw ((Throwable)localObject);
      }
      localObject = ((DriveContents)paramDriveContents).getDriveId();
      if (localObject != null)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        throw ((Throwable)localObject);
      }
      bool = ((DriveContents)paramDriveContents).zzsz();
    } while (!bool);
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("DriveContents are already closed.");
    throw ((Throwable)localObject);
  }
  
  private void zzb(MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("MetadataChangeSet must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    if (localObject != null)
    {
      boolean bool = ((zzi)localObject).zztH();
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("May not create shortcut files using this method. Use DriveFolder.createShortcutFile() instead.");
        throw ((Throwable)localObject);
      }
    }
  }
  
  public PendingResult createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents)
  {
    zzb(paramMetadataChangeSet);
    return zza(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, null);
  }
  
  public PendingResult createFile(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, ExecutionOptions paramExecutionOptions)
  {
    zzb(paramMetadataChangeSet);
    zzh localzzh = zzh.zza(paramExecutionOptions);
    return zza(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, localzzh);
  }
  
  public PendingResult createFolder(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("MetadataChangeSet must be provided.");
      throw ((Throwable)localObject);
    }
    Object localObject = paramMetadataChangeSet.getMimeType();
    if (localObject != null)
    {
      localObject = paramMetadataChangeSet.getMimeType();
      String str = "application/vnd.google-apps.folder";
      boolean bool = ((String)localObject).equals(str);
      if (!bool)
      {
        localObject = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject).<init>("The mimetype must be of type application/vnd.google-apps.folder");
        throw ((Throwable)localObject);
      }
    }
    localObject = new com/google/android/gms/drive/internal/zzy$2;
    ((zzy.2)localObject).<init>(this, paramGoogleApiClient, paramMetadataChangeSet);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public PendingResult listChildren(GoogleApiClient paramGoogleApiClient)
  {
    return queryChildren(paramGoogleApiClient, null);
  }
  
  public PendingResult queryChildren(GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    zzs localzzs = new com/google/android/gms/drive/internal/zzs;
    localzzs.<init>();
    Query localQuery = zza(paramQuery);
    return localzzs.query(paramGoogleApiClient, localQuery);
  }
  
  public PendingResult zza(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, DriveContents paramDriveContents, zzh paramzzh)
  {
    if (paramzzh == null)
    {
      localObject = new com/google/android/gms/drive/zzh$zza;
      ((zzh.zza)localObject).<init>();
      paramzzh = ((zzh.zza)localObject).zzsH();
    }
    zzb(paramGoogleApiClient, paramMetadataChangeSet, paramDriveContents, paramzzh);
    Object localObject = zzi.zzdd(paramMetadataChangeSet.getMimeType());
    int i = zza(paramDriveContents, (zzi)localObject);
    String str = paramzzh.zzsG();
    if (str != null) {
      paramMetadataChangeSet = zza(paramMetadataChangeSet, str);
    }
    return zza(paramGoogleApiClient, paramMetadataChangeSet, i, paramzzh);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */