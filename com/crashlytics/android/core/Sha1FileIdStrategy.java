package com.crashlytics.android.core;

import java.io.File;

class Sha1FileIdStrategy
  implements BinaryImagesConverter.FileIdStrategy
{
  /* Error */
  private static String getFileSHA(String paramString)
  {
    // Byte code:
    //   0: new 12	java/io/BufferedInputStream
    //   3: astore_1
    //   4: new 14	java/io/FileInputStream
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: invokespecial 17	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   13: aload_1
    //   14: aload_2
    //   15: invokespecial 20	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   18: aload_1
    //   19: invokestatic 26	io/fabric/sdk/android/services/common/CommonUtils:sha1	(Ljava/io/InputStream;)Ljava/lang/String;
    //   22: astore_2
    //   23: aload_1
    //   24: invokestatic 30	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   27: aload_2
    //   28: areturn
    //   29: astore_2
    //   30: aconst_null
    //   31: astore_1
    //   32: aload_1
    //   33: invokestatic 30	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   36: aload_2
    //   37: athrow
    //   38: astore_2
    //   39: goto -7 -> 32
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	paramString	String
    //   3	30	1	localBufferedInputStream	java.io.BufferedInputStream
    //   7	21	2	localObject1	Object
    //   29	8	2	localObject2	Object
    //   38	1	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   0	3	29	finally
    //   4	7	29	finally
    //   9	13	29	finally
    //   14	18	29	finally
    //   18	22	38	finally
  }
  
  public String createId(File paramFile)
  {
    return getFileSHA(paramFile.getPath());
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\Sha1FileIdStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */