package io.fabric.sdk.android.services.common;

import android.content.Context;

class AdvertisingInfoServiceStrategy
  implements AdvertisingInfoStrategy
{
  public static final String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
  public static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
  private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
  private final Context context;
  
  public AdvertisingInfoServiceStrategy(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    this.context = localContext;
  }
  
  /* Error */
  public AdvertisingInfo getAdvertisingInfo()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 37	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   5: astore_2
    //   6: invokestatic 40	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   9: astore_3
    //   10: aload_2
    //   11: aload_3
    //   12: if_acmpne +25 -> 37
    //   15: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   18: astore_2
    //   19: ldc 48
    //   21: astore_3
    //   22: ldc 50
    //   24: astore 4
    //   26: aload_2
    //   27: aload_3
    //   28: aload 4
    //   30: invokeinterface 56 3 0
    //   35: aload_1
    //   36: areturn
    //   37: aload_0
    //   38: getfield 31	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy:context	Landroid/content/Context;
    //   41: astore_2
    //   42: aload_2
    //   43: invokevirtual 60	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   46: astore_2
    //   47: ldc 17
    //   49: astore_3
    //   50: iconst_0
    //   51: istore 5
    //   53: aconst_null
    //   54: astore 4
    //   56: aload_2
    //   57: aload_3
    //   58: iconst_0
    //   59: invokevirtual 66	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   62: pop
    //   63: new 68	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection
    //   66: astore_3
    //   67: aload_3
    //   68: aconst_null
    //   69: invokespecial 71	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection:<init>	(Lio/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$1;)V
    //   72: new 73	android/content/Intent
    //   75: astore_2
    //   76: aload_2
    //   77: ldc 11
    //   79: invokespecial 76	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   82: ldc 14
    //   84: astore 4
    //   86: aload_2
    //   87: aload 4
    //   89: invokevirtual 80	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   92: pop
    //   93: aload_0
    //   94: getfield 31	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy:context	Landroid/content/Context;
    //   97: astore 4
    //   99: iconst_1
    //   100: istore 6
    //   102: aload 4
    //   104: aload_2
    //   105: aload_3
    //   106: iload 6
    //   108: invokevirtual 85	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   111: istore 7
    //   113: iload 7
    //   115: ifeq +194 -> 309
    //   118: new 87	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface
    //   121: astore 4
    //   123: aload_3
    //   124: invokevirtual 91	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingConnection:getBinder	()Landroid/os/IBinder;
    //   127: astore_2
    //   128: aload 4
    //   130: aload_2
    //   131: invokespecial 94	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface:<init>	(Landroid/os/IBinder;)V
    //   134: new 96	io/fabric/sdk/android/services/common/AdvertisingInfo
    //   137: astore_2
    //   138: aload 4
    //   140: invokevirtual 100	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface:getId	()Ljava/lang/String;
    //   143: astore 8
    //   145: aload 4
    //   147: invokevirtual 104	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy$AdvertisingInterface:isLimitAdTrackingEnabled	()Z
    //   150: istore 5
    //   152: aload_2
    //   153: aload 8
    //   155: iload 5
    //   157: invokespecial 107	io/fabric/sdk/android/services/common/AdvertisingInfo:<init>	(Ljava/lang/String;Z)V
    //   160: aload_0
    //   161: getfield 31	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy:context	Landroid/content/Context;
    //   164: astore 4
    //   166: aload 4
    //   168: aload_3
    //   169: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   172: aload_2
    //   173: astore_1
    //   174: goto -139 -> 35
    //   177: astore_2
    //   178: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   181: astore_2
    //   182: ldc 48
    //   184: astore_3
    //   185: ldc 113
    //   187: astore 4
    //   189: aload_2
    //   190: aload_3
    //   191: aload 4
    //   193: invokeinterface 56 3 0
    //   198: goto -163 -> 35
    //   201: astore_2
    //   202: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   205: astore_3
    //   206: ldc 48
    //   208: astore 4
    //   210: ldc 115
    //   212: astore 8
    //   214: aload_3
    //   215: aload 4
    //   217: aload 8
    //   219: aload_2
    //   220: invokeinterface 118 4 0
    //   225: goto -190 -> 35
    //   228: astore_2
    //   229: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   232: astore 4
    //   234: ldc 48
    //   236: astore 8
    //   238: ldc 120
    //   240: astore 9
    //   242: aload 4
    //   244: aload 8
    //   246: aload 9
    //   248: aload_2
    //   249: invokeinterface 123 4 0
    //   254: aload_0
    //   255: getfield 31	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy:context	Landroid/content/Context;
    //   258: astore_2
    //   259: aload_2
    //   260: aload_3
    //   261: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   264: goto -229 -> 35
    //   267: astore_2
    //   268: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   271: astore_3
    //   272: ldc 48
    //   274: astore 4
    //   276: ldc 125
    //   278: astore 8
    //   280: aload_3
    //   281: aload 4
    //   283: aload 8
    //   285: aload_2
    //   286: invokeinterface 118 4 0
    //   291: goto -256 -> 35
    //   294: astore_2
    //   295: aload_0
    //   296: getfield 31	io/fabric/sdk/android/services/common/AdvertisingInfoServiceStrategy:context	Landroid/content/Context;
    //   299: astore 4
    //   301: aload 4
    //   303: aload_3
    //   304: invokevirtual 111	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   307: aload_2
    //   308: athrow
    //   309: invokestatic 46	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   312: astore_2
    //   313: ldc 48
    //   315: astore_3
    //   316: ldc 125
    //   318: astore 4
    //   320: aload_2
    //   321: aload_3
    //   322: aload 4
    //   324: invokeinterface 56 3 0
    //   329: goto -294 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	332	0	this	AdvertisingInfoServiceStrategy
    //   1	173	1	localObject1	Object
    //   5	168	2	localObject2	Object
    //   177	1	2	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   181	9	2	localLogger1	io.fabric.sdk.android.Logger
    //   201	19	2	localException1	Exception
    //   228	21	2	localException2	Exception
    //   258	2	2	localContext	Context
    //   267	19	2	localThrowable	Throwable
    //   294	14	2	localObject3	Object
    //   312	9	2	localLogger2	io.fabric.sdk.android.Logger
    //   9	313	3	localObject4	Object
    //   24	299	4	localObject5	Object
    //   51	105	5	bool1	boolean
    //   100	7	6	i	int
    //   111	3	7	bool2	boolean
    //   143	141	8	str1	String
    //   240	7	9	str2	String
    // Exception table:
    //   from	to	target	type
    //   37	41	177	android/content/pm/PackageManager$NameNotFoundException
    //   42	46	177	android/content/pm/PackageManager$NameNotFoundException
    //   58	63	177	android/content/pm/PackageManager$NameNotFoundException
    //   37	41	201	java/lang/Exception
    //   42	46	201	java/lang/Exception
    //   58	63	201	java/lang/Exception
    //   118	121	228	java/lang/Exception
    //   123	127	228	java/lang/Exception
    //   130	134	228	java/lang/Exception
    //   134	137	228	java/lang/Exception
    //   138	143	228	java/lang/Exception
    //   145	150	228	java/lang/Exception
    //   155	160	228	java/lang/Exception
    //   93	97	267	finally
    //   106	111	267	finally
    //   160	164	267	finally
    //   168	172	267	finally
    //   254	258	267	finally
    //   260	264	267	finally
    //   295	299	267	finally
    //   303	307	267	finally
    //   307	309	267	finally
    //   309	312	267	finally
    //   322	329	267	finally
    //   118	121	294	finally
    //   123	127	294	finally
    //   130	134	294	finally
    //   134	137	294	finally
    //   138	143	294	finally
    //   145	150	294	finally
    //   155	160	294	finally
    //   229	232	294	finally
    //   248	254	294	finally
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfoServiceStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */