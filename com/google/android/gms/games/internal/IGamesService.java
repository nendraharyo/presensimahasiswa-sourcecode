package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;
import java.util.List;

public abstract interface IGamesService
  extends IInterface
{
  public abstract void zzE(String paramString1, String paramString2);
  
  public abstract void zzF(long paramLong);
  
  public abstract void zzF(String paramString1, String paramString2);
  
  public abstract void zzG(long paramLong);
  
  public abstract void zzH(long paramLong);
  
  public abstract void zzI(long paramLong);
  
  public abstract void zzJ(long paramLong);
  
  public abstract void zzK(long paramLong);
  
  public abstract int zza(IGamesCallbacks paramIGamesCallbacks, byte[] paramArrayOfByte, String paramString1, String paramString2);
  
  public abstract Intent zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, String paramString);
  
  public abstract Intent zza(PlayerEntity paramPlayerEntity);
  
  public abstract Intent zza(AchievementEntity paramAchievementEntity);
  
  public abstract Intent zza(ZInvitationCluster paramZInvitationCluster, Account paramAccount, String paramString);
  
  public abstract Intent zza(ZInvitationCluster paramZInvitationCluster, String paramString1, String paramString2);
  
  public abstract Intent zza(GameRequestCluster paramGameRequestCluster, Account paramAccount);
  
  public abstract Intent zza(GameRequestCluster paramGameRequestCluster, String paramString);
  
  public abstract Intent zza(RoomEntity paramRoomEntity, int paramInt);
  
  public abstract Intent zza(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt);
  
  public abstract Intent zza(ParticipantEntity[] paramArrayOfParticipantEntity, Account paramAccount, String paramString1, Uri paramUri1, Uri paramUri2, String paramString2);
  
  public abstract Intent zza(ParticipantEntity[] paramArrayOfParticipantEntity, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2);
  
  public abstract Intent zza(ParticipantEntity[] paramArrayOfParticipantEntity, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, String paramString3);
  
  public abstract void zza(IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zza(Contents paramContents);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt1, int paramInt2, String[] paramArrayOfString, Bundle paramBundle);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt, String paramString, String[] paramArrayOfString, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int paramInt, int[] paramArrayOfInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, long paramLong);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, Bundle paramBundle, int paramInt1, int paramInt2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, IBinder paramIBinder, int paramInt, String[] paramArrayOfString, Bundle paramBundle, boolean paramBoolean, long paramLong);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, IBinder paramIBinder, String paramString, boolean paramBoolean, long paramLong);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, int[] paramArrayOfInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, long paramLong);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, long paramLong, String paramString2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, SnapshotMetadataChangeEntity paramSnapshotMetadataChangeEntity, Contents paramContents);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, SnapshotMetadataChangeEntity paramSnapshotMetadataChangeEntity, Contents paramContents);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, VideoConfiguration paramVideoConfiguration);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, String[] paramArrayOfString);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, String[] paramArrayOfString, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean, int paramInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, int[] paramArrayOfInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String paramString, String[] paramArrayOfString, int paramInt1, byte[] paramArrayOfByte, int paramInt2);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean, Bundle paramBundle);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean, String[] paramArrayOfString);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int[] paramArrayOfInt);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, int[] paramArrayOfInt, int paramInt, boolean paramBoolean);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString);
  
  public abstract void zza(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString, boolean paramBoolean);
  
  public abstract void zza(IGamesClient paramIGamesClient, long paramLong);
  
  public abstract void zza(String paramString, Account paramAccount);
  
  public abstract void zza(String paramString, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zza(String paramString, IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzai(boolean paramBoolean);
  
  public abstract void zzaj(boolean paramBoolean);
  
  public abstract void zzak(boolean paramBoolean);
  
  public abstract int zzb(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString);
  
  public abstract Intent zzb(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract Intent zzb(int[] paramArrayOfInt);
  
  public abstract void zzb(long paramLong, String paramString);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, long paramLong);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, IBinder paramIBinder, Bundle paramBundle);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzb(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString);
  
  public abstract void zzb(String[] paramArrayOfString);
  
  public abstract Intent zzc(int paramInt1, int paramInt2, boolean paramBoolean);
  
  public abstract void zzc(long paramLong, String paramString);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, long paramLong);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2, boolean paramBoolean);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzc(IGamesCallbacks paramIGamesCallbacks, String[] paramArrayOfString);
  
  public abstract void zzd(long paramLong, String paramString);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, long paramLong);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, long paramLong, String paramString);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zzd(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzd(String paramString1, String paramString2, int paramInt);
  
  public abstract Intent zzdI(String paramString);
  
  public abstract String zzdK(String paramString);
  
  public abstract String zzdL(String paramString);
  
  public abstract void zzdM(String paramString);
  
  public abstract int zzdN(String paramString);
  
  public abstract Uri zzdO(String paramString);
  
  public abstract void zzdP(String paramString);
  
  public abstract Intent zzdQ(String paramString);
  
  public abstract ParcelFileDescriptor zzdR(String paramString);
  
  public abstract Account zzdS(String paramString);
  
  public abstract void zze(long paramLong, String paramString);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zze(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zze(String paramString1, String paramString2, int paramInt);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks, String paramString1, String paramString2);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks, String paramString, boolean paramBoolean);
  
  public abstract void zzf(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzg(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzg(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzg(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzgt(int paramInt);
  
  public abstract RoomEntity zzh(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzh(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzh(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzi(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzi(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzi(IGamesCallbacks paramIGamesCallbacks, boolean paramBoolean);
  
  public abstract void zzj(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzj(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzk(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzk(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzl(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzl(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract Intent zzm(String paramString, int paramInt1, int paramInt2);
  
  public abstract void zzm(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzm(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract ParcelFileDescriptor zzn(Uri paramUri);
  
  public abstract void zzn(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzn(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzo(IGamesCallbacks paramIGamesCallbacks);
  
  public abstract void zzo(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract Bundle zzoi();
  
  public abstract void zzp(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzp(String paramString, int paramInt);
  
  public abstract void zzq(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzq(String paramString, int paramInt);
  
  public abstract void zzr(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzr(String paramString, int paramInt);
  
  public abstract void zzs(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzt(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzt(String paramString, int paramInt);
  
  public abstract void zzu(IGamesCallbacks paramIGamesCallbacks, String paramString);
  
  public abstract void zzu(String paramString, int paramInt);
  
  public abstract Intent zzv(String paramString, int paramInt);
  
  public abstract Intent zzwA();
  
  public abstract Intent zzwB();
  
  public abstract Intent zzwC();
  
  public abstract Intent zzwH();
  
  public abstract Intent zzwI();
  
  public abstract int zzwJ();
  
  public abstract String zzwK();
  
  public abstract int zzwL();
  
  public abstract Intent zzwM();
  
  public abstract int zzwN();
  
  public abstract int zzwO();
  
  public abstract int zzwP();
  
  public abstract int zzwQ();
  
  public abstract void zzwR();
  
  public abstract String zzwT();
  
  public abstract DataHolder zzwU();
  
  public abstract boolean zzwV();
  
  public abstract DataHolder zzwW();
  
  public abstract void zzwX();
  
  public abstract Intent zzwY();
  
  public abstract void zzwZ();
  
  public abstract String zzww();
  
  public abstract Intent zzwz();
  
  public abstract boolean zzxa();
  
  public abstract void zzxb();
  
  public abstract Intent zzxc();
  
  public abstract Intent zzxd();
  
  public abstract Account zzxe();
  
  public abstract List zzxf();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\IGamesService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */