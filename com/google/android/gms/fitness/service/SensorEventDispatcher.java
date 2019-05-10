package com.google.android.gms.fitness.service;

import com.google.android.gms.fitness.data.DataPoint;
import java.util.List;

public abstract interface SensorEventDispatcher
{
  public abstract void publish(DataPoint paramDataPoint);
  
  public abstract void publish(List paramList);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\service\SensorEventDispatcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */