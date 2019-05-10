package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.CompletionListener;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import com.google.android.gms.drive.events.internal.zza;
import com.google.android.gms.drive.events.zzc;
import com.google.android.gms.drive.events.zzf;
import com.google.android.gms.drive.events.zzh;
import com.google.android.gms.drive.events.zzi;
import com.google.android.gms.drive.events.zzk;
import com.google.android.gms.drive.events.zzm;

class zzae$zza
  extends Handler
{
  private final Context mContext;
  
  private zzae$zza(Looper paramLooper, Context paramContext)
  {
    super(paramLooper);
    this.mContext = paramContext;
  }
  
  private static void zza(zzm paramzzm, QueryResultEventParcelable paramQueryResultEventParcelable)
  {
    Object localObject = paramQueryResultEventParcelable.zzsX();
    if (localObject != null)
    {
      MetadataBuffer localMetadataBuffer = new com/google/android/gms/drive/MetadataBuffer;
      localMetadataBuffer.<init>((DataHolder)localObject);
      localObject = new com/google/android/gms/drive/internal/zzae$zza$1;
      ((zzae.zza.1)localObject).<init>(localMetadataBuffer);
      paramzzm.zza((zzk)localObject);
    }
    boolean bool = paramQueryResultEventParcelable.zzsY();
    if (bool)
    {
      int i = paramQueryResultEventParcelable.zzsZ();
      paramzzm.zzcJ(i);
    }
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = this.mContext;
      localObject2 = "EventCallback";
      localObject3 = "Don't know how to handle this event";
      zzz.zze((Context)localObject1, (String)localObject2, (String)localObject3);
    }
    for (;;)
    {
      return;
      localObject1 = (Pair)paramMessage.obj;
      localObject2 = (zzf)((Pair)localObject1).first;
      localObject1 = (DriveEvent)((Pair)localObject1).second;
      int j = ((DriveEvent)localObject1).getType();
      switch (j)
      {
      case 5: 
      case 6: 
      case 7: 
      default: 
        localObject2 = "EventCallback";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Unexpected event: ";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject1 = localObject1;
        zzz.zzz((String)localObject2, (String)localObject1);
        break;
      case 1: 
        localObject2 = (ChangeListener)localObject2;
        localObject1 = (ChangeEvent)localObject1;
        ((ChangeListener)localObject2).onChange((ChangeEvent)localObject1);
        break;
      case 2: 
        localObject2 = (CompletionListener)localObject2;
        localObject1 = (CompletionEvent)localObject1;
        ((CompletionListener)localObject2).onCompletion((CompletionEvent)localObject1);
        break;
      case 3: 
        localObject2 = (zzm)localObject2;
        localObject1 = (QueryResultEventParcelable)localObject1;
        zza((zzm)localObject2, (QueryResultEventParcelable)localObject1);
        break;
      case 4: 
        localObject2 = (zzc)localObject2;
        localObject1 = (ChangesAvailableEvent)localObject1;
        ((zzc)localObject2).zza((ChangesAvailableEvent)localObject1);
        break;
      case 8: 
        localObject1 = ((TransferProgressEvent)localObject1).zzta();
        localObject3 = new com/google/android/gms/drive/events/internal/zza;
        ((zza)localObject3).<init>((TransferProgressData)localObject1);
        localObject2 = (zzi)localObject2;
        ((zzi)localObject2).zza((zzh)localObject3);
      }
    }
  }
  
  public void zza(zzf paramzzf, DriveEvent paramDriveEvent)
  {
    Pair localPair = new android/util/Pair;
    localPair.<init>(paramzzf, paramDriveEvent);
    Message localMessage = obtainMessage(1, localPair);
    sendMessage(localMessage);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzae$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */