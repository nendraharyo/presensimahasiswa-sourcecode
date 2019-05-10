package com.crashlytics.android.answers;

import android.os.Build.VERSION;
import io.fabric.sdk.android.services.events.EventTransform;
import java.io.IOException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class SessionEventTransform
  implements EventTransform
{
  static final String APP_BUNDLE_ID_KEY = "appBundleId";
  static final String APP_VERSION_CODE_KEY = "appVersionCode";
  static final String APP_VERSION_NAME_KEY = "appVersionName";
  static final String BETA_DEVICE_TOKEN_KEY = "betaDeviceToken";
  static final String BUILD_ID_KEY = "buildId";
  static final String CUSTOM_ATTRIBUTES = "customAttributes";
  static final String CUSTOM_TYPE = "customType";
  static final String DETAILS_KEY = "details";
  static final String DEVICE_MODEL_KEY = "deviceModel";
  static final String EXECUTION_ID_KEY = "executionId";
  static final String INSTALLATION_ID_KEY = "installationId";
  static final String LIMIT_AD_TRACKING_ENABLED_KEY = "limitAdTrackingEnabled";
  static final String OS_VERSION_KEY = "osVersion";
  static final String PREDEFINED_ATTRIBUTES = "predefinedAttributes";
  static final String PREDEFINED_TYPE = "predefinedType";
  static final String TIMESTAMP_KEY = "timestamp";
  static final String TYPE_KEY = "type";
  
  public JSONObject buildJsonForEvent(SessionEvent paramSessionEvent)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject1 = paramSessionEvent.sessionEventMetadata;
      localObject2 = "appBundleId";
      Object localObject3 = ((SessionEventMetadata)localObject1).appBundleId;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "executionId";
      localObject3 = ((SessionEventMetadata)localObject1).executionId;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "installationId";
      localObject3 = ((SessionEventMetadata)localObject1).installationId;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "limitAdTrackingEnabled";
      localObject3 = ((SessionEventMetadata)localObject1).limitAdTrackingEnabled;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "betaDeviceToken";
      localObject3 = ((SessionEventMetadata)localObject1).betaDeviceToken;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "buildId";
      localObject3 = ((SessionEventMetadata)localObject1).buildId;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "osVersion";
      localObject3 = ((SessionEventMetadata)localObject1).osVersion;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "deviceModel";
      localObject3 = ((SessionEventMetadata)localObject1).deviceModel;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "appVersionCode";
      localObject3 = ((SessionEventMetadata)localObject1).appVersionCode;
      localJSONObject.put((String)localObject2, localObject3);
      localObject2 = "appVersionName";
      localObject1 = ((SessionEventMetadata)localObject1).appVersionName;
      localJSONObject.put((String)localObject2, localObject1);
      localObject1 = "timestamp";
      long l = paramSessionEvent.timestamp;
      localJSONObject.put((String)localObject1, l);
      localObject1 = "type";
      localObject2 = paramSessionEvent.type;
      localObject2 = ((SessionEvent.Type)localObject2).toString();
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = paramSessionEvent.details;
      if (localObject1 != null)
      {
        localObject1 = "details";
        localObject2 = new org/json/JSONObject;
        localObject3 = paramSessionEvent.details;
        ((JSONObject)localObject2).<init>((Map)localObject3);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = "customType";
      localObject2 = paramSessionEvent.customType;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = paramSessionEvent.customAttributes;
      if (localObject1 != null)
      {
        localObject1 = "customAttributes";
        localObject2 = new org/json/JSONObject;
        localObject3 = paramSessionEvent.customAttributes;
        ((JSONObject)localObject2).<init>((Map)localObject3);
        localJSONObject.put((String)localObject1, localObject2);
      }
      localObject1 = "predefinedType";
      localObject2 = paramSessionEvent.predefinedType;
      localJSONObject.put((String)localObject1, localObject2);
      localObject1 = paramSessionEvent.predefinedAttributes;
      if (localObject1 != null)
      {
        localObject1 = "predefinedAttributes";
        localObject2 = new org/json/JSONObject;
        localObject3 = paramSessionEvent.predefinedAttributes;
        ((JSONObject)localObject2).<init>((Map)localObject3);
        localJSONObject.put((String)localObject1, localObject2);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Object localObject2;
      int i = Build.VERSION.SDK_INT;
      int j = 9;
      if (i >= j)
      {
        localObject1 = new java/io/IOException;
        localObject2 = localJSONException.getMessage();
        ((IOException)localObject1).<init>((String)localObject2, localJSONException);
        throw ((Throwable)localObject1);
      }
      Object localObject1 = new java/io/IOException;
      String str = localJSONException.getMessage();
      ((IOException)localObject1).<init>(str);
      throw ((Throwable)localObject1);
    }
  }
  
  public byte[] toBytes(SessionEvent paramSessionEvent)
  {
    return buildJsonForEvent(paramSessionEvent).toString().getBytes("UTF-8");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SessionEventTransform.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */