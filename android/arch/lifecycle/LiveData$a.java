package android.arch.lifecycle;

abstract class LiveData$a
{
  final k c;
  boolean d;
  int e = -1;
  
  LiveData$a(LiveData paramLiveData, k paramk)
  {
    this.c = paramk;
  }
  
  void a(boolean paramBoolean)
  {
    int i = 1;
    boolean bool1 = this.d;
    if (paramBoolean == bool1) {
      return;
    }
    this.d = paramBoolean;
    LiveData localLiveData1 = this.f;
    int j = LiveData.c(localLiveData1);
    label36:
    LiveData localLiveData2;
    int m;
    if (j == 0)
    {
      j = i;
      localLiveData2 = this.f;
      m = LiveData.c(localLiveData2);
      boolean bool4 = this.d;
      if (!bool4) {
        break label164;
      }
    }
    for (;;)
    {
      i += m;
      LiveData.a(localLiveData2, i);
      if (j != 0)
      {
        boolean bool2 = this.d;
        if (bool2)
        {
          localLiveData1 = this.f;
          localLiveData1.b();
        }
      }
      localLiveData1 = this.f;
      int k = LiveData.c(localLiveData1);
      if (k == 0)
      {
        bool3 = this.d;
        if (!bool3)
        {
          localLiveData1 = this.f;
          localLiveData1.c();
        }
      }
      boolean bool3 = this.d;
      if (!bool3) {
        break;
      }
      localLiveData1 = this.f;
      LiveData.a(localLiveData1, this);
      break;
      bool3 = false;
      localLiveData1 = null;
      break label36;
      label164:
      i = -1;
    }
  }
  
  abstract boolean a();
  
  boolean a(e parame)
  {
    return false;
  }
  
  void b() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\LiveData$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */