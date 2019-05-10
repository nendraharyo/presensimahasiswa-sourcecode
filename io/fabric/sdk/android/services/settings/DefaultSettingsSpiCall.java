package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class DefaultSettingsSpiCall
  extends AbstractSpiCall
  implements SettingsSpiCall
{
  static final String BUILD_VERSION_PARAM = "build_version";
  static final String DISPLAY_VERSION_PARAM = "display_version";
  static final String HEADER_DEVICE_MODEL = "X-CRASHLYTICS-DEVICE-MODEL";
  static final String HEADER_INSTALLATION_ID = "X-CRASHLYTICS-INSTALLATION-ID";
  static final String HEADER_OS_BUILD_VERSION = "X-CRASHLYTICS-OS-BUILD-VERSION";
  static final String HEADER_OS_DISPLAY_VERSION = "X-CRASHLYTICS-OS-DISPLAY-VERSION";
  static final String ICON_HASH = "icon_hash";
  static final String INSTANCE_PARAM = "instance";
  static final String SOURCE_PARAM = "source";
  
  public DefaultSettingsSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory)
  {
    this(paramKit, paramString1, paramString2, paramHttpRequestFactory, localHttpMethod);
  }
  
  DefaultSettingsSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory, HttpMethod paramHttpMethod)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, paramHttpMethod);
  }
  
  private HttpRequest applyHeadersTo(HttpRequest paramHttpRequest, SettingsRequest paramSettingsRequest)
  {
    String str = paramSettingsRequest.apiKey;
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-API-KEY", str);
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    str = this.kit.getVersion();
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", str);
    applyNonNullHeader(paramHttpRequest, "Accept", "application/json");
    str = paramSettingsRequest.deviceModel;
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-DEVICE-MODEL", str);
    str = paramSettingsRequest.osBuildVersion;
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", str);
    str = paramSettingsRequest.osDisplayVersion;
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", str);
    str = paramSettingsRequest.installationId;
    applyNonNullHeader(paramHttpRequest, "X-CRASHLYTICS-INSTALLATION-ID", str);
    return paramHttpRequest;
  }
  
  private void applyNonNullHeader(HttpRequest paramHttpRequest, String paramString1, String paramString2)
  {
    if (paramString2 != null) {
      paramHttpRequest.header(paramString1, paramString2);
    }
  }
  
  private JSONObject getJsonObjectFrom(String paramString)
  {
    try
    {
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        JSONObject localJSONObject;
        Object localObject1 = Fabric.getLogger();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Failed to parse settings JSON from ");
        String str = getUrl();
        localObject2 = str;
        ((Logger)localObject1).d("Fabric", (String)localObject2, localException);
        Logger localLogger = Fabric.getLogger();
        localObject1 = "Fabric";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = "Settings response ";
        localObject3 = (String)localObject2 + paramString;
        localLogger.d((String)localObject1, (String)localObject3);
        localLogger = null;
      }
    }
    return localJSONObject;
  }
  
  private Map getQueryParamsFor(SettingsRequest paramSettingsRequest)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1 = paramSettingsRequest.buildVersion;
    localHashMap.put("build_version", str1);
    str1 = paramSettingsRequest.displayVersion;
    localHashMap.put("display_version", str1);
    int i = paramSettingsRequest.source;
    str1 = Integer.toString(i);
    localHashMap.put("source", str1);
    String str2 = paramSettingsRequest.iconHash;
    if (str2 != null)
    {
      str2 = "icon_hash";
      str1 = paramSettingsRequest.iconHash;
      localHashMap.put(str2, str1);
    }
    str2 = paramSettingsRequest.instanceId;
    boolean bool = CommonUtils.isNullOrEmpty(str2);
    if (!bool)
    {
      str1 = "instance";
      localHashMap.put(str1, str2);
    }
    return localHashMap;
  }
  
  JSONObject handleResponse(HttpRequest paramHttpRequest)
  {
    int i = paramHttpRequest.code();
    Object localObject1 = Fabric.getLogger();
    Object localObject2 = "Fabric";
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    String str = "Settings result was: ";
    localObject3 = str + i;
    ((Logger)localObject1).d((String)localObject2, (String)localObject3);
    boolean bool = requestWasSuccessful(i);
    if (bool) {
      localObject4 = paramHttpRequest.body();
    }
    for (Object localObject4 = getJsonObjectFrom((String)localObject4);; localObject4 = null)
    {
      return (JSONObject)localObject4;
      localObject4 = Fabric.getLogger();
      localObject1 = "Fabric";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Failed to retrieve settings from ");
      localObject3 = getUrl();
      localObject2 = (String)localObject3;
      ((Logger)localObject4).e((String)localObject1, (String)localObject2);
      bool = false;
    }
  }
  
  /* Error */
  public JSONObject invoke(SettingsRequest paramSettingsRequest)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 202	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:getQueryParamsFor	(Lio/fabric/sdk/android/services/settings/SettingsRequest;)Ljava/util/Map;
    //   7: astore_3
    //   8: aload_0
    //   9: aload_3
    //   10: invokevirtual 206	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:getHttpRequest	(Ljava/util/Map;)Lio/fabric/sdk/android/services/network/HttpRequest;
    //   13: astore 4
    //   15: aload_0
    //   16: aload 4
    //   18: aload_1
    //   19: invokespecial 210	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:applyHeadersTo	(Lio/fabric/sdk/android/services/network/HttpRequest;Lio/fabric/sdk/android/services/settings/SettingsRequest;)Lio/fabric/sdk/android/services/network/HttpRequest;
    //   22: astore 4
    //   24: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   27: astore 5
    //   29: ldc 108
    //   31: astore 6
    //   33: new 110	java/lang/StringBuilder
    //   36: astore 7
    //   38: aload 7
    //   40: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   43: ldc -44
    //   45: astore 8
    //   47: aload 7
    //   49: aload 8
    //   51: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: astore 7
    //   56: aload_0
    //   57: invokevirtual 122	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:getUrl	()Ljava/lang/String;
    //   60: astore 8
    //   62: aload 7
    //   64: aload 8
    //   66: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: astore 7
    //   71: aload 7
    //   73: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 7
    //   78: aload 5
    //   80: aload 6
    //   82: aload 7
    //   84: invokeinterface 136 3 0
    //   89: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   92: astore 5
    //   94: ldc 108
    //   96: astore 6
    //   98: new 110	java/lang/StringBuilder
    //   101: astore 7
    //   103: aload 7
    //   105: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   108: ldc -42
    //   110: astore 8
    //   112: aload 7
    //   114: aload 8
    //   116: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: astore 7
    //   121: aload 7
    //   123: aload_3
    //   124: invokevirtual 217	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   127: astore_3
    //   128: aload_3
    //   129: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   132: astore_3
    //   133: aload 5
    //   135: aload 6
    //   137: aload_3
    //   138: invokeinterface 136 3 0
    //   143: aload_0
    //   144: aload 4
    //   146: invokevirtual 221	io/fabric/sdk/android/services/settings/DefaultSettingsSpiCall:handleResponse	(Lio/fabric/sdk/android/services/network/HttpRequest;)Lorg/json/JSONObject;
    //   149: astore_2
    //   150: aload 4
    //   152: ifnull +65 -> 217
    //   155: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   158: astore_3
    //   159: ldc 108
    //   161: astore 5
    //   163: new 110	java/lang/StringBuilder
    //   166: astore 6
    //   168: aload 6
    //   170: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   173: aload 6
    //   175: ldc -33
    //   177: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: astore 6
    //   182: ldc -31
    //   184: astore 7
    //   186: aload 4
    //   188: aload 7
    //   190: invokevirtual 228	io/fabric/sdk/android/services/network/HttpRequest:header	(Ljava/lang/String;)Ljava/lang/String;
    //   193: astore 4
    //   195: aload 6
    //   197: aload 4
    //   199: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: astore 4
    //   207: aload_3
    //   208: aload 5
    //   210: aload 4
    //   212: invokeinterface 136 3 0
    //   217: aload_2
    //   218: areturn
    //   219: astore_3
    //   220: aconst_null
    //   221: astore 4
    //   223: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   226: astore 5
    //   228: ldc 108
    //   230: astore 6
    //   232: ldc -26
    //   234: astore 7
    //   236: aload 5
    //   238: aload 6
    //   240: aload 7
    //   242: aload_3
    //   243: invokeinterface 232 4 0
    //   248: aload 4
    //   250: ifnull -33 -> 217
    //   253: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   256: astore_3
    //   257: ldc 108
    //   259: astore 5
    //   261: new 110	java/lang/StringBuilder
    //   264: astore 6
    //   266: aload 6
    //   268: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   271: aload 6
    //   273: ldc -33
    //   275: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: astore 6
    //   280: ldc -31
    //   282: astore 7
    //   284: aload 4
    //   286: aload 7
    //   288: invokevirtual 228	io/fabric/sdk/android/services/network/HttpRequest:header	(Ljava/lang/String;)Ljava/lang/String;
    //   291: astore 4
    //   293: aload 6
    //   295: aload 4
    //   297: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   300: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   303: astore 4
    //   305: aload_3
    //   306: aload 5
    //   308: aload 4
    //   310: invokeinterface 136 3 0
    //   315: goto -98 -> 217
    //   318: astore_3
    //   319: aconst_null
    //   320: astore 4
    //   322: aload_3
    //   323: astore_2
    //   324: aload 4
    //   326: ifnull +65 -> 391
    //   329: invokestatic 106	io/fabric/sdk/android/Fabric:getLogger	()Lio/fabric/sdk/android/Logger;
    //   332: astore_3
    //   333: ldc 108
    //   335: astore 5
    //   337: new 110	java/lang/StringBuilder
    //   340: astore 6
    //   342: aload 6
    //   344: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   347: aload 6
    //   349: ldc -33
    //   351: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: astore 6
    //   356: ldc -31
    //   358: astore 7
    //   360: aload 4
    //   362: aload 7
    //   364: invokevirtual 228	io/fabric/sdk/android/services/network/HttpRequest:header	(Ljava/lang/String;)Ljava/lang/String;
    //   367: astore 4
    //   369: aload 6
    //   371: aload 4
    //   373: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   376: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   379: astore 4
    //   381: aload_3
    //   382: aload 5
    //   384: aload 4
    //   386: invokeinterface 136 3 0
    //   391: aload_2
    //   392: athrow
    //   393: astore_2
    //   394: goto -70 -> 324
    //   397: astore_3
    //   398: goto -175 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	401	0	this	DefaultSettingsSpiCall
    //   0	401	1	paramSettingsRequest	SettingsRequest
    //   1	391	2	localObject1	Object
    //   393	1	2	localObject2	Object
    //   7	201	3	localObject3	Object
    //   219	24	3	localHttpRequestException1	io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException
    //   256	50	3	localLogger1	Logger
    //   318	5	3	localObject4	Object
    //   332	50	3	localLogger2	Logger
    //   397	1	3	localHttpRequestException2	io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException
    //   13	372	4	localObject5	Object
    //   27	356	5	localObject6	Object
    //   31	339	6	localObject7	Object
    //   36	327	7	localObject8	Object
    //   45	70	8	str	String
    // Exception table:
    //   from	to	target	type
    //   3	7	219	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   9	13	219	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   3	7	318	finally
    //   9	13	318	finally
    //   18	22	393	finally
    //   24	27	393	finally
    //   33	36	393	finally
    //   38	43	393	finally
    //   49	54	393	finally
    //   56	60	393	finally
    //   64	69	393	finally
    //   71	76	393	finally
    //   82	89	393	finally
    //   89	92	393	finally
    //   98	101	393	finally
    //   103	108	393	finally
    //   114	119	393	finally
    //   123	127	393	finally
    //   128	132	393	finally
    //   137	143	393	finally
    //   144	149	393	finally
    //   223	226	393	finally
    //   242	248	393	finally
    //   18	22	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   24	27	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   33	36	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   38	43	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   49	54	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   56	60	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   64	69	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   71	76	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   82	89	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   89	92	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   98	101	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   103	108	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   114	119	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   123	127	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   128	132	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   137	143	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
    //   144	149	397	io/fabric/sdk/android/services/network/HttpRequest$HttpRequestException
  }
  
  boolean requestWasSuccessful(int paramInt)
  {
    int i = 200;
    if (paramInt != i)
    {
      i = 201;
      if (paramInt != i)
      {
        i = 202;
        if (paramInt != i)
        {
          i = 203;
          if (paramInt != i) {
            break label40;
          }
        }
      }
    }
    label40:
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\DefaultSettingsSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */