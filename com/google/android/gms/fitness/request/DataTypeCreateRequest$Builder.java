package com.google.android.gms.fitness.request;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Field;
import java.util.ArrayList;
import java.util.List;

public class DataTypeCreateRequest$Builder
{
  private String mName;
  private List zzawE;
  
  public DataTypeCreateRequest$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzawE = localArrayList;
  }
  
  public Builder addField(Field paramField)
  {
    List localList = this.zzawE;
    boolean bool = localList.contains(paramField);
    if (!bool)
    {
      localList = this.zzawE;
      localList.add(paramField);
    }
    return this;
  }
  
  public Builder addField(String paramString, int paramInt)
  {
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.isEmpty();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      zzx.zzb(bool, "Invalid name specified");
      Field localField = Field.zzn(paramString, paramInt);
      return addField(localField);
      bool = false;
      localField = null;
    }
  }
  
  public DataTypeCreateRequest build()
  {
    boolean bool1 = true;
    Object localObject = this.mName;
    boolean bool2;
    if (localObject != null)
    {
      bool2 = bool1;
      String str = "Must set the name";
      zzx.zza(bool2, str);
      localObject = this.zzawE;
      bool2 = ((List)localObject).isEmpty();
      if (bool2) {
        break label64;
      }
    }
    for (;;)
    {
      zzx.zza(bool1, "Must specify the data fields");
      localObject = new com/google/android/gms/fitness/request/DataTypeCreateRequest;
      ((DataTypeCreateRequest)localObject).<init>(this, null);
      return (DataTypeCreateRequest)localObject;
      bool2 = false;
      localObject = null;
      break;
      label64:
      bool1 = false;
    }
  }
  
  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataTypeCreateRequest$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */