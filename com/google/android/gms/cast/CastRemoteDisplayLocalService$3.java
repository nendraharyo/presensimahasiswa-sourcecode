package com.google.android.gms.cast;

class CastRemoteDisplayLocalService$3
  implements Runnable
{
  CastRemoteDisplayLocalService$3(CastRemoteDisplayLocalService paramCastRemoteDisplayLocalService) {}
  
  public void run()
  {
    CastRemoteDisplayLocalService localCastRemoteDisplayLocalService1 = this.zzaaz;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("onCreate after delay. The local service been started: ");
    CastRemoteDisplayLocalService localCastRemoteDisplayLocalService2 = this.zzaaz;
    boolean bool1 = CastRemoteDisplayLocalService.zzb(localCastRemoteDisplayLocalService2);
    localObject = bool1;
    CastRemoteDisplayLocalService.zza(localCastRemoteDisplayLocalService1, (String)localObject);
    localCastRemoteDisplayLocalService1 = this.zzaaz;
    boolean bool2 = CastRemoteDisplayLocalService.zzb(localCastRemoteDisplayLocalService1);
    if (!bool2)
    {
      localCastRemoteDisplayLocalService1 = this.zzaaz;
      localObject = "The local service has not been been started, stopping it";
      CastRemoteDisplayLocalService.zzb(localCastRemoteDisplayLocalService1, (String)localObject);
      localCastRemoteDisplayLocalService1 = this.zzaaz;
      localCastRemoteDisplayLocalService1.stopSelf();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\CastRemoteDisplayLocalService$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */