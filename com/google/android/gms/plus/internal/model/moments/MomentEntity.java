package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MomentEntity
  extends FastSafeParcelableJsonResponse
  implements Moment
{
  public static final zzb CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzJN;
  final Set zzbeN;
  String zzbfA;
  ItemScopeEntity zzbfI;
  ItemScopeEntity zzbfJ;
  String zzyv;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/moments/zzb;
    ((zzb)localObject).<init>();
    CREATOR = (zzb)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("id", 2);
    ((HashMap)localObject).put("id", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("result", 4, ItemScopeEntity.class);
    ((HashMap)localObject).put("result", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("startDate", 5);
    ((HashMap)localObject).put("startDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("target", 6, ItemScopeEntity.class);
    ((HashMap)localObject).put("target", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("type", 7);
    ((HashMap)localObject).put("type", localField);
  }
  
  public MomentEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  MomentEntity(Set paramSet, int paramInt, String paramString1, ItemScopeEntity paramItemScopeEntity1, String paramString2, ItemScopeEntity paramItemScopeEntity2, String paramString3)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt;
    this.zzyv = paramString1;
    this.zzbfI = paramItemScopeEntity1;
    this.zzbfA = paramString2;
    this.zzbfJ = paramItemScopeEntity2;
    this.zzJN = paramString3;
  }
  
  public MomentEntity(Set paramSet, String paramString1, ItemScopeEntity paramItemScopeEntity1, String paramString2, ItemScopeEntity paramItemScopeEntity2, String paramString3)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = 1;
    this.zzyv = paramString1;
    this.zzbfI = paramItemScopeEntity1;
    this.zzbfA = paramString2;
    this.zzbfJ = paramItemScopeEntity2;
    this.zzJN = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof MomentEntity;
    Object localObject1;
    if (!bool2)
    {
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (MomentEntity)paramObject;
        localObject1 = zzbeM.values();
        Iterator localIterator = ((Collection)localObject1).iterator();
        label144:
        do
        {
          do
          {
            bool2 = localIterator.hasNext();
            if (!bool2) {
              break label163;
            }
            localObject1 = (FastJsonResponse.Field)localIterator.next();
            boolean bool3 = zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break label144;
            }
            bool3 = ((MomentEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((MomentEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((MomentEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public ItemScope getResult()
  {
    return this.zzbfI;
  }
  
  public String getStartDate()
  {
    return this.zzbfA;
  }
  
  public ItemScope getTarget()
  {
    return this.zzbfJ;
  }
  
  public String getType()
  {
    return this.zzJN;
  }
  
  public boolean hasId()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasResult()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    return localSet.contains(localInteger);
  }
  
  public boolean hasStartDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasTarget()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
    return localSet.contains(localInteger);
  }
  
  public int hashCode()
  {
    boolean bool1 = false;
    Object localObject = null;
    Iterator localIterator = zzbeM.values().iterator();
    int j = 0;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (FastJsonResponse.Field)localIterator.next();
      boolean bool2 = zza((FastJsonResponse.Field)localObject);
      if (!bool2) {
        break label88;
      }
      int k = ((FastJsonResponse.Field)localObject).zzrs();
      j += k;
      localObject = zzb((FastJsonResponse.Field)localObject);
    }
    label88:
    for (int i = localObject.hashCode() + j;; i = j)
    {
      j = i;
      break;
      return j;
    }
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public MomentEntity zzFn()
  {
    return this;
  }
  
  protected boolean zza(FastJsonResponse.Field paramField)
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(paramField.zzrs());
    return localSet.contains(localInteger);
  }
  
  protected Object zzb(FastJsonResponse.Field paramField)
  {
    int i = paramField.zzrs();
    Object localObject1;
    switch (i)
    {
    case 3: 
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unknown safe parcelable id=");
      int j = paramField.zzrs();
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = this.zzyv;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbfI;
      continue;
      localObject1 = this.zzbfA;
      continue;
      localObject1 = this.zzbfJ;
      continue;
      localObject1 = this.zzJN;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\moments\MomentEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */