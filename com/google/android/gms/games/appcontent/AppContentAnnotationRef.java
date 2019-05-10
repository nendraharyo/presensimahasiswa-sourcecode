package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentAnnotationRef
  extends MultiDataBufferRef
  implements AppContentAnnotation
{
  AppContentAnnotationRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 2, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentAnnotationEntity.zza(this, paramObject);
  }
  
  public String getDescription()
  {
    return getString("annotation_description");
  }
  
  public String getId()
  {
    return getString("annotation_id");
  }
  
  public String getTitle()
  {
    return getString("annotation_title");
  }
  
  public int hashCode()
  {
    return AppContentAnnotationEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentAnnotationEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentAnnotationEntity)zzvZ()).writeToParcel(paramParcel, paramInt);
  }
  
  public String zzvT()
  {
    return getString("annotation_image_default_id");
  }
  
  public int zzvU()
  {
    return getInteger("annotation_image_height");
  }
  
  public Uri zzvV()
  {
    return zzcA("annotation_image_uri");
  }
  
  public Bundle zzvW()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzd(localDataHolder, localArrayList, "annotation_modifiers", i);
  }
  
  public int zzvX()
  {
    return getInteger("annotation_image_width");
  }
  
  public String zzvY()
  {
    return getString("annotation_layout_slot");
  }
  
  public AppContentAnnotation zzvZ()
  {
    AppContentAnnotationEntity localAppContentAnnotationEntity = new com/google/android/gms/games/appcontent/AppContentAnnotationEntity;
    localAppContentAnnotationEntity.<init>(this);
    return localAppContentAnnotationEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentAnnotationRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */