package com.google.android.gms.wearable;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;

public abstract interface DataApi$GetFdForAssetResult
  extends Releasable, Result
{
  public abstract ParcelFileDescriptor getFd();
  
  public abstract InputStream getInputStream();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\DataApi$GetFdForAssetResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */