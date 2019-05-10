package com.google.android.gms.plus.model.people;

import android.os.Bundle;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzd;
import com.google.android.gms.plus.internal.model.people.PersonEntity;
import com.google.android.gms.plus.internal.model.people.zzk;

public final class PersonBuffer
  extends AbstractDataBuffer
{
  private final zzd zzbgt;
  
  public PersonBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    Object localObject1 = paramDataHolder.zzpZ();
    boolean bool;
    if (localObject1 != null)
    {
      localObject1 = paramDataHolder.zzpZ();
      Object localObject2 = "com.google.android.gms.plus.IsSafeParcelable";
      bool = ((Bundle)localObject1).getBoolean((String)localObject2, false);
      if (bool)
      {
        localObject1 = new com/google/android/gms/common/data/zzd;
        localObject2 = PersonEntity.CREATOR;
        ((zzd)localObject1).<init>(paramDataHolder, (Parcelable.Creator)localObject2);
      }
    }
    for (this.zzbgt = ((zzd)localObject1);; this.zzbgt = null)
    {
      return;
      bool = false;
      localObject1 = null;
    }
  }
  
  public Person get(int paramInt)
  {
    Object localObject = this.zzbgt;
    if (localObject != null) {
      localObject = (Person)this.zzbgt.zzbG(paramInt);
    }
    for (;;)
    {
      return (Person)localObject;
      localObject = new com/google/android/gms/plus/internal/model/people/zzk;
      DataHolder localDataHolder = this.zzahi;
      ((zzk)localObject).<init>(localDataHolder, paramInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\people\PersonBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */