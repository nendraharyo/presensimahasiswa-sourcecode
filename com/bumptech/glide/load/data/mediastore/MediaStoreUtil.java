package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import java.util.List;

public final class MediaStoreUtil
{
  private static final int MINI_THUMB_HEIGHT = 384;
  private static final int MINI_THUMB_WIDTH = 512;
  
  public static boolean isMediaStoreImageUri(Uri paramUri)
  {
    boolean bool = isMediaStoreUri(paramUri);
    if (bool)
    {
      bool = isVideoUri(paramUri);
      if (bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isMediaStoreUri(Uri paramUri)
  {
    String str1;
    boolean bool;
    if (paramUri != null)
    {
      str1 = "content";
      String str2 = paramUri.getScheme();
      bool = str1.equals(str2);
      if (bool)
      {
        str1 = "media";
        str2 = paramUri.getAuthority();
        bool = str1.equals(str2);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public static boolean isMediaStoreVideoUri(Uri paramUri)
  {
    boolean bool = isMediaStoreUri(paramUri);
    if (bool)
    {
      bool = isVideoUri(paramUri);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isThumbnailSize(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    if ((paramInt1 != i) && (paramInt2 != i))
    {
      i = 512;
      if (paramInt1 <= i)
      {
        i = 384;
        if (paramInt2 > i) {}
      }
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private static boolean isVideoUri(Uri paramUri)
  {
    return paramUri.getPathSegments().contains("video");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\mediastore\MediaStoreUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */