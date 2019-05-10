package org.apache.http.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VersionInfo
{
  public static final String PROPERTY_MODULE = "info.module";
  public static final String PROPERTY_RELEASE = "info.release";
  public static final String PROPERTY_TIMESTAMP = "info.timestamp";
  public static final String UNAVAILABLE = "UNAVAILABLE";
  public static final String VERSION_PROPERTY_FILE = "version.properties";
  private final String infoClassloader;
  private final String infoModule;
  private final String infoPackage;
  private final String infoRelease;
  private final String infoTimestamp;
  
  protected VersionInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str = "Package identifier";
    Args.notNull(paramString1, str);
    this.infoPackage = paramString1;
    if (paramString2 != null)
    {
      this.infoModule = paramString2;
      if (paramString3 == null) {
        break label67;
      }
      label33:
      this.infoRelease = paramString3;
      if (paramString4 == null) {
        break label73;
      }
      label43:
      this.infoTimestamp = paramString4;
      if (paramString5 == null) {
        break label80;
      }
    }
    for (;;)
    {
      this.infoClassloader = paramString5;
      return;
      paramString2 = "UNAVAILABLE";
      break;
      label67:
      paramString3 = "UNAVAILABLE";
      break label33;
      label73:
      paramString4 = "UNAVAILABLE";
      break label43;
      label80:
      paramString5 = "UNAVAILABLE";
    }
  }
  
  protected static VersionInfo fromMap(String paramString, Map paramMap, ClassLoader paramClassLoader)
  {
    int i = 1;
    String str = null;
    Object localObject1 = "Package identifier";
    Args.notNull(paramString, (String)localObject1);
    Object localObject2;
    Object localObject3;
    boolean bool1;
    label112:
    Object localObject4;
    boolean bool2;
    Object localObject5;
    if (paramMap != null)
    {
      localObject1 = (String)paramMap.get("info.module");
      if (localObject1 != null)
      {
        int j = ((String)localObject1).length();
        if (j < i)
        {
          j = 0;
          localObject2 = null;
          localObject1 = (String)paramMap.get("info.release");
          if (localObject1 != null)
          {
            int k = ((String)localObject1).length();
            if (k >= i)
            {
              localObject3 = "${pom.version}";
              bool1 = ((String)localObject1).equals(localObject3);
              if (!bool1) {}
            }
            else
            {
              bool1 = false;
              localObject3 = null;
              localObject1 = (String)paramMap.get("info.timestamp");
              if (localObject1 != null)
              {
                int m = ((String)localObject1).length();
                if (m >= i)
                {
                  localObject4 = "${mvn.timestamp}";
                  bool2 = ((String)localObject1).equals(localObject4);
                  if (!bool2) {}
                }
                else
                {
                  i = 0;
                  localObject5 = null;
                  localObject4 = localObject3;
                  localObject3 = localObject2;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      if (paramClassLoader != null) {
        str = paramClassLoader.toString();
      }
      localObject1 = new org/apache/http/util/VersionInfo;
      localObject2 = paramString;
      ((VersionInfo)localObject1).<init>(paramString, (String)localObject3, (String)localObject4, (String)localObject5, str);
      return (VersionInfo)localObject1;
      localObject5 = localObject1;
      localObject4 = localObject3;
      localObject3 = localObject2;
      continue;
      localObject3 = localObject1;
      break label112;
      localObject2 = localObject1;
      break;
      i = 0;
      localObject5 = null;
      bool2 = false;
      localObject4 = null;
      bool1 = false;
      localObject3 = null;
    }
  }
  
  public static String getUserAgent(String paramString1, String paramString2, Class paramClass)
  {
    Object localObject = paramClass.getClassLoader();
    localObject = loadVersionInfo(paramString2, (ClassLoader)localObject);
    if (localObject != null) {}
    for (localObject = ((VersionInfo)localObject).getRelease();; localObject = "UNAVAILABLE")
    {
      String str = System.getProperty("java.version");
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      return paramString1 + "/" + (String)localObject + " (Java 1.5 minimum; Java/" + str + ")";
    }
  }
  
  /* Error */
  public static VersionInfo loadVersionInfo(String paramString, ClassLoader paramClassLoader)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 31
    //   4: astore_3
    //   5: aload_0
    //   6: aload_3
    //   7: invokestatic 37	org/apache/http/util/Args:notNull	(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   10: pop
    //   11: aload_1
    //   12: ifnull +107 -> 119
    //   15: new 98	java/lang/StringBuilder
    //   18: astore_3
    //   19: aload_3
    //   20: invokespecial 99	java/lang/StringBuilder:<init>	()V
    //   23: bipush 46
    //   25: istore 4
    //   27: bipush 47
    //   29: istore 5
    //   31: aload_0
    //   32: iload 4
    //   34: iload 5
    //   36: invokevirtual 116	java/lang/String:replace	(CC)Ljava/lang/String;
    //   39: astore 6
    //   41: aload_3
    //   42: aload 6
    //   44: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: astore_3
    //   48: ldc 105
    //   50: astore 6
    //   52: aload_3
    //   53: aload 6
    //   55: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: astore_3
    //   59: ldc 20
    //   61: astore 6
    //   63: aload_3
    //   64: aload 6
    //   66: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: astore_3
    //   70: aload_3
    //   71: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore_3
    //   75: aload_1
    //   76: aload_3
    //   77: invokevirtual 122	java/lang/ClassLoader:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   80: astore 6
    //   82: aload 6
    //   84: ifnull +66 -> 150
    //   87: new 124	java/util/Properties
    //   90: astore_3
    //   91: aload_3
    //   92: invokespecial 125	java/util/Properties:<init>	()V
    //   95: aload_3
    //   96: aload 6
    //   98: invokevirtual 129	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   101: aload 6
    //   103: invokevirtual 134	java/io/InputStream:close	()V
    //   106: aload_3
    //   107: ifnull +10 -> 117
    //   110: aload_0
    //   111: aload_3
    //   112: aload_1
    //   113: invokestatic 138	org/apache/http/util/VersionInfo:fromMap	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/ClassLoader;)Lorg/apache/http/util/VersionInfo;
    //   116: astore_2
    //   117: aload_2
    //   118: areturn
    //   119: invokestatic 144	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   122: astore_3
    //   123: aload_3
    //   124: invokevirtual 147	java/lang/Thread:getContextClassLoader	()Ljava/lang/ClassLoader;
    //   127: astore_1
    //   128: goto -113 -> 15
    //   131: astore_3
    //   132: aload 6
    //   134: invokevirtual 134	java/io/InputStream:close	()V
    //   137: aload_3
    //   138: athrow
    //   139: astore_3
    //   140: aconst_null
    //   141: astore_3
    //   142: goto -36 -> 106
    //   145: astore 6
    //   147: goto -41 -> 106
    //   150: aconst_null
    //   151: astore_3
    //   152: goto -46 -> 106
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	paramString	String
    //   0	155	1	paramClassLoader	ClassLoader
    //   1	117	2	localVersionInfo	VersionInfo
    //   4	120	3	localObject1	Object
    //   131	7	3	localObject2	Object
    //   139	1	3	localIOException1	java.io.IOException
    //   141	11	3	localObject3	Object
    //   25	8	4	c1	char
    //   29	6	5	c2	char
    //   39	94	6	localObject4	Object
    //   145	1	6	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   87	90	131	finally
    //   91	95	131	finally
    //   96	101	131	finally
    //   15	18	139	java/io/IOException
    //   19	23	139	java/io/IOException
    //   34	39	139	java/io/IOException
    //   42	47	139	java/io/IOException
    //   53	58	139	java/io/IOException
    //   64	69	139	java/io/IOException
    //   70	74	139	java/io/IOException
    //   76	80	139	java/io/IOException
    //   132	137	139	java/io/IOException
    //   137	139	139	java/io/IOException
    //   101	106	145	java/io/IOException
  }
  
  public static VersionInfo[] loadVersionInfo(String[] paramArrayOfString, ClassLoader paramClassLoader)
  {
    Args.notNull(paramArrayOfString, "Package identifier array");
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOfString.length;
    localArrayList.<init>(i);
    int j = paramArrayOfString.length;
    i = 0;
    VersionInfo[] arrayOfVersionInfo = null;
    while (i < j)
    {
      VersionInfo localVersionInfo = loadVersionInfo(paramArrayOfString[i], paramClassLoader);
      if (localVersionInfo != null) {
        localArrayList.add(localVersionInfo);
      }
      i += 1;
    }
    arrayOfVersionInfo = new VersionInfo[localArrayList.size()];
    return (VersionInfo[])localArrayList.toArray(arrayOfVersionInfo);
  }
  
  public final String getClassloader()
  {
    return this.infoClassloader;
  }
  
  public final String getModule()
  {
    return this.infoModule;
  }
  
  public final String getPackage()
  {
    return this.infoPackage;
  }
  
  public final String getRelease()
  {
    return this.infoRelease;
  }
  
  public final String getTimestamp()
  {
    return this.infoTimestamp;
  }
  
  public String toString()
  {
    char c1 = ':';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = this.infoPackage.length() + 20;
    int j = this.infoModule.length();
    i += j;
    j = this.infoRelease.length();
    i += j;
    j = this.infoTimestamp.length();
    i += j;
    j = this.infoClassloader.length();
    i += j;
    localStringBuilder.<init>(i);
    Object localObject = localStringBuilder.append("VersionInfo(");
    String str = this.infoPackage;
    localObject = ((StringBuilder)localObject).append(str).append(c1);
    str = this.infoModule;
    ((StringBuilder)localObject).append(str);
    localObject = "UNAVAILABLE";
    str = this.infoRelease;
    boolean bool = ((String)localObject).equals(str);
    if (!bool)
    {
      localObject = localStringBuilder.append(c1);
      str = this.infoRelease;
      ((StringBuilder)localObject).append(str);
    }
    localObject = "UNAVAILABLE";
    str = this.infoTimestamp;
    bool = ((String)localObject).equals(str);
    if (!bool)
    {
      localObject = localStringBuilder.append(c1);
      str = this.infoTimestamp;
      ((StringBuilder)localObject).append(str);
    }
    localStringBuilder.append(')');
    localObject = "UNAVAILABLE";
    str = this.infoClassloader;
    bool = ((String)localObject).equals(str);
    if (!bool)
    {
      char c2 = '@';
      localObject = localStringBuilder.append(c2);
      str = this.infoClassloader;
      ((StringBuilder)localObject).append(str);
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\VersionInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */