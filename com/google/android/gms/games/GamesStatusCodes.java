package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;

public final class GamesStatusCodes
{
  public static final int STATUS_ACHIEVEMENT_NOT_INCREMENTAL = 3002;
  public static final int STATUS_ACHIEVEMENT_UNKNOWN = 3001;
  public static final int STATUS_ACHIEVEMENT_UNLOCKED = 3003;
  public static final int STATUS_ACHIEVEMENT_UNLOCK_FAILURE = 3000;
  public static final int STATUS_APP_MISCONFIGURED = 8;
  public static final int STATUS_CLIENT_RECONNECT_REQUIRED = 2;
  public static final int STATUS_GAME_NOT_FOUND = 9;
  public static final int STATUS_INTERNAL_ERROR = 1;
  public static final int STATUS_INTERRUPTED = 14;
  public static final int STATUS_INVALID_REAL_TIME_ROOM_ID = 7002;
  public static final int STATUS_LICENSE_CHECK_FAILED = 7;
  public static final int STATUS_MATCH_ERROR_ALREADY_REMATCHED = 6505;
  public static final int STATUS_MATCH_ERROR_INACTIVE_MATCH = 6501;
  public static final int STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS = 6504;
  public static final int STATUS_MATCH_ERROR_INVALID_MATCH_STATE = 6502;
  public static final int STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE = 6500;
  public static final int STATUS_MATCH_ERROR_LOCALLY_MODIFIED = 6507;
  public static final int STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION = 6503;
  public static final int STATUS_MATCH_NOT_FOUND = 6506;
  public static final int STATUS_MILESTONE_CLAIMED_PREVIOUSLY = 8000;
  public static final int STATUS_MILESTONE_CLAIM_FAILED = 8001;
  public static final int STATUS_MULTIPLAYER_DISABLED = 6003;
  public static final int STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED = 6000;
  public static final int STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE = 6002;
  public static final int STATUS_MULTIPLAYER_ERROR_INVALID_OPERATION = 6004;
  public static final int STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER = 6001;
  public static final int STATUS_NETWORK_ERROR_NO_DATA = 4;
  public static final int STATUS_NETWORK_ERROR_OPERATION_DEFERRED = 5;
  public static final int STATUS_NETWORK_ERROR_OPERATION_FAILED = 6;
  public static final int STATUS_NETWORK_ERROR_STALE_DATA = 3;
  public static final int STATUS_OK = 0;
  public static final int STATUS_OPERATION_IN_FLIGHT = 7007;
  public static final int STATUS_PARTICIPANT_NOT_CONNECTED = 7003;
  public static final int STATUS_QUEST_NOT_STARTED = 8003;
  public static final int STATUS_QUEST_NO_LONGER_AVAILABLE = 8002;
  public static final int STATUS_REAL_TIME_CONNECTION_FAILED = 7000;
  public static final int STATUS_REAL_TIME_INACTIVE_ROOM = 7005;
  public static final int STATUS_REAL_TIME_MESSAGE_SEND_FAILED = 7001;
  public static final int STATUS_REAL_TIME_ROOM_NOT_JOINED = 7004;
  public static final int STATUS_REQUEST_TOO_MANY_RECIPIENTS = 2002;
  public static final int STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS = 2000;
  public static final int STATUS_REQUEST_UPDATE_TOTAL_FAILURE = 2001;
  public static final int STATUS_SNAPSHOT_COMMIT_FAILED = 4003;
  public static final int STATUS_SNAPSHOT_CONFLICT = 4004;
  public static final int STATUS_SNAPSHOT_CONFLICT_MISSING = 4006;
  public static final int STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE = 4002;
  public static final int STATUS_SNAPSHOT_CREATION_FAILED = 4001;
  public static final int STATUS_SNAPSHOT_FOLDER_UNAVAILABLE = 4005;
  public static final int STATUS_SNAPSHOT_NOT_FOUND = 4000;
  public static final int STATUS_TIMEOUT = 15;
  
  public static String getStatusString(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default: 
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      str = String.format("Status code (%d) not found!", arrayOfObject);
    }
    for (;;)
    {
      return str;
      str = "STATUS_OK";
      continue;
      str = "STATUS_INTERNAL_ERROR";
      continue;
      str = "STATUS_CLIENT_RECONNECT_REQUIRED";
      continue;
      str = "STATUS_NETWORK_ERROR_STALE_DATA";
      continue;
      str = "STATUS_NETWORK_ERROR_NO_DATA";
      continue;
      str = "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
      continue;
      str = "STATUS_NETWORK_ERROR_OPERATION_FAILED";
      continue;
      str = "STATUS_LICENSE_CHECK_FAILED";
      continue;
      str = "STATUS_APP_MISCONFIGURED";
      continue;
      str = "STATUS_GAME_NOT_FOUND";
      continue;
      str = "STATUS_INTERRUPTED";
      continue;
      str = "STATUS_TIMEOUT";
      continue;
      str = "STATUS_RESOLVE_STALE_OR_NO_DATA";
      continue;
      str = "STATUS_AUTH_ERROR_HARD";
      continue;
      str = "STATUS_AUTH_ERROR_USER_RECOVERABLE";
      continue;
      str = "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
      continue;
      str = "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
      continue;
      str = "STATUS_PLAYER_OOB_REQUIRED";
      continue;
      str = "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
      continue;
      str = "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
      continue;
      str = "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
      continue;
      str = "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
      continue;
      str = "STATUS_ACHIEVEMENT_UNKNOWN";
      continue;
      str = "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
      continue;
      str = "STATUS_ACHIEVEMENT_UNLOCKED";
      continue;
      str = "STATUS_SNAPSHOT_NOT_FOUND";
      continue;
      str = "STATUS_SNAPSHOT_CREATION_FAILED";
      continue;
      str = "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
      continue;
      str = "STATUS_SNAPSHOT_COMMIT_FAILED";
      continue;
      str = "STATUS_SNAPSHOT_CONFLICT";
      continue;
      str = "STATUS_SNAPSHOT_CONFLICT_MISSING";
      continue;
      str = "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
      continue;
      str = "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
      continue;
      str = "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
      continue;
      str = "STATUS_MULTIPLAYER_DISABLED";
      continue;
      str = "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
      continue;
      str = "STATUS_MATCH_ERROR_INACTIVE_MATCH";
      continue;
      str = "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
      continue;
      str = "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
      continue;
      str = "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
      continue;
      str = "STATUS_MATCH_NOT_FOUND";
      continue;
      str = "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
      continue;
      str = "STATUS_REAL_TIME_CONNECTION_FAILED";
      continue;
      str = "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
      continue;
      str = "STATUS_INVALID_REAL_TIME_ROOM_ID";
      continue;
      str = "STATUS_PARTICIPANT_NOT_CONNECTED";
      continue;
      str = "STATUS_REAL_TIME_ROOM_NOT_JOINED";
      continue;
      str = "STATUS_REAL_TIME_INACTIVE_ROOM";
      continue;
      str = "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
      continue;
      str = "STATUS_OPERATION_IN_FLIGHT";
      continue;
      str = "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
      continue;
      str = "STATUS_MILESTONE_CLAIM_FAILED";
      continue;
      str = "STATUS_QUEST_NO_LONGER_AVAILABLE";
      continue;
      str = "STATUS_QUEST_NOT_STARTED";
      continue;
      str = "STATUS_VIDEO_NOT_ACTIVE";
      continue;
      str = "STATUS_VIDEO_UNSUPPORTED";
      continue;
      str = "STATUS_VIDEO_PERMISSION_ERROR";
      continue;
      str = "STATUS_VIDEO_STORAGE_ERROR";
      continue;
      str = "STATUS_VIDEO_DISPLAY_ERROR";
      continue;
      str = "STATUS_VIDEO_CODEC_ERROR";
      continue;
      str = "STATUS_VIDEO_ALREADY_RECORDING";
      continue;
      str = "STATUS_VIDEO_STREAM_ERROR";
      continue;
      str = "STATUS_VIDEO_NO_STREAMING_TARGET";
      continue;
      str = "STATUS_VIDEO_OUT_OF_DISK_SPACE";
      continue;
      str = "STATUS_VIDEO_NO_MIC";
      continue;
      str = "STATUS_VIDEO_NO_CAMERA";
      continue;
      str = "STATUS_VIDEO_SCREEN_OFF";
      continue;
      str = "STATUS_VIDEO_INVALID_STATE";
      continue;
      str = "STATUS_VIDEO_AUDIO_ENCODER_ERROR";
      continue;
      str = "STATUS_VIDEO_MEDIA_MUX_ERROR";
      continue;
      str = "STATUS_YOUTUBE_LIVE_STREAM_UNKNOWN_ERROR";
      continue;
      str = "STATUS_YOUTUBE_LIVE_STREAM_NOT_ENABLED";
    }
  }
  
  public static Status zzgc(int paramInt)
  {
    Status localStatus = new com/google/android/gms/common/api/Status;
    String str = getStatusString(paramInt);
    localStatus.<init>(paramInt, str);
    return localStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\GamesStatusCodes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */