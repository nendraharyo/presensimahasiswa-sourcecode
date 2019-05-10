package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

class ThumbnailStreamOpener
{
  private static final FileService DEFAULT_SERVICE;
  private static final String TAG = "ThumbStreamOpener";
  private final ArrayPool byteArrayPool;
  private final ContentResolver contentResolver;
  private final List parsers;
  private final ThumbnailQuery query;
  private final FileService service;
  
  static
  {
    FileService localFileService = new com/bumptech/glide/load/data/mediastore/FileService;
    localFileService.<init>();
    DEFAULT_SERVICE = localFileService;
  }
  
  ThumbnailStreamOpener(List paramList, FileService paramFileService, ThumbnailQuery paramThumbnailQuery, ArrayPool paramArrayPool, ContentResolver paramContentResolver)
  {
    this.service = paramFileService;
    this.query = paramThumbnailQuery;
    this.byteArrayPool = paramArrayPool;
    this.contentResolver = paramContentResolver;
    this.parsers = paramList;
  }
  
  ThumbnailStreamOpener(List paramList, ThumbnailQuery paramThumbnailQuery, ArrayPool paramArrayPool, ContentResolver paramContentResolver)
  {
    this(paramList, localFileService, paramThumbnailQuery, paramArrayPool, paramContentResolver);
  }
  
  /* Error */
  private String getPath(Uri paramUri)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:query	Lcom/bumptech/glide/load/data/mediastore/ThumbnailQuery;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokeinterface 47 2 0
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull +41 -> 55
    //   17: aload_3
    //   18: invokeinterface 53 1 0
    //   23: istore 4
    //   25: iload 4
    //   27: ifeq +28 -> 55
    //   30: iconst_0
    //   31: istore 4
    //   33: aconst_null
    //   34: astore_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 57 2 0
    //   42: astore_2
    //   43: aload_3
    //   44: ifnull +9 -> 53
    //   47: aload_3
    //   48: invokeinterface 60 1 0
    //   53: aload_2
    //   54: areturn
    //   55: iconst_0
    //   56: istore 4
    //   58: aconst_null
    //   59: astore_2
    //   60: aload_3
    //   61: ifnull -8 -> 53
    //   64: aload_3
    //   65: invokeinterface 60 1 0
    //   70: goto -17 -> 53
    //   73: astore_2
    //   74: aload_3
    //   75: ifnull +9 -> 84
    //   78: aload_3
    //   79: invokeinterface 60 1 0
    //   84: aload_2
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	ThumbnailStreamOpener
    //   0	86	1	paramUri	Uri
    //   4	56	2	localObject1	Object
    //   73	12	2	localObject2	Object
    //   12	67	3	localCursor	android.database.Cursor
    //   23	34	4	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   17	23	73	finally
    //   36	42	73	finally
  }
  
  private boolean isValid(File paramFile)
  {
    FileService localFileService1 = this.service;
    boolean bool = localFileService1.exists(paramFile);
    if (bool)
    {
      long l1 = 0L;
      FileService localFileService2 = this.service;
      long l2 = localFileService2.length(paramFile);
      bool = l1 < l2;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localFileService1 = null;
    }
  }
  
  /* Error */
  int getOrientation(Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 37	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:contentResolver	Landroid/content/ContentResolver;
    //   6: astore_3
    //   7: aload_3
    //   8: aload_1
    //   9: invokevirtual 75	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 39	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:parsers	Ljava/util/List;
    //   17: astore_3
    //   18: aload_0
    //   19: getfield 35	com/bumptech/glide/load/data/mediastore/ThumbnailStreamOpener:byteArrayPool	Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;
    //   22: astore 4
    //   24: aload_3
    //   25: aload_2
    //   26: aload 4
    //   28: invokestatic 81	com/bumptech/glide/load/ImageHeaderParserUtils:getOrientation	(Ljava/util/List;Ljava/io/InputStream;Lcom/bumptech/glide/load/engine/bitmap_recycle/ArrayPool;)I
    //   31: istore 5
    //   33: aload_2
    //   34: ifnull +7 -> 41
    //   37: aload_2
    //   38: invokevirtual 84	java/io/InputStream:close	()V
    //   41: iload 5
    //   43: ireturn
    //   44: astore_3
    //   45: ldc 11
    //   47: astore 4
    //   49: iconst_3
    //   50: istore 6
    //   52: aload 4
    //   54: iload 6
    //   56: invokestatic 91	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   59: istore 7
    //   61: iload 7
    //   63: ifeq +54 -> 117
    //   66: ldc 11
    //   68: astore 4
    //   70: new 93	java/lang/StringBuilder
    //   73: astore 8
    //   75: aload 8
    //   77: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   80: ldc 96
    //   82: astore 9
    //   84: aload 8
    //   86: aload 9
    //   88: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: astore 8
    //   93: aload 8
    //   95: aload_1
    //   96: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   99: astore 8
    //   101: aload 8
    //   103: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: astore 8
    //   108: aload 4
    //   110: aload 8
    //   112: aload_3
    //   113: invokestatic 111	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   116: pop
    //   117: aload_2
    //   118: ifnull +7 -> 125
    //   121: aload_2
    //   122: invokevirtual 84	java/io/InputStream:close	()V
    //   125: iconst_m1
    //   126: istore 5
    //   128: goto -87 -> 41
    //   131: astore_3
    //   132: aload_2
    //   133: ifnull +7 -> 140
    //   136: aload_2
    //   137: invokevirtual 84	java/io/InputStream:close	()V
    //   140: aload_3
    //   141: athrow
    //   142: astore_2
    //   143: goto -102 -> 41
    //   146: astore_3
    //   147: goto -22 -> 125
    //   150: astore_2
    //   151: goto -11 -> 140
    //   154: astore_3
    //   155: goto -110 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	ThumbnailStreamOpener
    //   0	158	1	paramUri	Uri
    //   1	136	2	localInputStream	InputStream
    //   142	1	2	localIOException1	java.io.IOException
    //   150	1	2	localIOException2	java.io.IOException
    //   6	19	3	localObject1	Object
    //   44	69	3	localNullPointerException	NullPointerException
    //   131	10	3	localObject2	Object
    //   146	1	3	localIOException3	java.io.IOException
    //   154	1	3	localIOException4	java.io.IOException
    //   22	87	4	localObject3	Object
    //   31	96	5	i	int
    //   50	5	6	j	int
    //   59	3	7	bool	boolean
    //   73	38	8	localObject4	Object
    //   82	5	9	str	String
    // Exception table:
    //   from	to	target	type
    //   2	6	44	java/lang/NullPointerException
    //   8	12	44	java/lang/NullPointerException
    //   13	17	44	java/lang/NullPointerException
    //   18	22	44	java/lang/NullPointerException
    //   26	31	44	java/lang/NullPointerException
    //   2	6	131	finally
    //   8	12	131	finally
    //   13	17	131	finally
    //   18	22	131	finally
    //   26	31	131	finally
    //   54	59	131	finally
    //   70	73	131	finally
    //   75	80	131	finally
    //   86	91	131	finally
    //   95	99	131	finally
    //   101	106	131	finally
    //   112	117	131	finally
    //   37	41	142	java/io/IOException
    //   121	125	146	java/io/IOException
    //   136	140	150	java/io/IOException
    //   2	6	154	java/io/IOException
    //   8	12	154	java/io/IOException
    //   13	17	154	java/io/IOException
    //   18	22	154	java/io/IOException
    //   26	31	154	java/io/IOException
  }
  
  public InputStream open(Uri paramUri)
  {
    Object localObject1 = null;
    Object localObject2 = getPath(paramUri);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool) {}
    for (;;)
    {
      return (InputStream)localObject1;
      Object localObject3 = this.service;
      localObject2 = ((FileService)localObject3).get((String)localObject2);
      bool = isValid((File)localObject2);
      if (!bool) {
        continue;
      }
      localObject2 = Uri.fromFile((File)localObject2);
      try
      {
        localObject1 = this.contentResolver;
        localObject1 = ((ContentResolver)localObject1).openInputStream((Uri)localObject2);
      }
      catch (NullPointerException localNullPointerException)
      {
        localObject3 = new java/io/FileNotFoundException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "NPE opening uri: " + paramUri + " -> " + localObject2;
        ((FileNotFoundException)localObject3).<init>((String)localObject2);
        throw ((FileNotFoundException)((FileNotFoundException)localObject3).initCause(localNullPointerException));
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\mediastore\ThumbnailStreamOpener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */