package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;

class ResultReceiver$a
  extends b.a
{
  ResultReceiver$a(ResultReceiver paramResultReceiver) {}
  
  public void a(int paramInt, Bundle paramBundle)
  {
    Object localObject = this.a.b;
    if (localObject != null)
    {
      localObject = this.a.b;
      ResultReceiver.b localb = new android/support/v4/os/ResultReceiver$b;
      ResultReceiver localResultReceiver = this.a;
      localb.<init>(localResultReceiver, paramInt, paramBundle);
      ((Handler)localObject).post(localb);
    }
    for (;;)
    {
      return;
      localObject = this.a;
      ((ResultReceiver)localObject).a(paramInt, paramBundle);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\ResultReceiver$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */