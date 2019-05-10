package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import java.io.File;

public class StringLoader
  implements ModelLoader
{
  private final ModelLoader uriLoader;
  
  public StringLoader(ModelLoader paramModelLoader)
  {
    this.uriLoader = paramModelLoader;
  }
  
  private static Uri parseUri(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Uri localUri;
    if (bool)
    {
      bool = false;
      localUri = null;
    }
    for (;;)
    {
      return localUri;
      localUri = null;
      int i = paramString.charAt(0);
      int j = 47;
      if (i == j)
      {
        localUri = toFileUri(paramString);
      }
      else
      {
        localUri = Uri.parse(paramString);
        String str = localUri.getScheme();
        if (str == null) {
          localUri = toFileUri(paramString);
        }
      }
    }
  }
  
  private static Uri toFileUri(String paramString)
  {
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    return Uri.fromFile(localFile);
  }
  
  public ModelLoader.LoadData buildLoadData(String paramString, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject = parseUri(paramString);
    ModelLoader localModelLoader;
    if (localObject != null)
    {
      localModelLoader = this.uriLoader;
      boolean bool = localModelLoader.handles(localObject);
      if (bool) {
        break label39;
      }
    }
    for (localObject = null;; localObject = localModelLoader.buildLoadData(localObject, paramInt1, paramInt2, paramOptions))
    {
      return (ModelLoader.LoadData)localObject;
      label39:
      localModelLoader = this.uriLoader;
    }
  }
  
  public boolean handles(String paramString)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\StringLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */