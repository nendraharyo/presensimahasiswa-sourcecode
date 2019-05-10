package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Video.Thumbnails;

class ThumbFetcher$VideoThumbnailQuery
  implements ThumbnailQuery
{
  private static final String[] PATH_PROJECTION;
  private static final String PATH_SELECTION = "kind = 1 AND video_id = ?";
  private final ContentResolver contentResolver;
  
  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "_data";
    PATH_PROJECTION = arrayOfString;
  }
  
  ThumbFetcher$VideoThumbnailQuery(ContentResolver paramContentResolver)
  {
    this.contentResolver = paramContentResolver;
  }
  
  public Cursor query(Uri paramUri)
  {
    String str = paramUri.getLastPathSegment();
    ContentResolver localContentResolver = this.contentResolver;
    Uri localUri = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;
    String[] arrayOfString1 = PATH_PROJECTION;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = str;
    return localContentResolver.query(localUri, arrayOfString1, "kind = 1 AND video_id = ?", arrayOfString2, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\mediastore\ThumbFetcher$VideoThumbnailQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */