package com.google.android.gms.drive.internal;

import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public final class zzp
  extends Metadata
{
  private final MetadataBundle zzaqB;
  
  public zzp(MetadataBundle paramMetadataBundle)
  {
    this.zzaqB = paramMetadataBundle;
  }
  
  public boolean isDataValid()
  {
    MetadataBundle localMetadataBundle = this.zzaqB;
    boolean bool;
    if (localMetadataBundle != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMetadataBundle = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Metadata [mImpl=");
    MetadataBundle localMetadataBundle = this.zzaqB;
    return localMetadataBundle + "]";
  }
  
  public Object zza(MetadataField paramMetadataField)
  {
    return this.zzaqB.zza(paramMetadataField);
  }
  
  public Metadata zzsK()
  {
    zzp localzzp = new com/google/android/gms/drive/internal/zzp;
    MetadataBundle localMetadataBundle = this.zzaqB.zztF();
    localzzp.<init>(localMetadataBundle);
    return localzzp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */