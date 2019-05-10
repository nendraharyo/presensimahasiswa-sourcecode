package com.bumptech.glide.load.model;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.Options;

public class ResourceLoader
  implements ModelLoader
{
  private static final String TAG = "ResourceLoader";
  private final Resources resources;
  private final ModelLoader uriLoader;
  
  public ResourceLoader(Resources paramResources, ModelLoader paramModelLoader)
  {
    this.resources = paramResources;
    this.uriLoader = paramModelLoader;
  }
  
  private Uri getResourceUri(Integer paramInteger)
  {
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "android.resource://";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject3 = this.resources;
      i = paramInteger.intValue();
      localObject3 = ((Resources)localObject3).getResourcePackageName(i);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      char c = '/';
      localObject1 = ((StringBuilder)localObject1).append(c);
      localObject3 = this.resources;
      i = paramInteger.intValue();
      localObject3 = ((Resources)localObject3).getResourceTypeName(i);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      c = '/';
      localObject1 = ((StringBuilder)localObject1).append(c);
      localObject3 = this.resources;
      i = paramInteger.intValue();
      localObject3 = ((Resources)localObject3).getResourceEntryName(i);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject1 = Uri.parse((String)localObject1);
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = "ResourceLoader";
        int i = 5;
        boolean bool = Log.isLoggable((String)localObject3, i);
        if (bool)
        {
          localObject3 = "ResourceLoader";
          Object localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          String str = "Received invalid resource id: ";
          localObject4 = str + paramInteger;
          Log.w((String)localObject3, (String)localObject4, localNotFoundException);
        }
        Object localObject2 = null;
      }
    }
    return (Uri)localObject1;
  }
  
  public ModelLoader.LoadData buildLoadData(Integer paramInteger, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject = getResourceUri(paramInteger);
    if (localObject == null) {}
    ModelLoader localModelLoader;
    for (localObject = null;; localObject = localModelLoader.buildLoadData(localObject, paramInt1, paramInt2, paramOptions))
    {
      return (ModelLoader.LoadData)localObject;
      localModelLoader = this.uriLoader;
    }
  }
  
  public boolean handles(Integer paramInteger)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ResourceLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */