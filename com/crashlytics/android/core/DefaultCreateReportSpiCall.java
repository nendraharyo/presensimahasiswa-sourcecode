package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.AbstractSpiCall;
import io.fabric.sdk.android.services.common.ResponseParser;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class DefaultCreateReportSpiCall
  extends AbstractSpiCall
  implements CreateReportSpiCall
{
  static final String FILE_CONTENT_TYPE = "application/octet-stream";
  static final String FILE_PARAM = "report[file]";
  static final String IDENTIFIER_PARAM = "report[identifier]";
  static final String MULTI_FILE_PARAM = "report[file";
  
  public DefaultCreateReportSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, localHttpMethod);
  }
  
  DefaultCreateReportSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory, HttpMethod paramHttpMethod)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, paramHttpMethod);
  }
  
  private HttpRequest applyHeadersTo(HttpRequest paramHttpRequest, CreateReportRequest paramCreateReportRequest)
  {
    Object localObject1 = paramCreateReportRequest.apiKey;
    Object localObject2 = paramHttpRequest.header("X-CRASHLYTICS-API-KEY", (String)localObject1).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    Object localObject3 = this.kit.getVersion();
    localObject2 = ((HttpRequest)localObject2).header("X-CRASHLYTICS-API-CLIENT-VERSION", (String)localObject3);
    localObject3 = paramCreateReportRequest.report.getCustomHeaders().entrySet().iterator();
    for (localObject1 = localObject2;; localObject1 = localObject2)
    {
      boolean bool = ((Iterator)localObject3).hasNext();
      if (!bool) {
        break;
      }
      localObject2 = (Map.Entry)((Iterator)localObject3).next();
      localObject2 = ((HttpRequest)localObject1).header((Map.Entry)localObject2);
    }
    return (HttpRequest)localObject1;
  }
  
  private HttpRequest applyMultipartDataTo(HttpRequest paramHttpRequest, Report paramReport)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = paramReport.getIdentifier();
    paramHttpRequest.part("report[identifier]", (String)localObject2);
    Object localObject3 = paramReport.getFiles();
    int j = localObject3.length;
    int k = 1;
    if (j == k)
    {
      localObject1 = Fabric.getLogger();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Adding single file ");
      Object localObject4 = paramReport.getFileName();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4).append(" to report ");
      localObject4 = paramReport.getIdentifier();
      localObject2 = (String)localObject4;
      ((Logger)localObject1).d("CrashlyticsCore", (String)localObject2);
      localObject1 = "report[file]";
      localObject3 = paramReport.getFileName();
      localObject2 = "application/octet-stream";
      localObject4 = paramReport.getFile();
      paramHttpRequest = paramHttpRequest.part((String)localObject1, (String)localObject3, (String)localObject2, (File)localObject4);
    }
    for (;;)
    {
      return paramHttpRequest;
      localObject2 = paramReport.getFiles();
      int m = localObject2.length;
      j = 0;
      localObject3 = null;
      while (i < m)
      {
        File localFile = localObject2[i];
        Object localObject5 = Fabric.getLogger();
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject6 = ((StringBuilder)localObject6).append("Adding file ");
        String str1 = localFile.getName();
        localObject6 = ((StringBuilder)localObject6).append(str1).append(" to report ");
        str1 = paramReport.getIdentifier();
        localObject6 = str1;
        ((Logger)localObject5).d("CrashlyticsCore", (String)localObject6);
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = "report[file" + j + "]";
        String str2 = localFile.getName();
        localObject6 = "application/octet-stream";
        paramHttpRequest.part((String)localObject5, str2, (String)localObject6, localFile);
        j += 1;
        i += 1;
      }
    }
  }
  
  public boolean invoke(CreateReportRequest paramCreateReportRequest)
  {
    Object localObject1 = getHttpRequest();
    localObject1 = applyHeadersTo((HttpRequest)localObject1, paramCreateReportRequest);
    Object localObject2 = paramCreateReportRequest.report;
    localObject1 = applyMultipartDataTo((HttpRequest)localObject1, (Report)localObject2);
    localObject2 = Fabric.getLogger();
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Sending report to: ");
    Object localObject4 = getUrl();
    localObject3 = (String)localObject4;
    ((Logger)localObject2).d("CrashlyticsCore", (String)localObject3);
    int i = ((HttpRequest)localObject1).code();
    Object localObject5 = Fabric.getLogger();
    localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject4 = ((StringBuilder)localObject4).append("Create report request ID: ");
    String str = "X-REQUEST-ID";
    localObject1 = ((HttpRequest)localObject1).header(str);
    localObject1 = (String)localObject1;
    ((Logger)localObject5).d("CrashlyticsCore", (String)localObject1);
    localObject1 = Fabric.getLogger();
    localObject5 = "CrashlyticsCore";
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject4 = "Result was: ";
    localObject3 = (String)localObject4 + i;
    ((Logger)localObject1).d((String)localObject5, (String)localObject3);
    int j = ResponseParser.parse(i);
    if (j == 0) {
      j = 1;
    }
    for (;;)
    {
      return j;
      int k = 0;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\DefaultCreateReportSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */