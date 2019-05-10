package android.arch.lifecycle;

class LiveData$1
  implements Runnable
{
  LiveData$1(LiveData paramLiveData) {}
  
  public void run()
  {
    Object localObject1 = this.a;
    synchronized (LiveData.a((LiveData)localObject1))
    {
      localObject1 = this.a;
      localObject1 = LiveData.b((LiveData)localObject1);
      LiveData localLiveData = this.a;
      Object localObject4 = LiveData.e();
      LiveData.a(localLiveData, localObject4);
      this.a.b(localObject1);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\arch\lifecycle\LiveData$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */