package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ApplicationMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  String mName;
  private final int mVersionCode;
  String zzZC;
  List zzZD;
  String zzZE;
  Uri zzZF;
  List zzxX;
  
  static
  {
    zza localzza = new com/google/android/gms/cast/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  private ApplicationMetadata()
  {
    this.mVersionCode = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzxX = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzZD = localArrayList;
  }
  
  ApplicationMetadata(int paramInt, String paramString1, String paramString2, List paramList1, List paramList2, String paramString3, Uri paramUri)
  {
    this.mVersionCode = paramInt;
    this.zzZC = paramString1;
    this.mName = paramString2;
    this.zzxX = paramList1;
    this.zzZD = paramList2;
    this.zzZE = paramString3;
    this.zzZF = paramUri;
  }
  
  public boolean areNamespacesSupported(List paramList)
  {
    List localList = this.zzZD;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzZD;
      bool = localList.containsAll(paramList);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof ApplicationMetadata;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (ApplicationMetadata)paramObject;
        Object localObject1 = this.zzZC;
        Object localObject2 = ((ApplicationMetadata)paramObject).zzZC;
        bool2 = zzf.zza(localObject1, localObject2);
        if (bool2)
        {
          localObject1 = this.zzxX;
          localObject2 = ((ApplicationMetadata)paramObject).zzxX;
          bool2 = zzf.zza(localObject1, localObject2);
          if (bool2)
          {
            localObject1 = this.mName;
            localObject2 = ((ApplicationMetadata)paramObject).mName;
            bool2 = zzf.zza(localObject1, localObject2);
            if (bool2)
            {
              localObject1 = this.zzZD;
              localObject2 = ((ApplicationMetadata)paramObject).zzZD;
              bool2 = zzf.zza(localObject1, localObject2);
              if (bool2)
              {
                localObject1 = this.zzZE;
                localObject2 = ((ApplicationMetadata)paramObject).zzZE;
                bool2 = zzf.zza(localObject1, localObject2);
                if (bool2)
                {
                  localObject1 = this.zzZF;
                  localObject2 = ((ApplicationMetadata)paramObject).zzZF;
                  bool2 = zzf.zza(localObject1, localObject2);
                  if (bool2) {
                    continue;
                  }
                }
              }
            }
          }
        }
        bool1 = false;
      }
    }
  }
  
  public String getApplicationId()
  {
    return this.zzZC;
  }
  
  public List getImages()
  {
    return this.zzxX;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getSenderAppIdentifier()
  {
    return this.zzZE;
  }
  
  public List getSupportedNamespaces()
  {
    return Collections.unmodifiableList(this.zzZD);
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[7];
    Object localObject = Integer.valueOf(this.mVersionCode);
    arrayOfObject[0] = localObject;
    localObject = this.zzZC;
    arrayOfObject[1] = localObject;
    localObject = this.mName;
    arrayOfObject[2] = localObject;
    localObject = this.zzxX;
    arrayOfObject[3] = localObject;
    localObject = this.zzZD;
    arrayOfObject[4] = localObject;
    localObject = this.zzZE;
    arrayOfObject[5] = localObject;
    localObject = this.zzZF;
    arrayOfObject[6] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean isNamespaceSupported(String paramString)
  {
    List localList = this.zzZD;
    boolean bool;
    if (localList != null)
    {
      localList = this.zzZD;
      bool = localList.contains(paramString);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList = null;
    }
  }
  
  public String toString()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("applicationId: ");
    Object localObject3 = this.zzZC;
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append(", name: ");
    localObject3 = this.mName;
    localObject3 = ((StringBuilder)localObject2).append((String)localObject3).append(", images.count: ");
    localObject2 = this.zzxX;
    int j;
    if (localObject2 == null)
    {
      j = 0;
      localObject2 = null;
      localObject2 = ((StringBuilder)localObject3).append(j).append(", namespaces.count: ");
      localObject3 = this.zzZD;
      if (localObject3 != null) {
        break label151;
      }
    }
    for (;;)
    {
      localObject2 = ((StringBuilder)localObject2).append(i).append(", senderAppIdentifier: ");
      localObject1 = this.zzZE;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append(", senderAppLaunchUrl: ");
      localObject1 = this.zzZF;
      return (String)localObject1;
      localObject2 = this.zzxX;
      j = ((List)localObject2).size();
      break;
      label151:
      localObject1 = this.zzZD;
      i = ((List)localObject1).size();
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Uri zznx()
  {
    return this.zzZF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\ApplicationMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */