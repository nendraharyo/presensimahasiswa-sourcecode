package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

public final class AssetFileDescriptorLocalUriFetcher
  extends LocalUriFetcher
{
  public AssetFileDescriptorLocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  protected void close(AssetFileDescriptor paramAssetFileDescriptor)
  {
    paramAssetFileDescriptor.close();
  }
  
  public Class getDataClass()
  {
    return AssetFileDescriptor.class;
  }
  
  protected AssetFileDescriptor loadResource(Uri paramUri, ContentResolver paramContentResolver)
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
    return (AssetFileDescriptor)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\AssetFileDescriptorLocalUriFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */