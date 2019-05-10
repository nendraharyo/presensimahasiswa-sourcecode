package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.events.FilesSender;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Iterator;
import java.util.List;

class SessionAnalyticsFilesSender
  extends AbstractSpiCall
  implements FilesSender
{
  static final String FILE_CONTENT_TYPE = "application/vnd.crashlytics.android.events";
  static final String FILE_PARAM_NAME = "session_analytics_file_";
  private final String apiKey;
  
  public SessionAnalyticsFilesSender(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory, String paramString3)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, localHttpMethod);
    this.apiKey = paramString3;
  }
  
  public boolean send(List paramList)
  {
    boolean bool1 = false;
    Object localObject1 = getHttpRequest().header("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    Object localObject2 = this.kit.getVersion();
    localObject1 = ((HttpRequest)localObject1).header("X-CRASHLYTICS-API-CLIENT-VERSION", (String)localObject2);
    localObject2 = this.apiKey;
    localObject2 = ((HttpRequest)localObject1).header("X-CRASHLYTICS-API-KEY", (String)localObject2);
    Object localObject3 = paramList.iterator();
    int i = 0;
    Logger localLogger = null;
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject3).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (File)((Iterator)localObject3).next();
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = "session_analytics_file_" + i;
      String str1 = ((File)localObject1).getName();
      String str2 = "application/vnd.crashlytics.android.events";
      ((HttpRequest)localObject2).part((String)localObject4, str1, str2, (File)localObject1);
      j = i + 1;
      i = j;
    }
    localObject1 = Fabric.getLogger();
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Sending ");
    int k = paramList.size();
    localObject3 = ((StringBuilder)localObject3).append(k).append(" analytics files to ");
    Object localObject4 = getUrl();
    localObject3 = (String)localObject4;
    ((Logger)localObject1).d("Answers", (String)localObject3);
    int j = ((HttpRequest)localObject2).code();
    localLogger = Fabric.getLogger();
    localObject2 = "Answers";
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject4 = "Response code for analytics file send is ";
    localObject3 = (String)localObject4 + j;
    localLogger.d((String)localObject2, (String)localObject3);
    j = ResponseParser.parse(j);
    if (j == 0) {
      bool1 = true;
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionAnalyticsFilesSender.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */