package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

final class NativeFileUtils
{
  private static byte[] binaryImagesJsonFromBinaryLibsFile(File paramFile, Context paramContext)
  {
    byte[] arrayOfByte = readFile(paramFile);
    if (arrayOfByte != null)
    {
      int i = arrayOfByte.length;
      if (i != 0) {
        break label20;
      }
    }
    label20:
    String str;
    for (arrayOfByte = null;; arrayOfByte = processBinaryImages(paramContext, str))
    {
      return arrayOfByte;
      str = new java/lang/String;
      str.<init>(arrayOfByte);
    }
  }
  
  static byte[] binaryImagesJsonFromDirectory(File paramFile, Context paramContext)
  {
    Object localObject = filter(paramFile, ".maps");
    if (localObject != null) {
      localObject = binaryImagesJsonFromMapsFile((File)localObject, paramContext);
    }
    for (;;)
    {
      return (byte[])localObject;
      localObject = filter(paramFile, ".binary_libs");
      if (localObject != null) {
        localObject = binaryImagesJsonFromBinaryLibsFile((File)localObject, paramContext);
      } else {
        localObject = null;
      }
    }
  }
  
  private static byte[] binaryImagesJsonFromMapsFile(File paramFile, Context paramContext)
  {
    Object localObject1 = null;
    boolean bool = paramFile.exists();
    if (!bool) {
      return (byte[])localObject1;
    }
    try
    {
      localBufferedReader = new java/io/BufferedReader;
      localObject3 = new java/io/FileReader;
      ((FileReader)localObject3).<init>(paramFile);
      localBufferedReader.<init>((Reader)localObject3);
    }
    finally
    {
      try
      {
        localObject1 = new com/crashlytics/android/core/BinaryImagesConverter;
        Object localObject3 = new com/crashlytics/android/core/Sha1FileIdStrategy;
        ((Sha1FileIdStrategy)localObject3).<init>();
        ((BinaryImagesConverter)localObject1).<init>(paramContext, (BinaryImagesConverter.FileIdStrategy)localObject3);
        localObject1 = ((BinaryImagesConverter)localObject1).convert(localBufferedReader);
        CommonUtils.closeQuietly(localBufferedReader);
      }
      finally
      {
        BufferedReader localBufferedReader;
        for (;;) {}
      }
      localObject4 = finally;
      bool = false;
      localBufferedReader = null;
      localObject1 = localObject4;
    }
    CommonUtils.closeQuietly(localBufferedReader);
    throw ((Throwable)localObject1);
  }
  
  private static File filter(File paramFile, String paramString)
  {
    File[] arrayOfFile = paramFile.listFiles();
    int i = arrayOfFile.length;
    int j = 0;
    File localFile = null;
    int k = 0;
    if (k < i)
    {
      localFile = arrayOfFile[k];
      String str = localFile.getName();
      boolean bool = str.endsWith(paramString);
      if (!bool) {}
    }
    for (;;)
    {
      return localFile;
      j = k + 1;
      k = j;
      break;
      j = 0;
      localFile = null;
    }
  }
  
  static byte[] metadataJsonFromDirectory(File paramFile)
  {
    Object localObject = filter(paramFile, ".device_info");
    if (localObject == null) {}
    for (localObject = null;; localObject = readFile((File)localObject)) {
      return (byte[])localObject;
    }
  }
  
  static byte[] minidumpFromDirectory(File paramFile)
  {
    Object localObject = filter(paramFile, ".dmp");
    if (localObject == null) {}
    for (localObject = new byte[0];; localObject = minidumpFromFile((File)localObject)) {
      return (byte[])localObject;
    }
  }
  
  private static byte[] minidumpFromFile(File paramFile)
  {
    return readFile(paramFile);
  }
  
  private static byte[] processBinaryImages(Context paramContext, String paramString)
  {
    BinaryImagesConverter localBinaryImagesConverter = new com/crashlytics/android/core/BinaryImagesConverter;
    Sha1FileIdStrategy localSha1FileIdStrategy = new com/crashlytics/android/core/Sha1FileIdStrategy;
    localSha1FileIdStrategy.<init>();
    localBinaryImagesConverter.<init>(paramContext, localSha1FileIdStrategy);
    return localBinaryImagesConverter.convert(paramString);
  }
  
  private static byte[] readBytes(InputStream paramInputStream)
  {
    int i = 1024;
    byte[] arrayOfByte = new byte[i];
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>();
    for (;;)
    {
      int j = paramInputStream.read(arrayOfByte);
      int k = -1;
      if (j == k) {
        break;
      }
      k = 0;
      localByteArrayOutputStream.write(arrayOfByte, 0, j);
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  /* Error */
  static byte[] readFile(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 112	java/io/FileInputStream
    //   5: astore_2
    //   6: aload_2
    //   7: aload_0
    //   8: invokespecial 113	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   11: aload_2
    //   12: invokestatic 117	com/crashlytics/android/core/NativeFileUtils:readBytes	(Ljava/io/InputStream;)[B
    //   15: astore_1
    //   16: aload_2
    //   17: invokestatic 70	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   20: aload_1
    //   21: areturn
    //   22: astore_2
    //   23: aconst_null
    //   24: astore_2
    //   25: aload_2
    //   26: invokestatic 70	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   29: goto -9 -> 20
    //   32: astore_2
    //   33: aconst_null
    //   34: astore_2
    //   35: aload_2
    //   36: invokestatic 70	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   39: goto -19 -> 20
    //   42: astore_3
    //   43: aconst_null
    //   44: astore_2
    //   45: aload_3
    //   46: astore_1
    //   47: aload_2
    //   48: invokestatic 70	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   51: aload_1
    //   52: athrow
    //   53: astore_1
    //   54: goto -7 -> 47
    //   57: pop
    //   58: goto -23 -> 35
    //   61: pop
    //   62: goto -37 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	paramFile	File
    //   1	51	1	localObject1	Object
    //   53	1	1	localObject2	Object
    //   5	12	2	localFileInputStream	java.io.FileInputStream
    //   22	1	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   24	2	2	localCloseable1	java.io.Closeable
    //   32	1	2	localIOException1	java.io.IOException
    //   34	14	2	localCloseable2	java.io.Closeable
    //   42	4	3	localObject3	Object
    //   57	1	9	localIOException2	java.io.IOException
    //   61	1	10	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   2	5	22	java/io/FileNotFoundException
    //   7	11	22	java/io/FileNotFoundException
    //   2	5	32	java/io/IOException
    //   7	11	32	java/io/IOException
    //   2	5	42	finally
    //   7	11	42	finally
    //   11	15	53	finally
    //   11	15	57	java/io/IOException
    //   11	15	61	java/io/FileNotFoundException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\NativeFileUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */