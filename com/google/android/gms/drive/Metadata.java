package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.zznm;
import com.google.android.gms.internal.zznm.zzc;
import com.google.android.gms.internal.zznm.zzd;
import com.google.android.gms.internal.zznm.zzg;
import com.google.android.gms.internal.zzno;
import com.google.android.gms.internal.zzno.zza;
import com.google.android.gms.internal.zzno.zzb;
import com.google.android.gms.internal.zzno.zzc;
import com.google.android.gms.internal.zzno.zzd;
import com.google.android.gms.internal.zzno.zzf;
import com.google.android.gms.internal.zznq;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata
  implements Freezable
{
  public static final int CONTENT_AVAILABLE_LOCALLY = 1;
  public static final int CONTENT_NOT_AVAILABLE_LOCALLY;
  
  public String getAlternateLink()
  {
    MetadataField localMetadataField = zznm.zzasV;
    return (String)zza(localMetadataField);
  }
  
  public int getContentAvailability()
  {
    Object localObject = zznq.zzatT;
    localObject = (Integer)zza((MetadataField)localObject);
    int i;
    if (localObject == null)
    {
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      i = ((Integer)localObject).intValue();
    }
  }
  
  public Date getCreatedDate()
  {
    zzno.zza localzza = zzno.zzatM;
    return (Date)zza(localzza);
  }
  
  public Map getCustomProperties()
  {
    Object localObject = zznm.zzasW;
    localObject = (AppVisibleCustomProperties)zza((MetadataField)localObject);
    if (localObject == null) {}
    for (localObject = Collections.emptyMap();; localObject = ((AppVisibleCustomProperties)localObject).zztz()) {
      return (Map)localObject;
    }
  }
  
  public String getDescription()
  {
    MetadataField localMetadataField = zznm.zzasX;
    return (String)zza(localMetadataField);
  }
  
  public DriveId getDriveId()
  {
    MetadataField localMetadataField = zznm.zzasU;
    return (DriveId)zza(localMetadataField);
  }
  
  public String getEmbedLink()
  {
    MetadataField localMetadataField = zznm.zzasY;
    return (String)zza(localMetadataField);
  }
  
  public String getFileExtension()
  {
    MetadataField localMetadataField = zznm.zzasZ;
    return (String)zza(localMetadataField);
  }
  
  public long getFileSize()
  {
    MetadataField localMetadataField = zznm.zzata;
    return ((Long)zza(localMetadataField)).longValue();
  }
  
  public Date getLastViewedByMeDate()
  {
    zzno.zzb localzzb = zzno.zzatN;
    return (Date)zza(localzzb);
  }
  
  public String getMimeType()
  {
    zznm.zzc localzzc = zznm.zzatr;
    return (String)zza(localzzc);
  }
  
  public Date getModifiedByMeDate()
  {
    zzno.zzc localzzc = zzno.zzatP;
    return (Date)zza(localzzc);
  }
  
  public Date getModifiedDate()
  {
    zzno.zzd localzzd = zzno.zzatO;
    return (Date)zza(localzzd);
  }
  
  public String getOriginalFilename()
  {
    MetadataField localMetadataField = zznm.zzats;
    return (String)zza(localMetadataField);
  }
  
  public long getQuotaBytesUsed()
  {
    zznm.zzd localzzd = zznm.zzatx;
    return ((Long)zza(localzzd)).longValue();
  }
  
  public Date getSharedWithMeDate()
  {
    zzno.zzf localzzf = zzno.zzatQ;
    return (Date)zza(localzzf);
  }
  
  public String getTitle()
  {
    zznm.zzg localzzg = zznm.zzatA;
    return (String)zza(localzzg);
  }
  
  public String getWebContentLink()
  {
    MetadataField localMetadataField = zznm.zzatC;
    return (String)zza(localMetadataField);
  }
  
  public String getWebViewLink()
  {
    MetadataField localMetadataField = zznm.zzatD;
    return (String)zza(localMetadataField);
  }
  
  public boolean isEditable()
  {
    Object localObject = zznm.zzatg;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isExplicitlyTrashed()
  {
    Object localObject = zznm.zzath;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isFolder()
  {
    String str = getMimeType();
    return "application/vnd.google-apps.folder".equals(str);
  }
  
  public boolean isInAppFolder()
  {
    Object localObject = zznm.zzate;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isPinnable()
  {
    Object localObject = zznq.zzatU;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isPinned()
  {
    Object localObject = zznm.zzatj;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isRestricted()
  {
    Object localObject = zznm.zzatl;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isShared()
  {
    Object localObject = zznm.zzatm;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isStarred()
  {
    Object localObject = zznm.zzaty;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isTrashable()
  {
    Object localObject = zznm.zzatp;
    localObject = (Boolean)zza((MetadataField)localObject);
    if (localObject == null) {}
    for (boolean bool = true;; bool = ((Boolean)localObject).booleanValue()) {
      return bool;
    }
  }
  
  public boolean isTrashed()
  {
    Object localObject = zznm.zzatB;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public boolean isViewed()
  {
    Object localObject = zznm.zzatq;
    localObject = (Boolean)zza((MetadataField)localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = ((Boolean)localObject).booleanValue();
    }
  }
  
  public abstract Object zza(MetadataField paramMetadataField);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\Metadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */