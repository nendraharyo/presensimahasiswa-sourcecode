package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;
import java.util.List;

public class AssetUriLoader
  implements ModelLoader
{
  private static final String ASSET_PATH_SEGMENT = "android_asset";
  private static final String ASSET_PREFIX = "file:///android_asset/";
  private static final int ASSET_PREFIX_LENGTH = "file:///android_asset/".length();
  private final AssetManager assetManager;
  private final AssetUriLoader.AssetFetcherFactory factory;
  
  public AssetUriLoader(AssetManager paramAssetManager, AssetUriLoader.AssetFetcherFactory paramAssetFetcherFactory)
  {
    this.assetManager = paramAssetManager;
    this.factory = paramAssetFetcherFactory;
  }
  
  public ModelLoader.LoadData buildLoadData(Uri paramUri, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject = paramUri.toString();
    int i = ASSET_PREFIX_LENGTH;
    localObject = ((String)localObject).substring(i);
    ModelLoader.LoadData localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
    ObjectKey localObjectKey = new com/bumptech/glide/signature/ObjectKey;
    localObjectKey.<init>(paramUri);
    AssetUriLoader.AssetFetcherFactory localAssetFetcherFactory = this.factory;
    AssetManager localAssetManager = this.assetManager;
    localObject = localAssetFetcherFactory.buildFetcher(localAssetManager, (String)localObject);
    localLoadData.<init>(localObjectKey, (DataFetcher)localObject);
    return localLoadData;
  }
  
  public boolean handles(Uri paramUri)
  {
    boolean bool1 = false;
    Object localObject1 = "file";
    Object localObject2 = paramUri.getScheme();
    boolean bool2 = ((String)localObject1).equals(localObject2);
    if (bool2)
    {
      localObject1 = paramUri.getPathSegments();
      bool2 = ((List)localObject1).isEmpty();
      if (!bool2)
      {
        localObject1 = "android_asset";
        localObject2 = paramUri.getPathSegments().get(0);
        bool2 = ((String)localObject1).equals(localObject2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\AssetUriLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */