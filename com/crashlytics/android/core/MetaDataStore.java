package com.crashlytics.android.core;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

class MetaDataStore
{
  private static final String KEYDATA_SUFFIX = "keys";
  private static final String KEY_USER_EMAIL = "userEmail";
  private static final String KEY_USER_ID = "userId";
  private static final String KEY_USER_NAME = "userName";
  private static final String METADATA_EXT = ".meta";
  private static final String USERDATA_SUFFIX = "user";
  private static final Charset UTF_8 = Charset.forName("UTF-8");
  private final File filesDir;
  
  public MetaDataStore(File paramFile)
  {
    this.filesDir = paramFile;
  }
  
  private static Map jsonToKeysData(String paramString)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramString);
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Iterator localIterator = localJSONObject.keys();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str1 = (String)localIterator.next();
      String str2 = valueOrNull(localJSONObject, str1);
      localHashMap.put(str1, str2);
    }
    return localHashMap;
  }
  
  private static UserMetaData jsonToUserData(String paramString)
  {
    Object localObject = new org/json/JSONObject;
    ((JSONObject)localObject).<init>(paramString);
    String str1 = valueOrNull((JSONObject)localObject, "userId");
    String str2 = valueOrNull((JSONObject)localObject, "userName");
    localObject = valueOrNull((JSONObject)localObject, "userEmail");
    UserMetaData localUserMetaData = new com/crashlytics/android/core/UserMetaData;
    localUserMetaData.<init>(str1, str2, (String)localObject);
    return localUserMetaData;
  }
  
  private static String keysDataToJson(Map paramMap)
  {
    JSONObject localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>(paramMap);
    return localJSONObject.toString();
  }
  
  private static String userDataToJson(UserMetaData paramUserMetaData)
  {
    MetaDataStore.1 local1 = new com/crashlytics/android/core/MetaDataStore$1;
    local1.<init>(paramUserMetaData);
    return local1.toString();
  }
  
  private static String valueOrNull(JSONObject paramJSONObject, String paramString)
  {
    String str = null;
    boolean bool = paramJSONObject.isNull(paramString);
    if (!bool) {
      str = paramJSONObject.optString(paramString, null);
    }
    return str;
  }
  
  public File getKeysFileForSession(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.filesDir;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "keys" + ".meta";
    localFile1.<init>(localFile2, (String)localObject);
    return localFile1;
  }
  
  public File getUserDataFileForSession(String paramString)
  {
    File localFile1 = new java/io/File;
    File localFile2 = this.filesDir;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString + "user" + ".meta";
    localFile1.<init>(localFile2, (String)localObject);
    return localFile1;
  }
  
  /* Error */
  public Map readKeyData(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 120	com/crashlytics/android/core/MetaDataStore:getKeysFileForSession	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: invokevirtual 123	java/io/File:exists	()Z
    //   10: istore_3
    //   11: iload_3
    //   12: ifne +9 -> 21
    //   15: invokestatic 129	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   18: astore_2
    //   19: aload_2
    //   20: areturn
    //   21: aconst_null
    //   22: astore 4
    //   24: new 131	java/io/FileInputStream
    //   27: astore 5
    //   29: aload 5
    //   31: aload_2
    //   32: invokespecial 134	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: aload 5
    //   37: invokestatic 140	io/fabric/sdk/android/services/common/CommonUtils:streamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_2
    //   42: invokestatic 144	com/crashlytics/android/core/MetaDataStore:jsonToKeysData	(Ljava/lang/String;)Ljava/util/Map;
    //   45: astore_2
    //   46: ldc -110
    //   48: astore 4
    //   50: aload 5
    //   52: aload 4
    //   54: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   57: goto -38 -> 19
    //   60: astore_2
    //   61: iconst_0
    //   62: istore_3
    //   63: aconst_null
    //   64: astore 5
    //   66: invokestatic 156	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   69: astore 4
    //   71: ldc -98
    //   73: astore 6
    //   75: ldc -96
    //   77: astore 7
    //   79: aload 4
    //   81: aload 6
    //   83: aload 7
    //   85: aload_2
    //   86: invokeinterface 166 4 0
    //   91: aload 5
    //   93: ldc -110
    //   95: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   98: invokestatic 129	java/util/Collections:emptyMap	()Ljava/util/Map;
    //   101: astore_2
    //   102: goto -83 -> 19
    //   105: astore_2
    //   106: iconst_0
    //   107: istore_3
    //   108: aconst_null
    //   109: astore 5
    //   111: aload 5
    //   113: ldc -110
    //   115: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   118: aload_2
    //   119: athrow
    //   120: astore_2
    //   121: goto -10 -> 111
    //   124: astore_2
    //   125: goto -59 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	MetaDataStore
    //   0	128	1	paramString	String
    //   5	41	2	localObject1	Object
    //   60	26	2	localException1	Exception
    //   101	1	2	localMap	Map
    //   105	14	2	localObject2	Object
    //   120	1	2	localObject3	Object
    //   124	1	2	localException2	Exception
    //   10	98	3	bool	boolean
    //   22	58	4	localObject4	Object
    //   27	85	5	localFileInputStream	java.io.FileInputStream
    //   73	9	6	str1	String
    //   77	7	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   24	27	60	java/lang/Exception
    //   31	35	60	java/lang/Exception
    //   24	27	105	finally
    //   31	35	105	finally
    //   35	40	120	finally
    //   41	45	120	finally
    //   66	69	120	finally
    //   85	91	120	finally
    //   35	40	124	java/lang/Exception
    //   41	45	124	java/lang/Exception
  }
  
  /* Error */
  public UserMetaData readUserData(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 171	com/crashlytics/android/core/MetaDataStore:getUserDataFileForSession	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_2
    //   6: aload_2
    //   7: invokevirtual 123	java/io/File:exists	()Z
    //   10: istore_3
    //   11: iload_3
    //   12: ifne +9 -> 21
    //   15: getstatic 175	com/crashlytics/android/core/UserMetaData:EMPTY	Lcom/crashlytics/android/core/UserMetaData;
    //   18: astore_2
    //   19: aload_2
    //   20: areturn
    //   21: aconst_null
    //   22: astore 4
    //   24: new 131	java/io/FileInputStream
    //   27: astore 5
    //   29: aload 5
    //   31: aload_2
    //   32: invokespecial 134	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   35: aload 5
    //   37: invokestatic 140	io/fabric/sdk/android/services/common/CommonUtils:streamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   40: astore_2
    //   41: aload_2
    //   42: invokestatic 179	com/crashlytics/android/core/MetaDataStore:jsonToUserData	(Ljava/lang/String;)Lcom/crashlytics/android/core/UserMetaData;
    //   45: astore_2
    //   46: ldc -110
    //   48: astore 4
    //   50: aload 5
    //   52: aload 4
    //   54: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   57: goto -38 -> 19
    //   60: astore_2
    //   61: iconst_0
    //   62: istore_3
    //   63: aconst_null
    //   64: astore 5
    //   66: invokestatic 156	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   69: astore 4
    //   71: ldc -98
    //   73: astore 6
    //   75: ldc -96
    //   77: astore 7
    //   79: aload 4
    //   81: aload 6
    //   83: aload 7
    //   85: aload_2
    //   86: invokeinterface 166 4 0
    //   91: aload 5
    //   93: ldc -110
    //   95: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   98: getstatic 175	com/crashlytics/android/core/UserMetaData:EMPTY	Lcom/crashlytics/android/core/UserMetaData;
    //   101: astore_2
    //   102: goto -83 -> 19
    //   105: astore_2
    //   106: iconst_0
    //   107: istore_3
    //   108: aconst_null
    //   109: astore 5
    //   111: aload 5
    //   113: ldc -110
    //   115: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   118: aload_2
    //   119: athrow
    //   120: astore_2
    //   121: goto -10 -> 111
    //   124: astore_2
    //   125: goto -59 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	MetaDataStore
    //   0	128	1	paramString	String
    //   5	41	2	localObject1	Object
    //   60	26	2	localException1	Exception
    //   101	1	2	localUserMetaData	UserMetaData
    //   105	14	2	localObject2	Object
    //   120	1	2	localObject3	Object
    //   124	1	2	localException2	Exception
    //   10	98	3	bool	boolean
    //   22	58	4	localObject4	Object
    //   27	85	5	localFileInputStream	java.io.FileInputStream
    //   73	9	6	str1	String
    //   77	7	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   24	27	60	java/lang/Exception
    //   31	35	60	java/lang/Exception
    //   24	27	105	finally
    //   31	35	105	finally
    //   35	40	120	finally
    //   41	45	120	finally
    //   66	69	120	finally
    //   85	91	120	finally
    //   35	40	124	java/lang/Exception
    //   41	45	124	java/lang/Exception
  }
  
  /* Error */
  public void writeKeyData(String paramString, Map paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 120	com/crashlytics/android/core/MetaDataStore:getKeysFileForSession	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_2
    //   10: invokestatic 183	com/crashlytics/android/core/MetaDataStore:keysDataToJson	(Ljava/util/Map;)Ljava/lang/String;
    //   13: astore 5
    //   15: new 185	java/io/BufferedWriter
    //   18: astore 6
    //   20: new 187	java/io/OutputStreamWriter
    //   23: astore 7
    //   25: new 189	java/io/FileOutputStream
    //   28: astore 8
    //   30: aload 8
    //   32: aload_3
    //   33: invokespecial 190	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   36: getstatic 38	com/crashlytics/android/core/MetaDataStore:UTF_8	Ljava/nio/charset/Charset;
    //   39: astore_3
    //   40: aload 7
    //   42: aload 8
    //   44: aload_3
    //   45: invokespecial 193	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   48: aload 6
    //   50: aload 7
    //   52: invokespecial 196	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   55: aload 6
    //   57: aload 5
    //   59: invokevirtual 201	java/io/Writer:write	(Ljava/lang/String;)V
    //   62: aload 6
    //   64: invokevirtual 204	java/io/Writer:flush	()V
    //   67: ldc -50
    //   69: astore_3
    //   70: aload 6
    //   72: aload_3
    //   73: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   76: return
    //   77: astore_3
    //   78: aconst_null
    //   79: astore 6
    //   81: invokestatic 156	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   84: astore 4
    //   86: ldc -98
    //   88: astore 5
    //   90: ldc -48
    //   92: astore 7
    //   94: aload 4
    //   96: aload 5
    //   98: aload 7
    //   100: aload_3
    //   101: invokeinterface 166 4 0
    //   106: ldc -50
    //   108: astore_3
    //   109: aload 6
    //   111: aload_3
    //   112: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   115: goto -39 -> 76
    //   118: astore_3
    //   119: aload 4
    //   121: ldc -50
    //   123: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   126: aload_3
    //   127: athrow
    //   128: astore_3
    //   129: aload 6
    //   131: astore 4
    //   133: goto -14 -> 119
    //   136: astore_3
    //   137: goto -56 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	MetaDataStore
    //   0	140	1	paramString	String
    //   0	140	2	paramMap	Map
    //   5	68	3	localObject1	Object
    //   77	24	3	localException1	Exception
    //   108	4	3	str1	String
    //   118	9	3	localObject2	Object
    //   128	1	3	localObject3	Object
    //   136	1	3	localException2	Exception
    //   7	125	4	localObject4	Object
    //   13	84	5	str2	String
    //   18	112	6	localBufferedWriter	java.io.BufferedWriter
    //   23	76	7	localObject5	Object
    //   28	15	8	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   9	13	77	java/lang/Exception
    //   15	18	77	java/lang/Exception
    //   20	23	77	java/lang/Exception
    //   25	28	77	java/lang/Exception
    //   32	36	77	java/lang/Exception
    //   36	39	77	java/lang/Exception
    //   44	48	77	java/lang/Exception
    //   50	55	77	java/lang/Exception
    //   9	13	118	finally
    //   15	18	118	finally
    //   20	23	118	finally
    //   25	28	118	finally
    //   32	36	118	finally
    //   36	39	118	finally
    //   44	48	118	finally
    //   50	55	118	finally
    //   57	62	128	finally
    //   62	67	128	finally
    //   81	84	128	finally
    //   100	106	128	finally
    //   57	62	136	java/lang/Exception
    //   62	67	136	java/lang/Exception
  }
  
  /* Error */
  public void writeUserData(String paramString, UserMetaData paramUserMetaData)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 171	com/crashlytics/android/core/MetaDataStore:getUserDataFileForSession	(Ljava/lang/String;)Ljava/io/File;
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_2
    //   10: invokestatic 212	com/crashlytics/android/core/MetaDataStore:userDataToJson	(Lcom/crashlytics/android/core/UserMetaData;)Ljava/lang/String;
    //   13: astore 5
    //   15: new 185	java/io/BufferedWriter
    //   18: astore 6
    //   20: new 187	java/io/OutputStreamWriter
    //   23: astore 7
    //   25: new 189	java/io/FileOutputStream
    //   28: astore 8
    //   30: aload 8
    //   32: aload_3
    //   33: invokespecial 190	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   36: getstatic 38	com/crashlytics/android/core/MetaDataStore:UTF_8	Ljava/nio/charset/Charset;
    //   39: astore_3
    //   40: aload 7
    //   42: aload 8
    //   44: aload_3
    //   45: invokespecial 193	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    //   48: aload 6
    //   50: aload 7
    //   52: invokespecial 196	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   55: aload 6
    //   57: aload 5
    //   59: invokevirtual 201	java/io/Writer:write	(Ljava/lang/String;)V
    //   62: aload 6
    //   64: invokevirtual 204	java/io/Writer:flush	()V
    //   67: ldc -110
    //   69: astore_3
    //   70: aload 6
    //   72: aload_3
    //   73: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   76: return
    //   77: astore_3
    //   78: aconst_null
    //   79: astore 6
    //   81: invokestatic 156	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   84: astore 4
    //   86: ldc -98
    //   88: astore 5
    //   90: ldc -42
    //   92: astore 7
    //   94: aload 4
    //   96: aload 5
    //   98: aload 7
    //   100: aload_3
    //   101: invokeinterface 166 4 0
    //   106: ldc -110
    //   108: astore_3
    //   109: aload 6
    //   111: aload_3
    //   112: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   115: goto -39 -> 76
    //   118: astore_3
    //   119: aload 4
    //   121: ldc -110
    //   123: invokestatic 150	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   126: aload_3
    //   127: athrow
    //   128: astore_3
    //   129: aload 6
    //   131: astore 4
    //   133: goto -14 -> 119
    //   136: astore_3
    //   137: goto -56 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	MetaDataStore
    //   0	140	1	paramString	String
    //   0	140	2	paramUserMetaData	UserMetaData
    //   5	68	3	localObject1	Object
    //   77	24	3	localException1	Exception
    //   108	4	3	str1	String
    //   118	9	3	localObject2	Object
    //   128	1	3	localObject3	Object
    //   136	1	3	localException2	Exception
    //   7	125	4	localObject4	Object
    //   13	84	5	str2	String
    //   18	112	6	localBufferedWriter	java.io.BufferedWriter
    //   23	76	7	localObject5	Object
    //   28	15	8	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   9	13	77	java/lang/Exception
    //   15	18	77	java/lang/Exception
    //   20	23	77	java/lang/Exception
    //   25	28	77	java/lang/Exception
    //   32	36	77	java/lang/Exception
    //   36	39	77	java/lang/Exception
    //   44	48	77	java/lang/Exception
    //   50	55	77	java/lang/Exception
    //   9	13	118	finally
    //   15	18	118	finally
    //   20	23	118	finally
    //   25	28	118	finally
    //   32	36	118	finally
    //   36	39	118	finally
    //   44	48	118	finally
    //   50	55	118	finally
    //   57	62	128	finally
    //   62	67	128	finally
    //   81	84	128	finally
    //   100	106	128	finally
    //   57	62	136	java/lang/Exception
    //   62	67	136	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\MetaDataStore.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */