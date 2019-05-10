package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;

class AnswersFilesManagerProvider
{
  static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
  static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
  final Context context;
  final FileStore fileStore;
  
  public AnswersFilesManagerProvider(Context paramContext, FileStore paramFileStore)
  {
    this.context = paramContext;
    this.fileStore = paramFileStore;
  }
  
  public SessionAnalyticsFilesManager getAnalyticsFilesManager()
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("AnswersFilesManagerProvider cannot be called on the main thread");
      throw ((Throwable)localObject1);
    }
    localObject1 = new com/crashlytics/android/answers/SessionEventTransform;
    ((SessionEventTransform)localObject1).<init>();
    localObject2 = new io/fabric/sdk/android/services/common/SystemCurrentTimeProvider;
    ((SystemCurrentTimeProvider)localObject2).<init>();
    Object localObject3 = this.fileStore.getFilesDir();
    GZIPQueueFileEventStorage localGZIPQueueFileEventStorage = new io/fabric/sdk/android/services/events/GZIPQueueFileEventStorage;
    Context localContext = this.context;
    localGZIPQueueFileEventStorage.<init>(localContext, (File)localObject3, "session_analytics.tap", "session_analytics_to_send");
    localObject3 = new com/crashlytics/android/answers/SessionAnalyticsFilesManager;
    localContext = this.context;
    ((SessionAnalyticsFilesManager)localObject3).<init>(localContext, (SessionEventTransform)localObject1, (CurrentTimeProvider)localObject2, localGZIPQueueFileEventStorage);
    return (SessionAnalyticsFilesManager)localObject3;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\AnswersFilesManagerProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */