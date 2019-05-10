package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

public class FileDescriptorLocalUriFetcher
  extends LocalUriFetcher
{
  public FileDescriptorLocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected void close(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    paramParcelFileDescriptor.close();
  }
  
  public Class getDataClass()
  {
    return ParcelFileDescriptor.class;
  }
  
  protected ParcelFileDescriptor loadResource(Uri paramUri, ContentResolver paramContentResolver)
  {
    Object localObject1 = paramContentResolver.openAssetFileDescriptor(paramUri, "r");
    if (localObject1 == null)
    {
      localObject1 = new java/io/FileNotFoundException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "FileDescriptor is null for: " + paramUri;
      ((FileNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return ((AssetFileDescriptor)localObject1).getParcelFileDescriptor();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\FileDescriptorLocalUriFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */