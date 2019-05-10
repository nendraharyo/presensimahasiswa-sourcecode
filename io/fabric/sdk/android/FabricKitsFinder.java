package io.fabric.sdk.android;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

class FabricKitsFinder
  implements Callable
{
  private static final String FABRIC_BUILD_TYPE_KEY = "fabric-build-type";
  static final String FABRIC_DIR = "fabric/";
  private static final String FABRIC_IDENTIFIER_KEY = "fabric-identifier";
  private static final String FABRIC_VERSION_KEY = "fabric-version";
  final String apkFileName;
  
  FabricKitsFinder(String paramString)
  {
    this.apkFileName = paramString;
  }
  
  private Map findImplicitKits()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject = "com.google.android.gms.ads.AdView";
    try
    {
      Class.forName((String)localObject);
      localObject = new io/fabric/sdk/android/KitInfo;
      String str1 = "com.google.firebase.firebase-ads";
      String str2 = "0.0.0";
      String str3 = "binary";
      ((KitInfo)localObject).<init>(str1, str2, str3);
      str1 = ((KitInfo)localObject).getIdentifier();
      localHashMap.put(str1, localObject);
      localObject = Fabric.getLogger();
      str1 = "Fabric";
      str2 = "Found kit: com.google.firebase.firebase-ads";
      ((Logger)localObject).v(str1, str2);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return localHashMap;
  }
  
  private Map findRegisteredKits()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    ZipFile localZipFile = loadApkFile();
    Enumeration localEnumeration = localZipFile.entries();
    for (;;)
    {
      boolean bool1 = localEnumeration.hasMoreElements();
      if (!bool1) {
        break;
      }
      Object localObject1 = (ZipEntry)localEnumeration.nextElement();
      Object localObject2 = ((ZipEntry)localObject1).getName();
      String str1 = "fabric/";
      boolean bool2 = ((String)localObject2).startsWith(str1);
      if (bool2)
      {
        localObject2 = ((ZipEntry)localObject1).getName();
        int i = ((String)localObject2).length();
        str1 = "fabric/";
        int j = str1.length();
        if (i > j)
        {
          localObject1 = loadKitInfo((ZipEntry)localObject1, localZipFile);
          if (localObject1 != null)
          {
            localObject2 = ((KitInfo)localObject1).getIdentifier();
            localHashMap.put(localObject2, localObject1);
            localObject2 = Fabric.getLogger();
            str1 = "Fabric";
            String str2 = "Found kit:[%s] version:[%s]";
            int k = 2;
            Object[] arrayOfObject = new Object[k];
            String str3 = ((KitInfo)localObject1).getIdentifier();
            arrayOfObject[0] = str3;
            int m = 1;
            localObject1 = ((KitInfo)localObject1).getVersion();
            arrayOfObject[m] = localObject1;
            localObject1 = String.format(str2, arrayOfObject);
            ((Logger)localObject2).v(str1, (String)localObject1);
          }
        }
      }
    }
    if (localZipFile != null) {}
    try
    {
      localZipFile.close();
      return localHashMap;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  private KitInfo loadKitInfo(ZipEntry paramZipEntry, ZipFile paramZipFile)
  {
    // Byte code:
    //   0: aload_2
    //   1: aload_1
    //   2: invokevirtual 136	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   5: astore_3
    //   6: new 138	java/util/Properties
    //   9: astore 4
    //   11: aload 4
    //   13: invokespecial 139	java/util/Properties:<init>	()V
    //   16: aload 4
    //   18: aload_3
    //   19: invokevirtual 143	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   22: ldc 17
    //   24: astore 5
    //   26: aload 4
    //   28: aload 5
    //   30: invokevirtual 147	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   33: astore 5
    //   35: ldc 20
    //   37: astore 6
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 147	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   46: astore 6
    //   48: ldc 11
    //   50: astore 7
    //   52: aload 4
    //   54: aload 7
    //   56: invokevirtual 147	java/util/Properties:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   59: astore 7
    //   61: aload 5
    //   63: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   66: istore 8
    //   68: iload 8
    //   70: ifne +15 -> 85
    //   73: aload 6
    //   75: invokestatic 153	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   78: istore 8
    //   80: iload 8
    //   82: ifeq +145 -> 227
    //   85: new 155	java/lang/IllegalStateException
    //   88: astore 4
    //   90: new 157	java/lang/StringBuilder
    //   93: astore 5
    //   95: aload 5
    //   97: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   100: ldc -96
    //   102: astore 6
    //   104: aload 5
    //   106: aload 6
    //   108: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: astore 5
    //   113: aload_1
    //   114: invokevirtual 102	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   117: astore 6
    //   119: aload 5
    //   121: aload 6
    //   123: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: astore 5
    //   128: aload 5
    //   130: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   133: astore 5
    //   135: aload 4
    //   137: aload 5
    //   139: invokespecial 170	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   142: aload 4
    //   144: athrow
    //   145: astore 4
    //   147: invokestatic 65	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   150: astore 5
    //   152: ldc 67
    //   154: astore 6
    //   156: new 157	java/lang/StringBuilder
    //   159: astore 7
    //   161: aload 7
    //   163: invokespecial 158	java/lang/StringBuilder:<init>	()V
    //   166: ldc -84
    //   168: astore 9
    //   170: aload 7
    //   172: aload 9
    //   174: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: astore 7
    //   179: aload_1
    //   180: invokevirtual 102	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   183: astore 9
    //   185: aload 7
    //   187: aload 9
    //   189: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: astore 7
    //   194: aload 7
    //   196: invokevirtual 167	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: astore 7
    //   201: aload 5
    //   203: aload 6
    //   205: aload 7
    //   207: aload 4
    //   209: invokeinterface 176 4 0
    //   214: aload_3
    //   215: invokestatic 182	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   218: iconst_0
    //   219: istore 8
    //   221: aconst_null
    //   222: astore 4
    //   224: aload 4
    //   226: areturn
    //   227: new 40	io/fabric/sdk/android/KitInfo
    //   230: astore 4
    //   232: aload 4
    //   234: aload 5
    //   236: aload 6
    //   238: aload 7
    //   240: invokespecial 49	io/fabric/sdk/android/KitInfo:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   243: aload_3
    //   244: invokestatic 182	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   247: goto -23 -> 224
    //   250: astore 4
    //   252: aconst_null
    //   253: astore_3
    //   254: aload_3
    //   255: invokestatic 182	io/fabric/sdk/android/services/common/CommonUtils:closeQuietly	(Ljava/io/Closeable;)V
    //   258: aload 4
    //   260: athrow
    //   261: astore 4
    //   263: goto -9 -> 254
    //   266: astore 4
    //   268: aconst_null
    //   269: astore_3
    //   270: goto -123 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	this	FabricKitsFinder
    //   0	273	1	paramZipEntry	ZipEntry
    //   0	273	2	paramZipFile	ZipFile
    //   5	265	3	localInputStream	java.io.InputStream
    //   9	134	4	localObject1	Object
    //   145	63	4	localIOException1	IOException
    //   222	11	4	localKitInfo	KitInfo
    //   250	9	4	localObject2	Object
    //   261	1	4	localObject3	Object
    //   266	1	4	localIOException2	IOException
    //   24	211	5	localObject4	Object
    //   37	200	6	str1	String
    //   50	189	7	localObject5	Object
    //   66	154	8	bool	boolean
    //   168	20	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   6	9	145	java/io/IOException
    //   11	16	145	java/io/IOException
    //   18	22	145	java/io/IOException
    //   28	33	145	java/io/IOException
    //   41	46	145	java/io/IOException
    //   54	59	145	java/io/IOException
    //   61	66	145	java/io/IOException
    //   73	78	145	java/io/IOException
    //   85	88	145	java/io/IOException
    //   90	93	145	java/io/IOException
    //   95	100	145	java/io/IOException
    //   106	111	145	java/io/IOException
    //   113	117	145	java/io/IOException
    //   121	126	145	java/io/IOException
    //   128	133	145	java/io/IOException
    //   137	142	145	java/io/IOException
    //   142	145	145	java/io/IOException
    //   227	230	145	java/io/IOException
    //   238	243	145	java/io/IOException
    //   1	5	250	finally
    //   6	9	261	finally
    //   11	16	261	finally
    //   18	22	261	finally
    //   28	33	261	finally
    //   41	46	261	finally
    //   54	59	261	finally
    //   61	66	261	finally
    //   73	78	261	finally
    //   85	88	261	finally
    //   90	93	261	finally
    //   95	100	261	finally
    //   106	111	261	finally
    //   113	117	261	finally
    //   121	126	261	finally
    //   128	133	261	finally
    //   137	142	261	finally
    //   142	145	261	finally
    //   147	150	261	finally
    //   156	159	261	finally
    //   161	166	261	finally
    //   172	177	261	finally
    //   179	183	261	finally
    //   187	192	261	finally
    //   194	199	261	finally
    //   207	214	261	finally
    //   227	230	261	finally
    //   238	243	261	finally
    //   1	5	266	java/io/IOException
  }
  
  public Map call()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    long l = SystemClock.elapsedRealtime();
    Object localObject = findImplicitKits();
    localHashMap.putAll((Map)localObject);
    localObject = findRegisteredKits();
    localHashMap.putAll((Map)localObject);
    localObject = Fabric.getLogger();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("finish scanning in ");
    l = SystemClock.elapsedRealtime() - l;
    String str = l;
    ((Logger)localObject).v("Fabric", str);
    return localHashMap;
  }
  
  protected ZipFile loadApkFile()
  {
    ZipFile localZipFile = new java/util/zip/ZipFile;
    String str = this.apkFileName;
    localZipFile.<init>(str);
    return localZipFile;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\FabricKitsFinder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */