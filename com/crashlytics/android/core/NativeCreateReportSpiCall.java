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

class NativeCreateReportSpiCall
  extends AbstractSpiCall
  implements CreateReportSpiCall
{
  private static final String APP_META_FILE_MULTIPART_PARAM = "app_meta_file";
  private static final String BINARY_IMAGES_FILE_MULTIPART_PARAM = "binary_images_file";
  private static final String DEVICE_META_FILE_MULTIPART_PARAM = "device_meta_file";
  private static final String GZIP_FILE_CONTENT_TYPE = "application/octet-stream";
  private static final String KEYS_FILE_MULTIPART_PARAM = "keys_file";
  private static final String LOGS_FILE_MULTIPART_PARAM = "logs_file";
  private static final String METADATA_FILE_MULTIPART_PARAM = "crash_meta_file";
  private static final String MINIDUMP_FILE_MULTIPART_PARAM = "minidump_file";
  private static final String OS_META_FILE_MULTIPART_PARAM = "os_meta_file";
  private static final String REPORT_IDENTIFIER_PARAM = "report_id";
  private static final String SESSION_META_FILE_MULTIPART_PARAM = "session_meta_file";
  private static final String USER_META_FILE_MULTIPART_PARAM = "user_meta_file";
  
  public NativeCreateReportSpiCall(Kit paramKit, String paramString1, String paramString2, HttpRequestFactory paramHttpRequestFactory)
  {
    super(paramKit, paramString1, paramString2, paramHttpRequestFactory, localHttpMethod);
  }
  
  private HttpRequest applyHeadersTo(HttpRequest paramHttpRequest, String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Crashlytics Android SDK/");
    String str = this.kit.getVersion();
    localObject = str;
    HttpRequest localHttpRequest = paramHttpRequest.header("User-Agent", (String)localObject).header("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
    str = this.kit.getVersion();
    localHttpRequest.header("X-CRASHLYTICS-API-CLIENT-VERSION", str).header("X-CRASHLYTICS-API-KEY", paramString);
    return paramHttpRequest;
  }
  
  private HttpRequest applyMultipartDataTo(HttpRequest paramHttpRequest, Report paramReport)
  {
    Object localObject = paramReport.getIdentifier();
    paramHttpRequest.part("report_id", (String)localObject);
    localObject = paramReport.getFiles();
    int i = localObject.length;
    int j = 0;
    if (j < i)
    {
      File localFile = localObject[j];
      String str1 = localFile.getName();
      String str2 = "minidump";
      boolean bool = str1.equals(str2);
      String str3;
      if (bool)
      {
        str1 = "minidump_file";
        str2 = localFile.getName();
        str3 = "application/octet-stream";
        paramHttpRequest.part(str1, str2, str3, localFile);
      }
      for (;;)
      {
        j += 1;
        break;
        str1 = localFile.getName();
        str2 = "metadata";
        bool = str1.equals(str2);
        if (bool)
        {
          str1 = "crash_meta_file";
          str2 = localFile.getName();
          str3 = "application/octet-stream";
          paramHttpRequest.part(str1, str2, str3, localFile);
        }
        else
        {
          str1 = localFile.getName();
          str2 = "binaryImages";
          bool = str1.equals(str2);
          if (bool)
          {
            str1 = "binary_images_file";
            str2 = localFile.getName();
            str3 = "application/octet-stream";
            paramHttpRequest.part(str1, str2, str3, localFile);
          }
          else
          {
            str1 = localFile.getName();
            str2 = "session";
            bool = str1.equals(str2);
            if (bool)
            {
              str1 = "session_meta_file";
              str2 = localFile.getName();
              str3 = "application/octet-stream";
              paramHttpRequest.part(str1, str2, str3, localFile);
            }
            else
            {
              str1 = localFile.getName();
              str2 = "app";
              bool = str1.equals(str2);
              if (bool)
              {
                str1 = "app_meta_file";
                str2 = localFile.getName();
                str3 = "application/octet-stream";
                paramHttpRequest.part(str1, str2, str3, localFile);
              }
              else
              {
                str1 = localFile.getName();
                str2 = "device";
                bool = str1.equals(str2);
                if (bool)
                {
                  str1 = "device_meta_file";
                  str2 = localFile.getName();
                  str3 = "application/octet-stream";
                  paramHttpRequest.part(str1, str2, str3, localFile);
                }
                else
                {
                  str1 = localFile.getName();
                  str2 = "os";
                  bool = str1.equals(str2);
                  if (bool)
                  {
                    str1 = "os_meta_file";
                    str2 = localFile.getName();
                    str3 = "application/octet-stream";
                    paramHttpRequest.part(str1, str2, str3, localFile);
                  }
                  else
                  {
                    str1 = localFile.getName();
                    str2 = "user";
                    bool = str1.equals(str2);
                    if (bool)
                    {
                      str1 = "user_meta_file";
                      str2 = localFile.getName();
                      str3 = "application/octet-stream";
                      paramHttpRequest.part(str1, str2, str3, localFile);
                    }
                    else
                    {
                      str1 = localFile.getName();
                      str2 = "logs";
                      bool = str1.equals(str2);
                      if (bool)
                      {
                        str1 = "logs_file";
                        str2 = localFile.getName();
                        str3 = "application/octet-stream";
                        paramHttpRequest.part(str1, str2, str3, localFile);
                      }
                      else
                      {
                        str1 = localFile.getName();
                        str2 = "keys";
                        bool = str1.equals(str2);
                        if (bool)
                        {
                          str1 = "keys_file";
                          str2 = localFile.getName();
                          str3 = "application/octet-stream";
                          paramHttpRequest.part(str1, str2, str3, localFile);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return paramHttpRequest;
  }
  
  public boolean invoke(CreateReportRequest paramCreateReportRequest)
  {
    HttpRequest localHttpRequest = getHttpRequest();
    Object localObject1 = paramCreateReportRequest.apiKey;
    localHttpRequest = applyHeadersTo(localHttpRequest, (String)localObject1);
    localObject1 = paramCreateReportRequest.report;
    localHttpRequest = applyMultipartDataTo(localHttpRequest, (Report)localObject1);
    localObject1 = Fabric.getLogger();
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append("Sending report to: ");
    String str1 = getUrl();
    localObject2 = str1;
    ((Logger)localObject1).d("CrashlyticsCore", (String)localObject2);
    int i = localHttpRequest.code();
    localObject1 = Fabric.getLogger();
    String str2 = "CrashlyticsCore";
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    str1 = "Result was: ";
    localObject2 = str1 + i;
    ((Logger)localObject1).d(str2, (String)localObject2);
    i = ResponseParser.parse(i);
    if (i == 0) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localHttpRequest = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\NativeCreateReportSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */