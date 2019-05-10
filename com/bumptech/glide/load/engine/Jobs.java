package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Jobs
{
  private final Map jobs;
  private final Map onlyCacheJobs;
  
  Jobs()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.jobs = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.onlyCacheJobs = localHashMap;
  }
  
  private Map getJobMap(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (Map localMap = this.onlyCacheJobs;; localMap = this.jobs) {
      return localMap;
    }
  }
  
  EngineJob get(Key paramKey, boolean paramBoolean)
  {
    return (EngineJob)getJobMap(paramBoolean).get(paramKey);
  }
  
  Map getAll()
  {
    return Collections.unmodifiableMap(this.jobs);
  }
  
  void put(Key paramKey, EngineJob paramEngineJob)
  {
    boolean bool = paramEngineJob.onlyRetrieveFromCache();
    getJobMap(bool).put(paramKey, paramEngineJob);
  }
  
  void removeIfCurrent(Key paramKey, EngineJob paramEngineJob)
  {
    boolean bool1 = paramEngineJob.onlyRetrieveFromCache();
    Map localMap = getJobMap(bool1);
    Object localObject = localMap.get(paramKey);
    boolean bool2 = paramEngineJob.equals(localObject);
    if (bool2) {
      localMap.remove(paramKey);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\Jobs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */