package com.google.android.gms.drive.events;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.internal.zzap;
import com.google.android.gms.drive.internal.zzap.zza;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.zzna;
import com.google.android.gms.internal.zznm;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class CompletionEvent
  implements SafeParcelable, ResourceEvent
{
  public static final Parcelable.Creator CREATOR;
  public static final int STATUS_CANCELED = 3;
  public static final int STATUS_CONFLICT = 2;
  public static final int STATUS_FAILURE = 1;
  public static final int STATUS_SUCCESS;
  final int mVersionCode;
  final int zzBc;
  final String zzVa;
  final DriveId zzaoz;
  final ParcelFileDescriptor zzapD;
  final ParcelFileDescriptor zzapE;
  final MetadataBundle zzapF;
  final List zzapG;
  final IBinder zzapH;
  private boolean zzapI = false;
  private boolean zzapJ = false;
  private boolean zzapK = false;
  
  static
  {
    zze localzze = new com/google/android/gms/drive/events/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  CompletionEvent(int paramInt1, DriveId paramDriveId, String paramString, ParcelFileDescriptor paramParcelFileDescriptor1, ParcelFileDescriptor paramParcelFileDescriptor2, MetadataBundle paramMetadataBundle, List paramList, int paramInt2, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt1;
    this.zzaoz = paramDriveId;
    this.zzVa = paramString;
    this.zzapD = paramParcelFileDescriptor1;
    this.zzapE = paramParcelFileDescriptor2;
    this.zzapF = paramMetadataBundle;
    this.zzapG = paramList;
    this.zzBc = paramInt2;
    this.zzapH = paramIBinder;
  }
  
  private void zzsU()
  {
    boolean bool = this.zzapK;
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Event has already been dismissed or snoozed.");
      throw localIllegalStateException;
    }
  }
  
  private void zzv(boolean paramBoolean)
  {
    zzsU();
    boolean bool = true;
    this.zzapK = bool;
    zzna.zza(this.zzapD);
    zzna.zza(this.zzapE);
    Object localObject1 = this.zzapF;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.zzapF;
      localObject2 = zznm.zzatz;
      bool = ((MetadataBundle)localObject1).zzc((MetadataField)localObject2);
      if (bool)
      {
        localObject1 = this.zzapF;
        localObject2 = zznm.zzatz;
        localObject1 = (BitmapTeleporter)((MetadataBundle)localObject1).zza((MetadataField)localObject2);
        ((BitmapTeleporter)localObject1).release();
      }
    }
    localObject1 = this.zzapH;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject2 = "CompletionEvent";
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("No callback on ");
      if (paramBoolean)
      {
        localObject1 = "snooze";
        localObject1 = (String)localObject1;
        zzz.zzA((String)localObject2, (String)localObject1);
      }
    }
    Object localObject4;
    for (;;)
    {
      return;
      localObject1 = "dismiss";
      break;
      try
      {
        localObject1 = this.zzapH;
        localObject1 = zzap.zza.zzbd((IBinder)localObject1);
        ((zzap)localObject1).zzv(paramBoolean);
      }
      catch (RemoteException localRemoteException)
      {
        localObject3 = "CompletionEvent";
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject4 = ((StringBuilder)localObject1).append("RemoteException on ");
        if (!paramBoolean) {}
      }
    }
    for (localObject1 = "snooze";; localObject1 = "dismiss")
    {
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = ": ";
      localObject1 = (String)localObject4 + localRemoteException;
      zzz.zzA((String)localObject3, (String)localObject1);
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void dismiss()
  {
    zzv(false);
  }
  
  public String getAccountName()
  {
    zzsU();
    return this.zzVa;
  }
  
  public InputStream getBaseContentsInputStream()
  {
    zzsU();
    Object localObject = this.zzapD;
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (InputStream)localObject;
      bool = this.zzapI;
      if (bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("getBaseInputStream() can only be called once per CompletionEvent instance.");
        throw ((Throwable)localObject);
      }
      bool = true;
      this.zzapI = bool;
      localObject = new java/io/FileInputStream;
      FileDescriptor localFileDescriptor = this.zzapD.getFileDescriptor();
      ((FileInputStream)localObject).<init>(localFileDescriptor);
    }
  }
  
  public DriveId getDriveId()
  {
    zzsU();
    return this.zzaoz;
  }
  
  public InputStream getModifiedContentsInputStream()
  {
    zzsU();
    Object localObject = this.zzapE;
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (InputStream)localObject;
      bool = this.zzapJ;
      if (bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("getModifiedInputStream() can only be called once per CompletionEvent instance.");
        throw ((Throwable)localObject);
      }
      bool = true;
      this.zzapJ = bool;
      localObject = new java/io/FileInputStream;
      FileDescriptor localFileDescriptor = this.zzapE.getFileDescriptor();
      ((FileInputStream)localObject).<init>(localFileDescriptor);
    }
  }
  
  public MetadataChangeSet getModifiedMetadataChangeSet()
  {
    zzsU();
    Object localObject = this.zzapF;
    if (localObject != null)
    {
      localObject = new com/google/android/gms/drive/MetadataChangeSet;
      MetadataBundle localMetadataBundle = this.zzapF;
      ((MetadataChangeSet)localObject).<init>(localMetadataBundle);
    }
    for (;;)
    {
      return (MetadataChangeSet)localObject;
      localObject = null;
    }
  }
  
  public int getStatus()
  {
    zzsU();
    return this.zzBc;
  }
  
  public List getTrackingTags()
  {
    zzsU();
    ArrayList localArrayList = new java/util/ArrayList;
    List localList = this.zzapG;
    localArrayList.<init>(localList);
    return localArrayList;
  }
  
  public int getType()
  {
    return 2;
  }
  
  public void snooze()
  {
    zzv(true);
  }
  
  public String toString()
  {
    Object localObject1 = this.zzapG;
    if (localObject1 == null) {}
    Object localObject2;
    for (localObject1 = "<null>";; localObject1 = (String)localObject2)
    {
      localObject2 = Locale.US;
      Object[] arrayOfObject = new Object[3];
      Object localObject3 = this.zzaoz;
      arrayOfObject[0] = localObject3;
      localObject3 = Integer.valueOf(this.zzBc);
      arrayOfObject[1] = localObject3;
      arrayOfObject[2] = localObject1;
      return String.format((Locale)localObject2, "CompletionEvent [id=%s, status=%s, trackingTag=%s]", arrayOfObject);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("'");
      List localList = this.zzapG;
      localObject2 = TextUtils.join("','", localList);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = "'";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = paramInt | 0x1;
    zze.zza(this, paramParcel, i);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\events\CompletionEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */