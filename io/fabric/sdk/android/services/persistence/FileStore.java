package io.fabric.sdk.android.services.persistence;

import java.io.File;

public abstract interface FileStore
{
  public abstract File getCacheDir();
  
  public abstract File getExternalCacheDir();
  
  public abstract File getExternalFilesDir();
  
  public abstract File getFilesDir();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\persistence\FileStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */