package android.support.v4.os;

import android.os.Bundle;

class ResultReceiver$b
  implements Runnable
{
  final int a;
  final Bundle b;
  
  ResultReceiver$b(ResultReceiver paramResultReceiver, int paramInt, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramBundle;
  }
  
  public void run()
  {
    ResultReceiver localResultReceiver = this.c;
    int i = this.a;
    Bundle localBundle = this.b;
    localResultReceiver.a(i, localBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\os\ResultReceiver$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */