package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.internal.zzz;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.zznm;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MetadataBundle
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  final Bundle zzasQ;
  
  static
  {
    zzh localzzh = new com/google/android/gms/drive/metadata/internal/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  MetadataBundle(int paramInt, Bundle paramBundle)
  {
    this.mVersionCode = paramInt;
    Object localObject1 = (Bundle)zzx.zzz(paramBundle);
    this.zzasQ = ((Bundle)localObject1);
    localObject1 = this.zzasQ;
    Object localObject2 = getClass().getClassLoader();
    ((Bundle)localObject1).setClassLoader((ClassLoader)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    localObject1 = this.zzasQ.keySet();
    Object localObject3 = ((Set)localObject1).iterator();
    boolean bool;
    for (;;)
    {
      bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject3).next();
      Object localObject4 = zze.zzdc((String)localObject1);
      if (localObject4 == null)
      {
        ((List)localObject2).add(localObject1);
        localObject4 = "MetadataBundle";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "Ignored unknown metadata field in bundle: ";
        localStringBuilder = localStringBuilder.append(str);
        localObject1 = (String)localObject1;
        zzz.zzz((String)localObject4, (String)localObject1);
      }
    }
    localObject2 = ((List)localObject2).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      localObject3 = this.zzasQ;
      ((Bundle)localObject3).remove((String)localObject1);
    }
  }
  
  private MetadataBundle(Bundle paramBundle)
  {
    this(1, paramBundle);
  }
  
  public static MetadataBundle zzb(MetadataField paramMetadataField, Object paramObject)
  {
    MetadataBundle localMetadataBundle = zztE();
    localMetadataBundle.zzc(paramMetadataField, paramObject);
    return localMetadataBundle;
  }
  
  public static MetadataBundle zztE()
  {
    MetadataBundle localMetadataBundle = new com/google/android/gms/drive/metadata/internal/MetadataBundle;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localMetadataBundle.<init>(localBundle);
    return localMetadataBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2;
    if (this == paramObject) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      bool2 = paramObject instanceof MetadataBundle;
      Object localObject1;
      if (!bool2)
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        paramObject = (MetadataBundle)paramObject;
        localObject1 = this.zzasQ.keySet();
        Object localObject2 = ((MetadataBundle)paramObject).zzasQ.keySet();
        boolean bool3 = ((Set)localObject1).equals(localObject2);
        if (!bool3)
        {
          bool2 = false;
          localObject1 = null;
        }
        else
        {
          localObject2 = ((Set)localObject1).iterator();
          do
          {
            bool2 = ((Iterator)localObject2).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (String)((Iterator)localObject2).next();
            Object localObject3 = this.zzasQ.get((String)localObject1);
            Bundle localBundle = ((MetadataBundle)paramObject).zzasQ;
            localObject1 = localBundle.get((String)localObject1);
            bool2 = zzw.equal(localObject3, localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          continue;
          bool2 = bool1;
        }
      }
    }
  }
  
  public int hashCode()
  {
    boolean bool1 = true;
    Set localSet = this.zzasQ.keySet();
    Iterator localIterator = localSet.iterator();
    int j;
    int i;
    for (boolean bool2 = bool1;; j = i)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Object localObject = (String)localIterator.next();
      bool2 *= true;
      Bundle localBundle = this.zzasQ;
      localObject = localBundle.get((String)localObject);
      i = localObject.hashCode() + j;
    }
    return j;
  }
  
  public void setContext(Context paramContext)
  {
    Object localObject = zznm.zzatz;
    localObject = (BitmapTeleporter)zza((MetadataField)localObject);
    if (localObject != null)
    {
      File localFile = paramContext.getCacheDir();
      ((BitmapTeleporter)localObject).zzc(localFile);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MetadataBundle [values=");
    Bundle localBundle = this.zzasQ;
    return localBundle + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public Object zza(MetadataField paramMetadataField)
  {
    Bundle localBundle = this.zzasQ;
    return paramMetadataField.zzm(localBundle);
  }
  
  public void zzc(MetadataField paramMetadataField, Object paramObject)
  {
    Object localObject1 = zze.zzdc(paramMetadataField.getName());
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unregistered field: ");
      String str = paramMetadataField.getName();
      localObject2 = str;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    localObject1 = this.zzasQ;
    paramMetadataField.zza(paramObject, (Bundle)localObject1);
  }
  
  public boolean zzc(MetadataField paramMetadataField)
  {
    Bundle localBundle = this.zzasQ;
    String str = paramMetadataField.getName();
    return localBundle.containsKey(str);
  }
  
  public MetadataBundle zztF()
  {
    MetadataBundle localMetadataBundle = new com/google/android/gms/drive/metadata/internal/MetadataBundle;
    Bundle localBundle1 = new android/os/Bundle;
    Bundle localBundle2 = this.zzasQ;
    localBundle1.<init>(localBundle2);
    localMetadataBundle.<init>(localBundle1);
    return localMetadataBundle;
  }
  
  public Set zztG()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    Object localObject = this.zzasQ.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = zze.zzdc((String)localIterator.next());
      localHashSet.add(localObject);
    }
    return localHashSet;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\MetadataBundle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */