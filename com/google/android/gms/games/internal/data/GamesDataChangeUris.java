package com.google.android.gms.games.internal.data;

import android.net.Uri;
import android.net.Uri.Builder;

public final class GamesDataChangeUris
{
  private static final Uri zzaIa = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
  public static final Uri zzaIb = zzaIa.buildUpon().appendPath("invitations").build();
  public static final Uri zzaIc = zzaIa.buildUpon().appendEncodedPath("players").build();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\data\GamesDataChangeUris.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */