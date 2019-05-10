package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HttpUriLoader
  implements ModelLoader
{
  private static final Set SCHEMES;
  private final ModelLoader urlLoader;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[2];
    localObject[0] = "http";
    localObject[1] = "https";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    SCHEMES = Collections.unmodifiableSet(localHashSet);
  }
  
  public HttpUriLoader(ModelLoader paramModelLoader)
  {
    this.urlLoader = paramModelLoader;
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader localModelLoader = this.urlLoader;
    GlideUrl localGlideUrl = new com/bumptech/glide/load/model/GlideUrl;
    String str = paramUri.toString();
    localGlideUrl.<init>(str);
    return localModelLoader.buildLoadData(localGlideUrl, paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(Uri paramUri)
  {
    Set localSet = SCHEMES;
    String str = paramUri.getScheme();
    return localSet.contains(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\HttpUriLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */