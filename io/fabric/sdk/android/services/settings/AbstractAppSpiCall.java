package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitInfo;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

abstract class AbstractAppSpiCall
  extends AbstractSpiCall
  implements AppSpiCall
{
  public static final String APP_BUILD_VERSION_PARAM = "app[build_version]";
  public static final String APP_BUILT_SDK_VERSION_PARAM = "app[built_sdk_version]";
  public static final String APP_DISPLAY_VERSION_PARAM = "app[display_version]";
  public static final String APP_ICON_DATA_PARAM = "app[icon][data]";
  public static final String APP_ICON_HASH_PARAM = "app[icon][hash]";
  public static final String APP_ICON_HEIGHT_PARAM = "app[icon][height]";
  public static final String APP_ICON_PRERENDERED_PARAM = "app[icon][prerendered]";
  public static final String APP_ICON_WIDTH_PARAM = "app[icon][width]";
  public static final String APP_IDENTIFIER_PARAM = "app[identifier]";
  public static final String APP_INSTANCE_IDENTIFIER_PARAM = "app[instance_identifier]";
  public static final String APP_MIN_SDK_VERSION_PARAM = "app[minimum_sdk_version]";
  public static final String APP_NAME_PARAM = "app[name]";
  public static final String APP_SDK_MODULES_PARAM_BUILD_TYPE = "app[build][libraries][%s][type]";
  public static final String APP_SDK_MODULES_PARAM_PREFIX = "app[build][libraries][%s]";
  public static final String APP_SDK_MODULES_PARAM_VERSION = "app[build][libraries][%s][version]";
  public static final String APP_SOURCE_PARAM = "app[source]";
  static final String ICON_CONTENT_TYPE = "application/octet-stream";
  static final String ICON_FILE_NAME = "icon.png";
  
  public AbstractAppSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory, HttpMethod paramHttpMethod)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, paramHttpMethod);
  }
  
  private HttpRequest applyHeadersTo(HttpRequest paramHttpRequest, AppRequestData paramAppRequestData)
  {
    String str1 = paramAppRequestData.apiKey;
    HttpRequest localHttpRequest = paramHttpRequest.header("X-CRASHLYTICS-API-KEY", str1).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    String str2 = this.kit.getVersion();
    return localHttpRequest.header("X-CRASHLYTICS-API-CLIENT-VERSION", str2);
  }
  
  private HttpRequest applyMultipartDataTo(HttpRequest paramHttpRequest, AppRequestData paramAppRequestData)
  {
    Object localObject1 = paramAppRequestData.appId;
    Object localObject2 = paramHttpRequest.part("app[identifier]", (String)localObject1);
    Object localObject4 = paramAppRequestData.name;
    localObject2 = ((HttpRequest)localObject2).part("app[name]", (String)localObject4);
    localObject4 = paramAppRequestData.displayVersion;
    localObject2 = ((HttpRequest)localObject2).part("app[display_version]", (String)localObject4);
    localObject4 = paramAppRequestData.buildVersion;
    localObject2 = ((HttpRequest)localObject2).part("app[build_version]", (String)localObject4);
    int i = paramAppRequestData.source;
    localObject4 = Integer.valueOf(i);
    localObject2 = ((HttpRequest)localObject2).part("app[source]", (Number)localObject4);
    localObject4 = paramAppRequestData.minSdkVersion;
    localObject2 = ((HttpRequest)localObject2).part("app[minimum_sdk_version]", (String)localObject4);
    localObject1 = "app[built_sdk_version]";
    localObject4 = paramAppRequestData.builtSdkVersion;
    localObject4 = ((HttpRequest)localObject2).part((String)localObject1, (String)localObject4);
    localObject2 = paramAppRequestData.instanceIdentifier;
    boolean bool = CommonUtils.isNullOrEmpty((String)localObject2);
    if (!bool)
    {
      localObject2 = "app[instance_identifier]";
      localObject1 = paramAppRequestData.instanceIdentifier;
      ((HttpRequest)localObject4).part((String)localObject2, (String)localObject1);
    }
    localObject2 = paramAppRequestData.icon;
    if (localObject2 != null) {
      localObject1 = null;
    }
    try
    {
      localObject2 = this.kit;
      localObject2 = ((Kit)localObject2).getContext();
      localObject2 = ((Context)localObject2).getResources();
      localObject5 = paramAppRequestData.icon;
      int j = ((IconRequest)localObject5).iconResourceId;
      localObject1 = ((Resources)localObject2).openRawResource(j);
      localObject2 = "app[icon][hash]";
      localObject5 = paramAppRequestData.icon;
      localObject5 = ((IconRequest)localObject5).hash;
      localObject2 = ((HttpRequest)localObject4).part((String)localObject2, (String)localObject5);
      localObject5 = "app[icon][data]";
      localObject6 = "icon.png";
      localObject7 = "application/octet-stream";
      localObject2 = ((HttpRequest)localObject2).part((String)localObject5, (String)localObject6, (String)localObject7, (InputStream)localObject1);
      localObject5 = "app[icon][width]";
      localObject6 = paramAppRequestData.icon;
      int k = ((IconRequest)localObject6).width;
      localObject6 = Integer.valueOf(k);
      localObject2 = ((HttpRequest)localObject2).part((String)localObject5, (Number)localObject6);
      localObject5 = "app[icon][height]";
      localObject6 = paramAppRequestData.icon;
      k = ((IconRequest)localObject6).height;
      localObject6 = Integer.valueOf(k);
      ((HttpRequest)localObject2).part((String)localObject5, (Number)localObject6);
      localObject2 = "Failed to close app icon InputStream.";
      CommonUtils.closeOrLog((Closeable)localObject1, (String)localObject2);
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      for (;;)
      {
        Object localObject5 = Fabric.getLogger();
        Object localObject6 = "Fabric";
        Object localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        Object localObject8 = "Failed to find app icon with resource ID: ";
        localObject7 = ((StringBuilder)localObject7).append((String)localObject8);
        localObject8 = paramAppRequestData.icon;
        int m = ((IconRequest)localObject8).iconResourceId;
        localObject7 = ((StringBuilder)localObject7).append(m);
        localObject7 = ((StringBuilder)localObject7).toString();
        ((Logger)localObject5).e((String)localObject6, (String)localObject7, localNotFoundException);
        String str = "Failed to close app icon InputStream.";
        CommonUtils.closeOrLog((Closeable)localObject1, str);
      }
    }
    finally
    {
      CommonUtils.closeOrLog((Closeable)localObject1, "Failed to close app icon InputStream.");
    }
    localObject2 = paramAppRequestData.sdkKits;
    if (localObject2 != null)
    {
      localObject2 = paramAppRequestData.sdkKits;
      localObject1 = ((Collection)localObject2).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (KitInfo)((Iterator)localObject1).next();
        localObject5 = getKitVersionKey((KitInfo)localObject2);
        localObject6 = ((KitInfo)localObject2).getVersion();
        ((HttpRequest)localObject4).part((String)localObject5, (String)localObject6);
        localObject5 = getKitBuildTypeKey((KitInfo)localObject2);
        localObject2 = ((KitInfo)localObject2).getBuildType();
        ((HttpRequest)localObject4).part((String)localObject5, (String)localObject2);
      }
    }
    return (HttpRequest)localObject4;
  }
  
  String getKitBuildTypeKey(KitInfo paramKitInfo)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    String str = paramKitInfo.getIdentifier();
    arrayOfObject[0] = str;
    return String.format(localLocale, "app[build][libraries][%s][type]", arrayOfObject);
  }
  
  String getKitVersionKey(KitInfo paramKitInfo)
  {
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[1];
    String str = paramKitInfo.getIdentifier();
    arrayOfObject[0] = str;
    return String.format(localLocale, "app[build][libraries][%s][version]", arrayOfObject);
  }
  
  public boolean invoke(AppRequestData paramAppRequestData)
  {
    Object localObject1 = getHttpRequest();
    localObject1 = applyHeadersTo((HttpRequest)localObject1, paramAppRequestData);
    Object localObject2 = applyMultipartDataTo((HttpRequest)localObject1, paramAppRequestData);
    localObject1 = Fabric.getLogger();
    String str = "Fabric";
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Sending app info to ");
    Object localObject4 = getUrl();
    localObject3 = (String)localObject4;
    ((Logger)localObject1).d(str, (String)localObject3);
    localObject1 = paramAppRequestData.icon;
    if (localObject1 != null)
    {
      localObject1 = Fabric.getLogger();
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("App icon hash is ");
      localObject4 = paramAppRequestData.icon.hash;
      localObject3 = (String)localObject4;
      ((Logger)localObject1).d("Fabric", (String)localObject3);
      localObject1 = Fabric.getLogger();
      str = "Fabric";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("App icon size is ");
      int i = paramAppRequestData.icon.width;
      localObject3 = ((StringBuilder)localObject3).append(i).append("x");
      localObject4 = paramAppRequestData.icon;
      i = ((IconRequest)localObject4).height;
      localObject3 = i;
      ((Logger)localObject1).d(str, (String)localObject3);
    }
    int j = ((HttpRequest)localObject2).code();
    localObject1 = "POST";
    localObject3 = ((HttpRequest)localObject2).method();
    boolean bool = ((String)localObject1).equals(localObject3);
    int k;
    if (bool)
    {
      localObject1 = "Create";
      localObject3 = Fabric.getLogger();
      Object localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject1 = ((StringBuilder)localObject5).append((String)localObject1).append(" app request ID: ");
      localObject5 = "X-REQUEST-ID";
      localObject2 = ((HttpRequest)localObject2).header((String)localObject5);
      localObject1 = (String)localObject2;
      ((Logger)localObject3).d("Fabric", (String)localObject1);
      localObject1 = Fabric.getLogger();
      localObject2 = "Fabric";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "Result was ";
      localObject3 = (String)localObject4 + j;
      ((Logger)localObject1).d((String)localObject2, (String)localObject3);
      k = ResponseParser.parse(j);
      if (k != 0) {
        break label391;
      }
      k = 1;
    }
    for (;;)
    {
      return k;
      localObject1 = "Update";
      break;
      label391:
      int m = 0;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\AbstractAppSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */