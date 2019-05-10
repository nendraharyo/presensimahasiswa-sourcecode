package io.fabric.sdk.android.services.concurrency;

public enum AsyncTask$Status
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$Status;
    ((Status)localObject).<init>("PENDING", 0);
    PENDING = (Status)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$Status;
    ((Status)localObject).<init>("RUNNING", j);
    RUNNING = (Status)localObject;
    localObject = new io/fabric/sdk/android/services/concurrency/AsyncTask$Status;
    ((Status)localObject).<init>("FINISHED", i);
    FINISHED = (Status)localObject;
    localObject = new Status[3];
    Status localStatus = PENDING;
    localObject[0] = localStatus;
    localStatus = RUNNING;
    localObject[j] = localStatus;
    localStatus = FINISHED;
    localObject[i] = localStatus;
    $VALUES = (Status[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\AsyncTask$Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */