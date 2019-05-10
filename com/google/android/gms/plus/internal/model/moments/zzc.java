package com.google.android.gms.plus.internal.model.moments;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.model.moments.ItemScope;
import com.google.android.gms.plus.model.moments.Moment;

public final class zzc
  extends com.google.android.gms.common.data.zzc
  implements Moment
{
  private MomentEntity zzbfK;
  
  public zzc(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  private MomentEntity zzFo()
  {
    try
    {
      Object localObject1 = this.zzbfK;
      if (localObject1 == null)
      {
        localObject1 = "momentImpl";
        localObject1 = getByteArray((String)localObject1);
        Parcel localParcel = Parcel.obtain();
        int i = localObject1.length;
        localParcel.unmarshall((byte[])localObject1, 0, i);
        localObject1 = null;
        localParcel.setDataPosition(0);
        localObject1 = MomentEntity.CREATOR;
        localObject1 = ((zzb)localObject1).zzgD(localParcel);
        this.zzbfK = ((MomentEntity)localObject1);
        localParcel.recycle();
      }
      return this.zzbfK;
    }
    finally {}
  }
  
  public String getId()
  {
    return zzFo().getId();
  }
  
  public ItemScope getResult()
  {
    return zzFo().getResult();
  }
  
  public String getStartDate()
  {
    return zzFo().getStartDate();
  }
  
  public ItemScope getTarget()
  {
    return zzFo().getTarget();
  }
  
  public String getType()
  {
    return zzFo().getType();
  }
  
  public boolean hasId()
  {
    return zzFo().hasId();
  }
  
  public boolean hasResult()
  {
    return zzFo().hasResult();
  }
  
  public boolean hasStartDate()
  {
    return zzFo().hasStartDate();
  }
  
  public boolean hasTarget()
  {
    return zzFo().hasTarget();
  }
  
  public boolean hasType()
  {
    return zzFo().hasType();
  }
  
  public MomentEntity zzFn()
  {
    return zzFo();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\moments\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */