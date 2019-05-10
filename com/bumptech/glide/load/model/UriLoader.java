package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UriLoader
  implements ModelLoader
{
  private static final Set SCHEMES;
  private final UriLoader.LocalUriFetcherFactory factory;
  
  static
  {
    HashSet localHashSet = new java/util/HashSet;
    Object localObject = new String[3];
    localObject[0] = "file";
    localObject[1] = "android.resource";
    localObject[2] = "content";
    localObject = Arrays.asList((Object[])localObject);
    localHashSet.<init>((Collection)localObject);
    SCHEMES = Collections.unmodifiableSet(localHashSet);
  }
  
  public UriLoader(UriLoader.LocalUriFetcherFactory paramLocalUriFetcherFactory)
  {
    this.factory = paramLocalUriFetcherFactory;
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramUri);
    DataFetcher localDataFetcher = this.factory.build(paramUri);
    localLoadData.<init>(localObjectKey, localDataFetcher);
    return localLoadData;
  }
  
  public boolean handles(Uri paramUri)
  {
    Set localSet = SCHEMES;
    String str = paramUri.getScheme();
    return localSet.contains(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UriLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */