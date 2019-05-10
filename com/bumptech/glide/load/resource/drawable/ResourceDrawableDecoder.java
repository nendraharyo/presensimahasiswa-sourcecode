package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

public class ResourceDrawableDecoder
  implements ResourceDecoder
{
  private static final int ID_PATH_SEGMENTS = 1;
  private static final int NAME_PATH_SEGMENT_INDEX = 1;
  private static final int NAME_URI_PATH_SEGMENTS = 2;
  private static final int RESOURCE_ID_SEGMENT_INDEX;
  private static final int TYPE_PATH_SEGMENT_INDEX;
  private final Context context;
  
  public ResourceDrawableDecoder(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
  }
  
  private Context getContextForPackage(Uri paramUri, String paramString)
  {
    try
    {
      Context localContext = this.context;
      localIllegalArgumentException = null;
      return localContext.createPackageContext(paramString, 0);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Failed to obtain context or unrecognized Uri format for: " + paramUri;
      localIllegalArgumentException.<init>((String)localObject, localNameNotFoundException);
      throw localIllegalArgumentException;
    }
  }
  
  private int loadResourceIdFromUri(Uri paramUri)
  {
    int i = 1;
    Object localObject1 = paramUri.getPathSegments();
    int j = 0;
    Object localObject2 = null;
    int k = ((List)localObject1).size();
    int m = 2;
    Object localObject3;
    if (k == m)
    {
      String str = paramUri.getAuthority();
      localObject3 = (String)((List)localObject1).get(0);
      localObject2 = (String)((List)localObject1).get(i);
      localObject1 = this.context.getResources();
      k = ((Resources)localObject1).getIdentifier((String)localObject2, (String)localObject3, str);
      localObject3 = Integer.valueOf(k);
    }
    for (;;)
    {
      if (localObject3 == null)
      {
        localObject3 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Unrecognized Uri format: " + paramUri;
        ((IllegalArgumentException)localObject3).<init>((String)localObject2);
        throw ((Throwable)localObject3);
        k = ((List)localObject1).size();
        if (k == i)
        {
          k = 0;
          localObject3 = null;
          try
          {
            localObject3 = ((List)localObject1).get(0);
            localObject3 = (String)localObject3;
            localObject3 = Integer.valueOf((String)localObject3);
          }
          catch (NumberFormatException localNumberFormatException)
          {
            k = 0;
            localIllegalArgumentException = null;
          }
        }
      }
      else
      {
        j = localIllegalArgumentException.intValue();
        if (j == 0)
        {
          localIllegalArgumentException = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Failed to obtain resource id for: " + paramUri;
          localIllegalArgumentException.<init>((String)localObject2);
          throw localIllegalArgumentException;
        }
        return localIllegalArgumentException.intValue();
      }
      k = 0;
      IllegalArgumentException localIllegalArgumentException = null;
    }
  }
  
  public Resource decode(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    int i = loadResourceIdFromUri(paramUri);
    Object localObject = paramUri.getAuthority();
    String str = this.context.getPackageName();
    boolean bool = ((String)localObject).equals(str);
    if (bool) {}
    for (localObject = this.context;; localObject = getContextForPackage(paramUri, (String)localObject)) {
      return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(this.context, (Context)localObject, i));
    }
  }
  
  public boolean handles(Uri paramUri, Options paramOptions)
  {
    return paramUri.getScheme().equals("android.resource");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\ResourceDrawableDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */