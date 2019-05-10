package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractSpiCall
{
  public static final String ACCEPT_JSON_VALUE = "application/json";
  public static final String ANDROID_CLIENT_TYPE = "android";
  public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
  public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
  public static final int DEFAULT_TIMEOUT = 10000;
  public static final String HEADER_ACCEPT = "Accept";
  public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
  public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
  public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
  public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
  public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
  public static final String HEADER_USER_AGENT = "User-Agent";
  private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
  protected final Kit kit;
  private final HttpMethod method;
  private final String protocolAndHostOverride;
  private final HttpRequestFactory requestFactory;
  private final String url;
  
  public AbstractSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory, HttpMethod paramHttpMethod)
  {
    if (paramString2 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("url must not be null.");
      throw ((Throwable)localObject);
    }
    if (paramHttpRequestFactory == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("requestFactory must not be null.");
      throw ((Throwable)localObject);
    }
    this.kit = paramKit;
    this.protocolAndHostOverride = paramString1;
    Object localObject = overrideProtocolAndHost(paramString2);
    this.url = ((String)localObject);
    this.requestFactory = paramHttpRequestFactory;
    this.method = paramHttpMethod;
  }
  
  private String overrideProtocolAndHost(String paramString)
  {
    Object localObject = this.protocolAndHostOverride;
    boolean bool = CommonUtils.isNullOrEmpty((String)localObject);
    if (!bool)
    {
      localObject = PROTOCOL_AND_HOST_PATTERN.matcher(paramString);
      String str = this.protocolAndHostOverride;
      paramString = ((Matcher)localObject).replaceFirst(str);
    }
    return paramString;
  }
  
  protected HttpRequest getHttpRequest()
  {
    Map localMap = Collections.emptyMap();
    return getHttpRequest(localMap);
  }
  
  protected HttpRequest getHttpRequest(Map paramMap)
  {
    Object localObject1 = this.requestFactory;
    HttpMethod localHttpMethod = this.method;
    Object localObject2 = getUrl();
    localObject1 = ((HttpRequestFactory)localObject1).buildHttpRequest(localHttpMethod, (String)localObject2, paramMap).useCaches(false).connectTimeout(10000);
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Crashlytics Android SDK/");
    String str = this.kit.getVersion();
    localObject2 = str;
    return ((HttpRequest)localObject1).header("User-Agent", (String)localObject2).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
  }
  
  protected String getUrl()
  {
    return this.url;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AbstractSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */