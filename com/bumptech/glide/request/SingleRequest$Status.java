package com.bumptech.glide.request;

 enum SingleRequest$Status
{
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("PENDING", 0);
    PENDING = (Status)localObject;
    localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("RUNNING", m);
    RUNNING = (Status)localObject;
    localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("WAITING_FOR_SIZE", k);
    WAITING_FOR_SIZE = (Status)localObject;
    localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("COMPLETE", j);
    COMPLETE = (Status)localObject;
    localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("FAILED", i);
    FAILED = (Status)localObject;
    localObject = new com/bumptech/glide/request/SingleRequest$Status;
    ((Status)localObject).<init>("CLEARED", 5);
    CLEARED = (Status)localObject;
    localObject = new Status[6];
    Status localStatus1 = PENDING;
    localObject[0] = localStatus1;
    localStatus1 = RUNNING;
    localObject[m] = localStatus1;
    localStatus1 = WAITING_FOR_SIZE;
    localObject[k] = localStatus1;
    localStatus1 = COMPLETE;
    localObject[j] = localStatus1;
    localStatus1 = FAILED;
    localObject[i] = localStatus1;
    Status localStatus2 = CLEARED;
    localObject[5] = localStatus2;
    $VALUES = (Status[])localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\SingleRequest$Status.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */