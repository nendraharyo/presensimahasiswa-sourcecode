package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Kit;

class DefaultCachedSettingsIo
  implements CachedSettingsIo
{
  private final Kit kit;
  
  public DefaultCachedSettingsIo(Kit paramKit)
  {
    this.kit = paramKit;
  }
  
  /* Error */
  public org.json.JSONObject readCachedSettings()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 20	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   5: astore_2
    //   6: ldc 22
    //   8: astore_3
    //   9: ldc 24
    //   11: astore 4
    //   13: aload_2
    //   14: aload_3
    //   15: aload 4
    //   17: invokeinterface 30 3 0
    //   22: new 32	java/io/File
    //   25: astore_2
    //   26: new 34	io/fabric/sdk/android/services/persistence/FileStoreImpl
    //   29: astore_3
    //   30: aload_0
    //   31: getfield 14	io/fabric/sdk/android/services/settings/DefaultCachedSettingsIo:kit	Lio/fabric/sdk/android/Kit;
    //   34: astore 4
    //   36: aload_3
    //   37: aload 4
    //   39: invokespecial 37	io/fabric/sdk/android/services/persistence/FileStoreImpl:<init>	(Lio/fabric/sdk/android/Kit;)V
    //   42: aload_3
    //   43: invokevirtual 41	io/fabric/sdk/android/services/persistence/FileStoreImpl:getFilesDir	()Ljava/io/File;
    //   46: astore_3
    //   47: ldc 43
    //   49: astore 4
    //   51: aload_2
    //   52: aload_3
    //   53: aload 4
    //   55: invokespecial 46	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   58: aload_2
    //   59: invokevirtual 50	java/io/File:exists	()Z
    //   62: istore 5
    //   64: iload 5
    //   66: ifeq +40 -> 106
    //   69: new 52	java/io/FileInputStream
    //   72: astore_3
    //   73: aload_3
    //   74: aload_2
    //   75: invokespecial 55	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   78: aload_3
    //   79: invokestatic 61	io/fabric/sdk/android/services/common/CommonUtils:streamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   82: astore 4
    //   84: new 63	org/json/JSONObject
    //   87: astore_2
    //   88: aload_2
    //   89: aload 4
    //   91: invokespecial 66	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   94: aload_3
    //   95: astore_1
    //   96: ldc 68
    //   98: astore_3
    //   99: aload_1
    //   100: aload_3
    //   101: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   104: aload_2
    //   105: areturn
    //   106: invokestatic 20	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   109: astore_2
    //   110: ldc 22
    //   112: astore_3
    //   113: ldc 74
    //   115: astore 4
    //   117: aload_2
    //   118: aload_3
    //   119: aload 4
    //   121: invokeinterface 30 3 0
    //   126: aconst_null
    //   127: astore_2
    //   128: goto -32 -> 96
    //   131: astore_2
    //   132: iconst_0
    //   133: istore 5
    //   135: aconst_null
    //   136: astore_3
    //   137: invokestatic 20	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   140: astore 4
    //   142: ldc 22
    //   144: astore 6
    //   146: ldc 76
    //   148: astore 7
    //   150: aload 4
    //   152: aload 6
    //   154: aload 7
    //   156: aload_2
    //   157: invokeinterface 80 4 0
    //   162: aload_3
    //   163: ldc 68
    //   165: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   168: aconst_null
    //   169: astore_2
    //   170: goto -66 -> 104
    //   173: astore_2
    //   174: aload_1
    //   175: ldc 68
    //   177: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   180: aload_2
    //   181: athrow
    //   182: astore_2
    //   183: aload_3
    //   184: astore_1
    //   185: goto -11 -> 174
    //   188: astore_2
    //   189: goto -52 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	DefaultCachedSettingsIo
    //   1	184	1	localObject1	Object
    //   5	123	2	localObject2	Object
    //   131	26	2	localException1	Exception
    //   169	1	2	localObject3	Object
    //   173	8	2	localObject4	Object
    //   182	1	2	localObject5	Object
    //   188	1	2	localException2	Exception
    //   8	176	3	localObject6	Object
    //   11	140	4	localObject7	Object
    //   62	72	5	bool	boolean
    //   144	9	6	str1	String
    //   148	7	7	str2	String
    // Exception table:
    //   from	to	target	type
    //   22	25	131	java/lang/Exception
    //   26	29	131	java/lang/Exception
    //   30	34	131	java/lang/Exception
    //   37	42	131	java/lang/Exception
    //   42	46	131	java/lang/Exception
    //   53	58	131	java/lang/Exception
    //   58	62	131	java/lang/Exception
    //   69	72	131	java/lang/Exception
    //   74	78	131	java/lang/Exception
    //   106	109	131	java/lang/Exception
    //   119	126	131	java/lang/Exception
    //   22	25	173	finally
    //   26	29	173	finally
    //   30	34	173	finally
    //   37	42	173	finally
    //   42	46	173	finally
    //   53	58	173	finally
    //   58	62	173	finally
    //   69	72	173	finally
    //   74	78	173	finally
    //   106	109	173	finally
    //   119	126	173	finally
    //   78	82	182	finally
    //   84	87	182	finally
    //   89	94	182	finally
    //   137	140	182	finally
    //   156	162	182	finally
    //   78	82	188	java/lang/Exception
    //   84	87	188	java/lang/Exception
    //   89	94	188	java/lang/Exception
  }
  
  /* Error */
  public void writeCachedSettings(long paramLong, org.json.JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: invokestatic 20	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   3: astore 4
    //   5: ldc 22
    //   7: astore 5
    //   9: ldc 84
    //   11: astore 6
    //   13: aload 4
    //   15: aload 5
    //   17: aload 6
    //   19: invokeinterface 30 3 0
    //   24: aload_3
    //   25: ifnull +102 -> 127
    //   28: aconst_null
    //   29: astore 6
    //   31: ldc 86
    //   33: astore 4
    //   35: aload_3
    //   36: aload 4
    //   38: lload_1
    //   39: invokevirtual 90	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   42: pop
    //   43: new 92	java/io/FileWriter
    //   46: astore 5
    //   48: new 32	java/io/File
    //   51: astore 4
    //   53: new 34	io/fabric/sdk/android/services/persistence/FileStoreImpl
    //   56: astore 7
    //   58: aload_0
    //   59: getfield 14	io/fabric/sdk/android/services/settings/DefaultCachedSettingsIo:kit	Lio/fabric/sdk/android/Kit;
    //   62: astore 8
    //   64: aload 7
    //   66: aload 8
    //   68: invokespecial 37	io/fabric/sdk/android/services/persistence/FileStoreImpl:<init>	(Lio/fabric/sdk/android/Kit;)V
    //   71: aload 7
    //   73: invokevirtual 41	io/fabric/sdk/android/services/persistence/FileStoreImpl:getFilesDir	()Ljava/io/File;
    //   76: astore 7
    //   78: ldc 43
    //   80: astore 8
    //   82: aload 4
    //   84: aload 7
    //   86: aload 8
    //   88: invokespecial 46	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   91: aload 5
    //   93: aload 4
    //   95: invokespecial 93	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   98: aload_3
    //   99: invokevirtual 97	org/json/JSONObject:toString	()Ljava/lang/String;
    //   102: astore 4
    //   104: aload 5
    //   106: aload 4
    //   108: invokevirtual 100	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   111: aload 5
    //   113: invokevirtual 103	java/io/FileWriter:flush	()V
    //   116: ldc 105
    //   118: astore 4
    //   120: aload 5
    //   122: aload 4
    //   124: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   127: return
    //   128: astore 4
    //   130: aconst_null
    //   131: astore 5
    //   133: invokestatic 20	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   136: astore 6
    //   138: ldc 22
    //   140: astore 7
    //   142: ldc 107
    //   144: astore 8
    //   146: aload 6
    //   148: aload 7
    //   150: aload 8
    //   152: aload 4
    //   154: invokeinterface 80 4 0
    //   159: ldc 105
    //   161: astore 4
    //   163: aload 5
    //   165: aload 4
    //   167: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   170: goto -43 -> 127
    //   173: astore 4
    //   175: aload 6
    //   177: ldc 105
    //   179: invokestatic 72	io/fabric/sdk/android/services/common/CommonUtils:closeOrLog	(Ljava/io/Closeable;Ljava/lang/String;)V
    //   182: aload 4
    //   184: athrow
    //   185: astore 4
    //   187: aload 5
    //   189: astore 6
    //   191: goto -16 -> 175
    //   194: astore 4
    //   196: goto -63 -> 133
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	199	0	this	DefaultCachedSettingsIo
    //   0	199	1	paramLong	long
    //   0	199	3	paramJSONObject	org.json.JSONObject
    //   3	120	4	localObject1	Object
    //   128	25	4	localException1	Exception
    //   161	5	4	str	String
    //   173	10	4	localObject2	Object
    //   185	1	4	localObject3	Object
    //   194	1	4	localException2	Exception
    //   7	181	5	localObject4	Object
    //   11	179	6	localObject5	Object
    //   56	93	7	localObject6	Object
    //   62	89	8	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   38	43	128	java/lang/Exception
    //   43	46	128	java/lang/Exception
    //   48	51	128	java/lang/Exception
    //   53	56	128	java/lang/Exception
    //   58	62	128	java/lang/Exception
    //   66	71	128	java/lang/Exception
    //   71	76	128	java/lang/Exception
    //   86	91	128	java/lang/Exception
    //   93	98	128	java/lang/Exception
    //   38	43	173	finally
    //   43	46	173	finally
    //   48	51	173	finally
    //   53	56	173	finally
    //   58	62	173	finally
    //   66	71	173	finally
    //   71	76	173	finally
    //   86	91	173	finally
    //   93	98	173	finally
    //   98	102	185	finally
    //   106	111	185	finally
    //   111	116	185	finally
    //   133	136	185	finally
    //   152	159	185	finally
    //   98	102	194	java/lang/Exception
    //   106	111	194	java/lang/Exception
    //   111	116	194	java/lang/Exception
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\DefaultCachedSettingsIo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */