package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.video.VideoCapabilities;

public abstract interface IGamesCallbacks
  extends IInterface
{
  public abstract void onInvitationRemoved(String paramString);
  
  public abstract void onLeftRoom(int paramInt, String paramString);
  
  public abstract void onP2PConnected(String paramString);
  
  public abstract void onP2PDisconnected(String paramString);
  
  public abstract void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage);
  
  public abstract void onRequestRemoved(String paramString);
  
  public abstract void onTurnBasedMatchRemoved(String paramString);
  
  public abstract void zzA(DataHolder paramDataHolder);
  
  public abstract void zzB(DataHolder paramDataHolder);
  
  public abstract void zzC(DataHolder paramDataHolder);
  
  public abstract void zzD(DataHolder paramDataHolder);
  
  public abstract void zzE(DataHolder paramDataHolder);
  
  public abstract void zzF(DataHolder paramDataHolder);
  
  public abstract void zzG(DataHolder paramDataHolder);
  
  public abstract void zzH(DataHolder paramDataHolder);
  
  public abstract void zzI(DataHolder paramDataHolder);
  
  public abstract void zzJ(DataHolder paramDataHolder);
  
  public abstract void zzK(DataHolder paramDataHolder);
  
  public abstract void zzL(DataHolder paramDataHolder);
  
  public abstract void zzM(DataHolder paramDataHolder);
  
  public abstract void zzN(DataHolder paramDataHolder);
  
  public abstract void zzO(DataHolder paramDataHolder);
  
  public abstract void zzP(DataHolder paramDataHolder);
  
  public abstract void zzQ(DataHolder paramDataHolder);
  
  public abstract void zzR(DataHolder paramDataHolder);
  
  public abstract void zzS(DataHolder paramDataHolder);
  
  public abstract void zzT(DataHolder paramDataHolder);
  
  public abstract void zzU(DataHolder paramDataHolder);
  
  public abstract void zzV(DataHolder paramDataHolder);
  
  public abstract void zzW(DataHolder paramDataHolder);
  
  public abstract void zzX(DataHolder paramDataHolder);
  
  public abstract void zza(int paramInt, VideoCapabilities paramVideoCapabilities);
  
  public abstract void zza(int paramInt, String paramString, boolean paramBoolean);
  
  public abstract void zza(int paramInt, long[] paramArrayOfLong);
  
  public abstract void zza(DataHolder paramDataHolder1, DataHolder paramDataHolder2);
  
  public abstract void zza(DataHolder paramDataHolder, Contents paramContents);
  
  public abstract void zza(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3);
  
  public abstract void zza(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zza(DataHolder[] paramArrayOfDataHolder);
  
  public abstract void zzb(int paramInt1, int paramInt2, String paramString);
  
  public abstract void zzb(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zzc(int paramInt, Bundle paramBundle);
  
  public abstract void zzc(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zzd(int paramInt, Bundle paramBundle);
  
  public abstract void zzd(int paramInt, boolean paramBoolean);
  
  public abstract void zzd(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zze(int paramInt, Bundle paramBundle);
  
  public abstract void zze(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zzf(int paramInt, Bundle paramBundle);
  
  public abstract void zzf(DataHolder paramDataHolder, String[] paramArrayOfString);
  
  public abstract void zzg(int paramInt, Bundle paramBundle);
  
  public abstract void zzg(int paramInt, String paramString);
  
  public abstract void zzgn(int paramInt);
  
  public abstract void zzgo(int paramInt);
  
  public abstract void zzgp(int paramInt);
  
  public abstract void zzgq(int paramInt);
  
  public abstract void zzh(int paramInt, String paramString);
  
  public abstract void zzh(DataHolder paramDataHolder);
  
  public abstract void zzi(int paramInt, String paramString);
  
  public abstract void zzi(DataHolder paramDataHolder);
  
  public abstract void zzj(int paramInt, String paramString);
  
  public abstract void zzj(DataHolder paramDataHolder);
  
  public abstract void zzk(DataHolder paramDataHolder);
  
  public abstract void zzl(DataHolder paramDataHolder);
  
  public abstract void zzm(DataHolder paramDataHolder);
  
  public abstract void zzn(DataHolder paramDataHolder);
  
  public abstract void zzo(DataHolder paramDataHolder);
  
  public abstract void zzp(DataHolder paramDataHolder);
  
  public abstract void zzq(DataHolder paramDataHolder);
  
  public abstract void zzr(DataHolder paramDataHolder);
  
  public abstract void zzs(DataHolder paramDataHolder);
  
  public abstract void zzt(DataHolder paramDataHolder);
  
  public abstract void zzu(DataHolder paramDataHolder);
  
  public abstract void zzv(DataHolder paramDataHolder);
  
  public abstract void zzw(DataHolder paramDataHolder);
  
  public abstract void zzwr();
  
  public abstract void zzx(DataHolder paramDataHolder);
  
  public abstract void zzy(DataHolder paramDataHolder);
  
  public abstract void zzz(DataHolder paramDataHolder);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */